package ru.ava.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private Music classicalMusic;
    private Music rockMusic;
    private Music reggaeMusic;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic,
                       @Qualifier("rockMusic") Music rockMusic,
                       @Qualifier("reggaeMusic") Music reggaeMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.reggaeMusic = reggaeMusic;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
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