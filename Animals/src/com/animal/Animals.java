/**
 * 
 */
package com.animal;

/**
 * @author hazrahothman
 *
 */
//MET CS 622_@Assignment 1_Hazrah Othman
//1.6.2 Code showing an abstract class or interface
//Show the relevant code (only) and explain why an abstract class or interface is appropriate here. It should be clear where the code is located (class and method).
//superclass for animals with basic function
public abstract class Animals {
	
	private  String name;
	//default constructor
	public Animals() {
		this.name = "Unknown name";
	}
	// constructor when naming the animal
    public Animals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String noise() {

        return "zZzZzz";
    }

    public String toString() {

        return this.name + " sound is: " + noise();

    }


}
