package ru.ava.springapp;

public class ClassicalMusic implements Music {

    public void initClassicalMusicBean() {
        System.out.println("Initialization");
    }

    public void destroyClassicalMusicBean() {
        System.out.println("Destroying object");
    }

    @Override
    public String getSong() {
        return "Moonlight Sonata";
    }
}
