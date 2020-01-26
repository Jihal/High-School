/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j4waterloo2017;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
public class J4Waterloo2017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int time1 = 1;
        int time2 = 2;
        int time3 = 0;
        int time4 = 1;
        int sum;
        int No3;
        int diff1, diff2, diff3;
        int counter=0;
        
        int time = input.nextInt();
        
        while (time > 0) { //Total time is not 0
             if (time1 != 0) {
            diff1 = time2-time1;
            diff2 = time3-time2;
            diff3 = time4-time3;
            if (diff1 == diff2 && diff1 == diff3) {
                counter++;
            }
            } else {
                diff1 = time3-time2;
                diff2 = time4-time3;
                if (diff1 == diff2) {
                counter++;
            }
            }
            
            if (time4 == 9) {  //If time reachs x9
                time3 += 1; //
                time4 = 0; 
            } else {
                time4+=1;
            }
                if (time3 == 6) { //If an hour has passed
                    time3 = 0;
                    time4 = 0;
                
                    sum = time1+time2;
                    No3 = time2+1;
                    //Setting new hour
                    if (time2 == 9) {
                        time1 = 1;
                        time2 = 0;
                     if (time1 == 1 && time2 == 2) {
                        time1 = 0;
                        time2 = 1;
                    }
                     if (time1 != 0 && time2!=9 || time1 != 1 && time2 != 2) {
                         time2+=1;
                     }
                  }
                }
                time--;
            
        }
        
        System.out.println(counter);
    }
    
}
