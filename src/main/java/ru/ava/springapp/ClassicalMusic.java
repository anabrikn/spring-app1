package ru.ava.springapp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music {
    List<String> list = new ArrayList<>();

    {
        list.add("The Four Seasons");
        list.add("Moonlight Sonata");
        list.add("Tritsch-Tratsch-Polka");
    }
    ClassicalMusic() {

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
