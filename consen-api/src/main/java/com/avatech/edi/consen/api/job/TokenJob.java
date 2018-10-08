package com.avatech.edi.consen.api.job;

import org.springframework.scheduling.annotation.Scheduled;

public class TokenJob {

    /**
     * 启动获取token
     */
    @Scheduled(cron="")
    private void getToken(){

    }


    /**
     * 2小时定时获取token
     */
    @Scheduled(cron="")
    private void refreshToken(){

    }
}
