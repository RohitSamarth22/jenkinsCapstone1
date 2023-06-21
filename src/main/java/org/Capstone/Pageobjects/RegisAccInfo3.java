package org.Capstone.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

public class RegisAccInfo3 {
	
    WebDriver driver;
	
	public RegisAccInfo3(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//Initialize the elements
	}
	
	@FindBy(xpath="//*[contains(text(), 'Enter Account Information')]")  
	public WebElement enterAccountInfo;
	
	@FindBy(id="id_gender1")  
	public WebElement title;
	
	@FindBy(id="name")  
	public WebElement accountName;
	
	@FindBy(id="password")  
	public WebElement accountPassword;
	
	@FindBy(name="days")  
	public WebElement dojDay;
	
	@FindBy(name="months")  
	public WebElement dojMonths;
	
	@FindBy(name="years")  
	public WebElement dojYears;
	
	@FindBy(xpath="//*[text()='Sign up for our newsletter!']")
	public WebElement newsLetter;
	
	@FindBy(xpath="//*[text()='Receive special offers from our partners!']")  
	public WebElement optIn;
	
	@FindBy(id="first_name")  
	public WebElement firstName;
	
	@FindBy(id="last_name")  
	public WebElement lastName;
	
	@FindBy(id="company")  
	public WebElement company;
	
	@FindBy(id="address1")  
	public WebElement address;
	
	@FindBy(name="country")  
	public WebElement country;
	
	@FindBy(id="state")  
	public WebElement state;
	
	@FindBy(id="city")  
	public WebElement city;
	
	@FindBy(id="zipcode")  
	public WebElement zipcode;
	
	@FindBy(id="mobile_number")  
	public WebElement mobile;
	
	@FindBy(xpath="(//*[@type='submit'])[1]")  
	public WebElement createAccount;
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public void enterAccountInfo() throws InterruptedException {
	    System.out.println(enterAccountInfo.isDisplayed());
	    title.click();
	    accountName.sendKeys("rohit");
	    accountPassword.sendKeys("asfrfg");
	    
	    Select dobd = new Select(dojDay);
	    dobd.selectByValue("22");
	    
	    Thread.sleep(3000);
	    
	    Select dobm = new Select(dojMonths);
	    dobm.selectByValue("8");
	    
	    Select doby = new Select(dojYears);
	    doby.selectByValue("1992");  
	    
	    
//	    newsLetter.click();
//	    optIn.click();	    
	}
	
	public void addressInfo() throws InterruptedException {
		firstName.sendKeys("rohit");
		lastName.sendKeys("sam");
		company.sendKeys("axis");
		address.sendKeys("delhi");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		Select coun = new Select(country);
	    coun.selectByValue("India");
		
	    state.sendKeys("Maharashtra");
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,250)");
	    city.sendKeys("Pune");
	    zipcode.sendKeys("553747");
	    mobile.sendKeys("6363636363");
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,250)");
	    Thread.sleep(3000);
        createAccount.click();
	}

}

