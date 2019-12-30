package com.kodilla.inheritance;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;

public class Car {
    private int wheels;
    private  int seats;

    public Car (int wheels, int seats) {
        this.wheels = wheels;
        this.seats = seats;
    }

    public void turnOnLights() {
        System.out.println("Lights were turned on");
    }

    public void openDoors() {
        System.out.println("Opening 4 doors");
    }

    public void displayNumberOfSeats() {
        System.out.println("Number of seats" + " " + seats);
    }


    public int getWheels() {
        return wheels;
    }
    public  int getSeats() {
        return seats;
    }
}
