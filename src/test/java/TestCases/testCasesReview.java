package TestCases;

import java.net.MalformedURLException;

import org.Capstone.Base.BaseConfiguration;
import org.Capstone.Pageobjects.ReviewDetails11;
import org.Capstone.Pageobjects.ReviewOpen10;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testCasesReview extends BaseConfiguration{
	
 public ReviewOpen10 clickObj1;
 public ReviewDetails11 clickObj2;
    WebDriver driver;
	
 @Parameters({"Port"})
 @BeforeClass
 public void initialSetup(String Port) throws MalformedURLException
 {
  driver=setUp(Port);
  
  clickObj1 = new ReviewOpen10(driver);
  clickObj2 = new ReviewDetails11(driver);
 }

	
 @Test
 public void scenario() 
 {
	 clickObj1.reviewClick();
	 clickObj2.reviewWrite();
 }

}
