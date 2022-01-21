package Animals;
//MET CS 622_@Assignment 1_Hazrah Othman
//1.6.4 Code showing upcasting or downcasting
//Show the relevant code (only) and explain why upcasting or downcasting is appropriate here. It should be clear where the code is located (class and method).
//Inheritance 
//superclass animals for alpaca
public class Alpaca extends Animals {
	public Alpaca() {
		super();
	}
	public void talk() {
		//Reference: https://en.wikipedia.org/wiki/List_of_animal_sounds
		System.out.println("Cluck");
	}
	public void timePasses() {
		super.timePasses();
		if (super.getHunger() >= 3) {
			//Reference: https://en.wikipedia.org/wiki/List_of_animal_sounds
			System.out.println("The alpaca paces hungrily and Scream!!!!!!");
		}
	}
	public String toString() {
		return "Alpaca";
	}
}

/*output:The zoo location has the animal:
Alpaca
Antelope
Leopard
The alpaca paces hungrily and Scream!!!!!!
Cluck
The antelope will snort and chew quietly.
Growl*/