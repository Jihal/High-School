/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package necklace;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
public class Necklace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int startingNumber1, startingNumber2, firstNumber, secondNumber, sum;
        
        System.out.print("Enter the first starting number: ");
        startingNumber1 = input.nextInt();
        System.out.print("Enter the second starting number: ");
        startingNumber2 = input.nextInt();
        
        firstNumber = startingNumber1;
        secondNumber = startingNumber2;
        System.out.print(firstNumber + " ");
        System.out.print(secondNumber+ " ");
        
        do { 
       
            sum = startingNumber1 + startingNumber2;
            startingNumber1 = startingNumber2;
            startingNumber2 = sum;
            if (sum >= 10) {
                startingNumber2 = startingNumber2 % 10;
            } 
            System.out.print(startingNumber2 + " ");
                } while (startingNumber1 != firstNumber || startingNumber2 != secondNumber);
        }
}