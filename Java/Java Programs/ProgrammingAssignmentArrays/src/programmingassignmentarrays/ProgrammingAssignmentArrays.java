/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingassignmentarrays;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: Programming Assignment Arrays
 * Course Code: ICS3U0A
 * Date: January 11, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner; // Imports Scanner needed for user input
public class ProgrammingAssignmentArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in); // Opens Scanner needed for user input
        
        int k, shiftValue, wordLength; //Declares the integer variables needed for the program
        char [] position; //Declares the character array needed for the program
        String word; //Declares the string variables needed for the program
        
        System.out.print("Value for parameter K: "); //Prompts user for the parameter of K
        k = input.nextInt(); //Allows user to input a value for parameter of K
        
        System.out.print("Enter word to decode(Uppercase): "); //Prompts user for the word to decode
        word = input.next(); //Allows user to enter a word to decode
        
        position = word.toCharArray(); //Initialize position to each letter's position in the word
        wordLength = word.length(); //Initializes word to the length of the word
        
        System.out.print("Decoded message: "); //Outputs Decoded message so the user knows what the output is
        for (int i = 0; i < wordLength; i++) { //For the i being less the the wordLength, increment i by 1
            shiftValue = 3 * (i + 1) + k; //Initializes shiftValue to it's formula: S = 3P + K where P is the value of i + 1 becuase first poisition is 1
            int unicodeValue = (int) position[i] - shiftValue; //Casts the character variable position to its integer unicode value and subtracts the shiftValue
            if (unicodeValue < 65) { //If the unicode value is less than 65 (meaning it goes below A) 
                unicodeValue += 26; //Add 26 to the unicode value (this makes it start at Z again and the remaining shiftValue will already be subtracted) 
            }
            char unicodeToLetter = (char) unicodeValue; //Casts unicodeValue back to a character value
            
            System.out.print(unicodeToLetter); //Prints the decoded letter until the for loop is complete
        }
    }
    
}
