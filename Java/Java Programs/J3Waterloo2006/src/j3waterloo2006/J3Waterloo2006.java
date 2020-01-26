/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j3waterloo2006;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;

public class J3Waterloo2006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int counter = 0;
        String text[] = new String [200];
        
        for (int i = 0; i < 100; i++) {
        System.out.print("Enter text: ");
        text[i] = input.next();
        if (text[i].equals("halt")) {
            break;
        } else {
            
        }
      }
    }
    
    public static int count(String text) {
    }
}

        

