/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digits;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: My First
 * Course Code: ICS3U0A
 * Date: September 14, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner; // Imports the Scanner which allows the user to input data
public class Digits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // Opens the Scanner whichs allows data to be inpputted
        int number, hundredsPlace, remainder1, remainder2, tensPlace, onesPlace; // Creates variables needed for the program
        
        boolean threeDigitNumber = false; // Makes a boolean variable for the three-digit number and sets it to false
        
        while (threeDigitNumber == false) { // While the boolean variable remains false do the following: 
        System.out.print("Enter a three-digit number: "); // Prints what the user needs to type in the input (next line) 
        number=input.nextInt(); // Allows the user to input the three-digit number
        
        if (number < 1000 && number > 99) { // If the number is a three-digit number then: 
            threeDigitNumber = true; // Make the boolean variable true allow it to run the rest of the while loop
            
        hundredsPlace=number/100; // Finds the hundreds-place of the number by dividing it by 100
        remainder1=number%100; // Finds the remainder after the number is divided by 100
        tensPlace=remainder1/10;  // Divides the remainder of the number by 10 to find the tens-place
        remainder2=remainder1%10; // Finds the remainder after dividing it by 10
        onesPlace=remainder2/1; // (Unnecessary) Divides the remainder by 1 to find the ones-place
        
        System.out.println("The hundreds-place digit is: "+hundredsPlace); // Prints the hundreds-place
        System.out.println("The tens-place digit is: "+tensPlace); // Prints the tens-place
        System.out.println("The ones-place digit is: "+onesPlace); // Prints the ones-place
        }
    }
    
    }
}
