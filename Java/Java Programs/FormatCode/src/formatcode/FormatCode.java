/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formatcode;

/**
 * Name: Jihal Patel
 * Student Number: 765697
 * Title: My First
 * Course Code: ICS3U0A
 * Date: September 14, 2016
 * Teacher Name: Mr. Veera

 * @author Jihal
 */
public class FormatCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.format("%-10s %8s %8s", "Team", "Wins", "Losses\n");
         System.out.format("%-10s %8s %8s", "Jaguars", "10", "5\n");
          System.out.format("%-10s %8s %8s", "Cheetahs", "14", "1\n");
           System.out.format("%-10s %8s %8s", "Panthers", "8", "7\n");
            System.out.format("%-10s %8s %8s", "Something", "10", "5");
    }
    
}
