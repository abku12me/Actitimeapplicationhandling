package zohocrm.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import zohocrm.genericLib.BaseClass;

public class handling extends BaseClass{
	@Test
	public void layoff() throws InterruptedException
	{
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		Thread.sleep(2000);
		List<WebElement> allsug=driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div"));
		
		for(WebElement sug:allsug)
		{
			String suggestion=sug.getText();
			
			if(suggestion.contains("iphone 13"))
			{
				sug.click();
				break;
			}
			
			
		}
		
		
		
		
		
		
		
	}

}
