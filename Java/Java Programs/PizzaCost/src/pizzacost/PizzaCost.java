/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzacost;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: My First
 * Course Code: ICS3U0A
 * Date: September 14, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner; // Import the Scanner which allows input
public class PizzaCost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // Open up Scanner which allows input
        final double LABOR_COST, RENT_COST; // Make a constant for labor and rent cost since they never change
        double totalCost, diameter; // Make a variable for total cost and diameter (This is not constant since they change) 
        LABOR_COST = 0.75; // Make labor cost equal to the fixed price for labor cost
        RENT_COST = 1.00; // Make rent cost equal to the fixed price for rent cost
        System.out.print("Enter the diameter of the pizza in inches: "); // Print "Enter the diameter of the pizza in inches: " for the user to understand what to type in the output
        diameter = input.nextInt(); // Allow the user to enter a diameter in the output
        totalCost = LABOR_COST + RENT_COST + 0.05*diameter*diameter; // Make the total cost equal to the total cost equation as mentioned in the excerise
        System.out.format("The cost of making the pizza is: $%.2f\n",totalCost); // Print the cost of making the pizza and write that it is the cost of making the pizza so that the user understands (this is in format and not println because of the need to limit decimal places) 
    }
    
}
