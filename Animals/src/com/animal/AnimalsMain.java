/**
 * 
 */
package com.animal;

/**
 * @author hazrahothman
 *
 */
//MET CS 622_@Assignment 1_Hazrah Othman
public class AnimalsMain {

	public static void main(String[] args) {
		//The main class to test the methods of animals and zoo
		Animals alpaca = new Alpaca();
		Animals antelope = new Antelope();
		Animals leopard = new Leopard();
		
		Zoo growl = new Zoo();
		growl.putInRoom1(alpaca);
		growl.putInRoom2(antelope);
		growl.putInRoom3(leopard);
		growl.printZoo();
		
		growl.timePasses();
		growl.timePasses();
		growl.timePasses();
		growl.allTalk();
	}

}
