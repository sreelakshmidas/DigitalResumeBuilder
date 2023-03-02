package com.qa.pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.drbBase.Base;

public class CreateProfile extends Base
{
	WebDriver driver;
	
	@FindBy(xpath="(//a[@href='/profilehome'])")//My Profile
    WebElement myprof;
	@FindBy(xpath="//button[text()='Create a Profile Now']")//Create your resume now
    WebElement crtprfbtn;
	//@FindBy(className="logout btn")
	//WebElement logout;
	@FindBy(xpath="//input[@id='name']")
    WebElement fulname;
	@FindBy(id="date")
    WebElement dob;
	@FindBy(id="gender")
	List<WebElement> gend;
	@FindBy(id="email_id")
    WebElement email;
	@FindBy(id="phone")
    WebElement phone;
	@FindBy(id="edu_title")
    WebElement strm;
	@FindBy(id="edu_school")
    WebElement school;
	@FindBy(id="edu_desc")
    WebElement percentage;
	@FindBy(id="edu_year")
    WebElement year;
	@FindBy(xpath="//label[text()='Higher Secondary']/following::select[1]")/////stream index change
    WebElement higherSecStrm;
	@FindBy(xpath="//p[@formgroupname='higherschools']//input[@formcontrolname='edu_desc']")
	//@FindBy(xpath="(//input[@placeholder=\"Percentage Scored\"][2]")
    WebElement higherSecPercentage;
	@FindBy(xpath="//p[@formgroupname='higherschools']//input[@formcontrolname='edu_school']")
	//@FindBy(xpath="(//input[@placeholder=\"School Name\"][2]")
    WebElement higherSecSchool;
	@FindBy(xpath="(//input[@placeholder=\"Year of Pass\"])[2]")
    WebElement higherSecYear;
	@FindBy(xpath="//label[text()='Higher Secondary']/following::select[2]")
	 WebElement graduation;
	@FindBy(xpath="//label[text()='Higher Secondary']/following::select[3]")
    WebElement graduationStream;
	@FindBy(xpath="//p[@formgroupname='graduations']//input[@formcontrolname='edu_desc']")
	//@FindBy(xpath="(//input[@placeholder=\\\"Percentage Scored\\\"])[3]")
    WebElement gradPercentage;
	@FindBy(xpath="(//input[@placeholder=\"Institution Name\"])[1]")
    WebElement gradInstitute;
	@FindBy(xpath="(//input[@placeholder=\"Year of Pass\"])[3]")
    WebElement gradYear;
	@FindBy(xpath="//label[text()='Higher Secondary']/following::select[4]")
	 WebElement postgraduation;
	@FindBy(xpath="//label[text()='Higher Secondary']/following::select[5]")
    WebElement postgraduationStream;
	@FindBy(xpath="(//input[@placeholder=\\\"Percentage Scored\\\"])[4]")
    WebElement postgradPercentage;
	@FindBy(xpath="(//input[@placeholder=\"Institution Name\"])[2]")
    WebElement postgradInstitute;
	@FindBy(xpath="(//input[@placeholder=\"Year of Pass\"])[4]")
    WebElement postgradYear;
	
	//project
	@FindBy(xpath="//table[@formarrayname=\"projects\"]//button[@class=\"btn btn-primary\"]")
	//@FindBy(xpath="//button[@type='button'])[2]")
	WebElement projectAdd;
	@FindBy(xpath="//input[contains(@formcontrolname,'title')]")
    WebElement projectTitle;
	@FindBy(xpath="(//input[contains(@formcontrolname,'desc')])[5]")
    WebElement projectDescription;
	//Additional
	@FindBy(xpath="(//button[@type='button'])[3]")
	WebElement addQualifcation;
	@FindBy(xpath="//label[text()='Higher Secondary']/following::select[6]")
	WebElement coursetype;
	@FindBy(xpath="//input[contains(@formcontrolname,'course_name')]")
	WebElement coursename;
	@FindBy(xpath="//input[contains(@formcontrolname,'percentage')]")
	WebElement percentge;
	//Experiance
	@FindBy(xpath="	(//button[@type='button'])[4]")
	WebElement addExperiance;
	@FindBy(xpath="//input[contains(@formcontrolname,'job_title')]")
	WebElement jobTitle;
	@FindBy(xpath="//input[contains(@formcontrolname,'exp_from')]")
	WebElement exp_from;
	@FindBy(xpath="//input[contains(@formcontrolname,'exp_to')]")
	WebElement exp_to;
	//skill
	@FindBy(xpath="//table[@formarrayname='skills']//button[@class='btn btn-primary']")
	//@FindBy(xpath="(//button[@type='button'])[5]")
	WebElement addSkillBtn;
	@FindBy(xpath="//input[contains(@formcontrolname,'skills')]")
    WebElement skill;
	//language
	//@FindBy(xpath="//table[@formarrayname='languages']//button[@class='btn btn-primary']")
	@FindBy(xpath="//table[@formarrayname='languages']//button[@class='btn btn-primary']")
    WebElement languageAdd;
	@FindBy(xpath="//input[contains(@formcontrolname,'languages')]")
    WebElement language;
	//programing languages
	@FindBy(xpath="	(//button[@type='button'])[7]")
	WebElement addprogramglang;
	@FindBy(xpath="//input[contains(@formcontrolname,'progs')]")
	WebElement lang_name;
	@FindBy(xpath="//input[contains(@formcontrolname,'prog_perc')]")
	WebElement progs_perc;
	//acheivments
	@FindBy(xpath="(//button[@type='button'])[8]")
    WebElement achievementAdd;
	@FindBy(xpath="//input[@formcontrolname='achievements']")
    WebElement achievement;
	@FindBy(id="yourself")
    WebElement descr;
	@FindBy(xpath="//input[@type='file']")
    WebElement img;
	@FindBy(xpath="//input[@type='checkbox']")
    WebElement acceptchk;
	@FindBy(xpath="//button[@type='submit']")
    WebElement crtprfsubmit;
	//input[@name="image"]
	
	
	
	
	@FindBy(xpath="//a[text()='My Profile']")
	private WebElement my_profile_button;
	
