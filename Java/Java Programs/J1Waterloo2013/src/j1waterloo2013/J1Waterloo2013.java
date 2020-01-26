/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1waterloo2013;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
public class J1Waterloo2013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int youngAge, middleAge, oldAge, difference1;
        
        System.out.print("Enter the age of the youngest child: ");
        youngAge = input.nextInt();
        System.out.print("Enter the age of the middle child: ");
        middleAge = input.nextInt();
        
        difference1 = middleAge - youngAge;
        oldAge = difference1 + middleAge; 
         
        System.out.println("The age of the oldest child is: " + oldAge);
    }
    
}
