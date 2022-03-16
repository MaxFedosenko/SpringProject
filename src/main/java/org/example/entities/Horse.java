package org.example.entities;

public class Horse {

    private String name;
    private Integer speed;

    public Horse() {
    }
    
    public Horse(String name, Integer speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSpeed() {
        return speed;
    }
    
    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
