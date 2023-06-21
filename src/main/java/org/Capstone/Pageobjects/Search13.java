package org.Capstone.Pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Search13 {
	
 WebDriver driver;

   public Search13(WebDriver driver)
 {
  this.driver=driver;
  PageFactory.initElements(driver, this);
 }
   
   @FindBy(xpath="//*[text()=' Products'][@style='color: orange;']")
    public WebElement allPro;
   
   @FindBy(xpath="//*[@id='search_product']")
   public WebElement searchBar;
   
   @FindBy(id="submit_search")
   public WebElement searchButton;
   
   @FindBy(xpath="//*[text()='Searched Products']")
   public WebElement searchedProductHeading;
   
// @FindBy(xpath="(//*[contains(text(),'Dress')])[3]")
// public WebElement Dress1;
//   
// @FindBy(xpath="(//*[contains(text(),'Dress')])[5]")
// public WebElement Dress2;
//   
// @FindBy(xpath="(//*[text()='Sleeves Top and Short - Blue & Pink']")
// public WebElement Dress3;
//   
// @FindBy(xpath="//*[text()='Sleeveless Unicorn Patch Gown - Pink']")
// public WebElement Dress4;
//   
//   
// @FindBy(xpath="(//*[contains(text(),'Dress')])[7]")
// public WebElement Dress5;
//   
// @FindBy(xpath="(//*[contains(text(),'Dress')])[9]")
// public WebElement Dress6;
//   
// @FindBy(xpath="(//*[contains(text(),'Dress')])[11]")
// public WebElement Dress7;
//   
// @FindBy(xpath="(//*[contains(text(),'Dress')])[13]")
// public WebElement Dress8;
//   
// @FindBy(xpath="(//*[contains(text(),'Dress')])[15]")
// public WebElement Dress9;
   
   @FindBy(xpath="(//*[text()='Add to cart'])[1]")
   public WebElement addcart1;
   

   @FindBy(xpath="(//*[text()='Add to cart'])[3]")
   public WebElement addcart2;
   

   @FindBy(xpath="(//*[text()='Add to cart'])[5]")
   public WebElement addcart3;
   
   @FindBy(xpath="(//*[text()='Add to cart'])[7]")
   public WebElement addcart4;
   
   @FindBy(xpath="(//*[text()='Add to cart'])[9]")
   public WebElement addcart5;
   
   @FindBy(xpath="(//*[text()='Add to cart'])[11]")
   public WebElement addcart6;
   
   @FindBy(xpath="(//*[text()='Add to cart'])[13]")
   public WebElement addcart7;
   
   @FindBy(xpath="(//*[text()='Add to cart'])[15]")
   public WebElement addcart8;
   
   @FindBy(xpath="(//*[text()='Add to cart'])[17]")
   public WebElement addcart9;
   
   @FindBy(xpath="//button[text()='Continue Shopping']")
   public WebElement continueButton;
   
   @FindBy(xpath="//*[text()=' Cart']")
   public WebElement cartbutton;
   
   public void allProducts()
   {
  Assert.assertEquals(allPro.isDisplayed(), true);
  searchBar.sendKeys("dress");
  searchButton.click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)");
  searchedProductHeading.isDisplayed();
  addcart1.click();
  continueButton.click();
  addcart2.click();
  continueButton.click();
  addcart3.click();
  continueButton.click();
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	js1.executeScript("window.scrollBy(0,500)");
  addcart4.click();
  continueButton.click();
  addcart5.click();
  continueButton.click();
  addcart6.click();
  continueButton.click();
	JavascriptExecutor js2 = (JavascriptExecutor) driver;
	js2.executeScript("window.scrollBy(0,500)");
  addcart7.click();
  continueButton.click();
  addcart8.click();
  continueButton.click();
  addcart9.click();
  continueButton.click();
  cartbutton.click();
   }  

}
