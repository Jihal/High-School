/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equivalentfractions;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: My First
 * Course Code: ICS3U0A
 * Date: October 14, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner;
public class EquivalentFractions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int randomNumber1, randomNumber2, remainder1, answer;
        int randomNumber3, randomNumber4, randomNumber5;
        int randomNumber6, randomNumber7, remainder2;
        
        System.out.println("Equivalent Fractions Quiz");
        
        randomNumber5 = (int) (10*Math.random()+1);
        
        do {
        randomNumber1 = (int) (10*Math.random()+1);
        randomNumber2 = (int) (10*Math.random()+1);
        remainder1 = randomNumber1 % randomNumber2;
        } while (remainder1 != 0 && randomNumber1 != randomNumber2);
        
        if (remainder1 == 0 && randomNumber1 != randomNumber2) {
         System.out.println("1. " + randomNumber1 + " / " + randomNumber2);
            do {
            randomNumber3 = randomNumber1 * randomNumber5;
            randomNumber4 = randomNumber2 * randomNumber5;
            if (randomNumber3 == randomNumber1 * randomNumber5 && randomNumber4 == randomNumber2 * randomNumber5) {
            System.out.println("2. " + randomNumber3 + " / " + randomNumber4); }
            }while (remainder1 == 0 && randomNumber1 != randomNumber2);
         
        
        if (randomNumber3 == randomNumber1 * randomNumber5 && randomNumber4 == randomNumber2 * randomNumber5) {
            System.out.println("2. " + randomNumber3 + " / " + randomNumber4);
        }
        
            }
        
        
        
        
        
     
    
    }
}
    
    
