package com.timbuchalka;

public class CarMain {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car holden = new Car();
        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("911");

    }

}
