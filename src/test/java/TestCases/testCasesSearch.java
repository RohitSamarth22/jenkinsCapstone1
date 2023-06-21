package TestCases;

import java.net.MalformedURLException;

import org.Capstone.Base.BaseConfiguration;
import org.Capstone.Pageobjects.Search12;
import org.Capstone.Pageobjects.Search13;
import org.Capstone.Pageobjects.Search14;
import org.Capstone.Pageobjects.Search15;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testCasesSearch extends BaseConfiguration {
	
	
 public Search12 clickObj1;
 public Search13 clickObj2;
 public Search14 clickObj3;
 //public LoginPage loginobj;
 public Search15 clickObj4;
    WebDriver driver;
	
 @Parameters({"Port"})
 @BeforeClass
 public void setup2(String Port) throws MalformedURLException
 {
  driver=setUp(Port);
  
  clickObj1=new Search12(driver);
  clickObj2=new Search13(driver);
  clickObj3= new Search14(driver);
  //loginobj= new LoginPage(driver);
  clickObj4= new Search15(driver);
 }

	
 @Test
 public void DemoScenario() 
 {
	 clickObj1.clickProductPage();
	 clickObj2.allProducts();
	 clickObj3.signupLogin();
  //loginobj.LogIn();
	 clickObj4.ClickonCart();
 }



}
