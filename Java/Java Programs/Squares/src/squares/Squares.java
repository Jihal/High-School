/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squares;

/**
 *
 * @author Jihal
 */

public class Squares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int squares[], squared[];
        
        squares = new int [5];
        squared = new int [5];
        
        for (int i = 0; i <5; i++) {
            squares [i] = i; 
        }
        for (int j = 0; j < 5; j++) {
            System.out.println(squared[j] = squares[j]*squares[j]);
            
        }
    }
    
}
