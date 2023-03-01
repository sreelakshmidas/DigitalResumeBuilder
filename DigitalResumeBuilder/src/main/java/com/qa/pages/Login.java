package com.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.drbBase.Base;

public class Login extends Base
{
	WebDriver driver;
	
	@FindBy(xpath = "//a[@href='/login']")
	private WebElement signup;
	
	@FindBy(xpath="//a[text()='Home']")
	private WebElement home_pagetext;
	
	@FindBy(xpath=" //span[text()=' Signin to continue '] ")
	private WebElement getText;

	@FindBy(xpath = "//input[@name='Username']")
	private WebElement Username;

	@FindBy(xpath = "//input[@name='pass']")
	private WebElement password;

	@FindBy(xpath = "//label[@for='checkbox']")
	private WebElement checkbox;

	@FindBy(xpath = "//button[text()=' Login ']")
	private WebElement login; 

	@FindBy(xpath = "//button[text()=' Login ']")
	private WebElement logout;
 


	public Login(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickLogin() throws InterruptedException 
	{
		Thread.sleep(1000);

		signup.click();
	}

	public String signuptext() {
		
		String aboutText=getText.getText();
		return aboutText;
	}
	
	
	
	
	public void setUsername(String strUsername) throws InterruptedException {
		Thread.sleep(2000);
		Username.sendKeys(strUsername);
	}

	public void setPassword(String strpassword) throws InterruptedException 
	{
		Thread.sleep(1000);
		password.sendKeys(strpassword);
	}

	public void clickRememberme() throws InterruptedException 
	{
		JavascriptExecutor executor =(JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();",checkbox);
	}

	public void clicksubmit() throws InterruptedException 
	{
		JavascriptExecutor executor =(JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();",login);
	}


public void clicklogout() throws InterruptedException {
{
	JavascriptExecutor executor =(JavascriptExecutor) driver;
	executor.executeScript("arguments[0].click();",logout);
}}
public String alert() throws InterruptedException
{
	//switching to alert
	Alert alert=driver.switchTo().alert();
	
	//capturing alert message
	String alertMessage=driver.switchTo().alert().getText();
	
	//displaying alert message
	System.out.println("Alert message:"+alertMessage);
	
	alert.accept();
	
	return alertMessage;
			
}
public String home_text() {
	
	String Text=home_pagetext.getText();
	return Text;
}
}
