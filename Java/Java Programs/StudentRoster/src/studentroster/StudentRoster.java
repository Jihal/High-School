/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentroster;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
public class StudentRoster {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int numberOfStudents;
        String name; 
        String[]studentNames;
        
        System.out.print("Enter the number of students in the class: ");
        numberOfStudents = input.nextInt();
        
        studentNames = new String[numberOfStudents];
        
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Student name: ");
            name = input.next();
            
            studentNames[i] = name;
        }
        
        System.out.println("Student Roster");
        for (int j = 0; j < numberOfStudents; j++) {
            
            System.out.println(studentNames[j]);
        }
    }
    
}
