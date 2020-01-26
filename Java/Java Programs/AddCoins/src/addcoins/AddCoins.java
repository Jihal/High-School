/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addcoins;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;

public class AddCoins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int quarters, dimes, pennies, nickels;
        String amount;
        System.out.println("Enter your total coins:");
        
        System.out.println("");
        System.out.print("Quarters: ");
        quarters = input.nextInt();
        System.out.print("Dimes: ");
        dimes = input.nextInt();
        System.out.print("Nickels: ");
        nickels = input.nextInt();
        System.out.print("Pennies: ");
        pennies = input.nextInt();
        
        amount = getDollarAmount(quarters, dimes, nickels, pennies);
        System.out.println(amount);
        
    }
    
    public static String getDollarAmount(int quarters, int dimes, int nickels, int pennies) {
        double amount = pennies * 0.01; 
        amount += quarters * 0.25;
        amount += dimes * 0.10;
        amount += nickels * 0.05;
        String total = "$" + amount;
        return total;
    }
}
