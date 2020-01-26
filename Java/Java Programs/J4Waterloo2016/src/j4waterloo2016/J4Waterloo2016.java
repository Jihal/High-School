/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j4waterloo2016;

/**
 *
 * @author Jihal
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class J4Waterloo2016 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws parsexecption {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("hh:mm");
        
        String time;
        String [] split;
        int timeInt[] = new int [2], timeAdded = 0;
        
       System.out.print("Enter time left: ");
       time = input.next();
       
       Date date = format.parse(time);

       cal.setTime(date);
       cal.add(Calendar.HOUR_OF_DAY, 2);
       
       String newTime = date.format(cal.getTime());
       
       System.out.print(newTime);
       
       /*for (int i = 0; i < split.length; i++) {
           timeInt[i] = Integer.parseInt(split[i]);
       }*/
       
      /* if (!(timeInt[0] >= 7) && !(timeInt[0] < 10) && !(timeInt[0] >= 15) && !(timeInt[0] < 19) && timeInt[1]==0) {
        timeInt[0]++;
        timeAdded++;
        if (timeAdded == 2) {
            //System.out.print(""timeInt[0])
        }
    }*/
    }
    
}
