/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagoreantriple;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
public class PythagoreanTriple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a, b, c, aSquared, bSquared;
        
        for (a = 1; a < 100; a++) {
            aSquared = (int) Math.pow(a, 2);
            for (b = 1; b < 100; b++) {
                bSquared = (int) Math.pow(b, 2);
                c = bSquared + aSquared;
               if (PerfectSquare(c)) {
                   System.out.println(a + "^2 + " + b +"^2 = " + c + "^2");
                   
               }
                       
            }
        }
        
    }
    
    public static boolean PerfectSquare(int num) {
       
        int newNum;
        newNum = (int) Math.sqrt(num);
        if (newNum * newNum == num) {
            return true;
        } else {
            return false; 
        }
    }

}   

