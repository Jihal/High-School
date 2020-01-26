/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathtutor;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: Math Tutor
 * Course Code: ICS3U0A
 * Date: October 13, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner; // Imports Scanner needed for user input
public class MathTutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // Opens Scanner needed for user input
        int randomNumber1, randomNumber2, operator, answer, inputAnswer, divisionRemainder; // Makes variables neeeded for the program 
        
        randomNumber1 = (int) (10*Math.random()+1); // Generates a random number from 1 to 10
        randomNumber2 = (int) (10*Math.random()+1); // Generates another random number from 1 to 10
        operator = (int) (5*Math.random()+1); // Generates a random number (1-4) to determine which operator it will use
        if (operator == 1) { // If the operater is 1
            answer = randomNumber1 + randomNumber2; //Answer is the addition of both random numbers
            System.out.print("What is "+randomNumber1 + " + " + randomNumber2 +"? "); //Prompts user for an answer
            inputAnswer = input.nextInt(); // Allows user to enter an answer
           if (inputAnswer == answer) { // If the answer is correct
                System.out.println("Correct!"); // Tell the user the answer is correct
            } else { // If the answer is incorrect
                System.out.println("Incorrect. The correct answer is: "+answer); // Tell the user the answer is incorrect and the right answer
            }
            
        }
        if (operator == 2) { // If the operator is 2
            answer = randomNumber1 - randomNumber2; // Answer is the subtration of both random numbers
            System.out.print("What is "+randomNumber1 + " - " + randomNumber2 +"? "); // Prompts user for an answer
            inputAnswer = input.nextInt(); // Allows user to enter an answer
            if (inputAnswer == answer) { // If the answer is correct
                System.out.println("Correct!"); // Tell the user the answer is correct
            } else { // If the answer is incorrect
                System.out.println("Incorrect. The correct answer is: "+answer); // Tell the user the answer is incorrect and the right answer
            }
            
        }
         if (operator == 3) { // If the operator is 3
            
            do { // Do the following
                randomNumber1 = (int) (10*Math.random()+1); //Generate another random number
                randomNumber2 = (int) (10*Math.random()+1); //Generate another random number (2)
                divisionRemainder = randomNumber1 % randomNumber2; // Find the remainder of both numbers
               } while (divisionRemainder !=0); // Do above while division remainder is 0
                
               if (divisionRemainder == 0) { // If the division remainder is equal to 0 do the rest
                    answer = randomNumber1 / randomNumber2; // Answer is the division of both random numbers
                    System.out.print("What is: "+ randomNumber1 + " / " + randomNumber2 + "? "); // Prompts user for an answer
                    inputAnswer = input.nextInt(); // Allows user to enter an answer 
                    if (inputAnswer == answer) { // If the answer is correct
                        System.out.println("Correct!"); // Tell the user the answer is correct
                       
                    } else { // If the answer is incorrect
                        System.out.println("Incorrect. The correct answer is: " + answer); // Tell the user the answer is incorrect and the right answer
                    }
                }
         }
             if (operator == 4) { // If the operator is 4
            answer = randomNumber1 * randomNumber2; // Answer is the multiplication of both numbers
            System.out.print("What is "+randomNumber1 + " * " + randomNumber2 +"? "); // Prompts user for an answer
            inputAnswer = input.nextInt(); // Allows user to enter an answer
                if (inputAnswer == answer) { // If the answer is correct 
                System.out.println("Correct!"); // Tell the user the answer is correct
            }       else { // If the answer is incorrect
                System.out.println("Incorrect. The correct answer is: "+answer); // Tell the user the answer is incorrect and the right answer
            }
            
        }
             if (operator == 5) { // If the operator is 5
            answer = randomNumber1 % randomNumber2; // Answer is the remainder of both numbers
            System.out.print("What is "+randomNumber1 + " % " + randomNumber2 +"? "); // Prompts user for an answer
            inputAnswer = input.nextInt(); // Allows user to enter an answer
                if (inputAnswer == answer) { // If the answer is correct 
                System.out.println("Correct!"); // Tell the user the answer is correct
            }       else { // If the answer is incorrect
                System.out.println("Incorrect. The correct answer is: "+answer); // Tell the user the answer is incorrect and the right answer
            }
            
        }
    
 
       }
}