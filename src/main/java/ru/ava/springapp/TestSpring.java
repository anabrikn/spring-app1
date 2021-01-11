package ru.ava.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(GenreMusic.CLASSICAL);
        musicPlayer.playMusic(GenreMusic.REGGAE);
        musicPlayer.playMusic(GenreMusic.ROCK);
        context.close();
    }
}