	@FindBy(xpath="//a[text()='Delete Profile']")
	private WebElement delete;
	
	

	
	
	
	
	public  CreateProfile(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	public void clickMyProfile() throws InterruptedException
	{	
		/*WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(100));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/profilehome']")));*/
		Thread.sleep(1000);
		myprof.click();
	}

public void clickprofile()
{
JavascriptExecutor executor = (JavascriptExecutor)driver;
executor.executeScript("arguments[0].click();",myprof);
}

	public void clickCrtProfile() throws InterruptedException
	{
		crtprfbtn.click();
		Thread.sleep(500);
	}
	public void clickcrprofile()
	{
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();",crtprfbtn);
	}

	public void setName(String name2) throws InterruptedException
	{
		
		 JavascriptExecutor er = (JavascriptExecutor)driver;
		  er.executeScript("arguments[0].click();",fulname);
		  fulname.clear();
		fulname.sendKeys(name2);
		Thread.sleep(500);

	}

	public void clickGender(String gender)throws InterruptedException
	{
		if(gender.equals("male"))
		{
			gend.get(0).click();
		}
		else if(gender.equals("female"))
		{
			gend.get(1).click();
		}
		 
		
	}


	public void setDob(String dateofbirth)throws InterruptedException
	{
	
		dob.sendKeys(dateofbirth);
	}

	public void setEmail(String emailid) throws InterruptedException
	{
		email.clear();
		email.sendKeys(emailid);
		Thread.sleep(500);

	}

	public void setPhone(String phonenum)throws InterruptedException
	{
		phone.clear();
		phone.sendKeys(phonenum);
		Thread.sleep(500);

		
	}

	public void setSchoolStream(String schoolstrm)throws InterruptedException
	{
		Select sel=new Select(strm);
		sel.selectByValue(schoolstrm);
	}

	public void setYear(String yr)throws InterruptedException
	{
	year.clear();
	year.sendKeys(yr);
	Thread.sleep(500);
		
	}
	public void setQualification(String Qualification) throws InterruptedException
	{
		try
		{ ((Locatable) addQualifcation).getCoordinates().inViewPort();
		//addQualifcation.click();
		 JavascriptExecutor er = (JavascriptExecutor)driver;
		  er.executeScript("arguments[0].click();",addQualifcation);
		}
		catch(Exception e)
		{
			new Actions(driver).sendKeys(Keys.PAGE_DOWN).perform();
			addQualifcation.click();
		}
		coursetype.sendKeys(Qualification);
		coursename.sendKeys(Qualification);
		percentge.sendKeys(Qualification);
				
	}


	public void setSkills(String skills) throws InterruptedException
	{ 	
	 try{ 
		  ((Locatable) addSkillBtn).getCoordinates().inViewPort();
        //addSkillBtn.click();
		  JavascriptExecutor er = (JavascriptExecutor)driver;
		  er.executeScript("arguments[0].click();",addSkillBtn);
       }
     catch(Exception e)
       {
    	new Actions(driver).sendKeys(Keys.PAGE_DOWN).perform();
    	addSkillBtn.click();
      }
	  try { ((Locatable) skill).getCoordinates().inViewPort();
	  skill.clear();
		skill.sendKeys(skills);
      }
     catch(Exception e)
     {
  	new Actions(driver).sendKeys(Keys.PAGE_DOWN).perform();
  	skill.clear();
	skill.sendKeys(skills);
     }  }
	  
	
	public void setLanguage(String lang) throws InterruptedException
	{
		
	    try { ((Locatable) languageAdd).getCoordinates().inViewPort();
	       // languageAdd.click();
		JavascriptExecutor erg = (JavascriptExecutor)driver;
		  erg.executeScript("arguments[0].click();",languageAdd);
	        }
	       catch(Exception e)
	       {
	        new Actions(driver).sendKeys(Keys.PAGE_DOWN).perform();
	        languageAdd.click();
	       }
	       Thread.sleep(500);
	       language.sendKeys(lang);
	}

	public void setDescribe(String describe)
	{
		descr.clear();
		descr.sendKeys(describe);
	}

	public void setImage(String imagelnk) throws InterruptedException
	{   Thread.sleep(1000);    
		img.sendKeys(imagelnk);
	}

	public void acceptCheck() throws InterruptedException
	{
		
		try { ((Locatable) acceptchk).getCoordinates().inViewPort();
		// acceptchk.click();
			JavascriptExecutor erg = (JavascriptExecutor)driver;
			  erg.executeScript("arguments[0].click();",acceptchk);
	        }
	       catch(Exception e)
	       {
	        new Actions(driver).sendKeys(Keys.PAGE_DOWN).perform();
	        
	        acceptchk.click();
	       }
	}
	public String clickCreateProfile() throws InterruptedException {
		Thread.sleep(2000);
		try { ((Locatable) crtprfsubmit).getCoordinates().inViewPort();
		//crtprfsubmit.click();
		JavascriptExecutor erg = (JavascriptExecutor)driver;
		  erg.executeScript("arguments[0].click();",crtprfsubmit);
     
	
	        }
	       catch(Exception e)
	       {
	        new Actions(driver).sendKeys(Keys.PAGE_DOWN).perform();
	        crtprfsubmit.click();
	       }
		 String actual=driver.switchTo().alert().getText();
		 driver.switchTo().alert().accept();
		 return actual;
	}
	public boolean clickcreate()
	{
		boolean enabled=crtprfsubmit.isEnabled();
		return enabled;
	}


	public void setPercent(String percent)
	{
		percentage.clear();
		percentage.sendKeys(percent);
	}
	

	public void setSchool(String schoolname)
	{
		school.clear();
		school.sendKeys(schoolname);
	}

	public void higherSecondaryStream(String highersec)
	{   
	    Select sel=new Select(higherSecStrm);
		sel.selectByValue(highersec);
		
	}

	public void setHighersecPercentage(String higersecPercent)
	{
		higherSecPercentage.clear();
		higherSecPercentage.sendKeys(higersecPercent);
		
	}

	public void setHighersecSchool(String higersecSchool)
	{
		higherSecSchool.sendKeys(higersecSchool);
	}

	public void setHighersecYear(String higersecYear)
	{
		higherSecYear.sendKeys(higersecYear);
		
	}

	public void setGraduationStream(String gradStream)
	{
		Select sel=new Select(graduationStream);
		sel.selectByValue(gradStream);
	}

	public void setGraduation(String grad) {
		Select sel=new Select(graduation);
		sel.selectByValue(grad);
		
	}

	public void setGraduationPercentage(String gradPercent) {
		
		gradPercentage.sendKeys(gradPercent);
	}

	public void setGraduationInstitute(String gradInst)
	{
		gradInstitute.sendKeys(gradInst);
	}

	public void setGraduationYear(String gradYr)
	{
		gradYear.sendKeys(gradYr);
	}

	public void setpostGraduationStream(String gradStream)
	{
		Select sel=new Select(graduationStream);
		sel.selectByValue(gradStream);
	}

	public void setpostGraduation(String grad) {
		Select sel=new Select(graduation);
		sel.selectByValue(grad);
		
	}

	public void setpostGraduationPercentage(String gradPercent) {
		
		postgradPercentage.sendKeys(gradPercent);
	}

	public void setpostGraduationInstitute(String gradInst)
	{
		postgradInstitute.sendKeys(gradInst);
	}

	public void setpostGraduationYear(String gradYr)
	{
		postgradYear.sendKeys(gradYr);
	}

	public void setProjectDetails(String project, String projectDesc)
	{
		try { ((Locatable) projectAdd).getCoordinates().inViewPort();
		//projectAdd.click();
		JavascriptExecutor er = (JavascriptExecutor)driver;
		  er.executeScript("arguments[0].click();",projectAdd);
		
        }
       catch(Exception e)
        {
        new Actions(driver).sendKeys(Keys.PAGE_DOWN).perform();
        projectAdd.click();
         }
		projectTitle.sendKeys(project);
		projectDescription.sendKeys(projectDesc);
		
	}

	public void setAchievements(String achievements)
	{
		try
		{ ((Locatable) achievementAdd).getCoordinates().inViewPort();
		//achievementAdd.click();
		JavascriptExecutor er = (JavascriptExecutor)driver;
		  er.executeScript("arguments[0].click();",achievementAdd);
		
		}
		catch(Exception e)
		{
			new Actions(driver).sendKeys(Keys.PAGE_DOWN).perform();
			achievementAdd.click();
		}
		achievement.sendKeys(achievements);
		
	}
	
	
	
	public void clickDelete()
	 {
		JavascriptExecutor er = (JavascriptExecutor)driver;
		er.executeScript("arguments[0].scrollIntoView();",delete);
		  er.executeScript("arguments[0].click();",delete);
	 }
	
	public void clickdprofile()
	{
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollIntoView();",my_profile_button);
		JavascriptExecutor ex = (JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click();",my_profile_button);
		JavascriptExecutor e = (JavascriptExecutor)driver;
		e.executeScript("arguments[0].click();",my_profile_button);
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
