/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleinterestpartb;

import java.util.Scanner; // Imports Scanner which allows user input

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: Simple Interest Part B Exercise 15
 * Course Code: ICS3U0A
 * Date: October 3, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
public class SimpleInterestPartB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // Opens Scanner which allows user input
        double amount, principal, years, interestRate; // Makes variables needed for the program
        
        System.out.print("Enter the amount desired: "); // Tells user to type the amount desired in output
        amount = input.nextDouble(); // Allows user to type the amount desired in output
        System.out.print("Enter the number of years: "); // Tells user to type the number of years in output
        years = input.nextDouble(); // Allows user to type number of years in output
        System.out.print("Enter the interest rate: "); // Allows user to type interest rate in output
        interestRate = input.nextDouble(); // Tells user to type interest rate in output
        
        principal = amount / (1 + years * interestRate); // Makes principal equal to the formula needed to find the principal
        
        System.out.format("The principal that will be needed to invested is: $ %.2f\n" , principal); /* Prints the pricinpal that 
        will be needed to get the amount desired
        */
    }
    
}
