//importing libraries
import org.junit.Test;
import static org.junit.Assert.*;

//tTest class
public class subTest {

    @Test
    public void bTest() {

        //making object
        tinyCal tc = new tinyCal();

        //input
        int[] set = {1,2};

        //result
        double result = -1.0;

        //testing
        assertEquals(result, tc.sub(set));

    }
}