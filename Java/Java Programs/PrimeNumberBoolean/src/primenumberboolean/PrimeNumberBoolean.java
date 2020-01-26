/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumberboolean;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
public class PrimeNumberBoolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if (isPrime()) {
            System.out.println("Prime number.");
        } else {
            System.out.println("Not a prime number.");
        }
    }
    
    public static boolean isPrime() {
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
        if (flag==false) {
            return true;
        } 
        return false;
        
    }
}
