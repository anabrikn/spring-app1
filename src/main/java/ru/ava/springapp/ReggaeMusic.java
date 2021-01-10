package ru.ava.springapp;

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
