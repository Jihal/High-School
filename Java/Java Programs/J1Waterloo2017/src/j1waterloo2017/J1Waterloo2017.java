/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1waterloo2017;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
public class J1Waterloo2017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int cor1, cor2; 
        
        cor1 = input.nextInt();
        cor2 = input.nextInt();
        
        if (cor1 >= 0 && cor2 >= 0) {
            System.out.println("1");
        }
        
        if (cor1 <= 0 && cor2 >= 0) {
            System.out.println("2");
        }
        if (cor1 <= 0 && cor2 <= 0) {
            System.out.println("3");
        }
        if (cor1 >= 0 && cor2 <= 0) {
            System.out.println("4");
        }
    }
    
}
