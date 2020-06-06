package homework7task3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import by.academy.junit.Calculator;

public class Sum extends Assert {
	private Calculator calculator;

	@Before
	public void init() {
		calculator = new Calculator();
	}

	@After
	public void destroy() {
		calculator = null;
	}

	@Test
	public void testSum() {
		assertEquals(100, calculator.getSum(50, 50));
	}

}
