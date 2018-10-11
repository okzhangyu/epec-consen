package com.avatech.edi.consen.service;

import com.avatech.edi.consen.model.vo.Token;
import com.avatech.edi.consen.repository.ITokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class TokenService {

    @Autowired
    private ITokenRepository iTokenRepository;

    public Token fetchToken()throws Exception{
        Iterable<Token> token=iTokenRepository.findAll();
        if(token!= null && token.iterator().hasNext())
            return token.iterator().next();
        else
           throw new Exception("token配置信息不存在");
    }

    @Transactional
    public void updateToken(Token newToken){
            Optional<Token> userTokens =  iTokenRepository.findById(newToken.getId());
            if(userTokens !=null && userTokens.isPresent()){
                Token token = iTokenRepository.findById(newToken.getId()).get();
                token.setExpiredTime(newToken.getExpiredTime());
                iTokenRepository.deleteById(newToken.getId());
            }
        iTokenRepository.save(newToken);
    }
}
