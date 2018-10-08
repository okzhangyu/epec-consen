package com.avatech.edi.consen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ConsenApplication {

    public static void main(String args[]){
        SpringApplication.run(ConsenApplication.class,args);
    }
}
