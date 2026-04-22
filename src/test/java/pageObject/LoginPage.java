package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Basepage{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


@FindBy(xpath="//input[@id='input-email']") WebElement txt_Email;
@FindBy(xpath="//input[@id='input-password']") WebElement txt_Password;
@FindBy(xpath="//button[normalize-space()='Login']") WebElement butn_click;




public void setEmail (String eml) 
{
	txt_Email.sendKeys(eml);
}
public void Setpassword(String passw) 
{
	txt_Password.sendKeys(passw);
}
public void clikLoginbut() 
{
	butn_click.click();
}



}

		
