package com.cucumber.utilities;

import org.openqa.selenium.WebDriver;

import com.cucumber.pom.Forgetpasswordpage;
import com.cucumber.pom.Loginpage;

public class Pageobjectmanager {

	public WebDriver driver;
	private Forgetpasswordpage fb;
	private Loginpage lp;
	
	
	
	
	
	public Pageobjectmanager(WebDriver ldriver) {
        this.driver=ldriver;
	}
	public Forgetpasswordpage getFb() 
	{
	  if (fb == null) 
	  {
		fb=new Forgetpasswordpage(driver);
	  }
	  return fb;
		
	}
	public Loginpage getLp() {
		if (lp==null) {
			lp=new Loginpage(driver);
		}
		return lp;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
