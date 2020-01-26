/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfectintegers;

/**
 *
 * @author Jihal
 */

public class PerfectIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int result=0;
        System.out.println("The perfect integers up to 100 are: ");
        for(int num=1; num < 100; num++) {
            if (isPerfect(num)) {
                System.out.println(num);
            }
        }
       
    }
    public static boolean isPerfect(int num) {
        int result, divisor, sum = 0;
        
        for (divisor = 1; divisor < num; divisor++) {
            result = num % divisor;
            if (result == 0) {
                sum+=divisor;
            }
        }
        if (sum == num) {
            return true;
        } else {
            return false;
        }
         
    }
    
}
