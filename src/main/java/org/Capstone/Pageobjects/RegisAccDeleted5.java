package org.Capstone.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisAccDeleted5 {
	
    WebDriver driver;
	
	public RegisAccDeleted5(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//Initialize the elements
	}
		
	@FindBy(xpath="//*[contains(text(),' Logged in as ')]")  //username import
	public WebElement loginUsername;
	
	@FindBy(xpath="//*[contains(text(),'Delete Account')]")
	public WebElement deleteAccount;
	
	@FindBy(xpath="//*[contains(text(),'Account Deleted!')]")
	public WebElement accountDeleted;
	
	@FindBy(xpath="//*[text()=' Home']")
	public WebElement homeIcon;
	
	public void deleteAccountInfo() {
	    System.out.println(loginUsername.isDisplayed());
	    deleteAccount.click();
	    System.out.println(accountDeleted.isDisplayed());
	    homeIcon.click();	}
}	