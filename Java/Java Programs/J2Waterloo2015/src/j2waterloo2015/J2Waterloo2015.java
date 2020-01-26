/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2waterloo2015;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;

public class J2Waterloo2015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        String text, newText, newText2;
        int happy2, sad2;
        int counter, numberOfHappy=0, numberOfSad=0, textLength; 
        boolean check = true;
        boolean check2 = true;
        System.out.print("Enter text: ");
        text = input.nextLine();
        
        newText = text;
        newText2 = text;
        String happy = ":-)";
        String sad = ":-(";
        
        while(newText.indexOf(happy) != -1) {
        happy2 = newText.indexOf(happy);
        newText = newText.substring(happy2+3);
        numberOfHappy++;
        check = false;
        }
        while(newText2.indexOf(sad) != -1) {
            sad2 = newText2.indexOf(sad);
            newText2 = newText2.substring(sad2+3);
            numberOfSad++;
            check2 = false;
        }
        if (newText.indexOf(happy) == -1 && newText.indexOf(sad) == -1) {
            System.out.println("none");
        }
        else if (numberOfHappy == numberOfSad) {
            System.out.println("unsure");
            
        }
        else if (numberOfHappy < numberOfSad) {
            System.out.println("sad");
            
        }
        else if (numberOfHappy > numberOfSad ) {
            System.out.println("happy");
            
        } 
    }
    
}
