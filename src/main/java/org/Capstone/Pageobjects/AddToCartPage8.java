package org.Capstone.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

public class AddToCartPage8 {
	
 WebDriver driver;

   public AddToCartPage8(WebDriver driver)
 {
  this.driver=driver;
  PageFactory.initElements(driver, this);
 }
   
   @FindBy(xpath="//*[text()=' Home'][@style='color: orange;']")
    public WebElement homePage;
   
   @FindBy(xpath="(//*[text()='Add to cart'])[1]")
   public WebElement addProduct1;
   
   @FindBy(xpath="(//*[text()='Add to cart'])[3]")
   public WebElement addProduct2;
   
   @FindBy(xpath="(//*[text()='Add to cart'])[5]")
   public WebElement addProduct3;
   
   @FindBy(xpath="(//*[text()='Add to cart'])[7]")
   public WebElement addProduct4;
   
   @FindBy(xpath="(//*[text()='Add to cart'])[9]")
   public WebElement addProduct5;
   
   @FindBy(xpath="//button[text()='Continue Shopping']")
   public WebElement continueButton;
   
   @FindBy(xpath="//*[text()=' Cart']")                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
   public WebElement cartButton;
   
   JavascriptExecutor executor = (JavascriptExecutor)driver;


    public void addProducts() 
   {
     Assert.assertEquals(homePage.isDisplayed(), true);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
     driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
     addProduct1.click();
     driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
     continueButton.click();
     driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
     addProduct2.click();
     driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
     continueButton.click();
     driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
     addProduct3.click();

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,400)");
		
     driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
     continueButton.click();
     driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
     addProduct4.click();
     driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
     continueButton.click();
     driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); 
     addProduct5.click();
     driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
     continueButton.click();
     driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
     cartButton.click();
    }
    
}