/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decay;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: Decay
 * Course Code: ICS3U0A
 * Date: October 18, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner; // Imports Scanner required for user input
public class Decay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in); // Opens Scanner required for user input
        
        double initialMass, finalMass, halfLife; // Makes double variables needed for the program
        int find, time; // Makes integer variables needed for the program
        
        System.out.println("1. Final Amount"); // States the first option
        System.out.println("2. Initial Amount"); // States the second option
        System.out.println("3. Constant <half-life>"); // States the third option
        
        boolean choice = false; // Makes a boolean variable for choice and sets it to false
        
        while (choice == false) { // While choice is false keep asking the user for the option until user chooses option from 1-3
        System.out.print("Find: "); // Prompts user for option
        find = input.nextInt(); // Allows user to enter option
        
       if (find == 1) { // If user chooses option one
           choice = true; // Don't prompt user for an option
           
           System.out.print("Enter initial mass: "); // Prompts user for initial mass
           initialMass = input.nextDouble(); // Allows user to enter initial mass 
           System.out.print("Enter time elapsed in years: "); // Prompts user for time in years
           time = input.nextInt(); // Allows user to enter time in years
           System.out.print("Enter constant <half-life>: "); // Prompts user for the constant half-life
           halfLife = input.nextDouble(); // Allows user to enter the constant half-life
           
           finalMass = (initialMass * Math.exp (-halfLife * time)); // Makes final mass equal to its formula
           
           System.out.format("Final Amount: %.2f\n", finalMass); // Prints final mass
           
           
       }
       else if (find == 2) { // If user chooses option two
           choice = true; // Don't prompt user to pick an option
           
           System.out.print("Enter final mass: "); // Prompt user to enter final mass
           finalMass = input.nextDouble(); // Allow user to enter final mass
           System.out.print("Enter time elapsed in years: "); // Prompt user for time in years
           time = input.nextInt(); // Allows user to enter time in years
           System.out.print("Enter constant <half-life>: "); // Prompt user for the constant half-life 
           halfLife = input.nextDouble(); // Allow user to enter the constant half-life
           
           initialMass = finalMass / Math.exp(-halfLife * time); // Makes initial mass equal to its formula
           
           System.out.format("Initial Amount: %.2f\n", initialMass); // Prints initial mass
           
           
       }
       else if (find == 3) { // If user picks option three 
           choice = true; // Don't prompt user to pick an option
           
           System.out.print("Enter final mass: "); // Prompts user for final mass
           finalMass = input.nextDouble(); // Allows user to enter final mass
           System.out.print("Enter initial mass: "); // Prompts user for initial mass
           initialMass = input.nextDouble(); // Allows user to enter initial mass
           System.out.print("Enter time elapsed in years: "); // Prompts user for time in years
           time = input.nextInt(); // Allows user to enter time in years
           
           halfLife = (Math.log (finalMass / initialMass)) / time; // Makes the constant half-life equal to its formula
           
           System.out.format("Constant <half-life>: %.5f\n", halfLife); // Prints the constant half-life
           
           
       }
    }
    
  }
}

