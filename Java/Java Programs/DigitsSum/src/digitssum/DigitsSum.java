/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitssum;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
public class DigitsSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int number, first, second, third, total=0;
        
        System.out.print("Enter a positive integer: ");
        number = input.nextInt();
         
        while (number > 0) {
            total = total +  number % 10;
            number = number / 10; 
            
        }
        
        System.out.println("The sum of the digits is: " + total);
        
    }
    
}
