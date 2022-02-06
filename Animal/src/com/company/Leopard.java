package com.company;

public class Leopard extends Animal {
    /**
     * Constructor linked to the
     * superclass Animal.
     */
    public Leopard() {
        super();
    }

    /**
     * superclass to have the leopard speak.
     */
    public void talk() {
        System.out.println("Roar!");
    }

    /**
     * Overrides the superclass method
     * to create the leopard representation.
     */
    public String toString() {
        return "Leopard";
    }
}