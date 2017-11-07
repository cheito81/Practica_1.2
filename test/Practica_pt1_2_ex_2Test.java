import ej_1_nom_may_vocals.Practica_pt1_2_ex_2;
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
public class Practica_pt1_2_ex_2Test {
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                {"test word", "tEst wOrd"}, {"WORD TEST", "WORD TEST"}, {"test", "tEst"}
           });
    }
    private String date;
    private String expected;
     
    public Practica_pt1_2_ex_2Test(String date,String expected) {
        this.date=date;
        this.expected=expected;
    }
    
    @Test
    public void  vowelsToUpperCaseTest() {
        Practica_pt1_2_ex_2 result=new Practica_pt1_2_ex_2();
        String res=result.vowelsToUpperCase(this.date);
        assertEquals(this.expected, res);  
    }
}