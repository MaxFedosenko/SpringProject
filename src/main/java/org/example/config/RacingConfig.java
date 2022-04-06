package org.example.config;

import org.example.entities.Horse;
import org.example.entities.Pair;
import org.example.entities.Rider;
import org.example.services.Racing;
import org.example.services.RacingImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

import java.util.List;

@Configuration
@ComponentScan(basePackages = {"org.example.config", "org.example.services"})
public class RacingConfig {

    @Bean
    @Qualifier("horse1")
    @Scope(value = "singleton")
    Horse horse1() {
        return new Horse("horse1", 18);
    }

    @Bean
    @Qualifier("horse2")
    @Scope(value = "singleton")
    Horse horse2() {
        return new Horse("horse2", 18);
    }

    @Bean
    @Qualifier("horse3")
    @Scope(value = "singleton")
    Horse horse3() {
        return new Horse("horse3", 18);
    }

    @Bean
    @Qualifier("rider1")
    @Scope(value = "singleton")
    Rider rider1() {
        return new Rider("rider1", 5);
    }

    @Bean
    @Qualifier("rider2")
    @Scope(value = "singleton")
    Rider rider2() {
        return new Rider("rider2", 5);
    }

    @Bean
    @Qualifier("rider3")
    @Scope(value = "singleton")
    Rider rider3() {
        return new Rider("rider3", 5);
    }

    @Bean(initMethod = "sumIndex")
    @Qualifier("pair1")
    @Scope(value = "singleton")
    @Lazy
    Pair pair1() {
        return new Pair(1L, horse1(), rider1());
    }

    @Bean(initMethod = "sumIndex")
    @Qualifier("pair2")
    @Scope(value = "singleton")
    @Lazy
    Pair pair2() {
        return new Pair(2L, horse2(), rider2());
    }

    @Bean(initMethod = "sumIndex")
    @Qualifier("pair3")
    @Scope(value = "singleton")
    @Lazy
    Pair pair3() {
        return new Pair(3L, horse3(), rider3());
    }
    
    @Bean
    @Qualifier("racing")
    @Scope(value = "singleton")
    @Lazy
    Racing racing() {
        return new RacingImpl(List.of(pair1(), pair2(), pair3()));
    }

}