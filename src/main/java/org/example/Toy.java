package org.example;

import java.util.Random;

public class Toy {
    public static int index = 0;
    int id;
    String name;
    Integer weight;
    Random random = new Random();

    {
        this.id = ++index;
    }
    public Toy(String name) {
        this.name = name;
        int p = random.nextInt(101);
        if (p < 60) this.weight = 3;
        else if (p < 80) this.weight = 2;
        else this.weight = 1;

    }

    @Override
    public String toString() {
        return String.format("%s - игрушка № %d, частота - %d",  this.getName(), this.getId(), this.getWeight());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public Integer getWeight() {
        return this.weight;
    }
}