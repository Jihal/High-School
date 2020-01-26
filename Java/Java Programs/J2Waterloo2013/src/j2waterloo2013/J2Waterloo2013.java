/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2waterloo2013;

/**
 *
 * @author Jihal
 */
import java.util.Scanner; // Import scanner which allows user input
public class J2Waterloo2013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in); // Open scanner which allows user input
        
        String word, subWord, Group1; // Make string variables necessary
        int wordLength, counter, checker=0; // Make integer variables necesary

        
        System.out.print("Enter a word: "); // Prompts user for word
        word = input.next(); // Allows user to enter word
        
        wordLength = word.length(); // Makes wordLength equal to the number of letters
        
        Group1 = "I, O, S, H, Z, X, N"; // Makes group 1 letter equals to the letters that are the same when flipped 180 degrees
        
        for (counter = 0; counter < wordLength; counter++) { // For the counter being less then word length increase counter by 1
        subWord = word.substring(counter, counter+1); // Makes subWord equal to each letter of word when the for loop is repeated
        if(Group1.indexOf(subWord) != -1) { // If subsWord is one wrod from group 1 
             
            checker++; // Increment checker by 1
        } 
    }
        
        
        if (checker == wordLength) { // If checker is equal to wordLength (so if all the letters are from Group 1) 
            System.out.println("YES"); // Print YES
            
        } else { // Otherwise 
            System.out.println("NO"); // Print NO
        }
                
    }
    
}
