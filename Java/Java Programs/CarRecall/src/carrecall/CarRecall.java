/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrecall;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
public class CarRecall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int userNumber=1; 
        
        
        
        while (userNumber != 0) {
            System.out.print("Enter the car's model number or 0 to quit: ");
            userNumber = input.nextInt();
            if (userNumber == 119 || userNumber == 179 || userNumber >= 189 && userNumber <=195 || userNumber == 221 || userNumber == 780 ) {
                System.out.println("Your car is defective. It must be repaired.");
            } else if (userNumber != 0) {
                System.out.println("Your car is not defective.");
            }
        }
    }
    
}
