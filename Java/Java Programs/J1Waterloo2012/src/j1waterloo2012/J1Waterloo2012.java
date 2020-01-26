/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1waterloo2012;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: Chapter 5 Test Code 1 / J1 Waterloo 2012
 * Course Code: ICS3U0A
 * Date: October 20, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner; // Imports Scanner needed for user input

public class J1Waterloo2012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in); // Opens Scanner needed for user input
        
        int speedLimit, driverSpeed, difference; // Makes variables needed for the program
        
        System.out.print("Enter the speed limit: "); // Prompts user for speed limit
        speedLimit = input.nextInt(); // Allows user to enter speed limit
        System.out.print("Enter the recorded speed of the car: "); // Prompts user for the recorded speed of the car
        driverSpeed = input.nextInt(); // Allows user to enter the recorded speed of the car
        difference = driverSpeed - speedLimit; // Finds the difference between the driver's speed and speed limit
        if (difference >= 1 && difference <= 20) { // If the difference is from 1-20 km/h
           System.out.println("You are speeding and your fine is $100."); // Print the fine ($100)
        } else if (difference >= 21 && difference <= 30) { // If the difference is from 21-30 km/h
            System.out.println("You are speeding and your fine is $270."); // Print the fine ($270)
        } else if (difference >= 31) { // If the difference is 31 or greater km/h
            System.out.println("You are speeding and your fine is $500."); // Print the fine ($500)
        } else { // Otherwise (If person is within speed limit)
            System.out.println("Congratulations, you are within the speed limit!"); // Print driver speed is within speed limit
        }
    }
    
}
