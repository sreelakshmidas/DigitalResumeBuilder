package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.drbBase.Base;


public class DownloadResume extends Base
{
	WebDriver driver;
	
	@FindBy(xpath="//a[text()='Download Resume']")
	private WebElement Download;
	public DownloadResume(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
 public void clickDownland()
  {
	 JavascriptExecutor executor =(JavascriptExecutor) driver;
	 executor.executeScript("arguments[0].scrollIntoView();",Download);
		executor.executeScript("arguments[0].click();",Download);
	
  }
	
}
