package zohocrm.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import zohocrm.genericLib.BaseClass;

public class amazon extends BaseClass{
	@Test
	public void dynamic()
	{
		driver.get("https://www.amazon.in/");
		WebElement price=driver.findElement(By.id("twotabsearchtextbox"));
		price.sendKeys("bag for men");
		price.submit();
		String det=driver.findElement(By.xpath("//span[text()='Lavie Sport Chairman Director Business Laptop Bags | Leatherette Business Backpacks for Men & Women | Durable Office Bag for Notebook/MacBook'][1]/../../../../div[3]/div/div/div/div[2]/a/span/span/span[2]")).getText();
		System.out.println(det);
		
		
	}

}
