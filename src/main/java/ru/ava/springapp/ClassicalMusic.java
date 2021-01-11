package ru.ava.springapp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    List<String> list = new ArrayList<>();

    {
        list.add("The Four Seasons");
        list.add("Moonlight Sonata");
        list.add("Tritsch-Tratsch-Polka");
    }
    private ClassicalMusic() {

    }

    /**
     * Factory Method
     * пока scope = singleton, spring создаст только один объект
     * и каждый раз будет давать ссылку именно на него
     * @return ClassicalMusic
     */
    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void initClassicalMusicBean() {
        System.out.println("Initialization");
    }

    public void destroyClassicalMusicBean() {
        System.out.println("Destroying object");
    }

    @Override
    public List<String> getSongs() {
        return list;
    }
}
