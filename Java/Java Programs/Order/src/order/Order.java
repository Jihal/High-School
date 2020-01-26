/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package order;

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
public class Order {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // Opens Scanner which allows user input
        final double BURGERS_COST, FRIES_COST, SODAS_COST; // Makes constant variables needed for the program
        double burgers, fries, sodas, totalBurgersCost, totalFriesCost, totalSodasCost;// Makes variables needed for the program
        double totalCost, tax, totalCostAfterTax, amountTendered, change; // Makes variables needed for the program 
       System.out.print("Enter the number of burgers: "); // Tells user to enter number of burgers in output
       burgers = input.nextDouble(); // Allows user to enter number of burgers in output
       System.out.print("Enter the number of fries: "); // Tells user to enter number of fries in output
       fries = input.nextDouble(); // Allows user to enter number of fries in output
       System.out.print("Enter the number of sodas: "); // Tells user to enter number of sodas in output
       sodas = input.nextDouble(); // Allows user to enter number of sodas in output
       
       BURGERS_COST = 1.69; // Makes burgers equal to the total burgur cost
       FRIES_COST = 1.09; // Makes fries equal to the total fries cost
       SODAS_COST = 0.99; // Makes sodas equal to the total sodas cost
       
       totalBurgersCost = BURGERS_COST * burgers; // Finds the total burgers cost  
       totalSodasCost = SODAS_COST * sodas; // Finds the total sodas cost
       totalFriesCost = FRIES_COST * fries; // Finds the total fries cost
       
       totalCost = totalBurgersCost + totalSodasCost + totalFriesCost; // Finds the total cost of everything before tax
       tax = totalCost * 0.065; // Finds the tax
       totalCostAfterTax = totalCost + tax; // Finds the total cost after tax
       
       System.out.format("Total before tax: $ %.2f\n" ,totalCost); // Prints total cost before tax
       System.out.format("Tax: $ %.2f\n", tax); // Prints tax
       System.out.format("Final total: $ %.2f\n", totalCostAfterTax); //Prints total cost after tax
       
       System.out.print("Enter amount tendered: $"); // Tells user to type amount tendered
       amountTendered = input.nextDouble(); // Allows user to type amount tendered
       change = amountTendered - totalCostAfterTax; // Finds the change
       System.out.format("Change: $%.2f\n", change); // Prints the change
    }
    
}
