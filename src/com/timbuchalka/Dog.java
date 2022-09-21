package com.timbuchalka;

public class Dog {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(int eyes, int legs, int tail, int teeth, String coat) {
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getTail() {
        return tail;
    }

    public int getTeeth() {
        return teeth;
    }

    public String getCoat() {
        return coat;
    }
}
