package PopUp3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadSendKeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://foundit/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//div[contains(text(),'  Upload Resume')]")).click();
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\SHIVA\\Downloads\\Presentation1 (1).pptx");
		
		Thread.sleep(10000);
		driver.close();
		
	}

}
