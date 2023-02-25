package com.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.drbBase.Base;

public class CreateYourResumeNow extends Base
{
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
	
	//xpath for create a profile now button
	@FindBy(xpath="//button[text()='Create a Profile Now']")
	private WebElement createProfile_button;
	
	
	public CreateYourResumeNow(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void createResumeNow()
	{
		/*Actions action=new Actions(driver);
		action.moveToElement(createResumeNow_button).click();*/
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",createResumeNow_button);
		
	}
	
	public String getText()
	{
		String templateText=text.getText();
		return templateText;
		
	}
	
	public void mulberry()
	{
		
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",template_mulberry);
	}
	
	public void create_profile()
	{
		createProfile_button.click();
	}
	
	public void alert() throws InterruptedException
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
			
	}
	
}

