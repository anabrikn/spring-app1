package ru.ava.springapp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class RockMusic implements Music {
    List<String> list = new ArrayList<>();

    {
        list.add("Believer");
        list.add("Thunder");
        list.add("Natural");
    }

    public void initRockMusicBean() {
        System.out.println("Initialization");
    }

    public void destroyRockMusicBean() {
        System.out.println("Destroying object");
    }

    @Override
    public List<String> getSongs() {
        return list;
    }
}
