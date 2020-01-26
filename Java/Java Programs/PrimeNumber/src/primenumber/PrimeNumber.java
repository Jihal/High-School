/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;

public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
        int userNumber, numberChecker = 2, result;
        boolean flag = false; 
        
        System.out.print("Enter a number: ");
        userNumber = input.nextInt();
            
        if (userNumber > 1) {
            while (numberChecker < userNumber-1) {
                result = userNumber % numberChecker;
                if (result == 0) {
                    flag = true;
                    break;
                    
                }
                numberChecker ++;
            } 
        }
        if (userNumber == 0) {
            System.out.println("Special Case");
        }
        else if (flag == true) {
            System.out.println("The number entered is not prime.");
        } else {
            //System.out.println("The number entered is not prime.");
            System.out.println("The number entered is prime.");
        }
    
    
    
    
    }
    
}
