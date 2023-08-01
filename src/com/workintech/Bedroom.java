package com.workintech;

public class Bedroom extends Room {
    private Bed bed;
    private  Wardobe wardobe;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Lamp lamp, Carpet carpet, Bed bed, Wardobe wardobe) {
        super(name, wall1, wall2, wall3, wall4, ceiling, lamp, carpet);
        this.bed = bed;
        this.wardobe = wardobe;
    }

    public Bed getBed() {
        return bed;
    }


    public Wardobe getWardobe() {
        return wardobe;
    }


}
