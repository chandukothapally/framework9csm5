package PoomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {
	
	//declaration
	@FindBy(xpath="//div[text()='My Addresses']")
	private WebElement MyAddressesLink;
	
	//Installation
	public MyProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void clickMyaddress()
	{
		MyAddressesLink.click();
	}

}
