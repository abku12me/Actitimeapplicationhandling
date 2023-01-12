package zohocrm.testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import zohocrm.genericLib.BaseClass;
import zohocrm.genericLib.CommonUtility;
import zohocrm.genericLib.DataUtility;

public class zohoCRM extends BaseClass{
	
	DataUtility du=new DataUtility();
	CommonUtility cu=new CommonUtility();
	@Test
	public void actions() throws IOException
	{
         driver.get(du.datafromexcel("sheet1", 0, 0));
         driver.findElement(By.id("name")).sendKeys(du.datafromexcel("Sheet1", 1, 0));
         driver.findElement(By.cssSelector("[class='zwfp_formcontrol formcontrol phone_number input_validate']")).sendKeys(du.datafromexcel("Sheet1", 2, 0));
		 driver.findElement(By.cssSelector("[class='zwfp_formcontrol formcontrol zwf_company_name input_validate']")).sendKeys(du.datafromexcel("Sheet1", 3, 0));
		driver.findElement(By.id("email")).sendKeys(du.datafromexcel("Sheet1", 4, 0));
		driver.findElement(By.cssSelector("[class='zwfp_formcontrol formcontrol zwf_employee']")).sendKeys(du.datafrompro("numberofemp"));
		WebElement drop=driver.findElement(By.cssSelector("[class='zwf_formcontrol zwf_existing_crm_service none-val']"));
		cu.dropdown(drop);
		
		
	}

}
