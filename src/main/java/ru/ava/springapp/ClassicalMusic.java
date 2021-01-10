package ru.ava.springapp;

public class ClassicalMusic implements Music {

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
    public String getSong() {
        return "Moonlight Sonata";
    }
}
