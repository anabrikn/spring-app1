package ru.ava.springapp;

import org.springframework.stereotype.Component;

@Component
public class ReggaeMusic implements Music {

    public void initReggaeMusicBean() {
        System.out.println("Initialization");
    }

    public void destroyReggaeMusicBean() {
        System.out.println("Destroying object");
    }

    @Override
    public String getSong() {
        return "Jamaica";
    }
}
