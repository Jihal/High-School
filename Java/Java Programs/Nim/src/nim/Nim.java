/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nim;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
import java.util.Random;

public class Nim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int stones, userInput, computerInput, subtract;

        stones = random.nextInt(30);
        stones += 1;
        if (stones < 15) {
            stones += 15;
        }
        do {
            System.out.println("There are " + stones + " stones.");

            do {
                System.out.print("How many would you like? ");
                userInput = input.nextInt();
            } while(validEntry(userInput, stones));
            
            stones -= userInput;
            
            if(stones == 0) {
                System.out.println("Computer won!");
                break;
            }

            do {
                computerInput = drawStones();
            } while (validEntry(computerInput, stones));
            
            System.out.println("The computer takes " + computerInput + " stones.");
            stones -= computerInput;
            
            if(stones == 0) {
                System.out.println("Player won!");
                break;
            }
        } while (stones != 0);
    }

    public static boolean validEntry(int userInput, int stones) {
        if(userInput <= stones) {
            if(userInput > 0) {
                if(userInput < 4) {
                    return false;
                }
            }
        }
        
        return true;
    }

    public static int drawStones() {
        Random random = new Random();
        int randomNum;
        randomNum = random.nextInt(3);
      
            randomNum += 1;
        
        return randomNum;
    }

}
