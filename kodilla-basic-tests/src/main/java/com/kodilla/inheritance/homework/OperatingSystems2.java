package com.kodilla.inheritance.homework;


public class OperatingSystems2 extends OperatingSystems {


    @Override
    public void turnOn() {
        System.out.println("Turn on quickly ");
    }

    public void turnOff() {
        System.out.println("Turn off after 5 minutes");
    }

    public OperatingSystems2(int publicationDate) {
        super(publicationDate);
        System.out.println("Publication date" + " " + publicationDate);

    }


}
