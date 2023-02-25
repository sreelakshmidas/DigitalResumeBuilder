package com.qa.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.drbBase.Base;

public class AboutUs extends Base
{
	    // Initializing web driver
		WebDriver driver;
		
		
		@FindBy(xpath="//a[text()='Aboutus']")
		private WebElement aboutus_button;
		
		//verify that the page is aboutus
		@FindBy(xpath="//span[text()='About Us']")
		private WebElement text;
		
		
		
		public AboutUs(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		
		public void clickAboutus()
		{
			aboutus_button.click();
		}
	
		public String getText()
		{
			String aboutText=text.getText();
			return aboutText;
			
		}
	
	
	
	
	

}
