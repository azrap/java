package com.LinkedInSearch;

public class Vehicle {

    private int wheels;
    private int doors;
    private int windows;
    private int trunk;
    private int length;
    private int width;
    private int height;

    public Vehicle(int wheels, int doors, int windows, int trunk, int length, int width, int height) {
        this.wheels = wheels;
        this.doors = doors;
        this.windows = windows;
        this.trunk = trunk;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void steering(){
        System.out.println("steering the wheels");
    }

    public void move(int speed){
        System.out.println("moving at speed " + speed + "mph");
    }

    public void brake(){
        System.out.println("braking the car");
    }
}
