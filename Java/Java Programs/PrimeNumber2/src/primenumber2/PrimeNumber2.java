/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumber2;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
public class PrimeNumber2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int userNumber1, userNumber2, numberChecker, result, counter;
        boolean flag = false;
        
        System.out.print("Enter number 1 (Smaller number): ");
        userNumber1 = input.nextInt();
        
        System.out.print("Enter number 2 (Bigger number): ");
        userNumber2 = input.nextInt();
        
        
        for (counter = userNumber1; counter <= userNumber2; counter++) {
            for (numberChecker = 2; numberChecker < counter; numberChecker++) {
                result = counter % numberChecker;
                if (result == 0) {
                    flag = true;
                    break;
                }
            }
            
            if(flag == false) {
                if (counter == userNumber1 || counter == userNumber2) {
                    System.out.print("");
                } else
                System.out.println("Prime number: " + counter);
            }
            
            flag = false;
        }
        
        
        
        
    }
}
