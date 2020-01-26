/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaofarectangle2;

/**
 *Name: Jihal Patel
 * Student Number: 765697
 * Title: My First
 * Course Code: ICS3U0A
 * Date: September 14, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner; 
public class AreaofaRectangle2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length, width, rectangleArea;
        System.out.print("Give the legnth of value for the rectangle: ");
        length=input.nextInt();
        System.out.print("Give the width value for the rectangle: ");
        width=input.nextInt();
        rectangleArea =length*width;
        System.out.println("Area of the rectangle = " +rectangleArea);
        
              
        // TODO code application logic here
    }
    
}
