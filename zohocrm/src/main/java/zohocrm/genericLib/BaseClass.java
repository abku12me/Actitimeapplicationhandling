package zohocrm.genericLib;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public WebDriver driver;
	
	@BeforeClass
	public void launchbro()
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
	 driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}

}
