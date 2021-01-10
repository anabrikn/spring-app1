package ru.ava.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // destroy вызывается - , т.к. singleton
        ClassicalMusic classicalMusic = context.getBean("musicClassicalBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

        // для объектов в бине musicPlayer вызывается только init
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        context.close();
    }
}
