package com.qa.pages;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.drbBase.Base;


public class DeleteProfile extends Base
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
	@FindBy(xpath="//a[text()='My Profile']")
	private WebElement profile;
	@FindBy(xpath="//a[text()='Delete Profile']")
	private WebElement delete;
	@FindBy(xpath="//button[@class='btn-get-started animate__animated animate__fadeInUp scrollto']")
	private WebElement button;
	
	public DeleteProfile(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	/* public void WebDriverWait(WebDriver driver, Duration timeout) {
		    this(
		        driver,
		        timeout,
		        Duration.ofMillis(DEFAULT_SLEEP_TIMEOUT),
		        Clock.systemDefaultZone(),
		        Sleeper.SYSTEM_SLEEPER);
		  }*/
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
	
	public void clickProfile()
	   {
		JavascriptExecutor executor =(JavascriptExecutor) driver;
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		
		//executor.executeScript("arguments[0].scrollIntoView();",profile);
		executor.executeScript("arguments[0].click();",profile);
		}
	
	
    public void clickDelete()
	  {
       delete.click();
	  }
    public String GetText()
	{
		String txt=button.getText();
		return txt;
	}
	
}
