/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isotriangle;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
public class IsoTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int size, barLength=1;
        
        System.out.print("Enter the size: ");
        size = input.nextInt();
        for (int index = 1; index <= size; index++) {
        
        addSpaces (size-index);
        drawBar(barLength);
        barLength+=2;
        }
        
    }
    public static void drawBar(int length) {
         for (int i = 0; i < length; i++) {
                 System.out.print("*");
             }
             System.out.println("");
         
         
    }
    public static void addSpaces(int length) {
        for (int i = 0; i <= length; i++)  {
            System.out.print(" ");
        }
    }
}
