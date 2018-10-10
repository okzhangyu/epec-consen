package com.avatech.edi.consen.config;

import com.avatech.edi.consen.service.DateUtil;
import com.avatech.edi.consen.service.TokenService;
import com.avatech.edi.consen.model.dto.TokenResponse;
import com.avatech.edi.consen.model.vo.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@Component
public class HttpRequest {

    public final static String BASE_URL = "https://uat-api.epec.com/apigate/";
    public final static String GET_TOKEN_URL = "oauth/token?client_id=%s&client_secret=%s&grant_type=password&companyid=%s&username=%s&password=%s";
    public final static String REFRESH_TOKEN_URL = "oauth/token?client_id=abc &client_secret=abc&grant_type=refresh_token &refresh_token=14122e6a-650c-4d63-aa3d-e0413515afbf";

    @Autowired
    private TokenService tokenService;

    public String getToken() throws Exception{
        Token token = tokenService.fetchToken();

        if(token.getToken() == null || (token != null && token.getExpiredTime() <= DateUtil.getLongTime())){
            RestTemplate restTemplate=new RestTemplate();
            TokenResponse response= restTemplate.getForObject(getTokenUrl(token), TokenResponse.class);
            if(response != null){
                token =new Token();
                token.setExpiredTime(DateUtil.getLongTime(LocalDateTime.now().plusSeconds(response.getData().getExpires_in())));
                token.setId("1");
                token.setToken(response.getData().getAccess_token());
                tokenService.updateToken(token);
                return token.getToken();
            }else {
                throw new Exception("");
            }

        }else{
            token.setExpiredTime(DateUtil.getLongTime(LocalDateTime.now().plusMinutes(15)));
            tokenService.updateToken(token);
            return token.getToken();
        }
    }

    private String getTokenUrl(Token token ) {
        return BASE_URL + String.format(GET_TOKEN_URL,token.getClientId(),token.getClientSceret(),token.getCompanyId(),token.getUserName(),token.getPassword());
    }
}
