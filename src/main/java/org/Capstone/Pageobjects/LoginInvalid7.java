package org.Capstone.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginInvalid7 {
	
    WebDriver driver;
	
	public LoginInvalid7(WebDriver driver) {
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
	
	@FindBy(xpath="//*[text()=' Home']")
	public WebElement homeIcon;
	
	public void loginInvalidCheck() {
	    System.out.println(loginText.isDisplayed()); 
	    email.sendKeys("fsfssef@gmail.com");
	    password.sendKeys("zappy");
	    loginButton.click();
	    homeIcon.click();;
	}
}
