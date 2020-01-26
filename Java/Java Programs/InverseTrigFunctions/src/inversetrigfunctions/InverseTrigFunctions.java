/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inversetrigfunctions;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: Inverse Trigonometry Functions
 * Course Code: ICS3U0A
 * Date: October 18, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner;
public class InverseTrigFunctions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in); // Opens Scanner needed for user input
        
        double sin, cosine, tangent, degrees; // Makes double variables needed for the program
        int angle; // Makes integer variables needed for the program
        
        System.out.print("Enter an angle in degrees: "); // Prompts user for angle in degrees
        angle = input.nextInt(); // Allows user to enter angle in degrees
        degrees = Math.toRadians(angle); // Converts angle to radians
        System.out.format("Arcsine: %.2f\n", Math.asin(degrees)); // Prints arcsine
        System.out.format("Arccosine: %.2f\n", Math.acos(degrees)); // Prints arccosine
        System.out.format("Arctangent: %.2f\n", Math.atan(degrees)); // Prints arctangent
                 
    }
    
}
