/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountsetup;

/**
 *
 * @author Jihal
 */
import java.util.Scanner; 
public class AccountSetup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        String userName, password;
                int passwordLength;
        
        System.out.print("Enter a user name: ");
        userName = input.next();
        
        System.out.print("Enter a password that is at least 8 characters: ");
        password = input.next();
        passwordLength = password.length();
        
        while (passwordLength < 8) {
            System.out.print("Enter a password that is at least 8 characters: ");
            password = input.next();
            passwordLength = password.length();
        }
        System.out.println("Your user name is " + userName.toLowerCase() + " and your password is " + password.toLowerCase());
        
    }
    
}
