import ej_6_ADN_Menu.ADN_Menu;
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
public class ADN_MenuTest {
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                {"ATGCATCGATCGATCCCGAA", true, "Test", "tseT"}, {"ATGCATCGATCGATCCCGA", false, "Second test", "tset dnoceS"}, {"ATGCATFGATCGATCCCGAA", false, "simple", "elpmis"}
           });
    }
    private String seq;
    private boolean expected;
    private String word;
    private String result;
     
    public ADN_MenuTest(String seq,boolean expected, String word,String result) {
        this.seq=seq;
        this.expected=expected;
        this.word = word;
        this.result = result;
    }
    
    
    @Test
    public void  verifyDNASeqTest() {
        boolean res=ADN_Menu.verifyDNASeq(this.seq);
        assertEquals(this.expected, res);  
    }
    
    @Test
    public void  reverseStringTest() {
        String res=ADN_Menu.reverseString(this.word);
        assertEquals(this.result, res);  
    }
}