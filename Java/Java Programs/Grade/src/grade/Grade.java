/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: Grade
 * Course Code: ICS3U0A
 * Date: October 14, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner; // Imports Scanner needed for user input
public class Grade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // Opens Scanner needed for user input
        
        double percentage; // Makes variables needed for the program
        
        System.out.print("Enter the percentage: "); // Prompts user for percentage
        percentage=input.nextDouble(); // Allows user to enter percentage
     
        if (percentage>= 90 && percentage<=100){ // If percentage is from 90-100
            System.out.println("The corresponding letter grade is: A"); // Print out of the corresponding letter grade
        }
            else if (percentage>=80&& percentage<=89){ // If percentage is from 80-89
            System.out.println("The corresponding letter grade is: B"); // Print out of the corresponding letter grade
            }
            else if (percentage>=70 && percentage<=79){ // If percentage is from 70-79
            System.out.println("The corresponding letter grade is: C");// Print out of the corresponding letter grade
            }
            else if (percentage>=60 && percentage<=69){ // If percentage is from 60-69
            System.out.println("The corresponding letter grade is: D"); // Print out of the corresponding letter grade
            }
            else if (percentage<60){ // If percentage is below 60
                System.out.println("The corresponding letter grade is: F"); // Print out of the corresponding letter grade
            }
        }
   }

  

