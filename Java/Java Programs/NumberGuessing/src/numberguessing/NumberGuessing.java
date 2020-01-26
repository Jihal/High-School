/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberguessing;

/**
 *
 * @author Jihal
 * 
 */

import java.util.Random; 
import java.util.Scanner;
public class NumberGuessing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to the guessing game!");
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int randomNumber = random.nextInt(10);
        System.out.print("Guess a number: ");
        int guess = input.nextInt();
        if (guess == randomNumber) {
            System.out.print("You guessed it!");   
    } else {
            System.out.println("Try again the number was: " + randomNumber);
        }
        
        
    }
    
}
