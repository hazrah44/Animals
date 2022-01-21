package Animals;
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
/*output:The zoo location has the animal:
Alpaca
Antelope
Leopard
The alpaca paces hungrily and Scream!!!!!!
Cluck
The antelope will snort and chew quietly.
Growl*/