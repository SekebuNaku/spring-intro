package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class myConfig {

    @Bean
    @Scope("prototype")
    public MessageService myNameMessageService(){
        return new MyNameMessageService();
    }

    @Bean
    @Scope("prototype")
    public MessageService randomTextMessageService(){
        return new RandomTextMessageService();
    }

}