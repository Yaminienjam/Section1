package PracticeSpecialClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		action.moveToElement(women).perform();
		driver.findElement(By.xpath("//h2[text()='mokshi ']")).click();
		 if(driver.getTitle().contains("tokyo talkies "))
			 System.out.println("pass");
		 else
			 System.out.println("fail");
		
		driver.close();
	
	}

}
