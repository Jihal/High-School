/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g11examquestion1;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: Exam Question 1 (Frequent Letters) 
 * Course Code: ICS3U0A
 * Date: January 20, 2017
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner; //Imports Scanner for user input 
public class G11ExamQuestion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in); //Opens Scanner for user input
        
        String frequentLetters[] = {"H", "O", "E", "I"}; //Makes a array storing the freqeunt letters
        String word, letter, upperCase;  // Declares the string variables needed for the program
        boolean check = false; //Initializes a boolean check variable to false
        
        System.out.print("Enter a word that is at least six characters in length: "); //Prompts user for a word that is at least 6 characters in length
        word = input.next(); //Word stores the user input
        
        upperCase = word.toUpperCase(); //Casts word to uppercase since frequent letters only stores uppercase
        letter = upperCase.substring(1, 2); //Makes letter equal to the 2nd letter
        
         for (int i = 0; i < 4; i++) { //For index being less then the number of frequent letters (4) increment it by 1
             if (frequentLetters[i].indexOf(letter) != -1) { //If the 2nd letter is one of the frequent letters
                 check = true;  //Set check to true
             }
         }
         if (check) { //If check is true 
             System.out.println("2nd Letter is a frequent letter."); //Print that the 2nd letter is a frequent letter
         } else { //Else 
             System.out.println("2nd Letter is not a frequent letter.");//Print that the 2nd letter is not a frequent letter
         }
    }
    
}
