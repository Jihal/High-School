/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1waterloo2014;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
public class J1Waterloo2014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int angle1, angle2, angle3, total;
        
        System.out.print("Enter angle #1: ");
        angle1 = input.nextInt();
        
        System.out.print("Enter angle #2: ");
        angle2 = input.nextInt();
        
        System.out.print("Enter angle #3: ");
        angle3 = input.nextInt();
        
        total = angle1 + angle2 + angle3; 
        
        
        if (total != 180) {
            System.out.println("Error");
        }
        else if (angle1 == 60 && angle2 == 60 && angle3 == 60) {
            System.out.println("Equilateral");
    }   else if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3 && total == 180) {
        System.out.println("Isoceles");
    }   else if (angle1 != angle2 || angle1 != angle3 || angle2 != angle3 && total == 180) {
        System.out.println("Scalene");
    } 
  }
}
