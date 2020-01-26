/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1waterloo2011;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: Chapter 5 Test Code 2 / J1 Waterloo 2011
 * Course Code: ICS3U0A
 * Date: October 20, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner; // Import Scanner needed for user input
public class J1Waterloo2011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in); // Opens Scanner needed for user input
        int antennas, eyes; // Makes the necessary variables for the program
        
        System.out.println("How many antennas? "); // Prompts user for number of antennas
        antennas = input.nextInt(); // Allows user to enter number of antennas
        
        System.out.println("How many eyes? "); // Prompts user for number of eyes
        eyes = input.nextInt(); // Allows user to enter number of eyes
        
        boolean identified1 = false; // Sets identifier for first statement
        boolean identified2 = false; // Sets identifier for second statement
        boolean identified3 = false; // Sets identifier for third statement
        
        
        if (antennas >= 3 && eyes >= 0 && eyes <= 4) { // If the antennas are atleast 3 and eyes are a most of 4
          
            System.out.println("TroyMartian"); // Print that the alien species is TroyMartian
            
        } else {
            identified1 = true; // If this species is not identified it sets identifier 1 to true
        }
        if (antennas >= 0 && antennas <= 6 && eyes >= 2) { // If the antennas are a most of 6 and eyes are atleast 2 
           
            System.out.println("VladSaturnian"); // Print that the alien species is VladSaturnian
            
        } else {
            identified2 = true; // If this species is not identified it sets identifier 1 to true
        }
            
        if (antennas >=0 && antennas <= 2 && eyes >= 0 && eyes <= 3){ // If the antennas are a most of 2 and eyes are a most of 3
           
            System.out.println("GraemeMercurian"); // Print that the alien species is GraemeMercurian
            
        } else {
            identified3 = true; // If this species is not identified it sets identifier 1 to true
        }
        if (identified1 == true && identified2 == true && identified3 == true) { // If the alien species is not one of the above
            
        }
       
    }
    
}
    

