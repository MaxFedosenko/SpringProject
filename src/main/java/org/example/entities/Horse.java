package org.example.entities;

public class Horse {

    private String name;
    private Integer speed;

    Integer init() {
        speed = (int)(18 + Math.random()*42);
        return speed;
    }

    public Horse() {
    }

    public Horse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSpeed() {
        return init();
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                '}';
    }
}
