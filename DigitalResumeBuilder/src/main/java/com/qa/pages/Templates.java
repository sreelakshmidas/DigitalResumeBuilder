package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.drbBase.Base;



public class Templates extends Base
{
	@FindBy(xpath = "//a[@href='/login']")
	private WebElement signup;
	WebDriver driver;
	@FindBy(xpath = "//input[@name='Username']")
	private WebElement username;
	@FindBy(xpath = "//input[@name='pass']")
	private WebElement pass;
	@FindBy(xpath="//div[@class='container-login100-form-btn']")
	private WebElement login;
	@FindBy(xpath="//label[@for='checkbox']")
	private WebElement checkbox;	
	@FindBy(xpath="//a[text()='My Profile']")
	private WebElement my_profile;
	
	
	
	
	@FindBy(xpath="//a[text()='Templates/Designs']")    
	private WebElement template;
    @FindBy(xpath="//p[text()='Attractive Template']//parent::figcaption")
	private WebElement template1;
	@FindBy(xpath="//p[text()='Classic Resumes']//parent::figcaption")
	private WebElement template2;
	@FindBy(xpath="//p[text()='Simple Resumes']//parent::figcaption")
	private WebElement template3;
	@FindBy(xpath="//div[text()='HELLO EVERYBODY, I AM']")
	private WebElement temp;
	
	public Templates(WebDriver driver)
	 {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	 }
	public void clickSignup() throws InterruptedException 
	{
		Thread.sleep(1000);

		signup.click();
	}

	public void setUsername(String strUserName)
	{
		/*JavascriptExecutor ex = (JavascriptExecutor)driver;
		ex.executeScript("arguments[0].scrollIntoView();", username);
		ex.executeScript("arguments[0].click();",username);*/
		username.sendKeys(strUserName);
	}

    public void setPassword(String strPassword)
	  {
		pass.sendKeys(strPassword);
		}

    public void clickLogin()
	  {
    	JavascriptExecutor executor =(JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();",login);
		
		}

   public void clickcheckbox()
	  {
		JavascriptExecutor executor =(JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();",checkbox);
		
	  }
   	
   public void clickMyprofile()
   
   {
		my_profile.click();
   } 
   
   public void clickTemplate()
	   
      {
	   
	   JavascriptExecutor executor =(JavascriptExecutor) driver;
	   executor.executeScript("arguments[0].scrollIntoView();",template);
		executor.executeScript("arguments[0].click();",template);
      } 
   public void clickTemplate1()
	  {
	   JavascriptExecutor executor =(JavascriptExecutor) driver;
	   executor.executeScript("arguments[0].scrollIntoView();",template1);
		executor.executeScript("arguments[0].click();",template1);
	  }

   public void clickTemplate2()
      {
	   JavascriptExecutor executor =(JavascriptExecutor) driver;
	   executor.executeScript("arguments[0].scrollIntoView();",template2);
		executor.executeScript("arguments[0].click();",template2);
	  }
   public void clickTemplate3()
	  {
	   JavascriptExecutor executor =(JavascriptExecutor) driver;
	   executor.executeScript("arguments[0].scrollIntoView();",template3);
		executor.executeScript("arguments[0].click();",	template3);
	
	  }
   public String GetText()
	{
	   JavascriptExecutor executor =(JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();",	temp);
	
		String txt=temp.getText();
		return txt;
}
	
	
	
}
