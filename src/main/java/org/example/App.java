/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Maria Quiros
 */

/*Declaring package*/
package org.example;

/*Importing scanner class*/
import java.util.Scanner;

/*Specifying class*/
public class App {
    public static void main(String[] args) {

        /*Creating a scanner object*/
        Scanner scan = new Scanner(System.in);

        /*Initializing variables*/
        String choice;
        double fTemp;
        double cTemp;
        double celsius;
        double fahrenheit;

        System.out.println("Press C to convert from Fahrenheit to Celsius.");

        System.out.println("Press F to convert from Celsius to Fahrenheit.");

        System.out.println("Your choice:");
        choice = scan.nextLine();
        
        /*If statement to convert from Fahrenheit to Celsius*/
        if ((choice.equals("C")) || (choice.equals("c"))) {
            System.out.println("Please enter the temperature in Fahrenheit:");
            fTemp = scan.nextDouble();
            celsius = ((fTemp - 32) * (5.0 / 9.0));
            System.out.printf("The temperature in Celsius is %.0f", +celsius);
        }

        /*If statement to convert from Celsius to Fahrenheit*/
        if ((choice.equals("F")) || (choice.equals("f"))) {
            System.out.println("Please enter the temperature in Celsius:");
            cTemp = scan.nextDouble();
            fahrenheit = (((cTemp * 9) / 5) + 32);
            System.out.printf("The temperature in Fahrenheit is %.0f", +fahrenheit);
        }
    }
}
