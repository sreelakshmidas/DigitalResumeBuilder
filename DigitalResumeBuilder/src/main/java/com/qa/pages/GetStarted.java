package com.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.drbBase.Base;

public class GetStarted extends Base
{
		
		WebDriver driver;
		
		//xpath for get started button
		@FindBy(xpath="//a[text()='Get Started >']")
		private WebElement getStarted_button;
		
		//xpath for create a profile now button
		@FindBy(xpath="//button[text()='Create a Profile Now']")
		private WebElement profileNow_button;
		
		
		public GetStarted(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
	
		
		public void getStartedButton()
		{
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			
			executor.executeScript("arguments[0].click();",getStarted_button);
			//executor.executeScript("window.scrollBy(0,100)");
		}
	
		public void profileNowButton()
		{
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();",profileNow_button);
			
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
