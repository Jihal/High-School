/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); 
        
        int userNumber, counter = 1, result, answer;
        
        System.out.print("Enter a number: "); 
        userNumber = input.nextInt();
        System.out.print(userNumber + "! = ");
        
       for (counter = 1; counter <= userNumber; counter ++) {
           result = 1; 
           result = result * counter; 
            if (counter == userNumber) {
                    System.out.print(result);
            } else {
                System.out.print(result + "*");
            }
            
       }
     
    }
    
}
