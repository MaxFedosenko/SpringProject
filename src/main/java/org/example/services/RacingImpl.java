package org.example.services;

import org.example.entities.Pair;

import java.util.*;

public class RacingImpl implements Racing {
    
    private List<Pair> pairs = new ArrayList<>();
    
    public RacingImpl(List<Pair> pairs) {
        this.pairs = pairs;
    }
    
    @Override
    public Pair randomizer(){
        return pairs.get((int) (Math.random() * 3));
    }
    
    @Override
    public void printResultLaps(Long rate) throws InterruptedException {
        for (int i = 1; i <= 5; i++) {
            Pair pair = randomizer();
            System.out.println("pair № " + pair.getId() + " leads on lap " + i);
            Thread.sleep(1000);
            if (rate.equals(pair.getId())) {
                System.out.println("!!!player won this lap!!!");
            } else {
                System.out.println("!!!player lost on this lap!!!");
            }
            Thread.sleep(1000);
        }
    }
    
    @Override
    public void printRaceResult() throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your rate");
        Long rate = scanner.nextLong();
        System.out.println("Your entered: " + rate);
        
        System.out.println("Are racing today next pairs: " + pairs);
    
        printResultLaps(rate);
        
        Pair pair = randomizer();
        System.out.println("Today win " + pair);

        if (rate.equals(pair.getId())) {
            System.out.println("!!!player's bet won!!!");
        } else {
            System.out.println("!!!player's bet lost!!!");
        }
    }
}