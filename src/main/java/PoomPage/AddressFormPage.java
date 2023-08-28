package PoomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Genericlibreies.WEbDriverUtility;

public class AddressFormPage {
	
	//declaration
	@FindBy(id="Name")
	private WebElement nameTF;
	@FindBy(id="House/office Info")
	private WebElement houseInfoTF;
	@FindBy(id="street info")
	private WebElement streetInfoTF;
	@FindBy(id="landmark")
	private WebElement landmarkTF;
	@FindBy(id="Country")
	private WebElement countryDropdown;
	@FindBy(id="State")
	private WebElement statedropdown;
	@FindBy(id="City")
	private WebElement CityDropDown;
	@FindBy(id="pincode")
    private WebElement pincodeTF;
	@FindBy(id="phone number")
	private WebElement phoneNumberTF;
	@FindBy(xpath="//button[text()='Add Address']")
	private WebElement addAddressButton;
	private String country;
	private String state;
	private String city;
	private String phoneNum;
	
	//initialization
	public  AddressFormPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		//Utilization
         public void addAddressDetails(WEbDriverUtility web ,String Name,String houseInfo,String street,String lanmark)
		{
			nameTF.sendKeys(Name);
			houseInfoTF.sendKeys(houseInfo);
			streetInfoTF.sendKeys(street);
			landmarkTF.sendKeys(landmark);
			
			web.selectFromDropdown(country,countryDropdown);
			web.selectFromDropdown(state,statedropdown);
			web.selectFromDropdown(city,CityDropDown);
			
			CharSequence pincode;
			pincodeTF.sendKeys(pincode);
			phoneNumberTF.sendKeys(phoneNum);
			addAddressButton.click();
			
		}
		
	}

	
	

}
