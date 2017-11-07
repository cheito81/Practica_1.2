
import ej_2_Palindroma.Palindroma;
import ej_4_nucleotids.NucleotidsPrincipal;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Jose, anas
 */
@RunWith(Parameterized.class)
public class ej_4_test {
   
     @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                {"UCA", "S "}, {"UCA", "C "}, {"UUA", "L "}
           });
    }
    
     private String word;
    private String expected;
    
     
    public ej_4_test(String expected,String word) {
        this.word=word;
        this.expected=expected;  
    }
    
    @Test
    public void  cadenaToAminoTest() {
        
       NucleotidsPrincipal myAp = new NucleotidsPrincipal();
       
        String res = myAp.cadenaToAmino(this.word);
        assertEquals(this.expected, res);  
    }
    
     @Test
    public void  AminoToCadenaTest() {
        
       NucleotidsPrincipal myAp = new NucleotidsPrincipal();
       
        String res = myAp.aminoToCadena(this.word);
        assertEquals(this.expected, res);  
    }
    
}
