/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeconverter;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
public class TimeConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("1. Hours to minutes.");
        System.out.println("2. Days to hours.");
        System.out.println("3. Minutes to hours.");
        System.out.println("4. Hours to days.");
        
        System.out.print("Choose one of the above: ");
        choice = input.nextInt();
        
        if (choice == 1) {
            hoursToMinutes();
        }
        else if (choice == 2) {
            daysToHours();
        }
        else if (choice == 3) {
            minutesToHours();
        }
        else if (choice == 4) {
            hoursToDays();
        }
    }
    public static void hoursToMinutes() {
        Scanner input = new Scanner (System.in);
        
        int minutes, hours;
        
        System.out.print("Enter number of hours: ");
        hours = input.nextInt();
        
        minutes = hours * 60;
        
        System.out.println(minutes + " minutes.");
    }
    public static void daysToHours() {
        Scanner input = new Scanner (System.in);
        
        int days, hours;
        
        System.out.print("Enter number of days: ");
        days = input.nextInt();
        
        hours = days * 24;
        
        System.out.println(hours + " hours.");
    }
    public static void minutesToHours() {
        Scanner input = new Scanner (System.in);
        
        int minutes, hours;
        
        System.out.print("Enter number of minutes: ");
        minutes = input.nextInt();
        
        hours = minutes / 60;
        
        System.out.println(hours + " hours.");
    }
    public static void hoursToDays() {
        Scanner input = new Scanner (System.in);
        
        int days, hours;
        
        System.out.print("Enter number of hours: ");
        hours = input.nextInt();
        
        days = hours / 24;
        
        System.out.println(days + " days.");
    }
}
