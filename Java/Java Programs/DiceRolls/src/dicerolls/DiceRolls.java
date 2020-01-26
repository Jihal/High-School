/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicerolls;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
public class DiceRolls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int diceRolls, sideNumber, rollAmount,low;
        
        System.out.print("How many sides: ");
        sideNumber = input.nextInt();
        
        System.out.print("How many dices to roll: ");
        diceRolls = input.nextInt();
        
        System.out.print("How many rolls to make: ");
        rollAmount = input.nextInt();
        
        
    }
    
}
