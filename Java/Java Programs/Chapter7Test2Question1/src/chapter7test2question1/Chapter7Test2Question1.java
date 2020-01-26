/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7test2question1;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: Chapter 7 Test2 Question 1
 * Course Code: ICS3U0A
 * Date: October 3, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner; // Imports Scanner for user input                                                   
public class Chapter7Test2Question1 {                                           

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in); // Opens Scanner for user input
        int dayMinutes, eveningMinutes, weekendMinutes; // Makes variables for each minutes
        
        System.out.print("Number of daytime minutes? "); // Prompts user for daytime minutes
        dayMinutes = input.nextInt(); // Allows user to enter daytime minutes
        
        System.out.print("Number of evening minutes? ");// Prompts user for evening minutes
        eveningMinutes = input.nextInt();// Allows user to enter evening minutes
        
        System.out.print("Number of weekend minutes? ");// Prompts user for weekend minutes
        weekendMinutes = input.nextInt(); // Allows user to enter weekend minutes
    
        System.out.println(Compare(dayMinutes, eveningMinutes, weekendMinutes)); //Prints out result of Compare() method
    }
    
    public static String Compare (int dayMin, int evenMin, int weekMin) { // Makes method calling for 3 int parameters
        int planAFreeMin, planAEvenMin=evenMin, planAWeekMin = weekMin, totalA; // Makes variables needed and stores evening / weekend minutes
        
        planAFreeMin = dayMin - 100; //Subtracts free minutes
        
        if (planAFreeMin <= 0) { // If free minutes is less than equal to 0
            planAFreeMin = 0; // Make planAFreeMin equal to 0
        } else if (planAFreeMin > 0) { //If it's more then 0
        
            planAFreeMin*=25; //Multiply it by the cents cost for plan A
        }
        
        planAEvenMin*=15; // Multiply evening minutes by it's cost
        
        planAWeekMin*=20; // Multiply weekend mintues by it's cost
        
        totalA = planAFreeMin + planAEvenMin + planAWeekMin; // Make totalA equal to the total cost for plan A
        
        int planBFreeMin, planBEvenMin=evenMin, planBWeekMin = weekMin, totalB; // Makes variables needed and stores evening / weekend minutes
        
        planBFreeMin = dayMin - 250; // Subtracts free minutes
        
        if (planBFreeMin <= 0) { // If planBFreeMin is less than equal to 0
            planBFreeMin = 0; // Make it equal to 0
        } else if (planBFreeMin > 0) { // If it's more then 0
            planBFreeMin*=45; // Multiply it by the cents cost for plan B
        }
        
        planBEvenMin*=35; // Multiply evening minutes by it's cost 
        
        planBWeekMin*=25; // Multiply weekend minutes by it's cost
        
        totalB = planBFreeMin + planBEvenMin + planBWeekMin; // Make total of plan B equal to it's cost
        
        if (totalA < totalB) { // If plan a is cheaper then b
            return ("Plan A is cheapest."); //Return that plan a is cheaper
        } else if (totalB < totalA) { // If plan b is cheaper 
            return ("Plan B is cheapest."); // Retun plan b is cheaper
        } else { // If they are the same price
            return ("Both Plans"); // Return both plans
        }
    }
}
