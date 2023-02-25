package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.drbBase.Base;

public class HomePage extends Base
{
		WebDriver driver;
		
		
		//xpath for home button
		@FindBy(xpath="//a[text()='Home']")
		private WebElement home_button;
		
		//for homepage verification
		@FindBy(xpath="//a[text()='Create your resume now']")
		private WebElement text;
		
		
		
		public HomePage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		
		public void clickHome()
		{
			home_button.click();
		}
	
		
		public String getText()
		{
			String homeText=text.getText();
			return homeText;
			
		}
	
	
}
