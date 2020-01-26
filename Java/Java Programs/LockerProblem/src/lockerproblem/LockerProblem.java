/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lockerproblem;

import java.util.Arrays;

/**
 *
 * @author Jihal
 */
public class LockerProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int locker[] = new int[100];
        boolean[] check = new boolean[100];
        Arrays.fill(check, true);
        
        for(int i = 2; i < 100; i++) {
            for (int a = i - 1; a < 100; a += i) {
                if (check[a]) {
                    check[a] = false;
                }
                else {
                    check[a] = true;    
                }
            }
        }
        
        
       for (int b = 0; b < 100; b++) {
           if (check[b] == true) {
               System.out.println("Locker number " + (b + 1) + " is opened.");
           } else {
               System.out.println("Locker number " + (b + 1) + " is closed.");
           }
       }
    }
    
}
