package com.kodilla.inheritance.homework;

public class Systems {
    public static void main(String[] args) {
        OperatingSystems operatingSystems = new OperatingSystems(2017);
        operatingSystems.displayPublicationDate();
        operatingSystems.turnOn();
        operatingSystems.turnOff();

        OperatingSystems2 operatingSystems2 = new OperatingSystems2(2018);
        operatingSystems2.turnOn();
        operatingSystems2.turnOff();

        OperatingSystems3 operatingSystems3 = new OperatingSystems3(2019);
        operatingSystems3.turnOn();
        operatingSystems3.turnOff();
    }
}
