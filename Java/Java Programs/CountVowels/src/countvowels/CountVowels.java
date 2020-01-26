/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countvowels;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
public class CountVowels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        String text, letters, a, e, i, o, u, textTrimmed;
        int counter, vowels=0, textLength;
        
        System.out.print("Enter text: ");
        text = input.nextLine();
        
        textTrimmed = text.trim();
        textLength = textTrimmed.length();
        
        a = "a";
        e = "e";
        i = "i";
        o = "o";
        u = "u";
        
        for (counter = 0; counter < textLength; counter++) {
            letters = textTrimmed.substring(counter, counter + 1);
            if (letters.compareToIgnoreCase(a) == 0) {
                vowels++;
            }
            else if (letters.compareToIgnoreCase(e) == 0) {
                vowels++;
            }
            else if (letters.compareToIgnoreCase(i) == 0) {
                vowels++;
            }
            else if (letters.compareToIgnoreCase(o) == 0) {
                vowels++;
            }
            else if (letters.compareToIgnoreCase(u) == 0) {
                vowels++;
            }
            
        }
        System.out.println("The number of vowels in " + text + " is " + vowels);
    }
    
}
