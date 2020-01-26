/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package election;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: My First
 * Course Code: ICS3U0A
 * Date: September 14, 2016
 * Teacher Name: Mr. Veera
 * @author Jihal
 */
import java.util.Scanner; // Imports Scanner which allows user input

public class Election {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // Opens Scanner which allows user input
        
        int awbreyNewYork, awbreyNewJersey, awbreyConnecticut, martinezNewYork, martinezNewJersey, martinezConnecticut, awbreyVotes, martinezVotes, totalVotes;
        // Makes integers needed for the program 
        double awbreyPercentage, martinezPercentage; // Makes double (decimal) variables needed for the program
        
        System.out.print("Enter the number of votes for Awbrey in New York: "); // Tells user to type the number of votes in New York for Awbrey
        awbreyNewYork = input.nextInt(); // Allows user to type the number of votes in New York for Awbrey
        System.out.print("Enter the number of votes for Awbrey in New Jersey: "); // Tells user to type the number of votes in New Jersey for Awbrey
        awbreyNewJersey = input.nextInt(); // Allows user to type the number of votes in New Jersey for Awbrey
        System.out.print("Enter the number of votes for Awbrey in Connecticut: "); // Tells user to type the number of votes in Connecticut for Awbrey
        awbreyConnecticut = input.nextInt(); // Allows user to type the number of votes in Conneticut for Awbrey
        
        System.out.print("Enter the number of votes for Martinez in New York: "); // Tells user to type the number of votes in New York for Martinez
        martinezNewYork = input.nextInt(); // Allows user to type the number of votes in New York for Martinez
        System.out.print("Enter the number of votes for Martinez in New Jersey: "); // Tells user to type the number of votes in New Jersey for Martinez
        martinezNewJersey = input.nextInt(); // Allows user to type the number of votes in New Jersey for Martinez
        System.out.print("Enter the number of votes for Martinez in Connecticut: "); 
        martinezConnecticut = input.nextInt();
        
        awbreyVotes = awbreyNewYork + awbreyNewJersey + awbreyConnecticut; 
        martinezVotes = martinezNewYork + martinezNewJersey + martinezConnecticut; 
        totalVotes = awbreyVotes + martinezVotes;
        awbreyPercentage = (awbreyVotes * 100.0) / totalVotes;
        martinezPercentage = (martinezVotes * 100.0) / totalVotes;
        
        System.out.println("");
        System.out.format("%-1s %10s %2s", "Candidate", "Votes", "Percentage\n");
        System.out.format("%-1s %13s %9s", "Awbrey", awbreyVotes, String.format("%.2f", awbreyPercentage));
        System.out.println("");
        System.out.format("%-1s %11s %9s", "Martinez", martinezVotes, String.format("%.2f", martinezPercentage));
        System.out.println("");
        
        System.out.format("%1s %5s", "TOTAL VOTES: ", totalVotes);
        System.out.println("");
    }
}
