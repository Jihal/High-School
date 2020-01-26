/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countconsonants;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
public class CountConsonants {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        String consonants = "bcdfghjklmnpqrstvwxyz", text;
        char [] letters; 
        int textLength, counter = 0;
        
        System.out.print("Enter text: ");
        text = input.nextLine();
        
        textLength = text.length() - 1;
        letters = text.toCharArray();
        
        for (int i = 0; i <= textLength; i++) {
            if (consonants.indexOf(letters[i]) != -1) {
                counter++;
            } 
        }
        System.out.println("The number of consonants in " + text + " is " + counter);
    }
    
}
