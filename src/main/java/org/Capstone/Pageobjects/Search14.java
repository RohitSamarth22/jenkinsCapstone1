package org.Capstone.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search14 {
	
 WebDriver driver;

   public Search14(WebDriver driver)
 {
  this.driver=driver;
  PageFactory.initElements(driver, this);
 }
   
   @FindBy(xpath=" //*[text()=' Signup / Login']")
   public WebElement clickSignUpButton;
   
   public void signupLogin() {
	   clickSignUpButton.click();
    //go to cart
    //verify product
   }

}