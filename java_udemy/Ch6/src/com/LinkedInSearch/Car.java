package com.LinkedInSearch;

public class Car extends Vehicle{

//    sedan, sports, coupe, hatchback etc
    private String type;
    private String transmission;

    public Car(int wheels, int doors, int windows, int trunk, int length, int width, int height, String type, String transmission) {
        super(wheels, doors, windows, trunk, length, width, height);
        this.type = type;
        this.transmission = transmission;
    }

    public void fueling(){
        System.out.println("getting fuel");
    }

    @Override
    public void brake() {
        System.out.println("braking the car, specifically");

    }
}
