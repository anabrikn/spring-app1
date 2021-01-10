package ru.ava.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    // внедрение через поля
    //@Autowired
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private ReggaeMusic reggaeMusic;

    // внедрение через конструктор
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, ReggaeMusic reggaeMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.reggaeMusic = reggaeMusic;
    }

    /*
    // внедрение через конструктор
    //@Autowired 
    public MusicPlayer(Music music) {
        this.music = music;
    }

    // внедрение через сеттер
    //@Autowired
    public void setMusic(Music music) {
        this.music = music;
    }
    */


    public String playMusic() {
        return new StringBuilder("Playing: ")
                .append(System.lineSeparator())
                .append(classicalMusic.getSong())
                .append(System.lineSeparator())
                .append(rockMusic.getSong())
                .append(System.lineSeparator())
                .append(reggaeMusic.getSong())
                .toString();
    }
}