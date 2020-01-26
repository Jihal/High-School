/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadraticequation;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: Quadratic Equation
 * Course Code: ICS3U0A
 * Date: October 13, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner; // Import Scanner needed for user input
public class QuadraticEquation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // Opens Scanner needed for user input
        int a, b, c; // Makes variables needed
        double root1, root2; // Makes double variables needed
        final double DISCRIMINANT; // Makes a constant for discriminant
        System.out.print("Enter value for a: "); // Prompts user for the value of a
        a = input.nextInt(); // Allows user to enter a value for a 
        System.out.print("Enter value for b: "); // Prompts user for the value of b
        b = input.nextInt(); // Allows user to enter a value for b
        System.out.print("Enter value for c: "); // Prompts user for the value of c
        c = input.nextInt(); // Allows user to enter a value for c
        DISCRIMINANT = (b * b) - (4 * a * c); // Makes discriminant equal to its formula
        if (DISCRIMINANT > 0) { // If discriminant is greater then 0 (two roots) 
            root1 = ((-b - Math.sqrt(DISCRIMINANT))/(2 * a)); // Makes root 1 equal to the quadratic formula ( - )
            root2 = ((-b + Math.sqrt(DISCRIMINANT))/(2 * a)); // Makes root 2 equal to the quadratic formula ( + )
            System.out.println("The roots are " + root1 + " and " + root2); // Prints both roots
    }   if (DISCRIMINANT == 0) { // If discriminant is equal to 0 (1 root) 
        root1 = (-b + Math.sqrt(DISCRIMINANT/2 * a)); // Makes root 1 equal to the quadratic formula
        System.out.println("The root is: " + root1); // Prints root 1 
    }
    
}
}
