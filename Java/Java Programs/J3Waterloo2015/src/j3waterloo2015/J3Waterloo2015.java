/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j3waterloo2015;

/**
 *
 * @author Jihal
 */
import java.util.Scanner;

public class J3Waterloo2015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        String word, vowels = "aeiou", consonants = "bacadefegehijikilimonopoqorosutuvuwuxuyuzu";
        char[] letters, letters2;

        System.out.print("Enter a word: ");
        word = input.next();

        letters = word.toCharArray();
        letters2 = consonants.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            if (vowels.indexOf(letters[i]) != -1) {
                System.out.print(letters[i]);
            } else {
                System.out.print(letters[i]);
                int indexOf = consonants.indexOf(letters[i]);
                System.out.print(letters2[indexOf + 1]);
                System.out.print(letters2[indexOf + 2]);
            }
        }

        /*for (int j = 0; j < letters.length; j++) {
            if (vowels.indexOf(letters[j]) == -1) {
                System.out.print(letters[j]);
                int unicode = (int) letters[j];
                store = unicode;
                store2 = unicode;

                for (int b = 0; b < store; b++) {
                    store++;
                    char backToLetter = (char) store;
                    for (int c = unicode; c > 0; c--) {
                        store2--;
                        char letterAgain = (char) store2;
                        if (backToLetter == a || backToLetter == e || backToLetter == i || backToLetter == o || backToLetter == u) {
                            System.out.print(backToLetter);
                            break;
                        } else if (letterAgain == a || letterAgain == e || letterAgain == i || letterAgain == o || letterAgain == u) {
                            System.out.print(letterAgain);
                            break;
                        }
                    }
                }
            }
        }*/
    }

}
