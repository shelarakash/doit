package Module1_Home_TestClasses;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.BaseClass;
import Library_Files.UtilityClass;
import Module1_Home.Insurance_Broker_Insurance_Webpage;
import Module1_Home.Insurance_Login;

public class Insurance_TestNG_TestClass extends BaseClass
{
	
	//public WebDriver driver;
	//InitializeBrowser() 
	
	Insurance_Login Login;
	Insurance_Broker_Insurance_Webpage Broker;

	@BeforeClass
	public void OpenBrowser() 
	{
		InitializeBrowser();
		
		 //Create Object Of POM-I Class
		Login=new Insurance_Login(driver);
		
		//Create object of POM-II Class
        Broker=new Insurance_Broker_Insurance_Webpage(driver);

	}
	
	
	@BeforeMethod
	public void loginToApp() throws IOException 
	{
		Login.EnterEmail(UtilityClass.getDatafromPF("EM")); //saradeg41@gmail.com
		
		Login.EnterPassowrd(UtilityClass.getDatafromPF("PSW"));  //Sai@1117
		
		Login.ClickLoginBtn();
		
	}
	
	@Test                                 //Test Case/method
	public void VerifyEmailAddress() 
	{
		//verify Email Address
		String ActualEmail=Broker.getEmail();   //saradeg41@gmail.com
		
		
		
	
	}

	@AfterMethod
	public void LogoutFromApp() 
	{
		
	}
	
	@AfterClass
	public void CloseBrowser() 
	{
		
	}
	
	
	
	
	
	
	
	
}