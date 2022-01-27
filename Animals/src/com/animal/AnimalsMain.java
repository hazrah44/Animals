/**
 * 
 */
package com.animal;

import java.util.Scanner;

/**
 * @author hazrahothman
 *
 */
//MET CS 622_@Assignment 1_Hazrah Othman
public class AnimalsMain {

    // creates zoo array with index size 5
    static Zoo zoo = new Zoo(5);

    public static void main(String[] args) {
    	Alpaca alpaca = new Alpaca();
    	Antelope antelope = new Antelope();
    	Leopard leopard = new Leopard();
    	
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Hello! Welcome to AnimalsApp. " + "Please select you number: ");
		System.out.println();

          // print menu

          for (int i = 1; i <= 5; i++)
        	  
                System.out.println(i + ". Type of Animal #" + i);

          System.out.println("0. Quit");
          System.out.println();
          // handle user commands

          boolean quit = false;

          int menuItem;

          do {
        	  System.out.println("Select the animal number 0 to 9 and use double click to enter:");
        	  
        	  menuItem = in.nextInt();

              switch (menuItem) {

                case 1:
                	 // do something...
                      System.out.print("You've chosen Alpaca, " + " " + alpaca + "\n" );
                      System.out.println();
                      break;

                case 2:
                	 // do something...
                      System.out.println("You've chosen item Antelope, " + " " + antelope);
                     
                      break;

                case 3:

                      System.out.println("You've chosen item Leopard, " +" " + leopard);

                      // do something...

                      break;

                case 4:

                      System.out.println("You've chosen item is not available and please try again");

                      // do something...

                      break;

                case 5:

                      System.out.println("You've chosen item is not available and please try again");

                      // do something...

                      break;

                case 0:

                      quit = true;

                      break;

                default:

                      System.out.println("Invalid choice.");

                }

          } while (!quit);

          System.out.println("Bye-bye! See you again");

    }

}
