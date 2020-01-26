/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2waterloo2017;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
public class J2Waterloo2017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int initial, shift, totalSum;
        
        initial = input.nextInt();
        
        totalSum = initial;
        
        shift = input.nextInt();
        
        for (int i = 0; i < shift; i++) {
            initial *= 10;
            
            totalSum+=initial;
        }
        System.out.println(totalSum);
    }
    
}
