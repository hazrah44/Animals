package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Main {


    public static void main(String[] args) throws IOException {
        // Create an ArrayList object
        //ArrayList<String> animal = new ArrayList<String>();

        /* A program that demonstrates the conversion of an array into a generic list
        Create an ArrayList object
        ArrayList<String> animal = new ArrayList<String>();
        */
        // Generic method
        String str[] = new String[]{"1: Alpaca", "2: Antelope", "3: Leopard"};
        List<String> list = Arrays.asList(str);

        /*animal.add("1:Alpaca");
        animal.add("2:Antelope");
        animal.add("3:Leopard");*/

        Animal alpaca = new Alpaca();
        Animal antelope = new Antelope();
        Animal leopard = new Leopard();

        //Using Lambda expressions for the system application
        //animal.forEach((n) -> {
        //System.out.println(n);
        //});
        System.out.println("------------All Animals List------------");
        System.out.println();
        System.out.println("The list is: " + list);
        System.out.println();


        //for (String i : str) {
        //System.out.println(i);

        //// Java Program to illustrate
        //// reading from Text File
        //// using Scanner Class
        File file = new File("/Users/hazrahothman/Desktop/hello.txt");
        Scanner sc = new Scanner(file);

        //Still working on adding more animal and sound in the txt file
        while(sc.hasNextLine()) {
            System.out.println("There are many animals will be adding in the system:"+ " " + sc.nextLine());
        }

        Scanner myObj = new Scanner(System.in);
        System.out.println("------------All files------------");
        System.out.println();
        System.out.println("Enter name: ");
        String userInput = myObj.nextLine();
        System.out.println("Hello: " + userInput + " " + "\n");

        System.out.println("------------All files------------");
        System.out.println("Enter the number: ");
        int num = myObj.nextInt();
        if (num == 1) {
            System.out.println("------------All files------------");
            System.out.println("Sophie the" + " " + alpaca);
            System.out.println();
            alpaca.talk();
        } else if (num == 2) {
            System.out.println("------------All files------------");
            System.out.println("Lily the" + " " + antelope);
            System.out.println();
            antelope.talk();
        } else if (num == 3) {
            System.out.println("------------All files------------");
            System.out.println("Thomas the" + " " + leopard);
            System.out.println();
            leopard.talk();
            //Add animals


            System.out.println("------------All files------------");
        } else
            try {
                System.out.println("------------All files------------");
                System.out.println("Enter name: ");
                int num2 = myObj.nextInt(6);
                //error
            } catch (Exception e) {
                System.out.println("------------All files------------");
                System.out.println("Something went wrong.");
                //The finally statement lets you execute code
            } finally {
                System.out.println("------------All files------------");
                System.out.println("The 'try catch' is finished.");
            }
        }
    }

















