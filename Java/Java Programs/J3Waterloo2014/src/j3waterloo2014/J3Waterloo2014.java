/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j3waterloo2014;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
public class J3Waterloo2014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int rounds, aRoll, dRoll, aPoints=100, dPoints=100;
        
        System.out.print("Enter the number of rounds to be played: ");
        rounds = input.nextInt();
        
       
        for (int i = 0; i < rounds; i++) {
           
            System.out.print("Antonia's roll: ");
            aRoll = input.nextInt();
            
            System.out.print("David's roll: ");
            dRoll = input.nextInt();
            
            if (aRoll > dRoll) {
                dPoints-=dRoll;
            } 
            if (dRoll > aRoll) {
                aPoints-=aRoll;
            } 
            if (dRoll == aRoll) {
                dPoints-=0;
                aPoints-=0;
            }
        }
        
        System.out.println("Antonia points: " + aPoints + " David points: " + dPoints);
    }
    
}
