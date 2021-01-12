package ru.ava.springapp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
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

    @PostConstruct
    public void initRockMusicBean() {
        System.out.println("Initialization");
    }

    @PreDestroy // у бинов с scope("prototype") этот метод спрингом не выполняется
    public void destroyRockMusicBean() {
        System.out.println("Destroying object");
    }

    @Override
    public List<String> getSongs() {
        return list;
    }
}
