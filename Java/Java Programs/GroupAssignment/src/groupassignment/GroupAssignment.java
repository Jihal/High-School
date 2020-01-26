/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupassignment;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;

public class GroupAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        String firstName, lastName, newC;
        char firstLetterLastName; 
        
        System.out.print("Enter your first name: ");
        firstName = input.next();
        
        System.out.print("Enter your last name: ");
        lastName = input.next();
        
        String Group1 = "abcdefghi";
        String Group2 = "jklmnopqrs";
        String Group3 = "tuvwxyz";
        
        firstLetterLastName = lastName.charAt(0);
        firstLetterLastName = Character.toLowerCase(firstLetterLastName);
        if(Group1.indexOf(firstLetterLastName) != -1) {
            System.out.println(firstName+ " " + lastName + " is assigned to Group 1");
        } 
        if(Group2.indexOf(firstLetterLastName) != -1) {
            System.out.println(firstName+ " " + lastName + " is assigned to Group 2");
        }
         if(Group3.indexOf(firstLetterLastName) != -1) {
            System.out.println(firstName+ " " + lastName + " is assigned to Group 3");
        }
    }
    
}
