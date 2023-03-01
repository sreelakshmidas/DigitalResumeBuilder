package com.qa.pages;

//import java.time.Duration;

import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.drbBase.Base;

public class CreateYourResumeNow extends Base
{
	//initializing web driver
	WebDriver driver;
	
	
	
	//xpath for create your resume now button
	@FindBy(xpath="//a[@class='contact_bt']")
	private WebElement createResumeNow_button;
	
	//page verification
	@FindBy(xpath="//div[text()='Here you can choose your Template/Design']")
	private WebElement text;
	
	//select a template
	@FindBy(xpath="//div[text()='MULBERRY WHITE']")
	private WebElement template_mulberry;
	
	//xpath for welcome to Digital Resume Builder
	@FindBy(xpath="//h2[text()='Welcome to Digital Resume Builder ']")
	private WebElement profile_home_text;
	
	//xpath for create a profile now button
	@FindBy(xpath="//button[text()='Create a Profile Now']")
	private WebElement createProfile_button;
	
	
	
	
	public CreateYourResumeNow(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void createResumeNow() throws InterruptedException
	{
		/*Actions action=new Actions(driver);
		action.moveToElement(createResumeNow_button).click();*/
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		
		//This will scroll the page till the element is found
		executor.executeScript("arguments[0].scrollIntoView();",createResumeNow_button);
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();",createResumeNow_button);
		
	}
	
	public String getText()
	{
		String templateText=text.getText();
		return templateText;
		
	}
	
	public String profile_home_getText()
	{
		String text=profile_home_text.getText();
		return text;
	}
	
	public void mulberry()
	{
		
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",template_mulberry);
	}
	
	public void create_profile()
	{
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",createProfile_button);
	}
	
	public String alert() throws InterruptedException
	{
		//switching to alert
		Alert alert=driver.switchTo().alert();
		
		//capturing alert message
		String alertMessage=driver.switchTo().alert().getText();
		
		//displaying alert message
		System.out.println("alert message:"+alertMessage);
		
		Thread.sleep(5000);
		
		//accepting alert
		alert.accept();
		
		return alertMessage;
			
	}
	
}

