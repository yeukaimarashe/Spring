package org.example.config;

import org.example.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot(){
        var p = new Parrot();
        p.setName("Papooola");
        return p;
    }

    @Bean
    String hello(){
        return "halooo";
    }

    @Bean
    Integer num(){
        return 10;
    }
}
