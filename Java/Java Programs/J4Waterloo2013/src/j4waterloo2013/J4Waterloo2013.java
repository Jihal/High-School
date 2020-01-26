/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j4waterloo2013;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;

public class J4Waterloo2013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int maxTime, numOfChores, storeTime = 0, choreTime[], number = 0, store;

        System.out.print("Maximum time for the chores to be completed in: ");
        maxTime = input.nextInt();

        System.out.print("Number of chores: ");
        numOfChores = input.nextInt();

        choreTime = new int[numOfChores];

        for (int i = 0; i < numOfChores; i++) {
            System.out.print("Enter time for chore number " + (i + 1) + ": ");
            choreTime[i] = input.nextInt();

        }
        // For loop below puts time in ascending order
        for (int j = 0; j < numOfChores; j++) {                                 //For j being less then number of chores, increment j by 1
            for (int k = j + 1; k < numOfChores; k++) {                         //For k being j+1 and less then number of number of chores, increment k by 1
                if (choreTime[j] > choreTime[k]) {                              //If choreTime at j is greater then choreTime at k
                    store = choreTime[j];                                       //Store choreTime at j in variable store
                    choreTime[j] = choreTime[k];                                //Change choreTime at j to the choreTime at k
                    choreTime[k] = store;                                       //Change choreTime at k to the value of store which is the choreTime at j before it was changed
                }
            }
        }

        for (int m = 0; m < numOfChores; m++) {
            if (choreTime[m] < maxTime && storeTime < maxTime) {
                storeTime += choreTime[m];
                number++;
                if (storeTime > maxTime) {
                    storeTime -= choreTime[m];
                    number--;
                }
            }
        }
        System.out.println(number);
    }

}
