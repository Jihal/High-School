/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdiscountquestion;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: Test Discount Question
 * Course Code: ICS3U0A
 * Date: October 3, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner; // Imports the Scanner which allows user input
public class TestDiscountQuestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // Opens Scanner which allows user input
        
        double purchasePrice, discountRate, discountedPrice, discountAmount; // Creates variables needed for the program
        
        System.out.print("Enter the purchase price: $"); // Prompts the user for purchase price
        purchasePrice = input.nextDouble(); // Allows the user to enter purchase price
        
        System.out.print("Enter the discount rate%: "); // Prompts the user for discount rate
        discountRate = input.nextDouble(); // Allows the user to enter discount rate
        
        discountRate = discountRate/100; // Overwrites and converts discount rate to a decimal number
        
        discountAmount = discountRate*purchasePrice; // Finds the discount amount from discount rate and purchase price
        
        discountedPrice = purchasePrice - discountAmount; // Finds the discounted price by deducting the discounted amount from the purchase price
        
        System.out.format("Discounted price is: $%.2f", discountedPrice); // Prints the discounted price and limits it to 2 decimal places
        
    }
    
}
