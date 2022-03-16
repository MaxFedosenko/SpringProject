package org.example;

import org.example.services.Racing;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        ApplicationContext context = new AnnotationConfigApplicationContext("org.example.config");
        Racing bean = context.getBean(Racing.class);
        bean.printRaceResult();
        
    }
}
