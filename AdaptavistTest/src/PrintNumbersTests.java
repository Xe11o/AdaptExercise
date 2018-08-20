import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class PrintNumbersTests extends TestCase {

	String actual, expected;
	int testNumber;
	
	@Test
	public void testGetNumber() {
		
		PrintNumbers pn = new PrintNumbers();
		
		//test numbers which are known multiples of 3
		testNumber = 3;
		actual = pn.getNumber(testNumber);
		expected = "Fizz";		
		assertTrue(actual == expected);
		
		testNumber = 6;
		actual = pn.getNumber(testNumber);
		expected = "Fizz";		
		assertTrue(actual == expected);
		
		testNumber = 9;
		actual = pn.getNumber(testNumber);
		expected = "Fizz";		
		assertTrue(actual == expected);
		
		//test numbers which are known multiples of 5
		testNumber = 5;
		actual = pn.getNumber(testNumber);
		expected = "Buzz";		
		assertTrue(actual == expected);
		
		testNumber = 20;
		actual = pn.getNumber(testNumber);
		expected = "Buzz";		
		assertTrue(actual == expected);
		
		testNumber = 50;
		actual = pn.getNumber(testNumber);
		expected = "Buzz";		
		assertTrue(actual == expected);
		
		//test numbers which are known multiples of both 3 and 5
		testNumber = 15;
		actual = pn.getNumber(testNumber);
		expected = "FizzBuzz";		
		assertTrue(actual == expected);
		
		testNumber = 30;
		actual = pn.getNumber(testNumber);
		expected = "FizzBuzz";		
		assertTrue(actual == expected);
		
		testNumber = 60;
		actual = pn.getNumber(testNumber);
		expected = "FizzBuzz";		
		assertTrue(actual == expected);
	}
}
