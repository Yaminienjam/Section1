package BatchExecution;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	
		@Test
		public void demo3() {
			System.out.println("TestClass-demo1");
			
		}
		@Test
		public void demo4() {
			System.out.println("TestClass-demo2");
			Assert.fail();
}
}