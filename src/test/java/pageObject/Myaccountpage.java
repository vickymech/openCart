package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Myaccountpage extends Basepage{
	
	public Myaccountpage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//h1[normalize-space()='My Account']") WebElement txt_display;
	@FindBy(partialLinkText ="Logout")  WebElement clic_logout;
	

		
	
	public boolean accountcheak()
	{
		try {
		return( txt_display.isDisplayed());
		}
		catch(Exception e) {
		return false;
		}
		
	}
	
	public void LogoutOfpage() 
	{
		clic_logout.click();
		
	}
	
	public void scrolePage()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", clic_logout);
	}

	

	
	

		
}
