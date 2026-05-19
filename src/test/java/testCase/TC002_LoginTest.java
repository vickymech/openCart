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
			logger.info("****Testcase TC002_LoginTest Start****");
			
			
			HomePage hp=new HomePage(driver);
			hp.clickMyAccount();
			logger.info("Clicked on MyAccount Link.. ");
			hp.clickLogin();
			logger.info("Clicked on Register Link.. ");
			
		LoginPage ln=new LoginPage(driver);
		logger.info("Providing customer details...");
		ln.setEmail(p.getProperty("email"));
		ln.Setpassword(p.getProperty("password"));
		ln.clikLoginbut();
		logger.info("Validating expected message..");
		
		Myaccountpage my=new Myaccountpage(driver);
		boolean conformation= my.accountcheak();
		Assert.assertEquals(conformation, true);
		
		
	
		
		}
		catch(Exception e) 
		{
			logger.error("test casefail"+e.getMessage());
			Assert.fail("test casefail"+e.getMessage());
		}
		logger.info("****Testcase TC002_LoginTest Start****");
		
			
		
	}
	
	
	
	

}
