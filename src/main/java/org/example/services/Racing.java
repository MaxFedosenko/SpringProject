package org.example.services;

import org.example.entities.Pair;

public interface Racing {
    
    Pair randomizer();
    
    void printResultLaps(Long rate) throws InterruptedException;
    
    void printRaceResult() throws InterruptedException;

}
