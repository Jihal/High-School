/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypow;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: My Pow
 * Course Code: ICS3U0A
 * Date: October 14, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner; // Imports Scanner needed for user input
public class MyPow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // Opens Scanner needed for user input
        int x, y; // Makes a variable for x and y 
        final double FORMULA; // Makes a constant for the formula provided
        
        System.out.print("Enter a value for X: "); // Prompts user for the value of x
        x = input.nextInt(); // Allows user to enter the value of x
        System.out.print("Enter a value for Y: "); // Prompts user for the value of y
        y = input.nextInt(); // Allows user to enter the value of y
        
        FORMULA = Math.exp(y * Math.log(x)); // Makes formula equal to the formula provided
        System.out.println("The result from using the formula is : " + FORMULA); // Prints the result using the formula
        
        System.out.println("The result from using the Math pow () method is: " + Math.pow(x, y)); // Prints the result using Math.pow function
    }
    
}
