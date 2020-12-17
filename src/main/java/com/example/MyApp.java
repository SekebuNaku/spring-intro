package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(myConfig.class);

        MessageService messageServiceA = applicationContext.getBean("myNameMessageService", MessageService.class);
        MessageService messageServiceB = applicationContext.getBean("myNameMessageService", MessageService.class);
        MessageService messageServiceC = applicationContext.getBean("randomTextMessageService", MessageService.class);

        System.out.println("Hashcodes comparition: " + messageServiceA.hashCode()+" "+messageServiceB.hashCode());

        System.out.println(messageServiceA.getMessage());
        System.out.println(messageServiceC.getMessage());

    }
}
