//importing libraries
import org.junit.Test;
import static org.junit.Assert.*;

//tTest class
public class addTest {

    @Test
    public void aTest() {

        //making object
        tinyCal tc = new tinyCal();

        //input
        int[] set = {1,2};

        //result
        double result = 3.0;

        //testing
        assertEquals(result, tc.add(set));

    }
}