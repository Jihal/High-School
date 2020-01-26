/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coder;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;                                                       //Imports Scanner for user input
public class Coder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);                                //Opens Scanner for user input
        
        String text;                                                            //Creates the String variable needed for the program
        char [] letter;                                                         //Creates the character variable needed for the program
        int textLength;                                                         //Creates the integer variable needed for the program
        
        System.out.print("Enter text: ");                                       //Prompts user for text to encode
        text = input.nextLine();                                                //Allows user to enter text to encode
            
        letter = text.toCharArray();                                            //Casts the text to a character array
        textLength = text.length();                                             //Initializes textLength to the text length
        
        for (int i = 0; i < textLength; i++) {                                  //For integer i being less then textLength, increment i by 1
            int unicode = (int)letter[i]+2;                                     //Casts the character at i to the unicode value and adds 2
            switch (unicode) {                                                  //Puts the unicode value into a switch statement
                case 34: unicode = 32; break;                                   //If the unicode value is space + 2 then change it back to a space
                case 91: unicode = 65; break;                                   //If the unicode value is Y then change it to A
                case 92: unicode = 66; break;                                   //If the unicode value is Z then change it to B
                case 123: unicode = 97; break;                                  //If the unicode value is y then change it to a
                case 124: unicode = 98; break;                                  //If the unicode value is z then change it to b
            }
            char unicodeToLetter = (char)unicode;                               //Typecast the unicode integer back to a character
            System.out.print(unicodeToLetter);                                  //Print the letter that is encoded
            
        }
        System.out.println("");                                                 //Prints the build sucessful on the next line 
    }
    
}
