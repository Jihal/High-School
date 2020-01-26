/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discrimant;

/**
 *
 * @author Jihal
 */
import java.util.Scanner; 
public class Discrimant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int a, b, c, discrimant; 
        
        System.out.print("Enter a value for a: ");
        a = input.nextInt();
        System.out.print("Enter a value for b: ");
        b = input.nextInt();
        System.out.print("Enter a value for c: ");
        c = input.nextInt();
        
        discrimant = (b*b) - (4*a*c);
        
        if (discrimant < 0) {
            System.out.println("No roots");
        } else if (discrimant == 0) {
            System.out.println("One root");
        } else if (discrimant > 0) {
            System.out.println("Two roots");
        }
            
    }
    
}
