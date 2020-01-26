/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
import java.util.Random;
public class GuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int randomNum, userInput;
        
        randomNum = random.nextInt(20);
        randomNum += 1;
        
        System.out.print("Enter a number between 1 and 20: ");
        userInput = input.nextInt();
        
        if (userInput == randomNum) {
            System.out.println("You won!");
        }
        while (userInput!= randomNum) {
        if (giveHint(randomNum, userInput)) {
            System.out.println("Hint: try a lower number");
            
        } else {
            System.out.println("Hint: try a higher number");
        }
         System.out.print("Enter a number between 1 and 20: ");
         userInput = input.nextInt();
        
         if (userInput == randomNum) {
            System.out.println("You won!");
        }
        
    }
    }
    public static boolean giveHint(int randomNum,int userInput) {
        if (randomNum < userInput) {
            return true;
        } else {
            return false;
        }
    }
    
}
