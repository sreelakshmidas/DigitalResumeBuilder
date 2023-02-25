package com.qa.drbBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class Base {

	public WebDriver driver;
	public static Properties prop=null;
	
	
	//method for configuring webpage
	@BeforeMethod
	public void Setup() throws IOException, InterruptedException
	{
		prop=new Properties();
		FileInputStream propFile=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
		prop.load(propFile);
		
		driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();	
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void close() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	
	}
	
	
	
}
