/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lettercount;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;
public class LetterCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String word;
       int[] count;
       char[] letters;
       char alpha;
       
       Scanner input = new Scanner(System.in);
       count= new int[91];
       System.out.print("Give a word: ");
       word=input.nextLine();
       
       word=word.toUpperCase();
       letters=word.toCharArray();
       
       for (int i=0; i<letters.length;i++){
           switch (letters[i]){
               case 65 : count[65]=count[65]+1; break;
               case 66 : count[66]=count[66]+1; break;
               case 67 : count[67]=count[67]+1; break;
               case 68 : count[68]=count[68]+1; break;
               case 69 : count[69]=count[69]+1; break;
               case 70 : count[70]=count[70]+1; break;
               case 71 : count[71]=count[71]+1; break;
               case 72 : count[72]=count[72]+1; break;
               case 73 : count[73]=count[73]+1; break;
               case 74 : count[74]=count[74]+1; break;
               case 75 : count[75]=count[75]+1; break;
               case 76 : count[76]=count[76]+1; break;
               case 77 : count[77]=count[77]+1; break;
               case 78 : count[78]=count[78]+1; break;
               case 79 : count[79]=count[79]+1; break;
               case 80 : count[80]=count[80]+1; break;
               case 81 : count[81]=count[81]+1; break;
               case 82 : count[82]=count[82]+1; break;
               case 83 : count[83]=count[83]+1; break;
               case 84 : count[84]=count[84]+1; break;
               case 85 : count[85]=count[85]+1; break;
               case 86 : count[86]=count[86]+1; break;
               case 87 : count[87]=count[87]+1; break;
               case 88 : count[88]=count[88]+1; break;
               case 89 : count[89]=count[89]+1; break;
               case 90 : count[90]=count[90]+1; break;
           }
       }
       alpha='A';
       for(int j=65;j<count.length;j++){
           if (count[j]==0) {
               System.out.print("");
           } else {
           System.out.println(alpha+": "+count[j]);
           }
           alpha=(char)(alpha+1);
       }
       
    }
    
}

    

