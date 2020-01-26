/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpayment;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: Car Payment
 * Course Code: ICS3U0A
 * Date: October 14, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner; // Imports Scanner needed for user input
public class CarPayment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // Opens Scanner needed for user input
        
        int principal, numberOfMonthlyPayments; // Makes integer variables needed
        double interestRate; // Makes a double variable for interest rate (decimal) 
        final double MONTHLYPAYMENT; // Makes a constant variable for the monthly payment
         
        System.out.print("Principal: "); // Prompts user for principal
        principal = input.nextInt(); // Allows user to enter principal
        System.out.print("Interest Rate: "); // Prompts user for interest rate
        interestRate = input.nextDouble(); // Allows user to enter interest rate
        System.out.print("Number of monthly payments: "); // Prompts user for number of monthly payments
        numberOfMonthlyPayments = input.nextInt(); // Allows user to enter number of monthly payments
        
        MONTHLYPAYMENT = (principal * (interestRate/12)) / (1 -(Math.pow(1 + interestRate/12, -numberOfMonthlyPayments)));
        // Line 38 (Above line) makes monthly payment equal to the formula for monthly payment
        
        System.out.format("The monthly payment is: $%.2f\n", MONTHLYPAYMENT); // Prints the monthly payment
    }
    
}
