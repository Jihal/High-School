/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chpater7testquestion2;

/**
 * Student Number: 765697
 * @author Jihal
 */
import java.util.Scanner;
public class Chpater7TestQuestion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        double hour, minutes;
        String day;
        
        System.out.print("Hour: ");
        hour = input.nextInt();
        System.out.print("Minutes: ");
        minutes = input.nextInt();
        System.out.print("Day: ");
        day = input.next();
        
        System.out.println(hour + "" + minutes + (" Same Day in Ottawa"));
        System.out.println(PST(hour, minutes, day) +  " in Victoria");
        System.out.println(MST(hour, minutes, day) +  " in Edmonton");
        System.out.println(CST(hour, minutes, day) +  " in Winnipeg");
        System.out.println(hour + "" + minutes + (" Same Day in Toronto"));
        
    }
    
    public static String PST(double hour, double minutes, String day) {
       double result;
       result = hour - 3; 
      
       if (result < 0) {
           result = 24-result; 
           return result + minutes +(" Previous day");
       } else {
           return result + minutes +(" Same day");
       }
              
       
    }
    public static String MST(double hour, double minutes, String day) {
       double result;
       result = hour - 2; 
      
       if (result < 0) {
           result = 24-result; 
           return result + minutes +(" Previous day");
       } else {
           return result + minutes +(" Same day");
       }
              
       
    }
    public static String CST(double hour, double minutes, String day) {
       double result;
       result = hour - 1; 
      
       if (result < 0) {
           result = 24-result; 
           return result + minutes +(" Previous day");
       } else {
           return result + minutes +(" Same day");
       }
              
       
    }
    public static String AST(double hour, double minutes, String day) {
       double result;
       result = hour + 1; 
      
       if (result > 24) {
           result = 0+result; 
           return result + minutes +(" Previous day");
       } else {
           return result + minutes +(" Same day");
       }
              // DIDNT HAVE TIME TO COMPLETE OR COMMENT 
              // CODE IS NOT PROPER AT ALL
       
    }
}
