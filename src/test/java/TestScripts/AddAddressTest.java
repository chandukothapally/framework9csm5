package TestScripts;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import Genericlibreies.BaseClass;

public class AddAddressTest extends BaseClass{
	@Test
	public void addAddressTest()
	{
		Map<String, String> map=excel.getData("Sheet1"," Add Address");
		welcome.clickLoginButton();
		login.loginToApp(map.get("Email"),map.get("Password"));
		Thread.sleep(10000);
		home.clickProfileButton();
		Thread.sleep(10000);
		myProfile.clickMyaddresses();
		address.addAddressDetails(webUtil,map);
		Thread.sleep(10000);
		Assert.assertEquals(headPhone, getAddToCartText(),"ADDED");
		String itemName=headPhone.getItemName();
		headPhone.clicKcartIcon();
		Assret.asserTrue(cart.getCartItem().equalsIgnoreCase(itemName));
		
		
	}

}
