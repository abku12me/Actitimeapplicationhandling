package zohocrm.testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import zohocrm.genericLib.BaseClass;

public class naukrifile extends BaseClass{
	@Test
	public void naukri() throws AWTException
	{
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gclid=CjwKCAiA2fmdBhBpEiwA4CcHzYNattIP62gDGQ8grDCJo_2tRPIKyOYAFZmKKlcLtYzJrLmjYHnS4hoCn5AQAvD_BwE&gclsrc=aw.ds");
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		//select the path
		StringSelection path=new StringSelection("C:\\Users\\mishr\\OneDrive\\Documents\\epfo (1).pdf");
		//copy the path
		Clipboard cb=Toolkit.getDefaultToolkit().getSystemClipboard();
		cb.setContents(path, null);
		//paste the path
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
