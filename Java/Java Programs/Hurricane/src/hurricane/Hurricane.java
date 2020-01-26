/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hurricane;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
public class Hurricane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int category; 
        
        System.out.print("Enter the category of the hurricane: ");
        category = input.nextInt();
        
        switch (category) {
            case 1 : System.out.println("Category 1: 74-95 mph or 64-82kt or 119-153 km/hr");
            case 2 : System.out.println("Category 2: 96-110 mph or 83-95kt or 154-177 km/hr");
            case 3 : System.out.println("Category 3: 111-130 mph or 96-113kt or 178-209 km/hr");
        }
    }    
    
}
