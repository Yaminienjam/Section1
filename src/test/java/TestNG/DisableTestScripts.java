package TestNG;

import org.testng.annotations.Test;

public class DisableTestScripts {
	@Test(enabled=true)
	public void demo1() {
		System.out.println("demo1");
	}
	@Test(enabled=false)
	public void demo2() {
		System.out.println("demo2");
	}
	

}
