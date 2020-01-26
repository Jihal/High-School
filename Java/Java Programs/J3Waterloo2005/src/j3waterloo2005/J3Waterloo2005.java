/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j3waterloo2005;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;                                                       //Imports Scanner needed for user input
import java.util.ArrayList;                                                     //Imports ArrayList class

public class J3Waterloo2005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);                                 //Opens Scanner needed for user input
        ArrayList directions = new ArrayList();                                 //Makes a new ArrayList called directions

        do {                                                                    //Beings do-while loop
            System.out.print("Enter direction: ");                              //Prompts user for direction
            directions.add(input.next());                                       //Adds direction to directions

            System.out.print("Enter street: ");                                 //Prompts user for street
            directions.add(input.next());                                       //Adds street to directions
        } while (!(directions.contains("SCHOOL")));                             //Does this while directions does not contain the string SCHOOL

        for (int i = 0; i < directions.size(); i++) {                           //For i being less then the size of the ArrayList directions, increment i by 1
            if (directions.get(i).equals("R")) {                                //If directions at i stores "R" (meaning turn right)
                directions.set(i, "L");                                         //Change it to "L" (meaning turn left)
            } else if (directions.get(i).equals("L")) {                         //If directions at i stores "L" (meaning turn left)
                directions.set(i, "R");                                         //Change it to "R" (meaning turn right)
            }
        }
        for (int k = directions.size() - 1; k >= 0; k--) {                      //For k being directions's size and less then 0 decrement k by 1
            if (k != 0) {                                                       //If k is not equal to 0 (needed because when I do k-1 it would go below first array index)
                if (directions.get(k).equals("R")) {                            //If directions at k stores "R" 
                    System.out.println("Turn RIGHT onto " + directions.get(k - 1) + " street."); //Print turn right and get the street which would be stored at k-1

                } else if (directions.get(k).equals("L")) {
                    System.out.println("Turn LEFT onto " + directions.get(k - 1) + " street.");

                }
            } else if (directions.get(k).equals("R")) {
                System.out.println("Turn RIGHT into your HOME.");

            } else if (directions.get(k).equals("L")) {
                System.out.println("Turn LEFT into your HOME.");
            }
        }
    }

}
