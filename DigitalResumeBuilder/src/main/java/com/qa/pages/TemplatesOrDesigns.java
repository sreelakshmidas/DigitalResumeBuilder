package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.drbBase.Base;

public class TemplatesOrDesigns extends Base
{
		WebDriver driver;
		
		//button for templates or designs
		@FindBy(xpath="//a[text()='Templates/Designs']")
		private WebElement templates_button;
		
		//templates or designs page verification
		@FindBy(xpath="//div[text()='Here you can choose your Template/Design']")
		private WebElement text;
		
		
		public TemplatesOrDesigns(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
	
	
		public void clickTemplates()
		{
			templates_button.click();
		}
	
	
		public String getText()
		{
			String templatesText=text.getText();
			return templatesText;
		
		}
	
	
	
	
}
