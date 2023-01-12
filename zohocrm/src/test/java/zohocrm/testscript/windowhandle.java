package zohocrm.testscript;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import zohocrm.genericLib.BaseClass;

public class windowhandle extends BaseClass{
	@Test
	public void allhandle()
	{
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		driver.switchTo().frame(0);
		WebElement move=driver.findElement(By.xpath("//font[text()='Free Mock Tests']"));
		Actions act=new Actions(driver);
		act.moveToElement(move).click().build().perform();
		String mainid=driver.getWindowHandle();
		Set<String> allid=driver.getWindowHandles();
		for(String id:allid)
		{
			if(!(mainid.equals(id)))
			{
				driver.switchTo().window(id);
			}
			
		}
		driver.findElement(By.linkText("Insurance")).click();
		driver.switchTo().window(mainid);
		String title=driver.getTitle();
		System.out.println(title);
		
		
		
		
	}

}
