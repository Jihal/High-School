/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectheightadvanced;

import java.util.Scanner; //Import Scanner which allows input 

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: My First
 * Course Code: ICS3U0A
 * Date: September 14, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
public class ObjectHeightAdvanced {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); //Open up Scanner
        double height, time; // Make a variable for time and height (double because of decimals)
        boolean game = false; // Open up a boolean variable of true and false which controls whether the number is below 4.5 or not
        
        while (game == false) { // While the time is less than 4.5 do the following: 
            System.out.print("Enter a time less than 4.5 seconds: "); // Print to enter a time less than 4.5 seconds
           time = input.nextDouble(); // Allow the person to enter a time less than 4.5 seconds
           if (time > 4.5) { // If the time is greater than 4.5 seconds than print the following: 
               System.out.println("The time must be less than 4.5 seconds."); // Print "The time must be less than 4.5 seconds." in the output
           }
           else if (time < 4.5) { // If the time is lower than 4.5 seconds then do the following: 
               game = true; // If the time is lower than 4.5 seconds then then the boolean variable since we got the time to be less than 4.5 seconds. 
               height = 100-4.9*time*time; // This is the equation for the height as mentioned in the exercise
        System.out.println("The height of the object is: "+height+ " meters."); // Print the height of the object and tell the user that it is the object of the height in meters
       
           }
    }
        
    }
}

