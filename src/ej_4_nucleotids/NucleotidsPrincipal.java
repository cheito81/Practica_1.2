
package ej_4_nucleotids;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeArray.map;

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
            
             String result="";
            
             HashMap<String, String> map = new HashMap<String, String>();
 
    map.put("UCA","S"); // Serine
   map.put("UCC" , "S");  // Serine
 map.put("UCG" , "S");  // Serine
 map.put("UCU" , "S");  // Serine
 map.put("UUC" , "F");  // Phenylalanine
 map.put("UUU" , "F");  // Phenylalanine
 map.put("UUA" , "L");  // Leucine
 map.put("UUG" , "L");  // Leucine
 map.put("UAC" , "Y");  // Tyrosine
 map.put("UAU" , "Y");  // Tyrosine
 map.put("UAA" , "_");  // Stop
 map.put("UAG" , "_");  // Stop
 map.put("UGC" , "C");  // Cysteine
map.put("UGU" , "C"); // Cysteine
 map.put("UGA" , "_");  // Stop
 map.put("UGG" , "W");  // Tryptophan
 map.put("CUA" , "L");  // Leucine
 map.put("CUC" , "L");  // Leucine
 map.put("CUG" , "L");  // Leucine
 map.put("CUU" , "L");  // Leucine
 map.put("CCA" , "P");  // Proline
 map.put("CAU" , "H");  // Histidine
 map.put("CAA" , "Q");  // Glutamine
 map.put("CAG" , "Q");  // Glutamine
 map.put("CGA" , "R");  // Arginine
 map.put("CGC" , "R");  // Arginine
 map.put("CGG" , "R");  // Arginine
 map.put("CGU" , "R");  // Arginine
 map.put("AUA" , "I");  // Isoleucine
 map.put("AUC" , "I");  // Isoleucine
 map.put("AUU" , "I");  // Isoleucine
 map.put("AUG" , "M");  // Methionine
 map.put("ACA" , "T");  // Threonine
 map.put("ACC" , "T");  // Threonine
 map.put("ACG" , "T");  // Threonine
 map.put("ACU" , "T");  // Threonine
 map.put("AAC" , "N");  // Asparagine
 map.put("AAU" , "N");  // Asparagine
 map.put("AAA" , "K");  // Lysine
 map.put("AAG" , "K");  // Lysine
 map.put("AGC" , "S");  // Serine
 map.put("AGU" , "S");  // Serine
 map.put("AGA" , "R");  // Arginine
 map.put("AGG" , "R");  // Arginine
 map.put("CCC" , "P");  // Proline
 map.put("CCG" , "P");  // Proline
 map.put("CCU" , "P");  // Proline
 map.put("CAC" , "H");  // Histidine
 map.put("GUA" , "V");  // Valine
 map.put("GUC" , "V");  // Valine
 map.put("GUG" , "V");  // Valine
 map.put("GUU" , "V");  // Valine
 map.put("GCA" , "A");  // Alanine
 map.put("GCC" , "A");  // Alanine
 map.put("GCG" , "A");  // Alanine
 map.put("GCU" , "A");  // Alanine
 map.put("GAC" , "D");  // Aspartic Acid
 map.put("GAU" , "D");  // Aspartic Acid
 map.put("GAA" , "E");  // Glutamic Acid
 map.put("GAG" , "E");  // Glutamic Acid
 map.put("GGA" , "G");  // Glycine
 map.put("GGC" , "G");  // Glycine
 map.put("GGG" , "G"); // Glycine
 map.put("GGU" , "G");  // Glycine)
  
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
				case 1: result = cadenaToAmino(map);
                                         System.out.println("LOS AMINOACIDOS SON: "+result);
					
					break;
				case 2: result = aminoToCadena(map);
					System.out.println("Los nucleotidos son: "+result);
					break;
				case 3:
					
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
     
     /**
 *  pasar de nucleotidos a aminoacido
 * @param map hashmap con todos los aminoacidos que existen
 * @return result te devuelve los aminoacidos de los nucleotidos introducidos.
 */
     private String cadenaToAmino( HashMap<String, String> map){
         
         String valor ="";
         String cadena="";
         String result="";
         
         Scanner scan = new Scanner(System.in);

                   System.out.println("Escribe cadena de nucleotidos: ");
                   cadena= scan.next();
                   cadena=cadena.trim();
                   cadena=cadena.toUpperCase();
                   int j=0;
                   for(int i=0;i<cadena.length()-2 ;i=i + 3){
                        j = i+3;
                        
                       String sSubCadena = cadena.substring(i, j);
                       
                        if (map.containsKey(sSubCadena)){
                            valor+= map.get(sSubCadena);
                             valor +=" ";
                                      
                        }
                        else{
                            System.out.println("No hay ningun aminoacido con estos nucleotidos.");
                            System.out.println(sSubCadena);
                        }
                       
                   };
                   result = valor;
         return result;
     }
     
/**
 *  pasar de aminoacido a nucleotidos
 * @param map hashmap con todos los aminoacidos que existen
 * @return result te devuelve la cadena de nucleotidos de los aminoacidos introducidos.
 */
    private String aminoToCadena(HashMap<String, String> map) {
        
       String valor ="";
         String cadena="";
         String result="";
         
         Scanner scan = new Scanner(System.in);

                   System.out.println("Escribe nucleotidos: ");
                   cadena= scan.next();
                   cadena=cadena.trim();
                   cadena=cadena.toUpperCase();
                   int j=0;
                   for(int i=0;i<cadena.length();i++){
                        j = i+1;
                        
                       String sSubCadena = cadena.substring(i, j);
                       
                        if (map.containsValue(sSubCadena)){
                            
                            for (Map.Entry<String, String> entry : map.entrySet()) {
                                String key = entry.getKey();
                                valor+= key;
                                
                            }
                                      
                        }
                        else{
                            System.out.println("No hay ningun nucleotido con estos aminoacidos.");
                            System.out.println(sSubCadena);
                        }
                       
                   };
                   result = valor;
        
        return result;
    }
     
  
}

