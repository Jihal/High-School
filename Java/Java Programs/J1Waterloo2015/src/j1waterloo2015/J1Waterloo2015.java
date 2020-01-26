/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1waterloo2015;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
public class J1Waterloo2015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int month, day;
        
        
        System.out.print("Enter the month: ");
        month = input.nextInt();
        System.out.print("Enter the day: ");
        day = input.nextInt();
        
        
        
                if (month == 1 && day >= 1 && day <= 31) {
                    
                    System.out.println("Before");
                    
                } else if (month == 2 && day < 18) {
                    
                    System.out.println("Before");
                } else if (month == 2 && day > 18) {
                 
                    System.out.println("After");
                   
                } else if (month == 2 && day == 18) {
                  
                    System.out.println("Special");
                } else if (month > 2 && month <= 12 && day >= 1 && day <= 31) {
                
                    System.out.println("After");
                }
            }
        }
    

    
