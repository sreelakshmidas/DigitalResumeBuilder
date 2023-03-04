package com.qa.testScriptsCreateProfile;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.drbBase.Base;
import com.qa.pages.CreateProfile;
import com.qa.pages.LoginForCreateProfile;
import com.qa.utilities.ReadExcelValues;

public class TestCasesCreateProfile extends Base
{
	LoginForCreateProfile objLogin,objLogin1,objLogin2,objLogin3,objLogin4;
    CreateProfile dcrtprf;	
    @BeforeMethod
    public void init()
    {    
    	dcrtprf   = new CreateProfile(driver);
    	objLogin  = new LoginForCreateProfile(driver);	
    	objLogin1 = new LoginForCreateProfile(driver);
    	objLogin2 = new LoginForCreateProfile(driver);
    	objLogin3 = new LoginForCreateProfile(driver);
    	objLogin4 = new LoginForCreateProfile(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
    }
  
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
public void login1() throws IOException, InterruptedException
{
objLogin1.clickSignUp();
String userName=ReadExcelValues.getCellData(2, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",0);
String pass=ReadExcelValues.getCellData(2, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",0);
objLogin1.setUserName(userName);
objLogin1.setPassword(pass);
objLogin1.clickRememberMe();
objLogin1.loginClick();
}
public void login2() throws IOException, InterruptedException
{

objLogin2.clickSignUp();
String userName=ReadExcelValues.getCellData(3, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",0);
String pass=ReadExcelValues.getCellData(3, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",0);
objLogin2.setUserName(userName);
objLogin2.setPassword(pass);
objLogin2.clickRememberMe();
objLogin2.loginClick();
}
public void login3() throws IOException, InterruptedException
{

objLogin3.clickSignUp();
String userName=ReadExcelValues.getCellData(3, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",0);
String pass=ReadExcelValues.getCellData(3, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",0);
objLogin3.setUserName(userName);
objLogin3.setPassword(pass);
objLogin3.clickRememberMe();
objLogin3.loginClick();
}
public void login4() throws IOException, InterruptedException
{

objLogin4.clickSignUp();
String userName=ReadExcelValues.getCellData(4, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",0);
String pass=ReadExcelValues.getCellData(4, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",0);
objLogin4.setUserName(userName);
objLogin4.setPassword(pass);
objLogin4.clickRememberMe();
objLogin4.loginClick();
}

@Test(priority=1)
public void validCreateProfile() throws IOException, InterruptedException
{

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
  
  JavascriptExecutor je= (JavascriptExecutor)driver;
  je.executeScript("window.scrollBy(0,-500)");
  Thread.sleep(6000);
   dcrtprf.clickdprofile();//myprofile
   Thread.sleep(6000);
   dcrtprf.clickDelete();//delete click
  Thread.sleep(1000);  

  String alertMessage=dcrtprf.alert();
  Assert.assertEquals(alertMessage,"Are you sure ,you want to delete your profile?");
  
 
 
}

@Test(priority=2)
public void validCreateProfile_option() throws IOException, InterruptedException
{
String name=ReadExcelValues.getCellData(2, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String dob=ReadExcelValues.getCellData(2, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String gender=ReadExcelValues.getCellData(2,2,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String email=ReadExcelValues.getCellData(2, 3,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String phone=ReadExcelValues.getCellData(2, 4,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String schoolstrm=ReadExcelValues.getCellData(2, 5,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String percentage=ReadExcelValues.getCellData(2, 6,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String school=ReadExcelValues.getCellData(2, 7,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String year=ReadExcelValues.getCellData(2, 8,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String higersec=ReadExcelValues.getCellData(2, 9,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String higersecPercentage=ReadExcelValues.getCellData(2, 10,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String higersecSchool=ReadExcelValues.getCellData(2,11,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String higersecYear=ReadExcelValues.getCellData(2, 12,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String graduation=ReadExcelValues.getCellData(2, 13,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String gradStream=ReadExcelValues.getCellData(2, 14,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String gradPercentage=ReadExcelValues.getCellData(2,15,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String gradInstitute=ReadExcelValues.getCellData(2, 16,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String gradYear=ReadExcelValues.getCellData(2, 17,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String project=ReadExcelValues.getCellData(2, 18,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String projectDesc=ReadExcelValues.getCellData(2, 19,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
//String additionalCourse=ReadExcelValues.getCellData(2, 20,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
//String courseName=ReadExcelValues.getCellData(2, 21,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
//String coursePercentage=ReadExcelValues.getCellData(2, 22,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
//String jobTitle=ReadExcelValues.getCellData(2, 23,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
//String from=ReadExcelValues.getCellData(2, 24,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
//String to=ReadExcelValues.getCellData(2, 25,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String skills=ReadExcelValues.getCellData(2, 26,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String lang=ReadExcelValues.getCellData(2, 27,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
//String programLang=ReadExcelValues.getCellData(2, 28,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String achievements=ReadExcelValues.getCellData(2, 29,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String describe=ReadExcelValues.getCellData(2, 30,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
  String img=System.getProperty("user.dir")+"\\"+ReadExcelValues.getCellData(2, 32,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
  
  login1();
  dcrtprf.clickprofile();
  Thread.sleep(3000);
  dcrtprf.clickcrprofile();
  dcrtprf.setName(name);
  dcrtprf.setDob(dob);
  dcrtprf.clickGender(gender);
  dcrtprf.setEmail(email);
  dcrtprf.setPhone(phone);
  dcrtprf.setSchoolStream(schoolstrm);
  dcrtprf.setPercent(percentage);
  dcrtprf.setSchool(school);
  dcrtprf.setYear(year);
  Thread.sleep(3000);
  dcrtprf.higherSecondaryStream(higersec);
  dcrtprf.setHighersecPercentage(higersecPercentage);
  dcrtprf.setHighersecSchool(higersecSchool);
  dcrtprf.setHighersecYear(higersecYear);
  dcrtprf.setGraduation(graduation);
  dcrtprf.setGraduationStream(gradStream);
  dcrtprf.setGraduationPercentage(gradPercentage);
  dcrtprf.setGraduationInstitute(gradInstitute);
  dcrtprf.setGraduationYear(gradYear);
  dcrtprf.setProjectDetails(project, projectDesc);
  Thread.sleep(300); 
  dcrtprf.setSkills(skills);
  dcrtprf.setLanguage(lang);
  dcrtprf.setAchievements(achievements);
  dcrtprf.setDescribe(describe);
  dcrtprf.setImage(img);
  dcrtprf.acceptCheck();
  String actual=dcrtprf.clickCreateProfile();
 String expected="Profile created";
 Assert.assertEquals(actual,expected);
 
 JavascriptExecutor je= (JavascriptExecutor)driver;
 je.executeScript("window.scrollBy(0,-500)");
 Thread.sleep(6000);
  dcrtprf.clickdprofile();//myprofile
  Thread.sleep(6000);
  dcrtprf.clickDelete();//delete click
 Thread.sleep(1000);  

 String alertMessage=dcrtprf.alert();
 Assert.assertEquals(alertMessage,"Are you sure ,you want to delete your profile?");
 

 
 
 Thread.sleep(3000);
}
@Test(priority=3)
public void CreateProfile_name() throws IOException, InterruptedException
{
String name=ReadExcelValues.getCellData(3, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String dob=ReadExcelValues.getCellData(3, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String gender=ReadExcelValues.getCellData(3, 2,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String email=ReadExcelValues.getCellData(3, 3,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String phone=ReadExcelValues.getCellData(3, 4,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String schoolstrm=ReadExcelValues.getCellData(3, 5,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String percentage=ReadExcelValues.getCellData(3, 6,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String school=ReadExcelValues.getCellData(3, 7,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String year=ReadExcelValues.getCellData(3, 8,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String skills=ReadExcelValues.getCellData(3, 26,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String lang=ReadExcelValues.getCellData(3, 27,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String describe=ReadExcelValues.getCellData(3, 30,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String img=System.getProperty("user.dir")+"\\"+ReadExcelValues.getCellData(3, 32,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);	
login2();
dcrtprf.clickprofile();
	dcrtprf.clickcrprofile();
	Thread.sleep(3000);
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
	dcrtprf.setSkills(skills);
	dcrtprf.setLanguage(lang);
	dcrtprf.setDescribe(describe);
	dcrtprf.setImage(img);
	dcrtprf.acceptCheck();
	boolean actual=dcrtprf.clickcreate();
	Assert.assertEquals(true,actual);

/*	dcrtprf.clickMyProfileButton();
	dcrtprf.clickDelete();
	String alertMessage=dcrtprf.alert();
	Assert.assertEquals(alertMessage,"Are you sure ,you want to delete your profile?");
*/
	Thread.sleep(1000);	 
}
@Test(priority=4)
public void CreateProfile_futuredob() throws IOException, InterruptedException
{
String name=ReadExcelValues.getCellData(4, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String dob=ReadExcelValues.getCellData(4, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String gender=ReadExcelValues.getCellData(4, 2,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String email=ReadExcelValues.getCellData(4, 3,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String phone=ReadExcelValues.getCellData(4, 4,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String schoolstrm=ReadExcelValues.getCellData(4, 5,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String percentage=ReadExcelValues.getCellData(4, 6,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String school=ReadExcelValues.getCellData(4, 7,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String year=ReadExcelValues.getCellData(4, 8,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String skills=ReadExcelValues.getCellData(4, 26,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String lang=ReadExcelValues.getCellData(4, 27,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String describe=ReadExcelValues.getCellData(4, 30,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String img=System.getProperty("user.dir")+"\\"+ReadExcelValues.getCellData(4, 32,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);	
login3();
dcrtprf.clickprofile();
	dcrtprf.clickcrprofile();
	Thread.sleep(3000);
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
	dcrtprf.setSkills(skills);
	dcrtprf.setLanguage(lang);
	dcrtprf.setDescribe(describe);
	dcrtprf.setImage(img);
	dcrtprf.acceptCheck();
	boolean actual=dcrtprf.clickcreate();
Assert.assertEquals(true,actual);
Thread.sleep(1000);	 
}
@Test(priority=5)
public void CreateProfile_invalidschoolname() throws IOException, InterruptedException
{
String name=ReadExcelValues.getCellData(5, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String dob=ReadExcelValues.getCellData(5, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String gender=ReadExcelValues.getCellData(5, 2,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String email=ReadExcelValues.getCellData(5, 3,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String phone=ReadExcelValues.getCellData(5, 4,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String schoolstrm=ReadExcelValues.getCellData(5, 5,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String percentage=ReadExcelValues.getCellData(5, 6,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String school=ReadExcelValues.getCellData(5, 7,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String year=ReadExcelValues.getCellData(5, 8,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String skills=ReadExcelValues.getCellData(5, 26,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String lang=ReadExcelValues.getCellData(5, 27,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String describe=ReadExcelValues.getCellData(5, 30,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);
String img=System.getProperty("user.dir")+"\\"+ReadExcelValues.getCellData(5, 32,System.getProperty("user.dir")+"\\src\\main\\resources\\Excelutill.xlsx",1);	
login4();
dcrtprf.clickprofile();
	dcrtprf.clickcrprofile();
	Thread.sleep(3000);
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
	dcrtprf.setSkills(skills);
	dcrtprf.setLanguage(lang);
	dcrtprf.setDescribe(describe);
	dcrtprf.setImage(img);
	dcrtprf.acceptCheck();
	boolean actual=dcrtprf.clickcreate();
Assert.assertEquals(true,actual);
Thread.sleep(1000);	 
}
}
