package PoomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeadPhonesPage {
	
	//declaration
	@FindBy(xpath="//span[text()='boat rockerz 450']/ancestor::div[@class='featuredProducts_cardFooter__qL8vT']/div[@class='featuredProducts_footerRight__Qlwal']")
	private WebElement addTocartButton;
	@FindBy(xpath="//span[text()='boat rockerz 450']")
	private WebElement itemName;
	private WebElement addCartButton;
	
	//initialization
	public HeadPhonesPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void clickAddCart() {
		addCartButton.click();
		}
	public String getAddTocartText(){
		return addCartButton.getText();
	}
	public String getItemName()
	{
		return itemName.getText();
		
		
	

}
}
