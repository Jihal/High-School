/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilo;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
import java.util.Random;
public class HiLo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        int pointsToRisk, randomNum, hiLo, points=1000;
        boolean play = true;
        String playAgain;
        
        System.out.println("High Low Game\n");
        System.out.println("RULES");
        System.out.println("Numbers 1 through 6 are low");
        System.out.println("Numbers 8 through 13 are high");
        System.out.println("Number 7 is neither high or low\n");
        
        
        while (play) {
        System.out.println("You have " + points + " points.");
        System.out.print("Enter points to risk: ");
        pointsToRisk = input.nextInt();
        
        randomNum = random.nextInt(13);
        
        randomNum+=1;
        
        System.out.print("Predict <1=High, 0=Low>: ");
        hiLo = input.nextInt();
        
        System.out.println("The number is " + randomNum);
        
        if (randomNum == 7) {
            System.out.println("You lose");
            points-= pointsToRisk;
        } 
        else if (hiLo == 1) {
            if (randomNum >= 8 && randomNum <=13) {
                System.out.println("You win");
                pointsToRisk *= 2;
                points+= pointsToRisk;
            } else {
                System.out.println("You lose");
                points-= pointsToRisk;
            }
        } else if (hiLo == 0) {
            if (randomNum >= 1 && randomNum <=6) {
                System.out.println("You win");
                pointsToRisk *= 2;
                points+= pointsToRisk;
            } else {
                System.out.println("You lose");
                points-= pointsToRisk;
            }
        }
        if (points<=0) {
            System.out.println("You lost all your points.");
            System.out.println("Game ended.");
            play = false;
            break;
        }
        System.out.print("Play again?: ");
        playAgain = input.next();
        
        if (playAgain.equalsIgnoreCase("n")) {
            play = false;
            System.out.println("Game ended.");
        }
    }
   
    }
    
}
