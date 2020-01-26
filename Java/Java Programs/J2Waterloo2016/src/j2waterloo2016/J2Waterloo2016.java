/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2waterloo2016;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
public class J2Waterloo2016 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
                
        int numbers1[] = new int [4];
        int numbers2[] = new int [4];
        int numbers3[] = new int [4];
        int numbers4[] = new int [4];
        int store1 = 0, store2 = 0, store3 = 0, store4 = 0, store5 = 0;
        int storeArray[] = new int [4];
        boolean magic = true;
        
        System.out.print("Row 1:");
        String row1 = input.nextLine(); // Read 1st line
        String[] space1 = row1.split(" "); //This stores all the values into the string array depending on the spaces
        
        for(int i=0;i<space1.length;i++){
        
        numbers1[i] = Integer.parseInt(space1[i]); //This converts the string array values into integer to modify for further use
        }
        
        System.out.print("Row 2:");
        String row2 = input.nextLine(); // Read 1st line
        String[] space2 = row2.split(" "); // Split based on space
        
        for(int i=0;i<space2.length;i++){

        numbers2[i] = Integer.parseInt(space2[i]);
        }
        
        System.out.print("Row 3:");
        String row3 = input.nextLine(); // Read 1st line
        String[] space3 = row3.split(" "); // Split based on space
        
        for(int i=0;i<space3.length;i++){
        
        numbers3[i] = Integer.parseInt(space3[i]);
        }
        
        System.out.print("Row 4:");
        String row4 = input.nextLine(); // Read 1st line
        String[] space4 = row4.split(" "); // Split based on space
        
        for(int i=0;i<space4.length;i++){
      
        numbers4[i] = Integer.parseInt(space4[i]);
        }
        
        for (int i = 0; i < 4; i++) {
            store1 += numbers1[i];
            store2 += numbers2[i];
            store3 += numbers3[i];
            store4 += numbers4[i];
            
        }
        if (store1 == store2 && store1 == store3 && store1 == store4) {
            magic = true;
        } else {
            magic = false;
            System.out.println("Not magic.");
        }
        //System.out.println(store1 + " " + store2 + " " + store3 + " " + store4);
        
        if (magic == true) {
            for (int j = 0; j < 4; j++) {
                storeArray[j] = numbers1[j] + numbers2[j] + numbers3[j] + numbers4[j];
                //System.out.println(storeArray[j] + " " + numbers1[j] + numbers2[j] + numbers3[j] + numbers4[j]);
            }
        }
        
        if (((storeArray[0] == storeArray[1]) && (storeArray[0] == storeArray[2])) && (storeArray[0] == storeArray[3]) && magic != false) {

                System.out.println("Magic.");
        }
       
        
    }
    
}
