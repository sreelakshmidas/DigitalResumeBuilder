package com.qa.testScriptsEditProfile;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.drbBase.Base;
import com.qa.pages.CreateProfile;
import com.qa.pages.DeleteProfile;
import com.qa.pages.EditProfile;
import com.qa.pages.LoginForCreateProfile;
import com.qa.utilities.ReadExcelValues;

public class TestCasesEditProfile extends Base
{
		EditProfile update;
		LoginForCreateProfile objLogin;
		CreateProfile dcrtprf;	
		DeleteProfile delete;
		EditProfile edit;
		
		  
		public void login() throws IOException, InterruptedException
		{
		  objLogin.clickSignUp();
		  String userName=ReadExcelValues.getCellData(1, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",0);
		  String pass=ReadExcelValues.getCellData(1, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",0);
		  objLogin.setUserName(userName);
		  objLogin.setPassword(pass);
		  objLogin.clickRememberMe();
		  objLogin.loginClick();
		}
		
		@Test(priority=1)
		public void createProfileWithMandatoryDetails() throws IOException, InterruptedException
		{
			dcrtprf   = new CreateProfile(driver);
			objLogin  = new LoginForCreateProfile(driver);	
			
			//JavascriptExecutor je= (JavascriptExecutor)driver;
		
   
		    String name=ReadExcelValues.getCellData(1, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
		    String dob=ReadExcelValues.getCellData(1, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
		    String gender=ReadExcelValues.getCellData(1, 2,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
		    String email=ReadExcelValues.getCellData(1, 3,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
		    String phone=ReadExcelValues.getCellData(1, 4,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
		    String schoolstrm=ReadExcelValues.getCellData(1, 5,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
		    String percentage=ReadExcelValues.getCellData(1, 6,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
		    String school=ReadExcelValues.getCellData(1, 7,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
		    String year=ReadExcelValues.getCellData(1, 8,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
		    String skills=ReadExcelValues.getCellData(1, 26,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
		    String lang=ReadExcelValues.getCellData(1, 27,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
		    String describe=ReadExcelValues.getCellData(1, 30,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
		    String img=System.getProperty("user.dir")+"\\"+ReadExcelValues.getCellData(1, 32,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);  
		    login();
		    
		      Thread.sleep(3000);
		      dcrtprf.clickMyProfile();
		      dcrtprf.clickCrtProfile();
		      Thread.sleep(300);
		      dcrtprf.setName(name);
		      dcrtprf.setDob(dob);
		      dcrtprf.clickGender(gender);
		      dcrtprf.setEmail(email);
		      dcrtprf.setPhone(phone);
		      dcrtprf.setSchoolStream(schoolstrm);
		      Thread.sleep(300);
		      dcrtprf. setPercent(percentage);
		      dcrtprf.setSchool(school);
		      dcrtprf.setYear(year);
		      Thread.sleep(300);
		      dcrtprf.setSkills(skills);
		      Thread.sleep(300);
		      dcrtprf.setLanguage(lang);
		      Thread.sleep(300);
		      dcrtprf.setDescribe(describe);
		      dcrtprf.setImage(img);
		      dcrtprf.acceptCheck();
		      String actual=dcrtprf.clickCreateProfile();
		      String expected="Profile created";
		      Assert.assertEquals(actual,expected);
		      		
			
		}
		
		@Test(priority=2)
		public void futureDOBverification() throws IOException, InterruptedException
		{
			dcrtprf   = new CreateProfile(driver);
			objLogin  = new LoginForCreateProfile(driver);	
			delete=new DeleteProfile(driver);
			edit = new EditProfile(driver);
			
			login();
			JavascriptExecutor je= (JavascriptExecutor)driver;
			je.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(6000);
			delete.clickProfile();
			Thread.sleep(6000); 
			edit.click_edit_button();
		
			String dob=ReadExcelValues.getCellData(1, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",2);
			dcrtprf.setDob(dob);
			
			je.executeScript("window.scrollBy(0,-500)");
			edit.click_updateprofile_button();
			Thread.sleep(6000); 
			
			String alertMessage=edit.alert();
			Assert.assertEquals(alertMessage,"Invalid date of birth");
			
					
		}

		@Test(priority=3)
		public void chooseFileVerification() throws IOException, InterruptedException
		{
			
			dcrtprf   = new CreateProfile(driver);
			objLogin  = new LoginForCreateProfile(driver);	
			delete=new DeleteProfile(driver);
			edit = new EditProfile(driver);
			
			login();
			JavascriptExecutor je= (JavascriptExecutor)driver;
			je.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(6000);
			delete.clickProfile();
			Thread.sleep(6000); 
			edit.click_edit_button();
			
			
			String img=System.getProperty("user.dir")+"\\"+ReadExcelValues.getCellData(12, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",2);
			dcrtprf.setImage(img);
			
			je.executeScript("window.scrollBy(0,-500)");
			edit.click_updateprofile_button();
			Thread.sleep(6000); 
			
			String alertMessage=edit.alert();
			Assert.assertEquals(alertMessage,"Upload only image file");
					
		}
		
		@Test(priority=4)
		public void changeNameVerification() throws IOException, InterruptedException
		{
			
			dcrtprf   = new CreateProfile(driver);
			objLogin  = new LoginForCreateProfile(driver);	
			delete=new DeleteProfile(driver);
			edit = new EditProfile(driver);
			
			login();
			JavascriptExecutor je= (JavascriptExecutor)driver;
			je.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(6000);
			delete.clickProfile();
			Thread.sleep(6000); 
			edit.click_edit_button();
			
			String name=ReadExcelValues.getCellData(0, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",2);
			dcrtprf.setName(name);
			Thread.sleep(6000); 
			
			 
			je.executeScript("window.scrollBy(0,-500)");
			edit.click_updateprofile_button();
			Thread.sleep(6000); 
			try {
			String alertMessage=edit.alert();
			Assert.assertEquals(alertMessage,"Profile updated");	
			}
			catch(Exception e) 
			{
				
				driver.navigate().back();
				dcrtprf.clickDelete();//delete click
				Thread.sleep(1000); 
				driver.switchTo().alert().accept();
				String alertMessage = "Error";
				Assert.assertEquals(alertMessage,"Profile updated");
				
			}
			 
		}
		
	
}
