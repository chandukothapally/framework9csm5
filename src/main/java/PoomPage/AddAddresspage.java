package PoomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAddresspage {
	//declaration
	@FindBy(xpath="//button[text()='Add Address']")
	private WebElement addAddressButton;
	@FindBy(xpath="//div[text()='successfully added']")
	private WebElement successMessage;
	
	//initialization
	public AddAddresspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void clickAddAddress()
	{
		addAddressButton.click();
	}

}
