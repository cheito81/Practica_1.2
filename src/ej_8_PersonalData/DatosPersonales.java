/**
 * En un programa se'ns demanen els següents camps: nom complet (nom i almenys un cognom), DNI sencer,  l'edat, el pes, el sexe (entre les opcions   d' home i dona), l'estat civil (entre les opcions de solter, casat i altres), i el correu electrònic. 
    Un cop introduïts el programa és capaç de dir quins errors hem fet i, en cas de no fer-ne cap, ens torna els valors introduïts. 
 * @name DatosPersonales.java
 * @author José Giménez
 * @version 1.2
 * @date 2017-11-03
 */
package ej_8_PersonalData;

import java.util.Scanner;
import validation.ValidationForm;

public class DatosPersonales {
    	
    /**
     * main(). 
     * Starts up application execution.
     */
    public static void main(String[] args) {
		/* application object */
		DatosPersonales myAp = new DatosPersonales();
		/* run the application */
		myAp.run();
		
	}
     /* -------------- methods -------------- */
    
    /** run()
     * runs the application in non-static mode.
     */	
	public void run() {	
          
               String nom = "";
               String edad = "";
                String dni="";
                String mail="";
                String pes="";
                
                
         Scanner scan = new Scanner(System.in);
        
        System.out.println("Escribe nombre completo");
             nom= scan.nextLine();
             
             System.out.println("Escribe dni");
             dni= scan.nextLine();
             
             System.out.println("Escribe mail");
             mail= scan.nextLine();
             
            
             System.out.println("Escribe peso");
             pes=scan.nextLine();
             
             System.out.println("Escribe edad");
             edad= scan.nextLine();
            
             printar(nom,dni,mail,pes,edad);
             
            
             
             
            
        }

        /**
         * Valida todos los campos pasados
         * @param nom
         * @param dni
         * @param mail
         * @param pes
         * @return false si los campos no se han validado true si se han validado
         */
    private Boolean validar(String nom, String dni, String mail, String pes,String edad) {
          ValidationForm valid = new ValidationForm();
             
          Boolean result = false;
          
             String validNom = nom;
             validNom.replace(" ","");
             validNom.toCharArray();
             
             boolean ok = true;
             
             if (!valid.areChars(validNom)) {
                  ok = false;
             }
             if (!valid.isBetweenInt(Integer.parseInt(edad), 1, 100)) {
                  ok = false;
             }
             
             if (!valid.isDni(dni)) {
                 ok = false;
             }
             
             if (!valid.isEmail(mail)) {
                 ok = false;
             }
             
             if (valid.isDouble(pes)) {
                 if (!valid.isBetweenFloat(Float.parseFloat(pes), 30, 200)) {
                    ok = false;
                 }
             }else{
                 ok = false;
             }
             
             
             if (ok) {
                    result = true;
             }
             
             return result;
    }
/**
 * Printa el resultado de la validacion
 * @param nom
 * @param dni
 * @param mail
 * @param pes 
 */
    private void printar(String nom, String dni, String mail, String pes,String edad) {
        
        
       
        boolean result = false;
        result=validar(nom,dni,mail,pes,edad);
        
        if (result) {
            
            System.out.println("Sus datos son:");
            System.out.println("Nombre: "+nom);
            System.out.println("Dni: "+dni);
            System.out.println("Mail: "+mail);
            System.out.println("Peso: "+pes);
            
        } else {
            ValidationForm valid = new ValidationForm();
            String validNom = nom;
             validNom.replace(" ","");
             validNom.toCharArray();
             
             boolean ok = true;
             
             if (!valid.areChars(validNom)) {
                  System.out.println("El nombre solo puede contener letras y espacios");
             }
             
             if (!valid.isBetweenInt(Integer.parseInt(edad), 1, 100)) {
                  System.out.println("La edad tiene que estar en un rango de 1 a 100");
             }
             
             if (!valid.isDni(dni)) {
                 System.out.println("Dni incorrecto");
             }
             
             if (!valid.isEmail(mail)) {
                System.out.println("Mail incorrecto");
             }
             
             if (valid.isDouble(pes)) {
                  if (!valid.isBetweenFloat(Float.parseFloat(pes), 20, 200)) {
                    System.out.println("El peso tiene que estar en un rango de 30 a 200");
                 }
                 
             }else{
                 System.out.println("El peso solo puede contener numeros");
             }
            
        }
            
    }


   

   
	
}
