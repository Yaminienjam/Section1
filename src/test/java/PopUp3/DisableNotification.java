package PopUp3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableNotification {

	public static void main(String[] args) throws InterruptedException {
		 ChromeOptions options = new ChromeOptions();
         options.addArguments("--disable-geolocation");
         System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
         WebDriver driver = new ChromeDriver(options);
         driver.manage().window().maximize();
         driver.get("https://www.myntra.com/");

         Thread.sleep(3000);
         driver.close();

	}

}
