package org.Capstone.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegisHomepage1 {
	
    WebDriver driver;
	
	public RegisHomepage1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//Initialize the elements
	}
	
	@FindBy(xpath="//*[text()=' Home'][@style='color: orange;']")
	public WebElement homeIcon;
	
	@FindBy(xpath="//a[contains(text(),'Signup / Login')]")  
	public WebElement signLogin;
	
	public void checkHomepage() {
		Assert.assertEquals(homeIcon.isDisplayed(), true);
	    signLogin.click();
	}
}