/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g11examquestion2;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: Exam Question 2 (Zero That Out)
 * Course Code: ICS3U0A
 * Date: January 20, 2017
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner; //Imports Scanner needed for user input
import java.util.Arrays; //Imports Arrays (I need it to fill the values in the array to something not equal to 0)

public class G11ExamQuestion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); //Opens Scanner needed for user input

        int numOfInt, total = 0, num[] = new int[100000], numBefore; //Declares and initializes all the variables needed for the program
        Arrays.fill(num, -1); //Sets the all the 100000 values to -1
        
        System.out.print("Enter number of integers: "); //Prompts user for number of integers
        numOfInt = input.nextInt(); //numOfInt stores the user input

        for (int i = 0; i < numOfInt; i++) { //For i being less the number of integers, increment i by 1
            System.out.print("Enter number: "); //Prompts user for a number
            num[i] = input.nextInt(); //Changes num's value at i to user input
        }
        for (int c = 0; c < numOfInt; c++) { //For c (check) being less the number of integers inputted, increment c by 1

            if (num[c] == 0) { //If the number at c is 0 meaning the boss made a mistake
                numBefore = c - 1; //Set numBefore to c-1 (which is number before)
                do { //Do
                    while (num[numBefore] == -1 || num[numBefore] == 0) { //If the numBefore is already -1 (meaning value was already removed) or the numBefore is 0 (making this another mistake)
                        numBefore--; //Decrement numBefore by 1
                    }
                    num[numBefore] = -1; //This runs when the number before is not negative one and zero but is a mistake and sets it to -1
                    
                } while (num[numBefore] != -1); //While numBefore is not equal to -1

            }

        }
        for (int k = 0; k < numOfInt; k++) { //For k being less then number of integers inputted, increment k by 1
            if (num[k] != -1) { //If number at k is not equal to -1 (meaning it is NOT a mistake) 
                total += num[k]; //Add the number at k to the total money made
            }

        }
        System.out.println(total); //Print out the total money made
    }

}
