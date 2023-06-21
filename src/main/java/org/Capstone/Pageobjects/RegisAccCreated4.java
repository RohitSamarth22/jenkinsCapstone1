package org.Capstone.Pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisAccCreated4 {
	
    WebDriver driver;
	
	public RegisAccCreated4(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//Initialize the elements
	}
	
	@FindBy(xpath="//*[contains(text(), 'Account Created!')]")  
	public WebElement accCreated;
	
	@FindBy(xpath="//a[contains(text(),'Continue')]")  
	public WebElement continueButton;
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public void enterAccountInfo() throws InterruptedException {
	    System.out.println(accCreated.isDisplayed());
	    continueButton.click();
	    Thread.sleep(2000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");	    	    
	    continueButton.click();
    }
}	