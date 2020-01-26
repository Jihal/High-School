/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primefactors;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
public class PrimeFactors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int userNumber, counter=2;
        
        System.out.print("Enter a number: ");
        userNumber = input.nextInt();
        
        while (counter <= userNumber) {
            if (userNumber % counter == 0) {
                System.out.println(counter);
                userNumber = userNumber/counter;    
            } else {
                counter++;
            }
        }
    }
    
}
