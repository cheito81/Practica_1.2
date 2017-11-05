/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_6_ADN_Menu;

import static ej_1_nom_may_vocals.Practica_pt1_2_ex_2.vowelsToUpperCase;
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
        while (op != 5) {
            menu();
            op = scan.nextInt();
            
            switch(op){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
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
}
