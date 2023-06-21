package org.Capstone.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search15 {
	
 WebDriver driver;

   public Search15(WebDriver driver)
 {
  this.driver=driver;
  PageFactory.initElements(driver, this);
 }
   
   @FindBy(xpath="//*[text()=' Cart']")
   public WebElement cart;
   
   @FindBy(xpath="//*[text()=' Home']")
	public WebElement homeIcon;
   
   public void ClickonCart()
   {
    cart.click();
    homeIcon.click();
   }

}
