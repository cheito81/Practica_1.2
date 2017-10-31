
package ej_4_nucleotids;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Jose Gimenez
 * @author Anas
 */
public class NucleotidsPrincipal {
    
    /* the options in the main menu of the application 
     * (i.e. the functional requirements) */
    //@overwrite
    private final String [] mainMenuOptions = {
             "0- Exit", 
             "1- Pasar de cadena de nucleotidos a aminoacido",
             "2- Pasar de aminoacidos a cadena de nucleotidos" 
            
    };
	
    /**
     * main(). 
     * Starts up application execution.
     */
    public static void main(String[] args) {
		/* application object */
		NucleotidsPrincipal myAp = new NucleotidsPrincipal();
		/* run the application */
		myAp.run();
		
	}
	
    /* -------------- methods -------------- */
    
    /** run()
     * runs the application in non-static mode.
     */	
	private void run() {	
		/* exit flag */
		boolean exit = false;
		/* menu option to execute */
		int option;
		
		/* user service loop  */
		do {
			//show menu and get option
			option = showMainMenu();
			//control block
			switch (option) {
				case 0: //exit
					exit = true;  //set the exit flag.
					break;
				case 1: //list all
					
					break;
				case 2: //find by id
					
					break;
				case 3: //find by name
					
					break;
				default: //default or invalid option
			                 System.out.println("Invalid option");
					break;
			}
		} while (!exit);
		
 
    }
  
     /** showMainMenu()
     * shows the application main menu and gets user"s option
     * @return option to execute
     */
     private int showMainMenu() {
		int option=-1;	//option to return	
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("\n===== Main menu =====");
			for (int i=0; i<mainMenuOptions.length; i++) {
				System.out.format("\n(%d) %s", i, mainMenuOptions[i]);
			} 
			System.out.print("\n=============================");
			System.out.print("\nEnter option: ");
			option = scan.nextInt();
		} catch (InputMismatchException ime) {
			option = -1;
		}
		return option;
	}
     
     private String cadenaToAmino(){
         Map<String, String> map = new HashMap<String, String>();
         String result="";
         
   map.put("UCA","S"); // Serine
  /*map.put("UCC" , "S"// Serine
  "UCG" , "S", // Serine
  "UCU" , "S", // Serine
  "UUC" , "F", // Phenylalanine
  "UUU" , "F", // Phenylalanine
  "UUA" , "L", // Leucine
  "UUG" , "L", // Leucine
  "UAC" , "Y", // Tyrosine
  "UAU" , "Y", // Tyrosine
  "UAA" , "_", // Stop
  "UAG" , "_", // Stop
  "UGC" , "C", // Cysteine
  "UGU" , "C", // Cysteine
  "UGA" , "_", // Stop
  "UGG" , "W", // Tryptophan
  "CUA" , "L", // Leucine
  "CUC" , "L", // Leucine
  "CUG" , "L", // Leucine
  "CUU" , "L", // Leucine
  "CCA" , "P", // Proline
  "CAU" , "H", // Histidine
  "CAA" , "Q", // Glutamine
  "CAG" , "Q", // Glutamine
  "CGA" , "R", // Arginine
  "CGC" , "R", // Arginine
  "CGG" , "R", // Arginine
  "CGU" , "R", // Arginine
  "AUA" , "I", // Isoleucine
  "AUC" , "I", // Isoleucine
  "AUU" , "I", // Isoleucine
  "AUG" , "M", // Methionine
  "ACA" , "T", // Threonine
  "ACC" , "T", // Threonine
  "ACG" , "T", // Threonine
  "ACU" , "T", // Threonine
  "AAC" , "N", // Asparagine
  "AAU" , "N", // Asparagine
  "AAA" , "K", // Lysine
  "AAG" , "K", // Lysine
  "AGC" , "S", // Serine
  "AGU" , "S", // Serine
  "AGA" , "R", // Arginine
  "AGG" , "R", // Arginine
  "CCC" , "P", // Proline
  "CCG" , "P", // Proline
  "CCU" , "P", // Proline
  "CAC" , "H", // Histidine
  "GUA" , "V", // Valine
  "GUC" , "V", // Valine
  "GUG" , "V", // Valine
  "GUU" , "V", // Valine
  "GCA" , "A", // Alanine
  "GCC" , "A", // Alanine
  "GCG" , "A", // Alanine
  "GCU" , "A", // Alanine
  "GAC" , "D", // Aspartic Acid
  "GAU" , "D", // Aspartic Acid
  "GAA" , "E", // Glutamic Acid
  "GAG" , "E", // Glutamic Acid
  "GGA" , "G", // Glycine
  "GGC" , "G", // Glycine
  "GGG" , "G", // Glycine
  "GGU" , "G");  // Glycine)
         /**
          *  "UCA" , "S", // Serine
  "UCC" , "S", // Serine
  "UCG" , "S", // Serine
  "UCU" , "S", // Serine
  "UUC" , "F", // Phenylalanine
  "UUU" , "F", // Phenylalanine
  "UUA" , "L", // Leucine
  "UUG" , "L", // Leucine
  "UAC" , "Y", // Tyrosine
  "UAU" , "Y", // Tyrosine
  "UAA" , "_", // Stop
  "UAG" , "_", // Stop
  "UGC" , "C", // Cysteine
  "UGU" , "C", // Cysteine
  "UGA" , "_", // Stop
  "UGG" , "W", // Tryptophan
  "CUA" , "L", // Leucine
  "CUC" , "L", // Leucine
  "CUG" , "L", // Leucine
  "CUU" , "L", // Leucine
  "CCA" , "P", // Proline
  "CAU" , "H", // Histidine
  "CAA" , "Q", // Glutamine
  "CAG" , "Q", // Glutamine
  "CGA" , "R", // Arginine
  "CGC" , "R", // Arginine
  "CGG" , "R", // Arginine
  "CGU" , "R", // Arginine
  "AUA" , "I", // Isoleucine
  "AUC" , "I", // Isoleucine
  "AUU" , "I", // Isoleucine
  "AUG" , "M", // Methionine
  "ACA" , "T", // Threonine
  "ACC" , "T", // Threonine
  "ACG" , "T", // Threonine
  "ACU" , "T", // Threonine
  "AAC" , "N", // Asparagine
  "AAU" , "N", // Asparagine
  "AAA" , "K", // Lysine
  "AAG" , "K", // Lysine
  "AGC" , "S", // Serine
  "AGU" , "S", // Serine
  "AGA" , "R", // Arginine
  "AGG" , "R", // Arginine
  "CCC" , "P", // Proline
  "CCG" , "P", // Proline
  "CCU" , "P", // Proline
  "CAC" , "H", // Histidine
  "GUA" , "V", // Valine
  "GUC" , "V", // Valine
  "GUG" , "V", // Valine
  "GUU" , "V", // Valine
  "GCA" , "A", // Alanine
  "GCC" , "A", // Alanine
  "GCG" , "A", // Alanine
  "GCU" , "A", // Alanine
  "GAC" , "D", // Aspartic Acid
  "GAU" , "D", // Aspartic Acid
  "GAA" , "E", // Glutamic Acid
  "GAG" , "E", // Glutamic Acid
  "GGA" , "G", // Glycine
  "GGC" , "G", // Glycine
  "GGG" , "G", // Glycine
  "GGU" , "G"  // Glycine
          */
         System.out.println("Escribe cade de nucleotidos: ");
         return result;
     }
     
  
}

