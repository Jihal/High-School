/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7testquestion1;

/**
 * Student Number: 765697
 * @author Jihal
 */
import java.util.Scanner;
public class Chapter7TestQuestion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in); // Open Scanner for user input
        int a, b, c, d, s; //Makes variables needed
        
        System.out.print("Give a value for a: "); //Prompts value for a
        a = input.nextInt(); // Allow user to enter a value for a
        
        System.out.print("Give a value for b: "); //Prompts value for b
        b = input.nextInt();//Allows user to enter a value for b
        
        System.out.print("Give a value for c: ");//Prompts value for c
        c = input.nextInt();//Allows user to enter a value for c
        
        System.out.print("Give a value for d: "); //Prompts value for d
        d = input.nextInt();//Allows user to enter value for d
        
        System.out.print("Give a value for s: ");//Prompts value for s
        s = input.nextInt();//Allows user to enter value for s
        
        System.out.println(UpandDown(a, b, c, d, s)); // Calls for method with 5 parameters
    }
    
    public static String UpandDown(int a, int b, int c, int d, int s) { // Method with 5 parameters
        int steps, result;  //Makes variables needed for the method
        
        while (result <= s) {
            
        }
        
       /* while (result < s) {
            int steps=0;
            
            for (steps=0; steps<a; steps++){
            result = steps + steps;
           
            if (result == s) {
                break;
            }
            
            for (int i=0; i < b; i++) {
                result = result - 1; 
                if (result == s) {
                    break;
                }
            }
            }
        } 
        while (result1 < s) {
            int steps=0;
            for (steps=0; steps<c; steps++){
            result = steps + steps;
            if (result == s) {
                break;
            }
            
            for (int i=0; i < d; i++) {
                result = result - 1; 
                if (result == s) {
                    break;
                    
                }
            }
            }
        }
        
        */
   /*     if (result < s) { // If result is less then steps
            result = a-b; //Subtract b from a
            counter++; // Increase counter (Steps)
        }
        if (result1 <s) { // If result1 is less then steps
            result1 = c-d+(c-1); // Subtract d from c
            counter1++; // Increase counter 2 (Steps2)
        }
         
        if (counter > counter1) { // If counter is greater then counter 1 
            return ("Nikky"); //return Nikky
        } else { // Else
            return ("Byron"); // return Byron
        }
        //Didnt have time to complete properly
    }        */
     
}
