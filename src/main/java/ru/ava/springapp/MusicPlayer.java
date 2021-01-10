package ru.ava.springapp;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> playList = new ArrayList<>();

    private String name;
    private int volume;

    public MusicPlayer() {
    }

    public MusicPlayer(List<Music> playList) {
        this.playList = playList;
    }


    // IoC
    public MusicPlayer(Music music) {
        this.playList.add(music);
    }


    public void playMusic() {
        for (Music music : playList) {
            System.out.println("Playing: " + music.getSong());
        }
    }

    public List<Music> getPlayList() {
        return playList;
    }

    public void setPlayList(List<Music> playList) {
        this.playList = playList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}
