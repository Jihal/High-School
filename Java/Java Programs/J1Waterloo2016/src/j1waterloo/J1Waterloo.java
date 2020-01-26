/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1waterloo;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;


public class J1Waterloo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // https://cemc.math.uwaterloo.ca/contests/computing/2016/stage%201/juniorEn.pdf
        Scanner input = new Scanner(System.in);
       String input1, input2, input3, input4, input5, input6; 
       int wins = 0; 
        System.out.print("Enter the result of the first game: ");
        input1 = input.next();
        System.out.print("Enter the result of the second game: ");
        input2 = input.next();
        System.out.print("Enter the result of the third game: ");
        input3 = input.next();
        System.out.print("Enter the result of the fourth game: ");
        input4 = input.next();
        System.out.print("Enter the result of the fifth game: ");
        input5 = input.next();
        System.out.print("Enter the result of the sixth game: ");
        input6 = input.next(); 
    
        if (input1.equalsIgnoreCase("W")) {
        wins++;          
    } /* else if (input1.equalsIgnoreCase("L")) {
        wins--;
    } */
    if (input2.equalsIgnoreCase("W")) {
        wins++;          
    } /* else if (input2.equalsIgnoreCase("L")) {
        wins--;
    } */
    if (input3.equalsIgnoreCase("W")) {
        wins++;          
    } /*else if (input3.equalsIgnoreCase("L")) {
        wins--;
    } */
    if (input4.equalsIgnoreCase("W")) {
        wins++;          
    } /*else if (input4.equalsIgnoreCase("L")) {
        wins--;
    } */
    
    if (input5.equalsIgnoreCase("W")) {
        wins++;          
    } /*else if (input5.equalsIgnoreCase("L")) {
        wins--; 
    } */
    if (input6.equalsIgnoreCase("W")) {
        wins++;          
    } /*else if (input6.equalsIgnoreCase("L")) {
        wins--; 
    } */
    
    
    if (wins == 5 || wins ==6) {
        System.out.println("1");
    } 
    else if (wins == 4 || wins ==3) {
        System.out.println("2");
    } 
    else if (wins == 1 || wins ==2) {
        System.out.println("3");
    }
      else  {
        System.out.println("-1");
    }
    
    
    // Excerise 1 Completed
    
    }
     
}

