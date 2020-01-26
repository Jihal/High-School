/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volumes;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: Volumes
 * Course Code: ICS3U0A
 * Date: October 13, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner; // Import Scanner needed for user input
public class Volumes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // Opens Scanner needed for user input
        
        // Part A
        final double VOLUME_OF_RECTANGLE; // Makes a constant for the volume of a rectangle
        int length, width, height; // Makes variables needed
        
        System.out.println("Rectangular Prism"); // Tells user that the program is for a rectangular prism
        System.out.print("Enter the length: "); // Prompts user for length
        length = input.nextInt(); // Allows user to enter length
        System.out.print("Enter the width: "); // Prompts user for width
        width = input.nextInt(); // Allows user to enter width
        System.out.print("Enter the height: "); // Prompts user for height
        height = input.nextInt(); // Allows user to enter height
        VOLUME_OF_RECTANGLE = length * width * height; // Makes volume of rectangle equal to its formula
        System.out.format("The volume is: %.2f\n", VOLUME_OF_RECTANGLE); // Prints volume of rectangle (2 decimal places) 
        
        // Part B
        final double VOLUME_OF_SPHERE; // Makes a constant for volume of sphere
        int radius; // Makes variable for radius
        final int DIAMETER; // Makes a constant for diameter
        System.out.println("Sphere"); // Tells user the program is for a sphere
        System.out.print("Enter the radius: "); // Prompts user for radius
        radius = input.nextInt(); // Allows user to enter radius
        DIAMETER = 2*radius; // Makes diameter equal to 2 times radius
        VOLUME_OF_SPHERE = Math.PI * Math.pow(DIAMETER, 3) /6; // Makes volume of sphere equal to its formula
        System.out.format("The volume is: %.2f\n", VOLUME_OF_SPHERE); // Prints volume of sphere (2 decimal places)
        
        // Part C
        final double VOLUME_OF_CUBE; //Makes a constant for the volume of cube
        int sideLength; // Makes a varaible for side length (all same on a cube)
        System.out.println("Cube"); // Tells user the program is for a cube
        System.out.print("Enter the length of each side: "); //Prompts user for the length of a side
        sideLength = input.nextInt(); // Allows user to enter the side length
        VOLUME_OF_CUBE = Math.pow(sideLength, 3); // Makes volume of cube equal to its formula
        System.out.format("The volume is: %.2f\n", VOLUME_OF_CUBE); // Prints the volume of cube
    }  
}
