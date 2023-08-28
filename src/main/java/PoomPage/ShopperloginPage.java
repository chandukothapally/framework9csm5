package PoomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopperloginPage {
	//declaration
	@FindBy(id="Email")
	private WebElement emailTF;
	@FindBy(id="password")
	private WebElement passwordTF;
	@FindBy(name="Login")
	private WebElement LoginButton;
	@FindBy(id="Create Account")
	private WebElement createAccountButton;
	
	//initialization
	public ShopperloginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void loginToApp(String email,String password)
	{
		emailTF.sendKeys(email);
		passwordTF.sendKeys(password);
		LoginButton.click();
	}
	public void clickCreateAccountButton()
	{
		createAccountButton.click();
	}
	}
	
	


