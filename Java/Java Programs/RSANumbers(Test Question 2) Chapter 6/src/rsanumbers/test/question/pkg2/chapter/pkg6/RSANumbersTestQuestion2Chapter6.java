/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsanumbers.test.question.pkg2.chapter.pkg6;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: Test Question 2 (Chapter 6)
 * Course Code: ICS3U0A
 * Date: November 15, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner; //Import Scanner needed for user input
public class RSANumbersTestQuestion2Chapter6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // Opens Scanner needed for user input 
        int lowerLimit, upperLimit, store1, store2, counter, newNumber, divideTime=0, counter2=0; // Declares/Initializes variables needed for the program
        
        System.out.print("Enter lower limit of range: "); // Prompts user for lower limit of range
        lowerLimit = input.nextInt(); // Allows user to enter lower limit
        store1 = lowerLimit; // Stores lower limit in store1
        
        System.out.print("Enter upper limit of range: "); // Prompts user for upper limit
        upperLimit = input.nextInt(); // Allows user to enter upper limit
        store2 = upperLimit; // Stores upper limit in store2
        
       
        for (store1 = store1+1; store1 <= store2; store1++) { // For the store1+1 being less then equal to store2 increment store1 by 1
            for (counter = 1; counter < store1; counter++) { // For counter being less then store1 increment counter by 1
                newNumber = store1 % counter; // make newNumber the remainder of store1 divided by counter
                if (newNumber == 0) { // If the remainder is 0
                    divideTime++;  // Increase divide time by 1
                }
               if (divideTime == 4) { // Check if the divide time is 4
                   counter2++; // If the divide time is 4 increment counter 2 by 1
                   
               }
            }
        } 
        System.out.println("The number of RSA numbers between " + lowerLimit + " and " + upperLimit + " is " + counter2); // Prints number of RSA numbers between lower limit and upperlimit
        
    }
    
}
