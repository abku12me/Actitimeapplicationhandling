package zohocrm.genericLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonUtility {
	
	public WebElement dropdown(WebElement drop)
	{
		Select s=new Select( drop);
		s.selectByVisibleText("Freshsales");
		WebElement sel=s.getFirstSelectedOption();
		return sel;
		
	}

}
