/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distanceapplication;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: My First
 * Course Code: ICS3U0A
 * Date: September 14, 2016
 * Teacher Name: Mr. Veera

 * @author Jihal
 */
public class DistanceApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Distance Application 
        double firstSegment = 12.2; //Declares a variable for the first segment of the race and its distance
        double secondSegment = 10.6; //Declares a variable for the second segment of the race and its distance
        double thirdSegment = 5.8;  // Declares a variable for the third segment of the race and its distance
        double totalDistance = firstSegment + secondSegment + thirdSegment; // Declares the total distance which is the addition of all the segments
        System.out.println("The total distance of the race with three segments is: " + totalDistance);
        
    }
    
}
