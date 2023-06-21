package TestCases;


import java.net.MalformedURLException;

import org.Capstone.Base.BaseConfiguration;
import org.Capstone.Pageobjects.LoginInvalid7;
import org.Capstone.Pageobjects.RegisHomepage1;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testCasesLoginInvalid extends BaseConfiguration{

	WebDriver driver;
	
	public RegisHomepage1 clickObj1;
	
	public LoginInvalid7 clickObj2;
	
	@Parameters({"Port"})
	@BeforeClass
	public void initialSetup(String Port) throws MalformedURLException {
		driver = setUp(Port);
		clickObj1 = new RegisHomepage1(driver);
		clickObj2 = new LoginInvalid7(driver);
	}
	
	@Test
	public void scenario() throws InterruptedException {
		clickObj1.checkHomepage();
		clickObj2.loginInvalidCheck();
	}
}