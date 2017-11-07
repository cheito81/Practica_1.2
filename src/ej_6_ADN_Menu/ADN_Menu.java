/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_6_ADN_Menu;

import static ej_1_nom_may_vocals.Practica_pt1_2_ex_2.vowelsToUpperCase;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author webapps
 */
public class ADN_Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        Scanner scan = new Scanner(System.in);
        int op = -1;
        String seq = "";
        while (op != 5) {
            menu();
            op = scan.nextInt();
            if(op>0 && op<5){
                seq = "";
                while(!verifyDNASeq(seq)){
                    System.out.println("Introduix la sequence d'ADN:");

                    seq = scan.nextLine();
                }
            }
            switch(op){
                case 1:
                    seq = reverseString(seq);
                    System.out.println("Sequencia invertida: "+seq);
                    break;
                case 2:
                    HashMap<Character, Integer> map;
                    map = countChars(seq);
                    Character maxKey = null;
                    int maxValue = 0;
                    for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                        if(entry.getValue() > maxValue){
                            maxKey = entry.getKey();
                            maxValue = entry.getValue();
                        }
                    }
                    System.out.println("La base que mes es repeteix es "+maxKey+" amb "+maxValue+" repeticions.");
                    break;
                case 3:
                    HashMap<Character, Integer> maps;
                    maps = countChars(seq);
                    Character minKey = null;
                    int minValue = 100;
                    for (Map.Entry<Character, Integer> entry : maps.entrySet()) {
                        minValue = entry.getValue();
                        break;
                    }
                    
                    for (Map.Entry<Character, Integer> entry : maps.entrySet()) {
                        if(entry.getValue() < minValue){
                            minKey = entry.getKey();
                            minValue = entry.getValue();
                        }
                    }
                    System.out.println("La base que menys es repeteix es "+minKey+" amb "+minValue+" repeticions.");
                    break;
                case 4:HashMap<Character, Integer> counter;
                    counter = countChars(seq);
                    for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
                        System.out.println(entry.getKey()+ " ==> " +entry.getValue());
                    }
                    break;
                default:
                    System.out.println("Opcio no valida: "+op);
                    break;
            }
        }

    }

    private static void menu() {
        System.out.println("Escolleix una opcio: ");
        System.out.println("1 - Donar la volta");
        System.out.println("2 - Trobar la base més repetida");
        System.out.println("3 - Trobar la base menys repetida");
        System.out.println("4 - Fer recompte de bases");
        System.out.println("5 - Sortir");
    }
    
    public static boolean verifyDNASeq(String seq) {
        if(seq.length() == 20){
            return seq.matches("^(?!>.*\\n)[ATGC\\n]+");
        }
        else{
            return false;
        }
    }
    
    public static String reverseString(String s) {
        StringBuilder builder = new StringBuilder(s);
        return builder.reverse().toString();
    }
    
    private static HashMap countChars(String word) {
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
