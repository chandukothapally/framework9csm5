package PoomPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signUpPage {
	
	//declaration
	@FindBy(id="First Name")
	private WebElement firstNameTF;
	@FindBy(id="Last Name")
	private WebElement lastNameTF;
	@FindBy(xpath="//div[@id='Gender']/descendant: :label/span[2]")
	private List<WebElement> genderRadioButtons;
	@FindBy(id="Phone Number")
	private WebElement PhoneNumberTF;
	@FindBy(id="Email Address")
	private WebElement EmailAddressTF;
	@FindBy(id="password")
	private WebElement passwordTF;
	@FindBy(id="Confirm Password")
	private WebElement ConfirmPasswordTF;
	@FindBy(id="Terms and Conditions")
	private WebElement TermsandConditionsCB;
	@FindBy(id="Register")
	private WebElement registerButton;
	
	//initialization
	public signUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public void createUserAccount(String firstname,String lastname,String expectedGender,String phoneNum,String email,String password) {
		firstNameTF.sendKeys(firstname);
		lastNameTF.sendKeys(lastname);
		
		for(WebElement Element: genderRadioButtons) {
			String gender=Element.getText();
			if(gender.equals(expectedGender))
			{
				Element.click();
				break;
			}
		
	}
		PhoneNumberTF.sendKeys(phoneNum);
		 EmailAddressTF.sendKeys(email);
		 passwordTF.sendKeys(password);
		 ConfirmPasswordTF.sendKeys(password);
		 TermsandConditionsCB.click();
		 registerButton.click();
		
	}
	
	
	

}
