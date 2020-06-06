package homework7task3;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import by.academy.junit.Calculator;

@RunWith(value = Parameterized.class)
public class Test2 {

	private int valueA;
	private int valueB;
	private int expected;

	public Test2(int valueA, int valueB, int expected) {
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:SumOf({0}+{1})= {2}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { { 1, 1, 2 }, { 2, 2, 4 }, { 4, 4, 8 } });
	}

	@Test
	public void paramTest() {
		assertEquals(expected, new Calculator().getSum(valueA, valueB));
	}
}
