package testCase;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.Myaccountpage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {
	
	
	@Test(groups= { "Sanity","Master"})
	public void Login_test() 
	
	{
		try {
			
			HomePage hp=new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();
		
		LoginPage ln=new LoginPage(driver);
		ln.setEmail(p.getProperty("email"));
		ln.Setpassword(p.getProperty("password"));
		ln.clikLoginbut();
		
		Myaccountpage my=new Myaccountpage(driver);
		boolean conformation= my.accountcheak();
		Assert.assertEquals(conformation, true);
		
	
		
		}
		catch(Exception e) 
		{
			Assert.fail();
		}
		
			
		
	}
	
	
	
	

}
