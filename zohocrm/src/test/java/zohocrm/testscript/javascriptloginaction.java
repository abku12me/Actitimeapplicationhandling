package zohocrm.testscript;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import zohocrm.genericLib.BaseClass;

public class javascriptloginaction extends BaseClass {
	
	@Test
	public void loginbyjavascript()
	{
		driver.navigate().to("https://demo.actitime.com/login.do");
	    JavascriptExecutor jse=(JavascriptExecutor)driver;
	    jse.executeScript("document.getElementById('username').value='admin';");
	    //jse.executeScript("document.getElementsByName('password')[0].value='admin123';");
	   // jse.executeScript("document.getElementsByClassName('oxd-button oxd-button--medium oxd-button--main orangehrm-login-button')[0].click();");
		
		
		
		
	}

}
