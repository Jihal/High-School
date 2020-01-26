/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equivalentfractions2;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: Equivalent Fractions
 * Course Code: ICS3U0A
 * Date: October 18, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner; // Imports Scanner needed for user input
public class EquivalentFractions2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // Opens Scanner needed for user input
        
        int answer; // Makes the variable needed for the program
        
        System.out.println("Equivalent Fractions Quiz"); // Prints what the program is about
        System.out.println("1. 21/3"); // Prints fraction 1 as mentioned in the excercise
        System.out.println("2. 2/3");// Prints fraction 2 as mentioned in the excercise
        System.out.println("3. 4/3");// Prints fraction 3 as mentioned in the excercise
        System.out.println("4. 28/4");// Prints fraction 4 as mentioned in the excercise
        System.out.println("5. 8/12");// Prints fraction 5 as mentioned in the excercise
        System.out.println("6. 1/3");// Prints fraction 6 as mentioned in the excercise
        System.out.println("7. 5/1");// Prints fraction 7 as mentioned in the excercise
        System.out.println("8. 125/5");// Prints fraction 8 as mentioned in the excercise
               
         System.out.print("Which fraction is equivalent to fraction #1? #"); // Prompts user for an answer
         answer = input.nextInt(); // Allows user to enter an answer
         if (answer == 4){ // If answer is four
         System.out.println("Correct!"); // Print correct
         } else { // If the answer is not four
                System.out.println("Incorrect!"); // Print incorrect
           }
       
   
        
    }
  }
    

