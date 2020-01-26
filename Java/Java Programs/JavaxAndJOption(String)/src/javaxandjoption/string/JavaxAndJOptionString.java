/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaxandjoption.string;

/**
 *
 * @author Jihal
 */
import javax.swing.*; 
public class JavaxAndJOptionString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("");
        String input = "";
        input = JOptionPane.showInputDialog("Do you want to pass or fail?");
        
        if (input.equals("pass")) {
            int reply = JOptionPane.showConfirmDialog(null,
                    "Confirm Answer", "Confirm Answer", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(frame,
                        "You can't pass.");
                System.exit(0);
                
            }
        } else if (input.equals("fail")) {
            int reply = JOptionPane.showConfirmDialog(null,
                    "Confirm Answer", "Confirm Answer", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(frame,
                        "You can't pass.");
                System.exit(0);
             
        }
        else {
            JOptionPane.showMessageDialog(frame, 
                    "Make your desicion.");
        }
    }
    
    
    }
}
