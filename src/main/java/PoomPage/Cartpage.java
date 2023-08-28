package PoomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage {
	
	//declaration
	@FindBy(xpath="//div[@class='cart_productDetails_pKWBd']/h3")
	private WebElement cartItem;
	
	//initialization
	public Cartpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public String getCartItem()
	{
		return cartItem.getText();
	}
	

}
