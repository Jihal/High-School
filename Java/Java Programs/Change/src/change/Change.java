/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package change;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: Change Exercise 6
 * Course Code: ICS3U0A
 * Date: October 3, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner; // Import the Scanner which allows the user to input data
public class Change {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int remainder1, remainder2, remainder3, cents, quarters, dimes, nickels, pennies; // Makes variable for the remainders, cents, and the different types of change
        
        Scanner input = new Scanner(System.in); // Open up Scanner which allows the user to input data
        System.out.print("Enter the change in cents: "); // Print the data the user needs to enter(next line) 
        cents = input.nextInt(); // Allows the user to input the amount of cents 
        
            
        quarters = cents/25; // Makes quarters equal to the cents divided by 25 (becuase quarters are worth 25 cents) 
        remainder1 = cents%25;  // Finds the remainder from the cents after the minimal number of quarters is deducted
        dimes = remainder1/10; // Makes the minimal number of dimes equal to the remainder after the quarters deduction divided by 10 (becuase dimes are worth 10 cents) 
        remainder2 = remainder1%10; // Finds the remainder from the cents after the minimal number of quarters and dimes is deducted
        nickels = remainder2/5; // Makes the minimal number of nickels equal to the remainder after the quarters and dimes deduction divided by 5 (because nickels are worth 5) 
        remainder3 = remainder2%5; // Finds the remainder from the cents after the minimal number of quarters, dimes, and nickels have been deducted
        pennies = remainder3/1; // The rest of the coins are divided by 1 (unnecesscary) to figure out the number of pennies
        
        System.out.println("The minimum number of coins is: "); // Prints the minimum number of coins so the user understands what will be printed
        System.out.println("Quarters: " + quarters); // Prints the minimum number of quarters
        System.out.println("Dimes: " + dimes); // Prints the minimum number of dimes
        System.out.println("Nickels: " + nickels); // Prints the minimum number of nickels
        System.out.println("Pennies: " + pennies); // Prints the minimum number of pennies
       
    }
    
}
