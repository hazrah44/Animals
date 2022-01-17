package main;

public abstract class Animal {

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
	 */
	public void timePasses() {
		hunger++;
	}
	
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
