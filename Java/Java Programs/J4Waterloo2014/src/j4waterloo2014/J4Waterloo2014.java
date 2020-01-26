/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j4waterloo2014;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;                                                       //Imports Scanner for user input
import java.util.ArrayList;                                                     //Imports ArrayList class

public class J4Waterloo2014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);                                 //Opens Scanner for user input
        
        ArrayList<Integer>friends = new ArrayList<Integer>();                                    //Makes friends an  ArrayList
        
        int rounds, removals, store, length;                                    //Declares the variables needed for the program

        System.out.print("Enter number of friends: ");                          //Prompts user for number of friends
        length = input.nextInt();                                               //Allows user to enter number of friends

        for (int add = 0; add < length; add++) {                                //Until add is less then number of friends
            friends.add(add + 1);                                               //Fills friends with number of friends like friend #1 = 1, friends #2 = 2, etc.
        }
        System.out.print("Enter number of rounds: ");                           //Prompts user for number of rounds
        rounds = input.nextInt();                                               //Allows user to enter number of rounds

        for (int i = 0; i < rounds; i++) {                                      //For index being less then number of rounds, increment index by 1

            System.out.print("Enter removal multiple: ");                       //Prompts user for removal multiple (does this every time the for loop runs)
            removals = input.nextInt();                                         //Allows user to enter removal multiple

            store = removals - 1;                                               //Intializes store to removals-1 becuase in the ArrayList friends, the first index value is 0 and not 1

            while (store < friends.size()) {                                    //While store is less then the size of the ArrayList friends
                friends.set(store, 0);                                          //Set the friends value at index store (multiple) to 0 (I don't remove it yet because it would shift the values)
                store += removals;                                              //Adds the removal multiple to store because it has to be increased
            }
            for (int k = 0; k < friends.size(); k++) {                          //While index k is less then the size of friends, increment k by 1
                if (friends.get(k).equals(0)) {                                 //If the friends value at k is 0 then 
                    friends.remove(k);                                          //Remove it
                }
            }
        }
        for (int print = 0; print < friends.size(); print++) {                  //For print being less then friend size, increment it by 1
            System.out.println(friends.get(print));                             //Prints all the remaining friends on different lines
        }
    }

}
