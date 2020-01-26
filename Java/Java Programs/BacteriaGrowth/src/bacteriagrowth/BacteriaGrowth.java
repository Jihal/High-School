/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bacteriagrowth;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: Bacteria Growth
 * Course Code: ICS3U0A
 * Date: October 14, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner; // Imports Scanner needed for user input
public class BacteriaGrowth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // Opens scanner needed for user input
        double finalAmount, constantGrowthValue, time; // Makes double variables needed (decimal)
        int initialAmount; // Makes the integer variables needed
        
        System.out.print("Enter initial bacteria amount: "); // Prompts user for initial bacteria amount
        initialAmount = input.nextInt(); // Allows user to enter initial bacteria amount 
        System.out.print("Enter a constant value for k: "); // Prompts user for constant value of k
        constantGrowthValue = input.nextDouble(); // Allows user to enter constant value for k 
        System.out.print("Enter the growth time period in hours: "); // Prompts user for growth time in hours
        time = input.nextInt(); // Allows user to enter growth time in hours
        
        finalAmount = initialAmount * Math.exp(constantGrowthValue*time); // Makes final amount equal to its formula
        
        System.out.format("%.1f", finalAmount);
        System.out.format(" bacteria will be present after %.1f", time);
        System.out.println(" hours.");
        // The above three "System.out" lines print the amount of bacteria that will be present after the time provided
    }
    
}
