package Animals;
//MET CS 622_@Assignment 1_Hazrah Othman
public class Zoo {
	private Animals room1;
	private Animals room2;
	private Animals room3;
	
	private Alpaca alpaca;
	private Antelope antelope;
	private Leopard leopard;
	
	public Zoo() {
		room1 = null;
		room2 = null;
		room3 = null;
		
		alpaca = new Alpaca();
		antelope = new Antelope();
		leopard = new Leopard();
	}
	public void putInRoom1(Animals animals) {
		room1 = animals;
	}
	public void putInRoom2(Animals animals) {
		room2 = animals;
	}
	public void putInRoom3(Animals animals) {
		room3 = animals;
	}
	public void printZoo() {
		System.out.println("The zoo location has the animal:");
		if(room1 !=null) {
			System.out.println("\t"  + room1);
		}
		if(room2 !=null) {
			System.out.println("\t"  + room2);
		}
		if(room3 !=null) {
			System.out.println("\t"  + room3);
		}
}
	public void timePasses() {
		if (room1 instanceof Alpaca || room2 instanceof Alpaca || room3 instanceof Alpaca) {
			alpaca.timePasses();
		}
		if (room1 instanceof Antelope || room2 instanceof Antelope || room3 instanceof Antelope) {
			antelope.timePasses();
		}
		if (room1 instanceof Leopard || room2 instanceof Leopard || room3 instanceof Leopard) {
			leopard.timePasses();
		}
	}
	public void allTalk() {
		if (room1 instanceof Alpaca || room2 instanceof Alpaca || room3 instanceof Alpaca) {
			alpaca.talk();
		}
		if (room1 instanceof Antelope || room2 instanceof Antelope || room3 instanceof Antelope) {
			antelope.talk();
		}
		if (room1 instanceof Leopard || room2 instanceof Leopard || room3 instanceof Leopard) {
			leopard.talk();
		}
	}
	public void feeAll() {
		if (room1 instanceof Alpaca || room2 instanceof Alpaca || room3 instanceof Alpaca) {
			alpaca.food();
		}
		if (room1 instanceof Antelope || room2 instanceof Antelope || room3 instanceof Antelope) {
			antelope.food();
		}
		if (room1 instanceof Leopard || room2 instanceof Leopard || room3 instanceof Leopard) {
			leopard.food();
		}
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
