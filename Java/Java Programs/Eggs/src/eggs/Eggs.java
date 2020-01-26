/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggs;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: Eggs
 * Course Code: ICS3U0A
 * Date: October 14, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner;
public class Eggs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // Opens Scanner needed for user input
        int eggs; // Makes a integer variable for eggs
        final double PRICE_1,PRICE_2, PRICE_3, PRICE_4, DOZEN, REMAINING_EGGS, TOTAL_PRICE; // Makes constant variables needed for the program
       
        System.out.print("Enter the number of eggs purchased: "); // Prompts user for number of eggs purchased
        eggs = input.nextInt(); // Allows user to enter number of eggs purchased
        
        DOZEN = eggs / 12; // Makes a dozen equal to number of eggs divided by 12
        PRICE_1 = 0.50; // Makes price 1 equal to the first price provided in the excercise
        PRICE_2 = 0.45; // Makes price 2 equal to the second price provided in the excercise
        PRICE_3 = 0.40; // Makes price 3 equal to the third price provided in the excercise
        PRICE_4 = 0.35; // Makes price 4 equal to the fourth price provided in the excercise
        REMAINING_EGGS = eggs%12; // Makes remaining eggs equal to the remainder of the eggs after dividing it by 12
        
        if (DOZEN >= 0 && DOZEN < 4) { // If dozen is equal to or above 0 and less than 4
            TOTAL_PRICE = PRICE_1 * DOZEN + (REMAINING_EGGS * (PRICE_1/12)); // Makes total price equal to its formula
            System.out.format("The bill is equal to: $%.2f\n", TOTAL_PRICE); // Prints total price
        } else if (DOZEN >= 4 && DOZEN < 6) { // If dozen is equal to or above 4 and less than 6
            TOTAL_PRICE = PRICE_2 * DOZEN + (REMAINING_EGGS * (PRICE_2/12)); // Makes total price equal to its formula
            System.out.format("The bill is equal to: $%.2f\n", TOTAL_PRICE); // Prints total price
        }  else if (DOZEN >=6 && DOZEN < 11) { // If dozen is equal to or above 6 and less than 11
            TOTAL_PRICE = PRICE_3 * DOZEN + (REMAINING_EGGS * (PRICE_3/12)); // Makes total price equal to its formula
            System.out.format("The bill is equal to: $%.2f\n", TOTAL_PRICE); // Prints total price
        } else if (DOZEN >= 11) { // If dozen is equal to or above 0 and less than 4
            TOTAL_PRICE = PRICE_4 * DOZEN + (REMAINING_EGGS * (PRICE_4/12)); // Makes total price equal to its formula
            System.out.format("The bill is equal to: $%.2f\n", TOTAL_PRICE); // Prints total price
        }
    
    }       
  }


