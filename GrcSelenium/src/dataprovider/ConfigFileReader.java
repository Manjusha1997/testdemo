package dataprovider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
 
public class ConfigFileReader {
 
	Properties pro;
 
 
 public ConfigFileReader(){
	 
	 try {
		 
		 File  src= new File("/Users/Srija/Desktop/Automation/GRCSelenium/config/config.properties");
		 FileInputStream fis = new FileInputStream(src);
		 pro = new Properties();
		 pro.load(fis);
	} catch (Exception e) {
		System.out.println("Exception is= "+e.getMessage());
	}
	 
}
  
 public String getDriverPath(){
	 
	 String path=pro.getProperty("driverPath");
	 return path;
	 
 }
 public String getApplicationUrl(){
	 
	 String burl=pro.getProperty("url");
	 return burl;
	 
 }
public String getApplicationUrl1(){
	 
	 String purl=pro.getProperty("url1");
	 return purl;
	 
 }
public String ulogin(){
	 
	 String user=pro.getProperty("username");
	 return user;
	 
 }
public String ulogin1(){
	 
	 String user1=pro.getProperty("u1");
	 return user1;
	 
}
public String ulogin2(){
	 
	 String user1=pro.getProperty("u2");
	 return user1;
	 
}
public String plogin(){
	 
	 String pass=pro.getProperty("password");
	 return pass;
	 
}
public String plogin1(){
	 
	 String pass1=pro.getProperty("p1");
	 return pass1;
	 
}	 
}
