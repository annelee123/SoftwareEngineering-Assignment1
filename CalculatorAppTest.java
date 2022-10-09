package calculatorApp;

import static org.junit.Assert.*;
import org.junit.*;

import org.junit.Test; //?

public class CalculatorAppTest {
		
		@Test
		public void testCalculator() {
			CalculatorApp cal = new CalculatorApp();	
			assertEquals("Test expression 1: 12+34-34 =", 12, cal.calculator("12+34-34"));
			assertEquals("Test expression2: 12435+34569-12345*10+50 =", 346640, cal.calculator("12435+34569-12345*10+50"));
			assertEquals("Test expression with errors: 12435+34569t =", 0,cal.calculator("12435+34569t"));

		}
}

