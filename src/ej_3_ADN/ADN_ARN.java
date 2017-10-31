/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_3_ADN;

import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class ADN_ARN {
    
   public static void main(String[] args) {
        run();
    }
    
   private static void run() {
       Scanner scan = new Scanner(System.in);
        System.out.println("Choose an option: ");
        System.out.println("1-ADN to ARN");
        System.out.println("2-ARN to ADN");
        
        int option = scan.nextInt();
        
        switch(option){
            case 1:
                System.out.println("Enter ADN Sequence: ");
                String ADNseq = scan.next();
                String arn = adnToArn(ADNseq);
                System.out.println("ARN Sequence: "+arn);
                break;
            case 2:
                System.out.println("Enter ARN Sequence: ");
                String ARNseq = scan.next();
                String adn = arnToAdn(ARNseq);
                System.out.println("ARN Sequence: "+adn);
                break;
        }
   }
   
   public static String adnToArn(String adn){
       return adn.toUpperCase().replaceAll("T", "U");
   }
   
   public static String arnToAdn(String arn){
       return arn.toUpperCase().replaceAll("U", "T");
   }
   
   
}
