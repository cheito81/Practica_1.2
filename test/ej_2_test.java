
import ej_2_Palindroma.Palindroma;
import ej_3_ADN.ADN_ARN;
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
public class ej_2_test {
    
    
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                {"luna", false}, {"ONO", true}, {"papa", false}
           });
    }
    private String word;
    private boolean expected;
    
     
    public ej_2_test(String word,boolean expected) {
        this.word=word;
        this.expected=expected;
        
    }
    
    
    @Test
    public void  verificarTest() {
        
        Palindroma palind = new Palindroma(this.word);
        boolean res = palind.verificar();
        assertEquals(this.expected, res);  
    }
  
}
