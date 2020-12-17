package com.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("messageService")
@Scope("prototype")
public class MyNameMessageService implements MessageService {
    @Override
    public String getMessage() {
        return "Dominika Stachura";
    }
}
