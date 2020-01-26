/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleinterest;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: Simple Interest Part A Excerise 15
 * Course Code: ICS3U0A
 * Date: October 3, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner; // Imports Scanner which allows user input
public class SimpleInterest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // Opens Scanner which allows user input
        double amount, principal, years, interestRate; // Makes variables needed for the program
        
        System.out.print("Enter the principal: "); // Tells user to type principal amount in output
        principal = input.nextDouble(); // Allows user to type principal amount in output
        System.out.print("Enter the number of years: ");// Tells user to type the number of years in output
        years = input.nextDouble(); // Allows user to type the number of years in output
        System.out.print("Enter the interest rate: "); // Tells user to type interest rate in output
        interestRate = input.nextDouble(); // Allows user to type interest rate in output
        
        amount = principal * (1 + years * interestRate); // Makes amount equal to the formula given in excerise
        
        System.out.format("The value after the term is: $ %.2f\n" , amount); // Prints the total value after the term
    }
    
}
