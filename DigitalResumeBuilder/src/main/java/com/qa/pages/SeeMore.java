package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.drbBase.Base;

public class SeeMore extends Base
{
		WebDriver driver;
		
		//xpath for see more button
		@FindBy(xpath="//a[text()='See More >']")
		private WebElement seeMoreTemplates_button;
		
		//templates or designs page verification
		@FindBy(xpath="//div[text()='Here you can choose your Template/Design']")
		private WebElement text;
		
		
		public SeeMore(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		
		public void seeMoreButton()
		{
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();",seeMoreTemplates_button);
		}
	
		
		public String getText()
		{
			String templatesPageText=text.getText();
			return templatesPageText;
			
		}
	
	
	
	
}
