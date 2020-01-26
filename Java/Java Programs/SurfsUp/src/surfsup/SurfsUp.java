/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package surfsup;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: My First
 * Course Code: ICS3U0A
 * Date: September 14, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner;
public class SurfsUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int height;
        
        System.out.print("Enter the wave height in feets: ");
        height = input.nextInt();
        
        if (height > 6) {
            System.out.println("Great day for surfing!");
        } else if (height > 3 && height < 6) {
            System.out.println("Go body boarding!");
            
        } else if (height > 0 && height < 3) {
            System.out.println("Go for a swim");
        } else if (height < 0) {
            System.out.println("Whoa! What kind of surf is that?");
        }
      
              
    }
    
}
