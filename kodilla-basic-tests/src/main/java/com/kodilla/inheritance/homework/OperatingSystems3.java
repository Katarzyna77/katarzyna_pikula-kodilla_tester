package com.kodilla.inheritance.homework;

public class OperatingSystems3 extends OperatingSystems {

    @Override
    public void turnOn() {
        System.out.println("Turn on as fast as possible ");
    }

    public void turnOff() {
        System.out.println("Turn off after 2 minutes");
    }


    public OperatingSystems3(int publicationDate) {
        super(publicationDate);
        System.out.println("Publication date" + " " + publicationDate);

    }

}
