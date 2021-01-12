package ru.ava.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private List<Music> musicPlayList = new ArrayList<>();

    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic,
                       @Qualifier("rockMusic") Music rockMusic,
                       @Qualifier("reggaeMusic") Music reggaeMusic) {
        this.musicPlayList.add(classicalMusic);
        this.musicPlayList.add(rockMusic);
        this.musicPlayList.add(reggaeMusic);
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic() {
        int num = new Random().nextInt(musicPlayList.size());
        List<String> list = musicPlayList.get(num).getSongs();
        return "Playing: " + list.get(new Random().nextInt(list.size()));
    }
}