package homework7task3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import by.academy.junit.Calculator;;

public class Multiple extends Assert {
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
	public void testMultiple() {
		assertEquals(16, calculator.getMultiple(4, 4));
	}
}
