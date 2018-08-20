import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class RunTests extends TestCase {

	@Test
	public static TestSuite suite() {
		
		TestSuite suite = new TestSuite(RunTests.class.getName());
		
		suite.addTestSuite(PrintNumbersTests.class);
		
		return suite;

	}

}
