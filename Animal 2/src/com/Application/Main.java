package com.Application;

public class Main {
    public static void main(String[] args){
        System.out.println("Enter the Animal List: ");
        readfile r = new readfile();
        r.openFile();
        r.readFile();
        r.closeFile();
    }
}
