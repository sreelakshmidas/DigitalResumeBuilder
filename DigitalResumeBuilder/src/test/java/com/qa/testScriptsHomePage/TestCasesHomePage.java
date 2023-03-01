package com.qa.testScriptsHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.drbBase.Base;
import com.qa.pages.AboutUs;
import com.qa.pages.CreateYourResumeNow;
import com.qa.pages.GetStarted;
import com.qa.pages.HomePage;
import com.qa.pages.SeeMore;
import com.qa.pages.TemplatesOrDesigns;


public class TestCasesHomePage extends Base
{

	HomePage home;
	AboutUs about;
	TemplatesOrDesigns templates;
	CreateYourResumeNow  resumeNow;
	GetStarted get;
	SeeMore see;
	
	@Test(priority=1)
	public void gotoHomePage() throws InterruptedException
	{
		home=new HomePage(driver);
		home.clickHome();
		Thread.sleep(5000);
		
		String homeText=home.getText();
		Assert.assertEquals(homeText, "Create your resume now");	
	}
	
	@Test(priority=2)
	public void gotoAboutusPage() throws InterruptedException
	{
		about=new AboutUs(driver);
		about.clickAboutus();
		Thread.sleep(5000);
		
		String aboutText=about.getText();
		Assert.assertEquals(aboutText,"About Us");
	}
	
	
	@Test(priority=3)
	public void gotoTemplatesOrDesignsPage() throws InterruptedException
	{
		templates=new TemplatesOrDesigns(driver);
		templates.clickTemplates();
		Thread.sleep(5000);
		
		String  templatesText=templates.getText();
		Assert.assertEquals(templatesText,"Here you can choose your Template/Design");
		
	}

	@Test(priority=4)
	public void clickCreateYourResumeNow() throws InterruptedException
	{
		 resumeNow=new CreateYourResumeNow (driver);
		 resumeNow.createResumeNow();
		 Thread.sleep(3000);
		
		 String designText=resumeNow.getText();
		 Assert.assertEquals(designText,"Here you can choose your Template/Design");
		 
		 resumeNow.mulberry();
		 String profile_home=resumeNow.profile_home_getText();
		 Assert.assertEquals(profile_home,"Welcome to Digital Resume Builder");
		 
		 resumeNow.create_profile();
		 
		 String alert_message=resumeNow.alert();
		 Assert.assertEquals(alert_message,"you need to login first");
		 driver.switchTo().defaultContent();
		
	}
	
	@Test(priority=5)
	public void getStarted() throws InterruptedException
	{
		get=new GetStarted(driver);
		
		get.getStartedButton();
		Thread.sleep(3000);
		
		get.profileNowButton();
		String alert_message=get.alert();
		Assert.assertEquals(alert_message,"you need to login first");
		driver.switchTo().parentFrame();
	}
	
	@Test(priority=6)
	public void seeMoreTemplates() throws InterruptedException
	{
		see=new SeeMore(driver);
		see.seeMoreButton();
		Thread.sleep(3000);
		
		String designText=see.getText();
		 Assert.assertEquals(designText,"Here you can choose your Template/Design");
		
	}
	
	
}
