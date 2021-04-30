package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dataprovider.ConfigFileReader;
import grclogin.GrcLogin;

public class IncidentVerified {
 WebDriver driver;	
	 
	 GrcLogin sigin;
	 ConfigFileReader cfr;

	 @BeforeTest
	 public void launchBrowser() throws Exception{
		 cfr= new ConfigFileReader();
		System.setProperty("webdriver.chrome.driver", cfr.getDriverPath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(cfr.getApplicationUrl());	
			 sigin =PageFactory.initElements(driver,GrcLogin.class);
			driver.get(cfr.getApplicationUrl()+"Account/Login/"); 
	 }
	 @Test(priority=1)
		
		public void grclogin() throws InterruptedException{
			
			sigin.grc_login_empty();
			Thread.sleep(3000);
		    sigin.grc_login_empty_pwd("abc");
		    Thread.sleep(3000);
		    sigin.grc_login_empty_user("abcd");
		    Thread.sleep(3000);
		    sigin.grc_login_failed("def","ghi");
		    Thread.sleep(3000);
		    sigin.grc_login_successful(cfr.ulogin(),cfr.plogin());
		    Thread.sleep(3000);

			
		}
	 
}
