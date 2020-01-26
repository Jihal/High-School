/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metricconversion;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;

public class MetricConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner (System.in);
        
        double conversion, num;
        
        System.out.print ("Enter a number: ");
        num=input.nextDouble ();
        
        System.out.println ("1. Inches to Centimeters");
        System.out.println ("2. Feet to Centimeters");
        System.out.println ("3. yards to Meters");
        System.out.println ("4. Miles to Kilometers");
        System.out.println ("5. Centimeters to Inches");
        System.out.println ("6. Centimeters to Feet");
        System.out.println ("7. meters to Yards");
        System.out.println ("8. Kilometers to Miles\n");
        
        System.out.print ("Enter your choice: ");
        conversion= input.nextInt ();
        
        if (conversion==1) {
            
            Inches_Centimeters (num);
        }
        else if (conversion==2) {
            
            Feet_Centimeters (num);
        }
        else if (conversion==3) {
            
            Yards_Meters (num);
        }
        else if (conversion==4) {
            
            Miles_Kilometers (num);
        }
        else if (conversion==5) {
            
            Centimeters_Inches (num);
        }
        else if (conversion==6) {
            
            Centimeters_Feet (num);
        }
        else if (conversion==7) {
            
            Meters_Yards (num);
        }
        else if (conversion==8) {
            
            Meters_Kilometers (num);
        }

    }
    
    public static void Inches_Centimeters (double inches) {
        double centimeters;
        
        centimeters= inches*2.54; 
        
        System.out.println (inches+" inches equals "+centimeters+" centimeters");
        
    }
    
    public static void Feet_Centimeters (double feet) {
        
        double centimeters;

        centimeters= feet*30.48; 
        
        System.out.println (feet+" feet equals "+centimeters+" centimeters");
    }
    
    public static void Yards_Meters (double yards) {
        
        double meters;
        
        meters= yards*0.91; 
        
        System.out.println (yards+" feet equals "+meters+" meters");
    }
    
    public static void Miles_Kilometers (double miles) {
        
        double kilometers;
        
        kilometers= miles*1.6; 
        
        System.out.println (miles+" miles equals "+kilometers+" kilometers");
    }
    
    public static void Centimeters_Inches (double centimeters) {
        
        double inches;

        inches= centimeters/2.54; 
        
        System.out.println (centimeters+" centimeters equals "+inches+" inches");      
    }
    
    public static void Centimeters_Feet (double centimeters) {
        
        double feet;
        
        feet= centimeters/30.48; 
        
        System.out.println (centimeters+" centimeters equals "+feet+" feet");
    }
    
    public static void Meters_Yards (double meters) {
        
        double yards;
        
        yards= meters/30.48; 
        
        System.out.println (meters+"  equals "+yards+" yards");
    }
    
    public static void Meters_Kilometers (double kilometers) {
        
        double miles;
        
        miles= kilometers/30.48; 
        
        System.out.println (kilometers+" equals "+miles+" miles");
    }
}
