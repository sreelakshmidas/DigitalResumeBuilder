package com.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.drbBase.Base;

public class SignUp extends Base
{
		WebDriver driver;
		
		//xpath for "SIGNUP NOW" button
		@FindBy(xpath="//a[text()='Signup now']")
		private WebElement signUpNow_button;
		
		//xpath for "or sign up" button
		@FindBy(xpath="//a[text()='or sign up ']")
		private WebElement orSignUp_button;
		
		//xpath for username field
		@FindBy(xpath="//input[@placeholder='Username']")
		private WebElement username;
		
		//xpath for phone number field
		@FindBy(xpath="//input[@placeholder='Phone Number']")
		private WebElement phone_number;
		
		//xpath for email field
		@FindBy(xpath="//input[@placeholder='Mail']")
		private WebElement email;
		
		//xpath for password field
		@FindBy(xpath="//input[@placeholder='Password']")
		private WebElement password;
		
		//xpath for confirm password field
		@FindBy(xpath="//input[@placeholder='Confirm Password']")
		private WebElement confirm_password;
		
		//xpath for username required message
		@FindBy(xpath="//div[text()='Username is required']")
		private WebElement username_required;
		
		
		//xpath for phone number required message
		@FindBy(xpath="//div[text()='phone number is required']")
		private WebElement phonenumber_required;
				
		
		//xpath for email required message
		@FindBy(xpath="//div[text()='Email is required']")
		private WebElement email_required;
				
		
		//xpath for password required message
		@FindBy(xpath="//div[text()='Password is required']")
		private WebElement password_required;
		
		//xpath for confirm password required message
		@FindBy(xpath="//div[text()=' Confirm Password is required ']")
		private WebElement confirmPassword_required;
						
		//xpath for username must be at least 4 characters
		@FindBy(xpath=" //div[text()=' Username must be at least 4 characters ']")
		private WebElement user_min_char;
		
		//xpath for username with more than 20 characters
		@FindBy(xpath="//div[text()=' Username must not exceed 20 characters ']")
		private WebElement user_max_char;
		
		//xpath for phone number be atleast 10 numbers mesage
		@FindBy(xpath="//div[text()=' phone number be at least 10 Numbers ']")
		private WebElement atleast_phonenumber;
		
		//xpath for email is invalid
		@FindBy(xpath="//div[text()='Email is invalid']")
		private WebElement invalid_email;
		
		//xpath for password must be atleast 6 characters 
		@FindBy(xpath="//div[text()=' Password must be at least 6 characters ' ]")
		private WebElement invalid_password_sixCharacters;
		
		//xpath for password must contain numbers,characters,symbols
		@FindBy(xpath="//div[text()=' Password must contain lowercase ,Uppercase ,Numbers and atleast one special characters ']")
		private WebElement invalid_password_combinations;
		
		
		
		
		//xpath for "REGISTER" button
		@FindBy(xpath="//span[text()='Register']")
		private WebElement register;
		
		public SignUp(WebDriver driver)
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
	
		public void clickOrSignUp() throws InterruptedException
		{
			Thread.sleep(2000);
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			//executor.executeScript("window.scrollBy(0,200)");
			executor.executeScript("arguments[0].click();",orSignUp_button);
		}
	
		public void setUsername(String strUsername)
		{
			username.click();
			username.sendKeys(strUsername);
			
		}
		
		public void setPhonenumber(String strPhonenumber)
		{
			phone_number.click();
			phone_number.sendKeys(strPhonenumber);
			
		}
		
		public void setEmail(String strEmail)
		{
			email.click();
			email.sendKeys(strEmail);
		}
		
		public void setPassword(String strPassword)
		{
			password.click();
			password.sendKeys(strPassword);
			
		}
		
		public void setConfirmPassword(String strConfirmPassword)
		{
			confirm_password.click();
			confirm_password.sendKeys(strConfirmPassword);
			
		}
	
		public String getUserText()
		{
			String homeText=username_required.getText();
			return homeText;
			
		}
		
		public String getPhoneText()
		{
			String homeText=phonenumber_required.getText();
			return homeText;
			
		}
		
		public String getEmailText()
		{
			String homeText=email_required.getText();
			return homeText;
			
		}
		
		public String getPasswordText()
		{
			String homeText=password_required.getText();
			return homeText;
			
		}
		
		
		public String getConfirmPasswordText()
		{
			String homeText=confirmPassword_required.getText();
			return homeText;
			
		}
		
		public String getUserValidationMinText()
		{
			String min_username=user_min_char.getText();
			return  min_username;	
		}
		
		public String getUserValidationMaxText()
		{
			String max_username=user_max_char.getText();
			return  max_username;	
		}
		
		public String getPhoneValidationAtleastText()
		{
			String min_phonenumber=atleast_phonenumber.getText();
			return min_phonenumber;
		}
		
		public String getInvalidEmailText()
		{
			String email_invalid=invalid_email.getText();
			return email_invalid;
		}
		
		public String getInvalidPasswordTextSixCharacter()
		{
			String password_invalid_six= invalid_password_sixCharacters.getText();
			return password_invalid_six;
		}
		
		public String getInvalidPasswordTextCombinations()
		{
			String password_invalid_combo=invalid_password_combinations.getText();
			return password_invalid_combo;
			
		}
		
		
		
		
		
		public void clickRegister()
		{
			JavascriptExecutor executor=(JavascriptExecutor)driver;
			
			executor.executeScript("arguments[0].click();",register);
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
