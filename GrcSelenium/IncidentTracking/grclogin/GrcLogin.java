/**
 * 
 */
package grclogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GrcLogin {

	WebDriver driver;
	
	By username = By.id("UserId");
	By password = By.id("Password");
	By login    = By.xpath("//button[@type='submit' and @id='login']");
	


public  GrcLogin(WebDriver driver)
{
	this.driver=driver;
}


public void grc_login_empty()  {
	   
	driver.findElement(username);
	driver.findElement(password);
	driver.findElement(login).click();
	
	  
	  }
public void grc_login_empty_pwd(String userid)  {
	driver.findElement(username).sendKeys(userid);
	driver.findElement(password);
	driver.findElement(login).click();
	
}
public void grc_login_empty_user(String pwd) 
{
	driver.findElement(username).clear();
	driver.findElement(username);
	driver.findElement(password).sendKeys(pwd);
	driver.findElement(login).click();
}
public void grc_login_failed(String userid,String pwd)  {
	driver.findElement(username).sendKeys(userid);
	driver.findElement(password).sendKeys(pwd);
	driver.findElement(login).click();
	
 }	 
public void grc_login_successful(String userid,String pwd)  {
	driver.findElement(username).clear();
	driver.findElement(password).clear();
	driver.findElement(username).sendKeys(userid);
	driver.findElement(password).sendKeys(pwd);
	driver.findElement(login).click();
 
}


}