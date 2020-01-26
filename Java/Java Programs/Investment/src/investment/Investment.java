/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investment;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
public class Investment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        int principal, years=0, userAmount; 
                final int finalPrincipal;
        double interestRate;
        
        System.out.print("Enter an investment: ");
        principal = input.nextInt();
        finalPrincipal = principal;
        System.out.print("Enter a interest rate in percent: ");
        interestRate = input.nextDouble();
        interestRate = interestRate/100;
        
        userAmount = principal * 2;
        for (principal = principal; principal <=userAmount; years++){
            principal = (int) (principal * interestRate) + (principal);
           
        }
       
        System.out.println("The amount of years it would take a $" + finalPrincipal + " investment to be doubled would be " + years + " years.");
        
    }
    
}
