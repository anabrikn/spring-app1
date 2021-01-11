package ru.ava.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private Music classicalMusic;
    private Music rockMusic;
    private Music reggaeMusic;

    @Autowired
    public MusicPlayer(Music classicalMusic,
                       Music rockMusic,
                       Music reggaeMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.reggaeMusic = reggaeMusic;
    }

    public void playMusic(GenreMusic genreMusic) {
        int num = new Random().nextInt(3);

        switch (genreMusic){
            case ROCK:
                System.out.println(rockMusic.getSongs().get(num));
                break;
            case REGGAE:
                System.out.println(reggaeMusic.getSongs().get(num));
                break;
            case CLASSICAL:
                System.out.println(classicalMusic.getSongs().get(num));
                break;
        }
    }


}

/*
    private Music classicalMusic;
    private Music rockMusic;
    private Music reggaeMusic;

    // внедрение через конструктор
    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic,
                       @Qualifier("rockMusic") Music rockMusic,
                       @Qualifier("reggaeMusic") Music reggaeMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.reggaeMusic = reggaeMusic;
    }

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
     */