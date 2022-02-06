package com.company;

public abstract class Animal {

    public String talk;
    /**
         * Field for the level of hunger of
         * the animal.
         */
        private int hunger;

        /**
         * Constructor that sets the hunger
         * of the animal to zero.
         */
        public Animal() {
            hunger = 0;
        }

        /**
         * Retrieves the hunger of the
         * animal.
         *
         * @return hunger
         */
        public int getHunger() {
            return hunger;
        }
        /**
         * Method to make the animal
         * speak.
         */
        public abstract void talk();

        /**
         * Adds times since the animal
         * has eaten - increases hunger.
         * @return
         */


        /**
         * Feed the animal. Not hungry
         * anymore.
         */
        public void food() {
            hunger = 0;
        }

        /**
         * Sets the string representation of the
         * class object.
         */
        public abstract String toString();
    }


