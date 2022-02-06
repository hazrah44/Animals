package com.company;

public class Alpaca extends Animal{

        /**
         * Constructor linked to the
         * superclass Animal.
         */
        public Alpaca() {
            super();
        }

        /**
         * Overrides the talk method of the
         * superclass to have the alpaca speak.
         */
        public void talk() {
            System.out.println("Cluck!!!!!!!!!!!!!!.");
        }

        /**
         * to create the alpaca representation.
         */
        public String toString() {
            return "Alpaca";
        }
    }

