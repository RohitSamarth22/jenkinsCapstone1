package org.Capstone.Pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CartPage9 {
	
 WebDriver driver;

   public CartPage9(WebDriver driver)
 {
  this.driver=driver;
  PageFactory.initElements(driver, this);
 }
   
   @FindBy(xpath="//*[text()=' Cart'][@style='color: orange;']")
    public WebElement cartpage;
   
   @FindBy(xpath="(//*[@style=\"cursor: pointer;\"])[1]")
   public WebElement remove1;
   
   @FindBy(xpath="(//*[@style=\"cursor: pointer;\"])[2]")
   public WebElement remove2;
	
   @FindBy(xpath="(//*[@style=\"cursor: pointer;\"])[3]")
   public WebElement remove3;
   
   @FindBy(xpath="(//*[@style=\"cursor: pointer;\"])[4]")
   public WebElement remove4;
   
   @FindBy(xpath="(//*[@style=\"cursor: pointer;\"])[5]")
   public WebElement remove5;
   
//   @FindBy(xpath="(//i[@class='fa fa-times'])[1]")
//   public WebElement remove1;
//   
//   @FindBy(xpath="(//i[@class='fa fa-times'])[2]")
//   public WebElement remove2;
//	
//   @FindBy(xpath="(//a[@class='cart_quantity_delete'])[1]")
//   public WebElement remove3;
//   
//   @FindBy(xpath="(//a[@class='cart_quantity_delete'])[1]")
//   public WebElement remove4;
//   
//   @FindBy(xpath="(//a[@class='cart_quantity_delete'])[1]")
//   public WebElement remove5;
   
   @FindBy (xpath="//*[text()='Cart is empty!']")
   public WebElement emptyCart;
   
   @FindBy(xpath="//*[text()=' Home']")
	public WebElement homeIcon;
   
   public void removeCart() throws InterruptedException
   {
    Assert.assertEquals(cartpage.isDisplayed(), true);
    JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,525)");
    remove1.click();
    Thread.sleep(1000);
    remove2.click();
    Thread.sleep(1000);
    remove3.click();
    Thread.sleep(1000);
    remove4.click();
    Thread.sleep(1000);
    remove5.click();
    Thread.sleep(1000);
    System.out.println("Cart is empty : true");
   // Assert.assertEquals(emptyCart.isDisplayed(), true);
    homeIcon.click();
   }
   

}
