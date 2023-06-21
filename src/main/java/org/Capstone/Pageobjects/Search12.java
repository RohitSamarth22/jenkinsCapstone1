package org.Capstone.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search12 {
	
WebDriver driver;

   public Search12(WebDriver driver){
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   
   @FindBy(xpath="//*[text()=' Products']")
   public WebElement clickProduct;
   
   public void clickProductPage() {
    clickProduct.click();
   }
}
