package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MessageService messageServiceA = applicationContext.getBean("messageService", MessageService.class);
        MessageService messageServiceB = applicationContext.getBean("messageService", MessageService.class);
        MessageService messageServiceC = applicationContext.getBean("randomMessageService", MessageService.class);

        System.out.println("Hashcodes comparition: " + messageServiceA.hashCode()+" "+messageServiceB.hashCode());

        System.out.println(messageServiceA.getMessage());
        System.out.println(messageServiceC.getMessage());

        applicationContext.close();
    }
}
