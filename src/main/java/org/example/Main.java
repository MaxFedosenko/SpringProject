package org.example;

import org.example.services.RacingImpl;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) throws InterruptedException {

//        ApplicationContext context = new AnnotationConfigApplicationContext("org.example.config");
//        context.getBean(Racing.class);
    
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("horseRacing.xml");
        RacingImpl bean = context.getBean(RacingImpl.class);
        bean.printRaceResult();
        
    }
}
