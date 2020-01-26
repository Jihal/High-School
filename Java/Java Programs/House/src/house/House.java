/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
public class House {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        addRoof();
        addBase();
        addWalk();
    }
    public static void addRoof() {
        System.out.format("%6s %1s", "/", "\\\n");
        System.out.format("%5s %4s", "/", "\\\n");
        System.out.format("%4s %6s", "/", "\\\n");
        System.out.format("%3s %8s", "/", "\\\n");
    }
    public static void addBase() {
        System.out.println("  _________");
        System.out.format("%3s %8s", ":", ":\n");
        System.out.format("%3s %8s", ":", ":\n");
        System.out.format("%3s %8s", ":", ":\n");
        System.out.format("%3s %8s", ":", ":\n");
        System.out.println("  _________");
    }
    public static void addWalk() {
        System.out.format("%8s", "**\n");
        System.out.format("%17s", "***********\n");
    }
}
