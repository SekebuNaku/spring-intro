package com.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("randomMessageService")
@Scope("prototype")
public class RandomTextMessageService implements MessageService{
    private String[] message = new String[]{
            "FATES:",
            "Go ahead and lay the blame",
            "Talk of virtue, talk of sin",
            "Wouldn't you have done the same?",
            "In her shoes, in her skin",
            "You can have your principles",
            "When you've got a bellyful",
            "But hunger has a way with you",
            "There's no telling what you're gonna do",
            "When the chips are down"

    };

    @Override
    public String getMessage() {
        int verse = new Random().nextInt(9);
        return message[verse];
    }
}
