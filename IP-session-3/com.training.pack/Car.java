package com.training.pack;

public class Car {
    String car;
    int speed;

    // Constructor
    Car(String car, int speed) {
        this.car = car;
        this.speed = speed;
    }

    // Instance method
    public void brandinfo() {
        System.out.println("Brand Name: " + car);
        System.out.println("Max Speed: " + speed);
    }
}
