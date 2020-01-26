/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elapsedtimecalculator;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;

public class ElapsedTimeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int startingHour, elapsedHours, newTime; 
        String amOrPm;
        
        System.out.print("Enter the starting hour: ");
        startingHour = input.nextInt();
        
        System.out.print("Enter am or pm: ");
        amOrPm = input.next();
        
        System.out.print("Enter the number of elapsed hours: ");
        elapsedHours = input.nextInt();
        
        newTime = (startingHour + elapsedHours); 
        
        if (newTime > 12) {
            newTime = startingHour + elapsedHours - 12;
            if (amOrPm.equalsIgnoreCase("am")) {
                System.out.println("The time is: " + newTime + ":00 " + "pm");
            } 
            if (amOrPm.equalsIgnoreCase("pm")) {
                System.out.println("The time is: " + newTime + ":00 " + "am");
            }
        } else
        
        System.out.println("The time is: " + newTime + ":00" + " " + amOrPm);
    }
    
}
