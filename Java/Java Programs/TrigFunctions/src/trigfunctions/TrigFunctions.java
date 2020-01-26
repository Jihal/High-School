/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trigfunctions;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: Trigonometry Functions
 * Course Code: ICS3U0A
 * Date: October 14, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner; // Imports Scanner needed for user input
public class TrigFunctions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in); // Opens Scanner needed for user input
        
        double sin, cosine, tangent, radians; // Makes double variables needed for the program
        int angle; // Makes integer variables needed for the program
        
        System.out.print("Enter an angle in degrees: "); // Prompts user for angle in degrees
        angle = input.nextInt(); // Allows user to enter angle in degrees
        radians = Math.toRadians(angle); // Converts angle to radians
        System.out.format("Sine: %.2f\n", Math.sin(radians)); // Prints sine
        System.out.format("Cosine: %.2f\n", Math.cos(radians)); // Prints cosine
        System.out.format("Tangent: %.2f\n", Math.tan(radians)); // Prints tangent
                 
    }
    
}
