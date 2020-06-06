package homework7task3;

import org.junit.runner.Description;
import org.junit.runner.notification.RunListener;

public class CalculatorTestListener extends RunListener {
	@Override
	public void testRunStarted(Description description) throws java.lang.Exception {
		System.out.println("All good");
	}

	@Override
	public void testFinished(Description description) throws java.lang.Exception {
		System.out.println(description.getMethodName());
	}
}
