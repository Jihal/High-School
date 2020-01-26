/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
public class GCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int userNumber1, userNumber2, numCheck; 
        
        System.out.print("Enter a number: ");
        userNumber1 = input.nextInt();
        
        System.out.print("Enter a second number: ");
        userNumber2 = input.nextInt();
        
        while (userNumber2 > 0) {
            numCheck = userNumber1 % userNumber2;
            userNumber1 = userNumber2;
            userNumber2 = numCheck;
            
            
        }
        System.out.println(userNumber1 + userNumber2);
        
    }
    
}
