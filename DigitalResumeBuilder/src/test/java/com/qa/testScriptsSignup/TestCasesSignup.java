package com.qa.testScriptsSignup;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.drbBase.Base;
import com.qa.pages.SignUp;
import com.qa.utilities.ReadExcelValues;


public class TestCasesSignup extends Base
{
		SignUp signup;
		
		
		@Test(priority=1)
		public void verifySignupNowButton() throws IOException, InterruptedException
		{
			signup=new SignUp(driver);
			
			signup.clickSignUpNow();
			String login_page_text=signup.login_getText();
			Assert.assertEquals(login_page_text,"Signin to continue");
			
			signup.clickOrSignUp();		
			String signup_page_text=signup.signup_getText();
			Assert.assertEquals(signup_page_text,"NEW ACCOUNT?");
		}
		
		
		@Test(priority=2)
		public void validData() throws IOException, InterruptedException
		{
			signup=new SignUp(driver);
			
			signup.clickSignUpNow();
			signup.clickOrSignUp();
			
			String username=ReadExcelValues.getCellData(1, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String phone=ReadExcelValues.getCellData(1, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String mail=ReadExcelValues.getCellData(1, 2,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String password=ReadExcelValues.getCellData(1, 3,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String confirmpassword=ReadExcelValues.getCellData(1, 4,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			
			signup.setUsername(username);
			signup.setPhonenumber(phone);
			signup.setEmail(mail);
			signup.setPassword(password);
			signup.setConfirmPassword(confirmpassword);
			
			signup.clickRegister();
			Thread.sleep(3000);
			
			String alertMessage=signup.alert();
			Assert.assertEquals(alertMessage,"New user added");
		
		}
	
		
		@Test(priority=3)
		public void noData() throws IOException, InterruptedException
		{
			signup=new SignUp(driver);
			
			signup.clickSignUpNow();
			signup.clickOrSignUp();	
			
			signup.clickRegister();
			
			String  user=signup.getUserText();
			Assert.assertEquals(user,"Username is required");
			
			String phone=signup.getPhoneText();
			Assert.assertEquals(phone,"phone number is required");
			
			String email=signup.getEmailText();
			Assert.assertEquals(email,"Email is required");
			
			String pass=signup.getPasswordText();
			Assert.assertEquals(pass,"Password is required");
			
			String confirmpass=signup.getConfirmPasswordText();
			Assert.assertEquals(confirmpass,"Confirm Password is required");
					
			Thread.sleep(3000);
			
		}
		
	
		@Test(priority=4)
		public void invalidUsernameWithLessthan4Characters() throws IOException, InterruptedException
		{
			signup=new SignUp(driver);
			
			signup.clickSignUpNow();
			signup.clickOrSignUp();
			
			String username=ReadExcelValues.getCellData(2, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String phone=ReadExcelValues.getCellData(2, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String mail=ReadExcelValues.getCellData(2, 2,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String password=ReadExcelValues.getCellData(2, 3,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String confirmpassword=ReadExcelValues.getCellData(2, 4,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			
			signup.setUsername(username);
			signup.setPhonenumber(phone);
			signup.setEmail(mail);
			signup.setPassword(password);
			signup.setConfirmPassword(confirmpassword);
			
			signup.clickRegister();
			
			String lessCharacter=signup.getUserValidationMinText();
			Assert.assertEquals(lessCharacter,"Username must be at least 4 characters");
			
			Thread.sleep(3000);
			
		}
	
		@Test(priority=5)
		public void invalidUsernameWithGreaterthan20Characters() throws IOException, InterruptedException
		{
			signup=new SignUp(driver);
			
			signup.clickSignUpNow();
			signup.clickOrSignUp();
			
			String username=ReadExcelValues.getCellData(3, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String phone=ReadExcelValues.getCellData(3, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String mail=ReadExcelValues.getCellData(3, 2,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String password=ReadExcelValues.getCellData(3, 3,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String confirmpassword=ReadExcelValues.getCellData(3, 4,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			
			signup.setUsername(username);
			signup.setPhonenumber(phone);
			signup.setEmail(mail);
			signup.setPassword(password);
			signup.setConfirmPassword(confirmpassword);
			
			signup.clickRegister();
			
			String exceedCharacter=signup.getUserValidationMaxText();
			Assert.assertEquals(exceedCharacter,"Username must not exceed 20 characters");
			
			Thread.sleep(3000);
			
		}
	
		@Test(priority=6)
		public void invalidPhonenumberWithLessthanOrGreaterthan10Numbers() throws IOException, InterruptedException
		{
			signup=new SignUp(driver);
			
			signup.clickSignUpNow();
			signup.clickOrSignUp();
			
			String username=ReadExcelValues.getCellData(4, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String phone=ReadExcelValues.getCellData(4, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String mail=ReadExcelValues.getCellData(4, 2,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String password=ReadExcelValues.getCellData(4, 3,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String confirmpassword=ReadExcelValues.getCellData(4, 4,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			
			signup.setUsername(username);
			signup.setPhonenumber(phone);
			signup.setEmail(mail);
			signup.setPassword(password);
			signup.setConfirmPassword(confirmpassword);
			
			signup.clickRegister();
			
			String phone_text_atleast=signup.getPhoneValidationAtleastText();
			Assert.assertEquals(phone_text_atleast,"phone number be at least 10 Numbers");
			
			Thread.sleep(3000);
			
		}
	
		@Test(priority=7)
		public void invalidPhonenumberWithCombinationOfCharactersNumbersSpecialSymbols() throws IOException, InterruptedException
		{
			signup=new SignUp(driver);
			
			signup.clickSignUpNow();
			signup.clickOrSignUp();
			
			String username=ReadExcelValues.getCellData(5, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String phone=ReadExcelValues.getCellData(5, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String mail=ReadExcelValues.getCellData(5, 2,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String password=ReadExcelValues.getCellData(5, 3,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String confirmpassword=ReadExcelValues.getCellData(5, 4,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			
			signup.setUsername(username);
			signup.setPhonenumber(phone);
			signup.setEmail(mail);
			signup.setPassword(password);
			signup.setConfirmPassword(confirmpassword);
			
			signup.clickRegister();
			Thread.sleep(3000);
			
			String alertMessage=signup.alert();
			Assert.assertEquals(alertMessage,"Invalid Phone number!");
			
			
		}
	
		@Test(priority=8)
		public void invalidEmailAddress() throws IOException, InterruptedException
		{
			signup=new SignUp(driver);
			
			signup.clickSignUpNow();
			signup.clickOrSignUp();
			
			String username=ReadExcelValues.getCellData(6, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String phone=ReadExcelValues.getCellData(6, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String mail=ReadExcelValues.getCellData(6, 2,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String password=ReadExcelValues.getCellData(6, 3,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String confirmpassword=ReadExcelValues.getCellData(6, 4,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			
			signup.setUsername(username);
			signup.setPhonenumber(phone);
			signup.setEmail(mail);
			signup.setPassword(password);
			signup.setConfirmPassword(confirmpassword);
			
			signup.clickRegister();
			
			String invalidEmailTextResult=signup.getInvalidEmailText();
			Assert.assertEquals(invalidEmailTextResult,"Email is invalid");
			
			Thread.sleep(3000);
			
		}
	
		@Test(priority=9)
		public void alreadyExistingEmailAddress() throws IOException, InterruptedException
		{
			signup=new SignUp(driver);
			
			signup.clickSignUpNow();
			signup.clickOrSignUp();
			
			String username=ReadExcelValues.getCellData(7, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String phone=ReadExcelValues.getCellData(7, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String mail=ReadExcelValues.getCellData(7, 2,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String password=ReadExcelValues.getCellData(7, 3,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String confirmpassword=ReadExcelValues.getCellData(7, 4,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			
			signup.setUsername(username);
			signup.setPhonenumber(phone);
			signup.setEmail(mail);
			signup.setPassword(password);
			signup.setConfirmPassword(confirmpassword);
			
			signup.clickRegister();
			Thread.sleep(3000);
			
			String alertMessage=signup.alert();
			Assert.assertEquals(alertMessage,"Email address is already existing!");
			
		}
	
		
		@Test(priority=10)
		public void invalidPassword() throws IOException, InterruptedException
		{
			signup=new SignUp(driver);
			
			signup.clickSignUpNow();
			signup.clickOrSignUp();
			
			String username=ReadExcelValues.getCellData(8, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String phone=ReadExcelValues.getCellData(8, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String mail=ReadExcelValues.getCellData(8, 2,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String password=ReadExcelValues.getCellData(8, 3,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String confirmpassword=ReadExcelValues.getCellData(8, 4,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			
			signup.setUsername(username);
			signup.setPhonenumber(phone);
			signup.setEmail(mail);
			signup.setPassword(password);
			signup.setConfirmPassword(confirmpassword);
			
			signup.clickRegister();
			
			String invalidPasswordTextResult1=signup.getInvalidPasswordTextSixCharacter();
			Assert.assertEquals(invalidPasswordTextResult1,"Password must be at least 6 characters");
			
			String invalidPasswordTextResult2=signup.getInvalidPasswordTextCombinations();
			Assert.assertEquals(invalidPasswordTextResult2,"Password must contain lowercase ,Uppercase ,Numbers and atleast one special characters");
					
			Thread.sleep(3000);
			
		}
	
		@Test(priority=11)
		public void wrongConfirmPassword() throws IOException, InterruptedException
		{
			signup=new SignUp(driver);
			
			signup.clickSignUpNow();
			signup.clickOrSignUp();
			
			String username=ReadExcelValues.getCellData(9, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String phone=ReadExcelValues.getCellData(9, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String mail=ReadExcelValues.getCellData(9, 2,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String password=ReadExcelValues.getCellData(9, 3,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String confirmpassword=ReadExcelValues.getCellData(9, 4,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			
			signup.setUsername(username);
			signup.setPhonenumber(phone);
			signup.setEmail(mail);
			signup.setPassword(password);
			signup.setConfirmPassword(confirmpassword);
			
			signup.clickRegister();
			
			String alertMessage=signup.alert();
			Assert.assertEquals(alertMessage,"It does not match to actual password!");
			
			Thread.sleep(3000);
			
		}
	
		@Test(priority=12)
		public void incompleteConfirmPassword() throws IOException, InterruptedException
		{
			signup=new SignUp(driver);
			
			signup.clickSignUpNow();
			signup.clickOrSignUp();
			
			String username=ReadExcelValues.getCellData(10, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String phone=ReadExcelValues.getCellData(10, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String mail=ReadExcelValues.getCellData(10, 2,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String password=ReadExcelValues.getCellData(10, 3,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			String confirmpassword=ReadExcelValues.getCellData(10, 4,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",0);
			
			signup.setUsername(username);
			signup.setPhonenumber(phone);
			signup.setEmail(mail);
			signup.setPassword(password);
			signup.setConfirmPassword(confirmpassword);
			
			signup.clickRegister();
			
			String alertMessage=signup.alert();
			Assert.assertEquals(alertMessage,"It does not match to actual password!");
			
			Thread.sleep(3000);
			
		}
	
	
}
