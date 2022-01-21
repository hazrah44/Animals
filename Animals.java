package Animals;
//MET CS 622_@Assignment 1_Hazrah Othman
//1.6.2 Code showing an abstract class or interface
//Show the relevant code (only) and explain why an abstract class or interface is appropriate here. It should be clear where the code is located (class and method).
//This is animals class
public abstract class Animals {
	
	private  int hunger;
	
	public Animals() {
		hunger = 0;
	}
	public int getHunger() {
		return hunger;
	}
	public abstract void talk();
	public void timePasses() {
		hunger++;
	}
	public void food() {
		hunger = 0;
	}
	public abstract String toString();
	
	}
/*output:The zoo location has the animal:
Alpaca
Antelope
Leopard
The alpaca paces hungrily and Scream!!!!!!
Cluck
The antelope will snort and chew quietly.
Growl*/
