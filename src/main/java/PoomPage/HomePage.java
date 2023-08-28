package PoomPage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//declaration
	@FindBy(xpath="//button[@aria-label='Account settings']")
	private WebElement profileButton;
	@FindBy(xpath="//Li[.='My Profile']")
	private WebElement myprofile;
	
	//initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void clickProfileButton()
	{
		profileButton.click();
	}
	public void selectMyprofile()
	{
		myprofile.click();
		

	}
	
}
