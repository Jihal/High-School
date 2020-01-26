/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        String phrase;
        
        System.out.print("Enter text: ");
        phrase = input.nextLine();
        
        if (palindromeCheck(phrase)) {
            System.out.println("The text is a palindrome.");
        } else {
            System.out.println("The text is not a palindrome.");
        }
    }
        public static boolean palindromeCheck(String phrase) {
        char [] letters;
        int phraseLength; 
        boolean check = false;
        phraseLength = phrase.length() - 1;
        
        letters = phrase.toCharArray();
        
        for (int i = 0; i <= phraseLength; i++) {
            for (int j = phraseLength; j >= 0; j--) {
                if (letters[j] == letters[i]) {
                    check = true; 
                } 
                else {
                    check = false;
                }
            }
        }
        if (check) {
            return true;
        } else {
            return false;
        }
    }

}
