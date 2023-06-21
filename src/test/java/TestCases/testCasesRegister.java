package TestCases;

import java.net.MalformedURLException;

import org.Capstone.Base.BaseConfiguration;
import org.Capstone.Pageobjects.RegisAccCreated4;
import org.Capstone.Pageobjects.RegisAccDeleted5;
import org.Capstone.Pageobjects.RegisAccInfo3;
import org.Capstone.Pageobjects.RegisHomepage1;
import org.Capstone.Pageobjects.RegisSignUp2;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testCasesRegister extends BaseConfiguration{

	WebDriver driver;
	
	public RegisSignUp2 clickObj2;
	
	public RegisHomepage1 clickObj1;
	
	public RegisAccCreated4 clickObj4;
	
	public RegisAccDeleted5 clickObj5;
	
	public RegisAccInfo3 clickObj3;
	
	@Parameters({"Port"})
	@BeforeClass
	public void initialSetup(String Port) throws MalformedURLException {
		driver = setUp(Port);
		clickObj1 = new RegisHomepage1(driver);
		clickObj2 = new RegisSignUp2(driver);
		clickObj4 = new RegisAccCreated4(driver);
		clickObj5 = new RegisAccDeleted5(driver);
		clickObj3 = new RegisAccInfo3(driver);
	}
	
	@Test
	public void scenario() throws InterruptedException {
		clickObj1.checkHomepage();
		clickObj2.signUp();
		clickObj3.enterAccountInfo();
		clickObj3.addressInfo();
		clickObj4.enterAccountInfo();
		clickObj5.deleteAccountInfo();
	}
}