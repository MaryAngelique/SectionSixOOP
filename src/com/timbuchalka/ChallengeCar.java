package com.timbuchalka;

public class ChallengeCar extends ChallengeVehicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public ChallengeCar(String name, String size, int wheels, int doors, int gears, boolean isManual, int currentGear) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }


}
