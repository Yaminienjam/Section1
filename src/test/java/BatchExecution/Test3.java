package BatchExecution;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 {
	
		
		@Test
		public void demo5() {
			System.out.println("TestClass-demo1");
			
		}
		@Test
		public void demo6() {
			System.out.println("TestClass-demo2");
			Assert.fail();


}
}
