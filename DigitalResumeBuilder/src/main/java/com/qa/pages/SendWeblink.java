package com.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.drbBase.Base;


public class SendWeblink extends Base
{
	WebDriver driver;
	@FindBy(name="Username")
	private WebElement username;
	@FindBy(name="pass")
	private WebElement pass;
	@FindBy(xpath="//div[@class='container-login100-form-btn']")
	private WebElement login;
	@FindBy(xpath="//label[@for='checkbox']")
	private WebElement checkbox;	
	@FindBy(xpath="//a[text()='Templates/Designs']")    
	private WebElement template;
    @FindBy(xpath="//p[text()='Attractive Template']//parent::figcaption")
	private WebElement template1;
  	@FindBy(xpath="//a[text()='Send a Weblink']")
	private WebElement Weblink;
  	
	
	public SendWeblink(WebDriver driver)
	 {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	 }
	
	
	public void setUsername(String strUserName)
		{
			username.sendKeys(strUserName);
		}
	
	public void setPassword(String strPassword)
		{
			pass.sendKeys(strPassword);
		}
	
	public void clickLogin()
		{
			login.click();
		}
	
	public void clickcheckbox()
		{
			checkbox.click();
		}
        
    public void clickTemplate()
	   {
		template.click();
		} 
        
    public void clickTemplate1()
		  {
			template1.click();
			}
     	
    public void clickWeblink()
 	   {
    	JavascriptExecutor executor =(JavascriptExecutor) driver;
    	executor.executeScript("arguments[0].scrollIntoView();",Weblink);
		executor.executeScript("arguments[0].click();",	Weblink);
		
 		}	
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

}
