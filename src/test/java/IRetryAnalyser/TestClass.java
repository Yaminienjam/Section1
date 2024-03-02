package IRetryAnalyser;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;

public class TestClass {
	@Test(retryAnalyzer=IretryAnalyzer RetryImplementation.class)
	public void demo() {
		System.out.println("demo");
		Assert.fail();
	}
	

}
