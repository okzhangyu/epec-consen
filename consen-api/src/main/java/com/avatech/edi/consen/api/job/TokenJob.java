package com.avatech.edi.consen.api.job;

import com.avatech.edi.consen.config.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TokenJob {

    @Autowired
    private HttpRequest httpRequest;
    /**
     * 启动获取token
     */
    @Scheduled(cron="0 0/1 * * * ?")
    private void getToken() throws Exception{
        httpRequest.getToken();
    }


    /**
     * 2小时定时获取token
     */
    @Scheduled(cron="")
    private void refreshToken(){

    }
}
