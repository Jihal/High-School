/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monogram;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
public class Monogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String firstName, middleInitial, lastName, firstName2, lastName2;
        
        System.out.print("Enter your first name: ");
        firstName = input.next();
        
        System.out.print("Enter your middle initial: ");
        middleInitial = input.next();
        
        System.out.print("Enter your last name: ");
        lastName = input.next();
        
        firstName2 = firstName.substring(0, 1);
        lastName2 = lastName.substring(0, 1);
        
        System.out.println("Your monogram is: " + firstName2.toLowerCase()  + lastName2.toUpperCase() + middleInitial.toLowerCase());
                
    }
    
}
