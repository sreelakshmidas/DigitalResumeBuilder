package com.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.drbBase.Base;

public class UpdateProfile extends Base
{

		WebDriver driver;
		
		
		//xpath for "SIGNUP NOW" button
		@FindBy(xpath="//a[text()='Signup now']")
		private WebElement signUpNow_button;
		
		//xpath for username
		@FindBy(xpath="//input[@name='Username']")
		private WebElement username;
		
		//xpath for password
		@FindBy(xpath="//input[@name='pass']")
		private WebElement password;
		
		//xpath for remember me check box
		@FindBy(xpath="//input[@id='checkbox']")
		private WebElement remember_me;
		
		//xpath for login button
		@FindBy(xpath="//button[text()=' Login ']")
		private WebElement login;
		
		//xpath for my profile button
		@FindBy(xpath="//a[text()='My Profile']")
		private WebElement my_profile;
		
		//xpath for create profile button
		@FindBy(xpath="//button[text()='Create a Profile Now']")
		private WebElement create_profile;
		
		//xpath for name field
		@FindBy(xpath="//input[@id='name']")
		private WebElement name;
		
		//xpath for date of birth
		@FindBy(xpath="//input[@id='date']")
		private WebElement birth;
		
		//xpath for gender
		@FindBy(xpath="//input[@id='gender']")
		private WebElement gender;
		
		//xpath for male
		@FindBy(xpath="//input[@id='gender'][1]")
		private WebElement male;
		
		//xpath for female
		@FindBy(xpath="//input[@id='gender'][2]")
		private WebElement female;
		
		//xpath for email
		@FindBy(xpath="//input[@id='email_id']")
		private WebElement email;
		
		//xpath for phone number
		@FindBy(xpath="//input[@id='phone']")
		private WebElement phone;
		
		
		//xpath for school board
		@FindBy(xpath="//select[@id='edu_title']")
		private WebElement board;
		
		//xpath for percentage scored
		@FindBy(xpath="//input[@id='edu_desc']")
		private WebElement percentage;
		
		//xpath for school name
		@FindBy(xpath="//input[@id='edu_school']")
		private WebElement school;
		
		//xpath for year of pass
		@FindBy(xpath="//input[@id='edu_year']")
		private WebElement pass_year;
		
		//xpath for skills add button
		@FindBy(xpath="//table[@formarrayname='skills']//child::button[1]")
		private WebElement skill_add_button;
		
		//xpath for skills add field
		@FindBy(xpath="//input[@formcontrolname='skills']")
		private WebElement skill_form;
		
		//xpath for languages add button
		@FindBy(xpath="//table[@formarrayname='languages']//child::button")
		private WebElement language_add_button;

		//xpath for languages add field
		@FindBy(xpath="//input[@formcontrolname='languages']")
		private WebElement language_form;
		
		//xpath  for self description
		@FindBy(xpath="//textarea[@id='yourself']")
		private WebElement describe;
		
		//xpath for choose an image
		@FindBy(xpath="//input[@name='image']")
		private WebElement image;
		
		//xpath for create profile button
		@FindBy(xpath="//button[@type='submit']")
		private WebElement create_profile_button;
		
		
		
		
		public UpdateProfile(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
	
	
		public void clickSignUpNow()
		{
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			signUpNow_button.click();
			executor.executeScript("window.scrollBy(0,200)");
		}
	
		public void setUsername(String strUsername)
		{
			username.click();
			username.sendKeys(strUsername);
			
		}
	
		public void setPassword(String strPassword)
		{
			password.click();
			password.sendKeys(strPassword);
			
		}
	
		public void tickRemember()
		{
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();",remember_me);
		}
	
		public void clickLogin()
		{
			 login.click();
		}
	
		public void clickMyProfile()
		{
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();",my_profile);
		}
	
		public void clickCreate()
		{
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();",create_profile);
		}
	
		public void setName(String strName)
		{
			name.click();
			name.clear();
			name.sendKeys(strName);		
		}
	
		public void setDOB(String strDOB)
		{
			birth.click();
			birth.sendKeys(strDOB);
			birth.sendKeys(Keys.RETURN);
		}
	
		public void setGender(String strGender)
		{
			if(strGender.equals("male"))
				male.click();
			if(strGender.equals("female"))
				female.click();
		}
	
		public void setEmail(String strEmail)
		{
			email.click();
			email.clear();
			email.sendKeys(strEmail);
		}
		
		public void setPhonenumber(String strPhonenumber)
		{
			phone.click();
			phone.clear();
			phone.sendKeys(strPhonenumber);
			
		}
		
		public void setBoard(String strBoard)
		{
			board.click();
			board.sendKeys(strBoard);		
		}
		
		public void setPercentage(String strPercentage)
		{
			percentage.click();
			percentage.sendKeys(strPercentage);		
		}
		
		public void setSchool(String strSchool)
		{
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();",school);
			school.sendKeys(strSchool);		
		}
		public void setPassyear(String strPassyear)
		{
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();",pass_year);
			pass_year.sendKeys(strPassyear);		
		}
		
		public void clickSkillAddButton()
		{
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();",skill_add_button);
		}
		public void setSkillForm(String strSkillForm)
		{
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();",skill_form);
			skill_form.sendKeys(strSkillForm);		
		}
		public void clickLanguageAddButton()
		{
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();",language_add_button);
		}
		public void setLanguageForm(String strLanguageForm)
		{
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();",language_form);
			language_form.sendKeys(strLanguageForm);		
		}
		public void setDescription(String strDescription)
		{
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();",describe);
			describe.sendKeys(strDescription);		
		}
		public void setImage(String strImage)
		{
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();",image);
			image.sendKeys(strImage);		
		}
		
		public void clickCreateProfileButton()
		{
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();",create_profile_button);
		}
		

		public String alert() throws InterruptedException
		{
			//switching to alert
			Alert alert=driver.switchTo().alert();
			
			//capturing alert message
			String alertMessage=driver.switchTo().alert().getText();
			
			//displaying alert message
			System.out.println("Alert message:"+alertMessage);
			
			alert.accept();
			
			return alertMessage;
					
		}
		
		
		
}
