package Animals;
//MET CS 622_@Assignment 1_Hazrah Othman
//1.6.4 Code showing upcasting or downcasting
//Show the relevant code (only) and explain why upcasting or downcasting is appropriate here. It should be clear where the code is located (class and method).
public class Leopard extends Animals {
	public Leopard () {
		super();
	}
	public void talk() {
		System.out.println("Growl");
	}
	public String toString() {
		return "Leopard";
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