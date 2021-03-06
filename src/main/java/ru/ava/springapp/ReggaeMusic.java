package ru.ava.springapp;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

//@Component
public class ReggaeMusic implements Music {
    List<String> list = new ArrayList<>();

    {
        list.add("Sun Is Shining");
        list.add("Three Little Birds");
        list.add("Baby, I Love Your Way");
    }

    @PostConstruct
    public void initReggaeMusicBean() {
        //System.out.println("Initialization");
    }

    @PreDestroy
    public void destroyReggaeMusicBean() {
        //System.out.println("Destroying object");
    }

    @Override
    public List<String> getSongs() {
        return list;
    }
}
