package com.kodilla.inheritance.homework;

public class OperatingSystems {

    private int publicationDate;

    public OperatingSystems(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    public void displayPublicationDate() {
        System.out.println("Publication date" + " " + publicationDate);
    }

    public void turnOn() {
        System.out.println("Turn on");
    }

    public void turnOff() {
        System.out.println("Turn off");
    }
}
