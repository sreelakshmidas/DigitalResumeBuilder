package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.drbBase.Base;

public class LoginForCreateProfile extends Base
{
	WebDriver driver;
	@FindBy(xpath="//a[@href='/login']")
	 WebElement signup;
	@FindBy(name="Username")
	 WebElement username;
	@FindBy(name="pass")
	 WebElement password;
	@FindBy(xpath="//label[@for='checkbox']")
	 WebElement rem;
	@FindBy(className="login100-form-btn")
	 private WebElement login;
	//@FindBy(className="logout btn")
	//WebElement logout;
	@FindBy(xpath="//a[@href='/profilehome']")//My Profile
    WebElement myprof;
	@FindBy(xpath="//button[text()='Create a Profile Now']")//Create your resume now
    WebElement crtprfbtn;
	public LoginForCreateProfile (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickSignUp() throws InterruptedException
	{ Thread.sleep(1000);
		signup.click();
	}
	public void setUserName(String userName) throws InterruptedException
	
	{
		/*WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(100));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Username")));
	
	username.clear();*/
		username.sendKeys(userName);
		
		 
	}
	public void setPassword(String pass) throws InterruptedException
	{
		password.clear();
		password.sendKeys(pass);
		  Thread.sleep(200);
	}
	public void clickRememberMe()
	{  
		//rem.click();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",rem);
	}
	public void loginClick()
	{
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(100));
//		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("login100-form-btn")));
		//login.click();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",login);
	}

	public void clickMyProfile() throws InterruptedException
	{	
		/*WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(100));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/profilehome']")));*/
		Thread.sleep(1000);
		myprof.click();
	}

	public void clickCrtProfile() throws InterruptedException
	{
		Thread.sleep(1000);
		crtprfbtn.click();
	}
	
}
