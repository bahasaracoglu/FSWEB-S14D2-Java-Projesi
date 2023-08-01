package com.workintech;

public class Wardobe {

    private int width,heignt;
    private double weight;

    public Wardobe(int width, int heignt, double weight) {
        this.width = width;
        this.heignt = heignt;
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public int getHeignt() {
        return heignt;
    }

    public double getWeight() {
        return weight;
    }

    public void add () {
        System.out.println("Wardrobe added into Bedroom." );
    }
}
