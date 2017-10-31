/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_1_nom_may_vocals;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Practica_pt1_2_ex_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        Scanner scan = new Scanner(System.in);
        Map listChars;
        System.out.println("Enter a word: ");
        String word = scan.nextLine();

        word = vowelsToUpperCase(word);
        
        word = consonantsToLowerCase(word);
        listChars = countChars(word);
        System.out.println("Result word: "+word);
        System.out.println("Count of chars in the word: "+listChars.toString());
    }

    public static String consonantsToLowerCase(String word) {
        for (int i = 0; i < word.length(); i++) {
            if ((word.charAt(i) != 'A') && (word.charAt(i) != 'E') && (word.charAt(i) != 'I') && (word.charAt(i) != 'O') && (word.charAt(i) != 'U')) {
                word = word.replace(word.charAt(i), word.toLowerCase().charAt(i));
            }
        }
        return word;
    }

    public static String vowelsToUpperCase(String word) {
        word = word.replaceAll("a", "A");
        word = word.replaceAll("e", "E");
        word = word.replaceAll("i", "I");
        word = word.replaceAll("o", "O");
        word = word.replaceAll("u", "U");
 
        return word;
    }

    private static Map countChars(String word) {
        String aux = word.replaceAll(" ","");
        HashMap<Character, Integer> map = new HashMap();
        
        for (int i = 0; i < aux.length(); i++) {
            char c = aux.charAt(i);
            Integer val = map.get(c);
            if (val != null) {
                map.put(c, val + 1);
            } else {
                map.put(c, 1);
            }
        }
        return map;
    }
}
