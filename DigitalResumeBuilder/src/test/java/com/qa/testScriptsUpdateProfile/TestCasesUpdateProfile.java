package com.qa.testScriptsUpdateProfile;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.drbBase.Base;
import com.qa.pages.UpdateProfile;
import com.qa.utilities.ReadExcelValues;

public class TestCasesUpdateProfile extends Base
{
		UpdateProfile update;
		
		
		
		@Test(priority=1)
		public void createProfileWithMandatoryDetails() throws IOException, InterruptedException
		{
			update=new UpdateProfile(driver);
			
			update.clickSignUpNow();
			

			String username=ReadExcelValues.getCellData(1, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",1);
			String password=ReadExcelValues.getCellData(1, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",1);
			update.setUsername(username);
			update.setPassword(password);
			
			update.tickRemember();
			update.clickLogin();
			Thread.sleep(3000);
			update.clickMyProfile();
			Thread.sleep(3000);
			update.clickCreate();
			
			String name=ReadExcelValues.getCellData(0, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",2);
			String dob=ReadExcelValues.getCellData(1, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",2);
			String gender=ReadExcelValues.getCellData(2, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",2);
			String email=ReadExcelValues.getCellData(3, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",2);
			String phone=ReadExcelValues.getCellData(4, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",2);
			String board=ReadExcelValues.getCellData(5, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",2);
			String percentage=ReadExcelValues.getCellData(6, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",2);
			String school=ReadExcelValues.getCellData(7,1,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",2);
			String pass_year=ReadExcelValues.getCellData(8, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",2);
			String skills=ReadExcelValues.getCellData(9, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",2);
			String language=ReadExcelValues.getCellData(10, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",2);
			String describe=ReadExcelValues.getCellData(11, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",2);
			String image=ReadExcelValues.getCellData(12, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\user_credentials.xlsx",2);
			
			update.setName(name);
			update.setDOB(dob);
			Thread.sleep(3000);
			update.setGender(gender);
			Thread.sleep(2000);
			update.setEmail(email);
			update.setPhonenumber(phone);
			Thread.sleep(2000);
			update.setBoard(board);
			update.setPercentage(percentage);
			Thread.sleep(2000);
			update.setSchool(school);
			update.setPassyear(pass_year);
			update.clickSkillAddButton();
			update.setSkillForm(skills);
			Thread.sleep(5000);
			update.clickLanguageAddButton();
			update.setLanguageForm(language);
			Thread.sleep(5000);
			update.setDescription(describe);
			update.setImage(image);
			update.clickCreateProfileButton();
			Thread.sleep(5000);
			
			String alertMessage=update.alert();
			Assert.assertEquals(alertMessage,"Profile created");
			
			Thread.sleep(3000);
			
			
			
			
			
			
			
			
			
		}

	
	
}
