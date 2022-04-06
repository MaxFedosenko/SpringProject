package org.example.entities;

public class Rider {

    private String name;
    private Integer exp;

    public Rider() {
    }

    public Rider(String name) {
        this.name = name;
    }

    public Rider(String name, Integer exp) {
        this.name = name;
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getExp() {
        return exp;
    }

    @Override
    public String toString() {
        return "Rider{" +
                "name='" + name + '\'' +
                ", exp=" + exp +
                '}';
    }
}
