package ru.ava.springapp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.ava.springapp")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
