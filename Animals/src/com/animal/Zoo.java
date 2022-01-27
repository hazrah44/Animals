/**
 * 
 */
package com.animal;

import java.util.Arrays;

/**
 * @author hazrahothman
 *
 */
//MET CS 622_@Assignment 1_Hazrah Othman
public class Zoo {
	Animals[] zoo;
    final int zooSize;
    int zooCounter = 0;

    // default constructor
    public Zoo() {
        this.zooSize = 10;
        zoo = new Animals[zooSize];
    }

    // constructor for initializing a barn
    public Zoo(int zooSize) {
        if (zooSize > 0) {
            this.zooSize = zooSize;
        } else {
            this.zooSize = 1;
        }

        zoo = new Animals[zooSize];
    }

    // function for adding animals to zoo array
    public void addAnimal(Animals animal) {

        boolean first = true;

        // when barn is full, print message
        if (zoo[zooSize - 1] != null) {

            System.out.println("Zoo is full!");

        } else {

            // loops barn array for first empty space
            for (int i = 0; i < zoo.length; i++) {

                if (zoo[i] != null) {
                    continue;
                } else if (first == true) {
                    zoo[i] = animal;
                    zooCounter++;
                    first = false;
                }
            }
        }
    }

    // function that returns the array with only occupied spaces
    public Animals[] getZoo() {

        return Arrays.copyOf(zoo, zooCounter);
    }


}


	    