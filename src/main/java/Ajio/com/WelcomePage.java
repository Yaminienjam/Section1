package Ajio.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	//Declaration
	
	@FindBy(xpath="//img[@src=\"https://assets.ajio.com/static/img/Ajio-Logo.svg\"]")
	
	private WebElement ajioImage;
	
	@FindBy(xpath="//a[text()='HOME AND KITCHEN']")
	private WebElement homeAndkITchenTab;
	
	@FindBy(xpath="//a[text()='Photo Frames']")
	private WebElement PhotoFramesLink;
	
	//Initilization
	
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	//Utilization
	public WebElement getImage() {
		return ajioImage;
	}
		
		public void mouseHoverOnHomeAndKitchen(WebDriver driver) {
			Actions a = new Actions(driver);
			a.moveToElement(homeAndkITchenTab).perform();
		}
		public void clickPhotoFrameLink() {
			PhotoFramesLink.click();
		
	}
	
		
		
}


