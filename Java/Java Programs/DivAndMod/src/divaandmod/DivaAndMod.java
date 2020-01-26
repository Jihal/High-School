/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divaandmod;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: My First
 * Course Code: ICS3U0A
 * Date: September 14, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner; // Imports Scanner which allows input
public class DivaAndMod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // Open Scanner which allows user input
        int firstInteger, secondInteger, div1, mod1, div2, mod2;  // Declares variables needed for the excerise
        System.out.print("Enter an integer: "); // Tells user to enter an integer in the output
        firstInteger=input.nextInt(); // Allows user to enter an integer in the output
        System.out.print("Enter a second integer: "); // Tells user to enter a second integer in the output
        secondInteger=input.nextInt(); // Allows user to enter a second integer in the output
        
        /* Basically the program from here is about dividing the first integer with the second
        and finding the remainder of the division and vice-versa
        */
        
        div1=firstInteger/secondInteger; // Finds the answer of the first integer divided by the second
        mod1=firstInteger%secondInteger; // Finds the remainder of the first integer and second integer
        div2=secondInteger/firstInteger; // Finds the answer of the second integer divded by the first
        mod2=secondInteger%firstInteger; // Finds the remainder of the second integer and first integer
        System.out.println(firstInteger+ " / " + secondInteger + " = " +div1 ); // Prints out the answer of the first integer divided by the second integer
        System.out.println(firstInteger+ " % " + secondInteger + " = " +mod1 ); // Prints out the remainder of the first integer divided by the second integer
        System.out.println(secondInteger+ " / " + firstInteger + " = " +div2 ); // Prints out the answer of the second integer divided by the first integer
        System.out.println(secondInteger+ " % " + firstInteger + " = " +mod2 ); // Prints out the remainder of the second integer divided by the first integer
        
    }
    
}
