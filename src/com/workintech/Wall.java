package com.workintech;

public class Wall {
    private String direction;

    public String getDirection() {
        return direction;
    }

    public Wall(String direction) {
        this.direction = direction;
    }
    public void create () {
        System.out.println("Wall created to direction: " + direction);
    }
}
