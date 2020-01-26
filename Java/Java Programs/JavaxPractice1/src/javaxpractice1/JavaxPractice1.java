/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaxpractice1;

/**
 *
 * @author Jihal
 */
import javax.swing.*;
import java.util.Random;
public class JavaxPractice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        Random random = new Random();
        
        int randomNumber; 
        
        
        randomNumber = random.nextInt(5);
        boolean game = false; 
        while (game == false) {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Guess a random number"));
        
        if (input == randomNumber) {
            game = true; 
            JOptionPane.showMessageDialog(frame, 
                    "Congratulations! You guessed the number");
            System.exit(0);
        }  else if (input > randomNumber) {
           
            JOptionPane.showMessageDialog(frame,
                    "Too high!");            
       
        } else if (input < randomNumber) {
            JOptionPane.showMessageDialog(frame, 
                    "Too low!");
        }
    }
    
}
}
