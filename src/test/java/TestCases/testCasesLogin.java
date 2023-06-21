package TestCases;

import java.net.MalformedURLException;

import org.Capstone.Base.BaseConfiguration;
import org.Capstone.Pageobjects.LoginPage6;
import org.Capstone.Pageobjects.RegisAccDeleted5;
import org.Capstone.Pageobjects.RegisHomepage1;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testCasesLogin extends BaseConfiguration{

	WebDriver driver;
	
	public RegisHomepage1 clickObj1;
	
	public LoginPage6 clickObj2;
	
	public RegisAccDeleted5 clickObj3;
	
	@Parameters({"Port"})
	@BeforeClass
	public void initialSetup(String Port) throws MalformedURLException {
		driver = setUp(Port);
		clickObj1 = new RegisHomepage1(driver);
		clickObj2 = new LoginPage6(driver);
		clickObj3 = new RegisAccDeleted5(driver);
	}
	
	@Test
	public void scenario() throws InterruptedException {
		clickObj1.checkHomepage();
		clickObj2.loginCheck();
		clickObj3.deleteAccountInfo();
	}
}