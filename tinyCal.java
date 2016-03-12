//importing libraries
import java.util.*;
import java.util.Scanner;
import java.util.Arrays.*;

//tinyCal class
public class tinyCal {

    public double add(int[] set){

        double result=0;
        for (int i = 0; i < set.length; i++)
            result = result + set[i];
        System.out.println("Answer: "+result);
        return result;
            
    }
    public double sub(int[] set){

        double result=0;
        for (int i = 0; i < set.length; i++)
            result = result - set[i];
        System.out.println("Answer: "+result);
        return result;
    }
    public double mult(int[] set){

        double result=0;
        for (int i = 0; i < set.length; i++)
            result = result * set[i];
        System.out.println("Answer: "+result);
        return result;
    }
    public double div(int[] set){

        double result=0;
        for (int i = 0; i < set.length; i++)
            result = result / set[i];
        System.out.println("Answer: "+result);
        return result;
    }

}