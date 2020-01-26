/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberguessingadvanced;

/**
 *
 * @author Jihal
 */
import java.util.Scanner; //Imports scanner
import java.util.Random; //Imports random thing
public class NumberGuessingAdvanced {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random(); //Open random thing
        Scanner input = new Scanner(System.in); //Open scanner 
        int randomNumber = random.nextInt(20); // Make random number to anything in between 0 and bracket
        int number_ofGuesses = 0; // Make number of guesses variable and equal it to 0 
        
        boolean game = false; //Open up a boolean game of true or false (right or wrong guesses I suppose) 
        
        while (game == false) { // while the answer is wrong 
        System.out.print("Guess a number: "); //Make the print thing
        int guess = input.nextInt(); //Allow player to guess
         
            
            if (guess == randomNumber) { // if the guess is correct end game and do not run else ifs
            game = true; //End game
            number_ofGuesses++;
        } else if (guess < randomNumber) { //if the guess is too low then increase the number of guesses by 1 
             number_ofGuesses++;
                System.out.println ("Too low!"); // also print too low so the guy knows
        }  else if (guess > randomNumber) { // if the guess is too high then increase the number of guesses by 1
            number_ofGuesses++;
                System.out.println ("Too high"); //also print too high so the guy knows
        }
        }
               //If the guess is right do the following:   
        System.out.println("You got it!"); //Tell the guy the answer is right
        System.out.println("The number was: " + randomNumber); //Print the number
        System.out.println("The amount of tries it took you: " + number_ofGuesses); //State the amount of tries
    
    
}
}