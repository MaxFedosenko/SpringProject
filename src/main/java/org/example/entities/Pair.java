package org.example.entities;

public class Pair {

    private Long id;
    private Horse horse;
    private Rider rider;
    private Integer sumIndex;

    public Pair() {
    }
    
    public Pair(Long id, Horse horse, Rider rider) {
        this.id = id;
        this.horse = horse;
        this.rider = rider;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSumIndex() {
        return sumIndex;
    }
    
    public void setSumIndex(Integer sumIndex) {
        this.sumIndex = sumIndex;
    }
    
    public void sumIndex() {
        this.sumIndex = horse.getSpeed() + rider.getExp();
    }

    public Horse getHorse() {
        return horse;
    }

    public void setHorse(Horse horse) {
        this.horse = horse;
    }

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }
    
    @Override
    public String toString() {
        return "Pair №" + id + "{" +
                ", horse=" + horse +
                ", rider=" + rider +
                ", sumIndex=" + sumIndex +
                '}';
    }
}
