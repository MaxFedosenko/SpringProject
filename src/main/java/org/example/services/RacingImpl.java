package org.example.services;

import org.example.entities.Horse;
import org.example.entities.Pair;
import org.example.entities.Rider;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.*;

@Service
@Lazy
public class RacingImpl implements Racing {

    public List<Pair> creator() {
        Horse horse1 = new Horse("horse1");
        Horse horse2 = new Horse("horse2");
        Horse horse3 = new Horse("horse3");

        Rider rider1 = new Rider("rider1", (int) (1 + Math.random() * 10));
        Rider rider2 = new Rider("rider2", (int) (1 + Math.random() * 10));
        Rider rider3 = new Rider("rider3", (int) (1 + Math.random() * 10));

        Pair pair1 = new Pair(1L, horse1, rider1);
        Pair pair2 = new Pair(2L, horse2, rider2);
        Pair pair3 = new Pair(3L, horse3, rider3);

        List<Pair> pairs = new ArrayList<>();
        pairs.add(pair1);
        pairs.add(pair2);
        pairs.add(pair3);

        return pairs;

    }

    @PostConstruct
    @Override
    public void printRaceResult() throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your rate");
        Long rate = scanner.nextLong();
        System.out.println("Your entered: " + rate);
        Thread.sleep(1000);
        RacingImpl racing = new RacingImpl();
        List<Pair> pairs = racing.creator();
        System.out.println("Are racing today next pairs: " + pairs);
        Thread.sleep(2000);

        List<Pair> pairList = null;
        for (int i = 1; i <= 5; i++) {
            Optional<Pair> max1 = pairs.stream()
                    .max(Comparator.comparing(Pair::getSumIndex));
            System.out.println("pair № " + max1.get().getId() + " leads on lap " + i);
            Thread.sleep(1000);

            if (rate.equals(max1.get().getId())) {
                System.out.println("!!!player won this lap!!!");
            } else {
                System.out.println("!!!player lost on this lap!!!");
            }

            Thread.sleep(1000);
            pairList = new ArrayList<>();
            pairList.add(max1.get());
        }

        System.out.println("Today win " + pairList);

        if (rate.equals(pairList.get(0).getId())) {
            System.out.println("!!!player's bet won!!!");
        } else {
            System.out.println("!!!player's bet lost!!!");
        }
    }
}