package org.example.services;

import org.example.entities.Pair;

import java.util.List;

public interface Racing {

    public List<Pair> creator();

    void printRaceResult() throws InterruptedException;

}
