/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagecheck;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: Package Check
 * Course Code: ICS3U0A
 * Date: October 13, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner; // Imports Scanner needed for user input
public class PackageCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // Opens Scanner needed for user input
        int width, height, length, weight; // Makes variables needed
        final int SIZE; // Makes constant variables needed
        
        System.out.print("Enter package weight in kilograms: "); // Prompts user for package weight in kilograms
        weight = input.nextInt(); // Allows user to enter package weight in kilograms
        System.out.print("Enter package length in centimeters: "); // Prompts user for package length in centimeters
        length = input.nextInt(); // Allows user to enter package length in centimeters
        System.out.print("Enter package width in centimeters: "); // Prompts user for package width in centimeters
        width = input.nextInt(); // Allows user to enter package width in centimeters
        System.out.print("Enter package height in centimeters: "); // Prompts user for height in centimeters
        height = input.nextInt(); // Allows user to enter package width in centimeters
        SIZE = length * width * height; // Makes size equal to its formula
        
       if (SIZE <= 100000 && weight <= 27) { // If the size is below or equal to 100000 cubic centimeters and weight is smaller then or equal to 27
           System.out.println("Meets requirements."); // Print meets requirements
    }
       else if (SIZE <= 100000 && weight > 27) { // If the size is below or equal to 100000 cubic centimeters and weight greater than 27
           System.out.println("Too heavy."); // Print too heavy
       }
       else if (SIZE > 100000 && weight <= 27) { // If the size is above 100000 cubic centimeters and weight is smaller then or equal to 27
           System.out.println("Too large."); // Print too large
       } else if (SIZE > 100000 && weight > 27) { // If the size is above 100000 cubic centimeters and weight is greater then 27
           System.out.println("Too heavy and too large."); // Print too heavy and too large
       }
}
}
