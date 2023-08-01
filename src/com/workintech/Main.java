package com.workintech;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tests");
        Wall wall1 = new Wall("left");
        Wall wall2 = new Wall("right");
        Ceiling ceiling1 = new Ceiling(10,PaintColor.BLUE);
        Bed bed1 = new Bed("double",4,5,3,2);
        Lamp lamp1 = new Lamp(LampType.CEILING_LAMP,true,4);
        Wardobe wardobe1 = new Wardobe(4,5, 4.5);
        Carpet carpet1 = new Carpet(2,3,PaintColor.ORANGE);

        Bedroom bedroom1 = new Bedroom("firstroom",wall1,wall1,wall1,wall2,ceiling1,lamp1,carpet1,bed1,wardobe1);
        System.out.println(bedroom1.getBed());
        System.out.println(bedroom1.getName());
        System.out.println(bedroom1.getCarpet());
    }
}