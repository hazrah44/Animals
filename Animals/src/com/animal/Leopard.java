/**
 * 
 */
package com.animal;

/**
 * @author hazrahothman
 *
 */
//MET CS 622_@Assignment 1_Hazrah Othman
//1.6.4 Code showing upcasting or downcasting
//Show the relevant code (only) and explain why upcasting or downcasting is appropriate here. It should be clear where the code is located (class and method).
public class Leopard extends Animals {
	public Leopard () {
		
	}
	public Leopard(String name) {
        super(name);
    }

    @Override
    public String noise() {

        return "grownl";
    }

    @Override
    public String toString() {

        return getName() + " sound is: " + noise();

    }

}
