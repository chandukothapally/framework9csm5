package TestScripts;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterShopperTest {
	@Test
	public void createAccountTest(){
		welcome.clickLoginButton();
		login.clickCreateAccountButton();
		
		Map<String,String> map=excel.getData("Sheet1","Shopper Registration");
		int randomNum = jutil.generaterandomNum(100);
		String email=randomNum+map.get("Email aDDRESS");
		String pwd=map.get("Password")+randomNum;
		
		signUp.createUserAccount(map.get("First name"),map.get("Last name"),map.get("Gender"),
				map.get("Phone number"),email,pwd);
		
		Thread.sleep(10000);
		welcome.clickloginButton();
		login.loginToApp(map.get("Email aDDRESS"),map.get("Password"));
		
		Assert.assertTrue(driver.getTitle().contains("Home"));
		
		
		
		
	}

}
