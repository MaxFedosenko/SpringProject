package org.example.config;

import org.example.entities.Horse;
import org.example.entities.Pair;
import org.example.entities.Rider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan(basePackages = {"org.example.config", "org.example.services"})
public class RacingConfig {

    @Bean(name = "horse1")
    Horse horse1() {
        return new Horse();
    }

    @Bean(name = "horse2")
    Horse horse2() {
        return new Horse();
    }

    @Bean(name = "horse2")
    Horse horse3() {
        return new Horse();
    }

    @Bean(name = "rider1")
    Rider rider1() {
        return new Rider();
    }

    @Bean(name = "rider2")
    Rider rider2() {
        return new Rider();
    }

    @Bean(name = "rider3")
    Rider rider3() {
        return new Rider();
    }

    @Bean(name = "pair1", initMethod = "init")
    @Lazy
    Pair pair1() {
        return new Pair();
    }

    @Bean(name = "pair2", initMethod = "init")
    @Lazy
    Pair pair2() {
        return new Pair();
    }

    @Bean(name = "pair3", initMethod = "init")
    @Lazy
    Pair pair3() {
        return new Pair();
    }

}