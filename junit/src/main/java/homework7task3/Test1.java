package homework7task3;

/*Задача 3. jUnit тестирование.
1) создаем 3 классса-теста
2) каждый из которых будет тестировать одну функцию калькулятора
3) протестировать методы 3 наборами данных (используем Parametrize)
4) объеденить 3 класса-теста в Test Suite.
5) добавить CalculatorTestListener, переопределить, 
метод который вызывается на успешное завершение теста и выводит на экран название нашего метода.
*/
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import by.academy.junit.Calculator;

@RunWith(value = Parameterized.class)
public class Test1 {

	private int valueA;
	private int valueB;
	private int expected;

	public Test1(int valueA, int valueB, int expected) {
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:DivideOf({0}/{1})= {2}")
	public static <asList> Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { { 10, 1, 10 }, { 2, 2, 1 }, { 3, 3, 1 } });
	}

	@Test
	public void paramTest() {
		assertEquals(expected, new Calculator().getDivide(valueA, valueB));
	}
}
