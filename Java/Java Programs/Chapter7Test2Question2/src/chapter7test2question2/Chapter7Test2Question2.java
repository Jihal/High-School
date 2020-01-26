/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7test2question2;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: Chapter 7 Test2 Question2
 * Course Code: ICS3U0A
 * Date: December 7, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner; //Imports Scanner
public class Chapter7Test2Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Program does not work didn't have time to troubleshoot
        Scanner input = new Scanner(System.in); // Opens scanner
        
        String word; //Makes string for word 
        
        System.out.print("Enter a word to be translated: "); //Prompts user for word
        word = input.next(); // Allows user to enter word
        
        System.out.println(Translate(word)); // Print translated word from method
    }
    
    public static String Translate(String word1) { // Makes a method which calls for 1 string
        int wordLength; // Makes int for word length
        String storeWord = word1, firstLetter, constants, or, last2; // Stores word and makes other variables needed
        
        firstLetter = word1.substring(0, 1); // Makes first letter equal to first letter
                
        constants = ("bcdfghjklmnpqrtsvwxz"); // Makes variable for constants
        
        or = ("or"); // Makes variable for or
        
        wordLength = word1.length(); // Makes word length equal to wordLength
        
        last2 = word1.substring(wordLength-1, wordLength - 3); // Makes last 2 words equal to last 2 words
        
        if (wordLength < 5) { // If word is smaller then 5 letters
            return word1; // return word1
            // Cannot comment rest due to time
        } else  {
            if (firstLetter.indexOf(constants) != -1 && word1.lastIndexOf(or) != -1) {
                storeWord = word1.replaceFirst(last2, "our");
            }
            return storeWord;
        }
    }
}
