package org.Capstone.Pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ReviewOpen10 {
	

WebDriver driver;

public ReviewOpen10(WebDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
}
   
@FindBy(xpath="//*[text()=' Products']")
public WebElement productPage;

JavascriptExecutor js = (JavascriptExecutor) driver;
   
@FindBy(xpath="//*[text()=' Products'][@style='color: orange;']")
public WebElement AllProduct;
   
@FindBy(xpath="(//*[text()='View Product'])[1]")
public WebElement clickViewProduct;
   
public void reviewClick() {
	productPage.click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,300)");
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	js1.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
	clickViewProduct.click();
	Assert.assertEquals(AllProduct.isDisplayed(), true);
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
}

}