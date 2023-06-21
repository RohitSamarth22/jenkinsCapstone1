package TestCases;

import java.net.MalformedURLException;

import org.Capstone.Base.BaseConfiguration;
import org.Capstone.Pageobjects.AddToCartPage8;
import org.Capstone.Pageobjects.CartPage9;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testCasesAddProduct extends BaseConfiguration{

	WebDriver driver;
	
	public AddToCartPage8 clickObj1;
	
	public CartPage9 clickObj2;
	
	@Parameters({"Port"})
	@BeforeClass
	public void initialSetup(String Port) throws MalformedURLException {
		driver = setUp(Port);
		clickObj1 = new AddToCartPage8(driver);
		clickObj2 = new CartPage9(driver);
	}
	
	@Test
	public void scenario() throws InterruptedException {
		clickObj1.addProducts();
		clickObj2.removeCart();
	}
}