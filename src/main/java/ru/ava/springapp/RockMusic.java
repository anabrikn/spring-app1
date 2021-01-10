package ru.ava.springapp;

public class RockMusic implements Music {

    public void initRockMusicBean() {
        System.out.println("Initialization");
    }

    public void destroyRockMusicBean() {
        System.out.println("Destroying object");
    }

    @Override
    public String getSong() {
        return "Believer";
    }
}
