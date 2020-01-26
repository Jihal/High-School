/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeconversion;

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
public class TimeConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // Opens Scanner which allows user input
        int minutes, hours, minutes1, leftover; // Makes variables needed for the exercise
        System.out.print("Enter the time in minutes: "); // Tells user to input the time in minutes in  the output box
        minutes = input.nextInt(); // Allows user to input the time in minutes in the output
        
        hours = minutes/60; // Finds the hours from the minutes given
        minutes1 = minutes%60; // Finds the remainder of the minutes after hours have been deducted
        if (minutes1 < 10) { /* If the remainder of the minutes is less then 10 
            Print out a "0" before the minutes so that it doesn't output times like
            3:5, it would do this instead: 3:05
            */
            System.out.println("The time is: " + hours + ":0" +minutes1);
        } else {
        
        System.out.println("The time is: " + hours + ":" + minutes1); // If the time is not less then 10 minutes then output the hours and minutes with a collon in the middle
        
       
    }
    
    }
}

