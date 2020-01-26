/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgallonquestion;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: My First
 * Course Code: ICS3U0A
 * Date: September 14, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */

import java.util.Scanner; // Imports Scanner which allows user input

public class TestGallonQuestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // Opens Scanner which allows user input
        
        final double QUARTS, TABLESPOONS; // Makes constant double (decimal) variables needed for the program
        final int PINTS, CUPS;  // Makes constant integers needed for the program
        double gallon; // Makes a double (decimal) variable for gallon
        
        System.out.print("Enter the number of gallons: "); // Prompts the user for number of gallons
        gallon = input.nextInt(); // Allows the user to enter the number of gallons
        
        QUARTS = gallon * 4;  // Makes quarts equal to gallon times four
        PINTS = (int) (QUARTS * 2); // (int) does a conversion from integer to double and makes pints equal to quarts times two
        CUPS = PINTS * 2; // Makes cups equal to pints times two
        TABLESPOONS = CUPS * 16; // Makes tablespoons equal to cups times sixteen
        
        System.out.println("In " + gallon + " gallons there are: "); // Tells user that in the amount of gallons entered there are: 
        System.out.println(QUARTS + " quarts"); // Prints the result of quarts
        System.out.println(PINTS + " pints"); // Prints the result of pints
        System.out.println(CUPS + " cups"); // Prints the result of cups
        System.out.println(TABLESPOONS + " tablespoons"); // Prints the result of tablespoons
    }
    
}
