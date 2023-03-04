package com.qa.testScriptsDeleteDownload;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import org.testng.annotations.Test;

import com.qa.drbBase.Base;
import com.qa.pages.CreateProfile;
import com.qa.pages.DeleteProfile;
import com.qa.pages.DownloadResume;
import com.qa.pages.LoginForCreateProfile;
//import com.qa.pages.LoginForCreateProfile;
import com.qa.pages.SendWeblink;
import com.qa.pages.Templates;
import com.qa.utilities.ReadExcelValues;

public class TestCasesDeleteDownload extends  Base
{
	 Templates template;
	  SendWeblink send;
	  DownloadResume download;
	  DeleteProfile delete;
	 LoginForCreateProfile objLogin;
	  CreateProfile dcrtprf;	
	
	  
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
		public  void TemplatesVerification() throws IOException, InterruptedException{
			
			template=new Templates(driver);
			dcrtprf   = new CreateProfile(driver);
			objLogin  = new LoginForCreateProfile(driver);	
			
			JavascriptExecutor je= (JavascriptExecutor)driver;
		
   
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
		      
		    
		     
		//	je.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(6000);
		   	Thread.sleep(2000);	
		    template.clickTemplate();	     
		   	Thread.sleep(2000);	
		   	template.clickTemplate3();
		    Thread.sleep(5000);	
		 	driver.navigate().back();
		 	je.executeScript("window.scrollBy(0,150)"); 
		    Thread.sleep(4000);	
		    template.clickTemplate2();
		    Thread.sleep(5000);	
		    driver.navigate().back();
		    je.executeScript("window.scrollBy(0,120)"); 
		    Thread.sleep(5000);
		    template.clickTemplate1();
		    Thread.sleep(6000);		
		    String temp1=template.GetText();
		    Assert.assertEquals(temp1,"HELLO EVERYBODY, I AM" );		
		}


		  @Test(priority=2)  
		  public  void DownloadResumeVerification() throws IOException, InterruptedException
		{
			download=new DownloadResume(driver);
			objLogin  = new LoginForCreateProfile(driver);	
			template=new Templates(driver);
			
			login();
		 	Thread.sleep(2000);	
		    template.clickTemplate();	
		    Thread.sleep(5000);
		    template.clickTemplate1();
		    JavascriptExecutor je= (JavascriptExecutor)driver;
		    je.executeScript("window.scrollBy(0,2)");
		    Thread.sleep(2000);
		    download.clickDownland();
		    Thread.sleep(2000);
		    String alert= driver.switchTo().alert().getText();
		  	Assert.assertEquals(alert, "Download Started");
		    driver.switchTo().alert().dismiss();
		    Thread.sleep(4000);			
	 	    
		}
		

	   	  @Test(priority=3)
		  public  void SendWeblinkVerification() throws IOException, InterruptedException{
			send=new SendWeblink(driver);	
			objLogin  = new LoginForCreateProfile(driver);	
			template=new Templates(driver);
			
			login();
		 	Thread.sleep(2000);	
		    template.clickTemplate();	
		    Thread.sleep(5000);
		    template.clickTemplate1();
			JavascriptExecutor je= (JavascriptExecutor)driver;
		    je.executeScript("window.scrollBy(0,5)");
			Thread.sleep(2000);	
		    send.clickWeblink();
	
			String alertMessage=send.alert();
		   	Assert.assertEquals(alertMessage,"Link copied");
	   	  }
	

		@Test(priority=4)
		  public  void DeleteProfileVerification() throws IOException, InterruptedException{
			delete=new DeleteProfile(driver);
			objLogin  = new LoginForCreateProfile(driver);	
			
			login();
			JavascriptExecutor je= (JavascriptExecutor)driver;
			je.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(6000);
			delete.clickProfile();
			Thread.sleep(6000);
		    delete.clickDelete();
			Thread.sleep(3000);
		    driver.switchTo().alert().accept();
		    driver.navigate().back();
		    Thread.sleep(3000);
		    String del=delete.GetText();
		    Assert.assertEquals(del,"Create a Profile Now" );
		    
         }	
}
