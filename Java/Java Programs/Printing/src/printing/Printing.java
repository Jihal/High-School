/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printing;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: Printing
 * Course Code: ICS3U0A
 * Date: October 13, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */

import java.util.Scanner; // Imports Scanner needed for user input

public class Printing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in); // Opens Scanner needed for user input
    
    double copies, totalCost, pricePerCopy; // Makes variables needed for the program
    
    System.out.print("Enter the number of copies to be printed: "); // Prompts user for number of copies to be printed
    copies = input.nextInt(); // Allows user to enter number of copies to be printed
    
    if (copies > 0 && copies < 100) { // If the number of copies are above 0 and equal or less than 100
        System.out.println("Price per copy is: $0.30"); // The price per copy is 30 cents
        totalCost = copies * 0.30; // Make total cost equal to its formula
        System.out.println("Total cost is: " + totalCost); //Prints the total cost
    } else if (copies >= 100 && copies < 500) { // If the number of copies are equal to or above 100 and less than 500
        System.out.println("Price per copy is: $0.28"); // The price per copy is 28 cents
        totalCost = copies * 0.28; // Make total cost equal to its formula
        System.out.println("Total cost is: " + totalCost); //Prints the total cost
    } else if (copies >= 500 && copies < 750) { // If the number of copies are equal to or above 500 and less than 750
        System.out.println("Price per copy is: $0.27"); // The price per copy is 27 cents
        totalCost = copies * 0.27; // Make total cost equal to its formula
        System.out.println("Total cost is: " + totalCost); //Prints the total cost
    } else if (copies >= 750 && copies < 1000) {  // If the number of copies are equal to or above 750 and less than 1000
        System.out.println("Price per copy is: $0.26"); // The price per copy is 26 cents
        totalCost = copies * 0.26; // Make total cost equal to its formula
        System.out.println("Total cost is: " + totalCost); //Prints the total cost
    } else if (copies >= 1000) { // If the number of copies are equal to or above 1000
        System.out.println("Price per copy is: $0.25"); // The price per copy is 25 cents
        totalCost = copies * 0.25; // Make total cost equal to its formula
        System.out.println("Total cost is: " + totalCost); //Prints the total cost
    }
    
    
    
    
    
    }
    
}
