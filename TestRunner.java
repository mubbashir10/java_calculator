//importing libraries
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

//test runner class
public class TestRunner {
	
	//main methd	
	public static void main(String[] args) {

		//additon
		Result resultA = JUnitCore.runClasses(addTest.class);
		for (Failure failureA : resultA.getFailures())
			System.out.println(failureA.toString());
		System.out.println("Addition Test: "+resultA.wasSuccessful());

		//sub
		Result resultB = JUnitCore.runClasses(subTest.class);
		for (Failure failureB : resultB.getFailures())
			System.out.println(failureB.toString());
		System.out.println("Subtraction Test: "+resultB.wasSuccessful());

		//div
		Result resultC = JUnitCore.runClasses(divTest.class);
		for (Failure failureC : resultC.getFailures())
			System.out.println(failureC.toString());
		System.out.println("Division Test: "+resultC.wasSuccessful());

		//mul
		Result resultD = JUnitCore.runClasses(mulTest.class);
		for (Failure failureD : resultD.getFailures())
			System.out.println(failureD.toString());
		System.out.println("Multiplication Test: "+resultD.wasSuccessful());


	}	
}  	