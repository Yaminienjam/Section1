package DropDowns;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement dropdown = driver.findElement(By.id("cars"));
		Select s= new Select(dropdown);
		
		if(s.isMultiple()){
			s.selectByIndex(0);
			s.selectByValue("199");
			s.selectByVisibleText("INR 50 - INR 99 ( 1 )");
			
			Thread.sleep(3000);
			System.out.println("First selected option:"+s.getFirstSelectedOption().getText());
			List<WebElement> selectedOptions=s.getAllSelectedOptions();
			System.out.println("************************");
			for(WebElement option:selectedOptions) {
				System.out.println(option.getText());
			
			}
			s.deselectByIndex(0);
			s.deselectByValue("199");
			s.deselectByVisibleText("INR 50 - INR 99 ( 1 )");
			
			}
		else
			System.out.println("Single select dropdown");
		driver.close();
			
		

	}

}
