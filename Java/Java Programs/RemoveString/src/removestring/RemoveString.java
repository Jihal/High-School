/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removestring;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
       
public class RemoveString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
        
        String sentence, word, returnValue;
        
        System.out.print("Enter a sentence: ");
        sentence = input.nextLine();
        
        System.out.print("Enter a string: ");
        word = input.next();
        
        returnValue = sentence.replaceAll(word, "");
        
        System.out.println(returnValue);
        
    }

   
    
}
