//importing libraries
import org.junit.Test;
import static org.junit.Assert.*;

//tTest class
public class divTest {

    @Test
    public void cTest() {

        //making object
        tinyCal tc = new tinyCal();

        //input
        int[] set = {1,2};

        //result
        double result = 0.5;

        //testing
        assertEquals(result, tc.div(set));

    }
}