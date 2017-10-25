
package ej_2_Palindroma;

/**
 * @author Jose Gimenez
 * @author Anas
 */
public class Palindroma {
    
    //Declare
    private String cadena;
    private String aux;
    
    //Constructors
    public Palindroma() {
    }
    public Palindroma(String cadena) {
        this.cadena = cadena;
    }

    //Getters and Setters
    public String getCadena() {
        return cadena;
    }
    public void setCadena(String Cadena) {
        this.cadena = Cadena;
    }
    public String getAux() {
        return aux;
    }
   
    //Functions
    
    /**
     * Comprueba si una cadena es o palindroma
     * @return true en caso de la frase palindroma, false si no lo es
     */
    public boolean verificar() { 
	                                              
         
        this.cadena=this.cadena.toLowerCase();
        changeAccents();
        withoutSpaces();
        
        aux = new StringBuilder(this.cadena).reverse().toString();
        if (aux.equals(cadena)){// comparamos las dos cadenas 
            return true;
        }
        else {
            return false;
        }
	
    }
     public void changeAccents(){
         String ascii = "aaaeeeiiiooouuunAAAEEEIIIOOOUUUNcC";
         String original = "áàäéèëíìïóòöúùuñÁÀÄÉÈËÍÌÏÓÒÖÚÙÜÑçÇ";
         
         for (int i=0; i<this.cadena.length(); i++) {
                 // Reemplazamos los caracteres especiales.
                 this.cadena = this.cadena.replace(original.charAt(i), ascii.charAt(i));
           }   
     }
     
     public void withoutSpaces(){
          this.cadena = this.cadena.replace(" ","");
     }
        @Override 
    public String toString (){
        return "La palabra introducida es :"+cadena+"   La inversa es :"+aux; // Devolvemos la palabra y la palabra al reves
    }
}
