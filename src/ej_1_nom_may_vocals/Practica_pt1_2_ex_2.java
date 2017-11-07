/**
 *  programa que demani a l’usuari el seu nom i ens retorni les vocals en majúscules i les consonants en minúsucles. A més a més ens retornarà el recompte de cadascuna de les vocals i consonants que hi conté (nombre d' a’s, d' e’s, etc.) 
 *
 */
package ej_1_nom_may_vocals;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Practica_pt1_2_ex_2
 * @author Jose, Anas
 * @version 1.0, 3/11/2017
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

    private static String consonantsToLowerCase(String word) {
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
/**
 * countChars
 * @param word
 * @return map
 */
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
