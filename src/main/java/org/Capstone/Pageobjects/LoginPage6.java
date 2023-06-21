package org.Capstone.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage6 {
	
    WebDriver driver;
	
	public LoginPage6(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//Initialize the elements
	}
	
	@FindBy(xpath="//*[contains(text(), 'Login to your account')]")  
	public WebElement loginText;
	
	@FindBy(xpath="(//input[@name='email'])[1]")  
	public WebElement email;
	
	@FindBy(name="password")  
	public WebElement password;
	
	@FindBy(xpath="//button[text()='Login']")  
	public WebElement loginButton;
	
	public void loginCheck() {
		Assert.assertEquals(loginText.isDisplayed(), true);
	    email.sendKeys("bahahah@gmail.com");
	    password.sendKeys("ninja");
	    loginButton.click();
	}
}
