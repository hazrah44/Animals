package com.company;

public class Antelope extends Animal{
    /**
     * Constructor linked to the
     * superclass Animal.
     */
    public Antelope() {
        super();
    }
    /**
     * superclass to have the antelope speak.
     */
    public void talk() {
        System.out.println("The antelope quietly chews the food and make a sound...snort!!!.");
    }

    /**
     * to create the zebra representation.
     */
    public String toString() {
        return "Antelope";
    }
}
