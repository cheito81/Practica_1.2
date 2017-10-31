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
 * @author alumne
 */
@RunWith(Parameterized.class)
public class ARN_ADNTest {
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                {"augcaucgaucag", "ATGCATCGATCAG"}, {"augcaucgaucag", "ATGCATCGATCAG"}, {"augcaucgaucag", "ATGCATCGATCAG"}
           });
    }
    private String date;
    private String expected;
     
    public ARN_ADNTest(String date,String expected) {
        this.date=date;
        this.expected=expected;
    }
    
    
    @Test
    public void  arnToAdn() {
        ADN_ARN result=new ADN_ARN();
        String res=result.arnToAdn(this.date);
        assertEquals(this.expected, res);  
    }
}