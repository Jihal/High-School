/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package energy;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: My First
 * Course Code: ICS3U0A
 * Date: September 14, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner; // Import the Scanner which allows the user to input information
public class Energy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // Open the Scanner which allows the user to input information
        double mass, Joules, light_bulbs; // Make a variable for mass, Joules, and lightbulbs
        final double SPEED_OF_LIGHT, C_SQUARED; // Make a constant for speed of light and speed of light squared (for the equation)
        SPEED_OF_LIGHT = 3.0E+8; // Make speed of light equal to what the speed of light is (Self-note: the E+8 basically means 10 to the power of 8) 
        System.out.print("Enter the mass in kilograms: "); // Print "Enter the mass in kilograms: " for the user to know what to enter for the next line
        mass = input.nextDouble(); // Make the mass inputable by the user
        C_SQUARED = SPEED_OF_LIGHT * SPEED_OF_LIGHT; // Make csquared equal to the speed of light squared (needed for equation) 
        Joules= mass * C_SQUARED; // Make a equation for Joules from the excercise
        light_bulbs = Joules/36000; // Since each 100-watt light bulb takes 36000 Joules make light bulbs equal to the total Joules (from mass) divided by 36000
        System.out.println("The enery produced in Joules is = " + Joules); // Print the total energy produced in Joules
        System.out.println("The number of 100-watt light bulbs powered = " + light_bulbs); // Print the amount of light bulbs that can powered with the Joules avaiable 
        
    }
    
}
