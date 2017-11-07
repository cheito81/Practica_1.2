import ej_3_ADN.ADN_ARN;
import org.junit.Test;
import static org.junit.Assert.*;
//imports per fer servir la paramtrització
import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
/**
 *
 * @author Jose, anas
 */
@RunWith(Parameterized.class)
public class ADN_ARNTest {
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                {"atgcatcgatcag", "AUGCAUCGAUCAG"}, {"atgcatcgatcag", "AUGCAUCGAUCAG"}, {"atgcatcgatcag", "AUGCAUCGAUCAG"}
           });
    }
    private String date;
    private String expected;
     
    public ADN_ARNTest(String date,String expected) {
        this.date=date;
        this.expected=expected;
    }
    
    
    @Test
    public void  adnToArnTest() {
        ADN_ARN result=new ADN_ARN();
        String res=result.adnToArn(this.date);
        assertEquals(this.expected, res);  
    }
}