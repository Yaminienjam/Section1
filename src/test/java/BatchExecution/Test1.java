package BatchExecution;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void demo1() {
		System.out.println("TestClass-demo1");
		
	}
	@Test
	public void demo2() {
		System.out.println("TestClass-demo2");
		Assert.fail();
	}

}
