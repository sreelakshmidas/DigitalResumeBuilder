package com.qa.testScriptsLogin;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.drbBase.Base;
import com.qa.pages.Login;
import com.qa.utilities.ReadExcelValues;

public class TestCasesLogin extends Base
{

	Login ObjLogin;

	@Test(priority = 1)
	public void Loginverification() throws InterruptedException, IOException {

		ObjLogin = new Login(driver);

		ObjLogin.clickLogin();
		String logintext = ObjLogin.signuptext();
		Assert.assertEquals(logintext,"Signin to continue");
		String username = ReadExcelValues.getCellData(0,0,System.getProperty("user.dir") + "\\src\\main\\resources\\New Microsoft Office Excel Worksheet.xlsx",0);
		String password = ReadExcelValues.getCellData(0,1,System.getProperty("user.dir") + "\\src\\main\\resources\\New Microsoft Office Excel Worksheet.xlsx",0);

		ObjLogin.setUsername(username);
		ObjLogin.setPassword(password);
		ObjLogin.clickRememberme();
		ObjLogin.clicksubmit();
		ObjLogin.clicklogout();
		String hometext = ObjLogin.home_text();
		Assert.assertEquals(hometext,"HOME");
		Thread.sleep(5000);
	}

	@Test(priority = 2)
	public void Invalidusernamevalidpassword() throws InterruptedException, IOException {

		ObjLogin = new Login(driver);
		
		ObjLogin.clickLogin();
		String logintext = ObjLogin.signuptext();
		Assert.assertEquals(logintext,"Signin to continue");
		
		String username = ReadExcelValues.getCellData(1,0,System.getProperty("user.dir") + "\\src\\main\\resources\\New Microsoft Office Excel Worksheet.xlsx",0);
		String password = ReadExcelValues.getCellData(1,1,System.getProperty("user.dir") + "\\src\\main\\resources\\New Microsoft Office Excel Worksheet.xlsx",0);

		ObjLogin.setUsername(username);
		ObjLogin.setPassword(password);
		ObjLogin.clickRememberme();
		ObjLogin.clicksubmit();
		String alertMessage=ObjLogin.alert();
		Assert.assertEquals(alertMessage,"Invalid username");
		ObjLogin.clicklogout();
		String hometext = ObjLogin.home_text();
		Assert.assertEquals(hometext,"HOME");
		Thread.sleep(5000);
	}

	@Test(priority = 3)
	public void Invalidpasswordvalidusername() throws InterruptedException, IOException {

		ObjLogin = new Login(driver);

		ObjLogin.clickLogin();
		String logintext = ObjLogin.signuptext();
		Assert.assertEquals(logintext,"Signin to continue");
		String username = ReadExcelValues.getCellData(2,0,System.getProperty("user.dir") + "\\src\\main\\resources\\New Microsoft Office Excel Worksheet.xlsx",0);
		String password = ReadExcelValues.getCellData(2,1,System.getProperty("user.dir") + "\\src\\main\\resources\\New Microsoft Office Excel Worksheet.xlsx",0);

		ObjLogin.setUsername(username);
		ObjLogin.setPassword(password);
		ObjLogin.clickRememberme();
		ObjLogin.clicksubmit();
		String alertMessage=ObjLogin.alert();
		Assert.assertEquals(alertMessage,"Invalid password");
		ObjLogin.clicklogout();
		String hometext = ObjLogin.home_text();
		Assert.assertEquals(hometext,"HOME");
		Thread.sleep(5000);
	}

	@Test(priority = 4)
	public void Invalidusernameinvalidpassword() throws InterruptedException, IOException {

		ObjLogin = new Login(driver);

		ObjLogin.clickLogin();
		String logintext = ObjLogin.signuptext();
		Assert.assertEquals(logintext,"Signin to continue");
		String username = ReadExcelValues.getCellData(3, 0,
				System.getProperty("user.dir") + "\\src\\main\\resources\\New Microsoft Office Excel Worksheet.xlsx",
				0);
		String password = ReadExcelValues.getCellData(3, 1,
				System.getProperty("user.dir") + "\\src\\main\\resources\\New Microsoft Office Excel Worksheet.xlsx",
				0);

		ObjLogin.setUsername(username);
		ObjLogin.setPassword(password);
		ObjLogin.clickRememberme();
		ObjLogin.clicksubmit();
		String alertMessage=ObjLogin.alert();
		Assert.assertEquals(alertMessage,"Invalid username and invalid password");
		ObjLogin.clicklogout();
		String hometext = ObjLogin.home_text();
		Assert.assertEquals(hometext,"HOME");
		Thread.sleep(5000);

	}

	@Test(priority = 5)
	public void nullusernamevalidpassword() throws InterruptedException, IOException {

		ObjLogin = new Login(driver);

		ObjLogin.clickLogin();
		String logintext = ObjLogin.signuptext();
		Assert.assertEquals(logintext,"Signin to continue");
				
		ObjLogin.clicksubmit();
		String alertMessage=ObjLogin.alert();
		Assert.assertEquals(alertMessage,"please enter username");
		ObjLogin.clicklogout();
		String hometext = ObjLogin.home_text();
		Assert.assertEquals(hometext,"HOME");
		Thread.sleep(5000);

	}

	@Test(priority = 6)
	public void nullpasswordvalidusername() throws InterruptedException, IOException {

		ObjLogin = new Login(driver);
		
		ObjLogin.clickLogin();
		String logintext = ObjLogin.signuptext();
		Assert.assertEquals(logintext,"Signin to continue");

    	ObjLogin.clicksubmit();
    	String alertMessage=ObjLogin.alert();
		Assert.assertEquals(alertMessage,"please enter password");
		ObjLogin.clicklogout();
		String hometext = ObjLogin.home_text();
		Assert.assertEquals(hometext,"HOME");
		Thread.sleep(5000);

	}

	@Test(priority = 7)
	public void verify_logout_button() throws InterruptedException, IOException {

		ObjLogin = new Login(driver);

		ObjLogin.clickLogin();
		String logintext = ObjLogin.signuptext();
		Assert.assertEquals(logintext,"Signin to continue");
		String username =ReadExcelValues.getCellData(6, 0,
				System.getProperty("user.dir") + "\\src\\main\\resources\\New Microsoft Office Excel Worksheet.xlsx",
				0);
		String password = ReadExcelValues.getCellData(6, 1,
				System.getProperty("user.dir") + "\\src\\main\\resources\\New Microsoft Office Excel Worksheet.xlsx",
				0);

		ObjLogin.setUsername(username);
		ObjLogin.setPassword(password);
		ObjLogin.clickRememberme();
		ObjLogin.clicksubmit();
		ObjLogin.clicklogout();
		String hometext = ObjLogin.home_text();
		Assert.assertEquals(hometext,"HOME");
		Thread.sleep(5000);
		
	}
	
	
}
