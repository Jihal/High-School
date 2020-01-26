/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2waterloo2014;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: J2 Waterloo 2014 / Test Question 1 (Chapter 6)
 * Course Code: ICS3U0A
 * Date: November 15, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner;
public class J2Waterloo2014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        int numberOfVotes, counter, a=0, b=0;
        String squence, subStringVotes;
        
        System.out.print("Enter the number of votes: ");
        numberOfVotes = input.nextInt();
        
        System.out.print("Enter the squence of votes: ");
        squence = input.next();
        
        for (counter = 0; counter < numberOfVotes; counter++ ) {
            subStringVotes = squence.substring(counter, counter+1);
            if (subStringVotes.equalsIgnoreCase("A")){
                a++;
            } else if (subStringVotes.equalsIgnoreCase("B")) {
                b++;
            }
        }
        
        if (b < a) {
            System.out.println("A");
            
        } else if (a < b ) {
            System.out.println("B");
        } else if (a == b) {
            System.out.println("Tie");
        }
    }
    
}
