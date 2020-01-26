/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleep;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: Sleep Exercise 10
 * Course Code: ICS3U0A
 * Date: October 3, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner; // Imports the Scanner which allows user input
public class Sleep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // Opens the Scanner which allows user input
        int year, month, day, year1, month1, day1, daysAlive, hoursSlept; // Creates the variables needed for the program
        System.out.println("Enter your birthdate: "); // Tells user to enter birthdate in output
        System.out.print("Year: "); // Tells user to enter birth year in output
        year = input.nextInt(); // Allows user to enter birth year in output
        System.out.print("Month: "); // Tells user to enter birth month in output
        month = input.nextInt(); // Allows user to enter birth month in output
        System.out.print("Day: "); // Tells user to enter birth day in output
        day = input.nextInt(); // Allows user to enter birth day in output
        System.out.println("Enter today's date: "); // Tells user to enter current date in output
        System.out.print("Year: "); // Tells user to enter current year in output
        year1 = input.nextInt(); // Allows user to enter current year in output
        System.out.print("Month: "); // Tells user to enter current month in output
        month1 = input.nextInt(); // Allows user to enter current month in output
        System.out.print("Day: "); // Tells user to enter current day in output
        day1 = input.nextInt(); // Allows user to enter current day in output
        
        daysAlive = (year1 - year) *365 + (month1-month) * 30 + (day1-day); // Finds out the number of days alive from birthdate
        System.out.println("You have been alive for " + daysAlive + " days."); // Prints the number of days alive from birthdate
        
        hoursSlept = daysAlive * 8; // Finds out the number of hours slept on the consideration of 8 hours of sleep per day
        
        System.out.println("You have slept for " +hoursSlept + " hours." ); // Prints the number of hours slept 
        
        
        
    }
    
}
