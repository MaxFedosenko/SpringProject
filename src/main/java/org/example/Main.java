package org.example;

import org.example.services.Racing;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("horseRacing.xml");
        Racing racing = context.getBean(Racing.class);
        racing.printRaceResult();

    }
}
