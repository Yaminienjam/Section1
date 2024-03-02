package TestNG;

import org.testng.annotations.Test;

public class UsingInvocationCount {
	@Test(invocationCount=2,priority=2)
	public void demo1() {
		System.out.println("demo1");
	}
		
		@Test(invocationCount=1,priority=-3)
		public void demo2() {
			System.out.println("demo2");
			
	
	}
		@Test(invocationCount=0,priority=-3)
		public void demo3() {
			System.out.println("demo3");
		}
			
			@Test(invocationCount=-2,priority=-5)
			public void demo4() {
				System.out.println("demo4");
				

			}

}
