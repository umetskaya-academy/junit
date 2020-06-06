package homework7task3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import by.academy.junit.Calculator;

public class Divide extends Assert {
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
	public void testDivide() {
		assertTrue(calculator.getDivide(10, 5) == 2);
	}

}
