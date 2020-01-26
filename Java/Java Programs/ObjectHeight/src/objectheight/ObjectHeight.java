/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectheight;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: My First
 * Course Code: ICS3U0A
 * Date: September 14, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 * @author Jihal
 */
import java.util.Scanner;
public class ObjectHeight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double height, time;
        System.out.print("Enter a time less than 4.5 seconds: ");
        time=input.nextInt();
        if (time >= 4.5) {
            System.out.print("Time must be less than 4.5 seconds. Re-run the program and enter a time less than 4.5 seconds.");
        } else { 
        height = 100-4.9*time*time; 
        System.out.print("The height of the object is: "+height+ " meters");
        }
    }
    
}
