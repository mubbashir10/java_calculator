//importing libraries
import org.junit.Test;
import static org.junit.Assert.*;

//tTest class
public class mulTest {

    @Test
    public void dTest() {

        //making object
        tinyCal tc = new tinyCal();

        //input
        int[] set = {1,2};

        //result
        double result = 2.0;

        //testing
        assertEquals(result, tc.mult(set));

    }
}