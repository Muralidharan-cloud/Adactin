package com.cucumber.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class configreader {
	public WebDriver driver;
  public static Properties prop=new Properties();
  
  public configreader() throws Exception {
	  try {
	  File f=new File(System.getProperty("user.dir")+"src\\test\\resource\\com\\cucumber\\property\\configuration.property");
      FileInputStream fis=new FileInputStream(f);
      prop.load(fis);
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception("file path is not valid");
	}
     
    }
  
  
  
  





public configreader(WebDriver lodriver) {

  this.driver=lodriver;
}









public String getbrowsername() throws Exception {
	  
	  
	  try {
		String browser = prop.getProperty("browsername");
		  return browser;
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception("browser name is not valid in property file");
	}
	  
}
  
  public String geturl() throws Exception {
    try {
		String url = prop.getProperty("url");
		return url;
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception("not a valid url");
	}
}
  
  public WebElement getwait() throws Exception {
     try {
		Object wait = prop.getProperty("implicitwait");
		 return (WebElement) wait;
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception();
	}
}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
