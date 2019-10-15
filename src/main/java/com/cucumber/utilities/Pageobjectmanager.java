package com.cucumber.utilities;

import org.openqa.selenium.WebDriver;

import com.adactinproject.AdactinLogin;
import com.adactinproject.adactinSearchhotel;
import com.cucumber.pom.Forgetpasswordpage;
import com.cucumber.pom.Loginpage;

public class Pageobjectmanager {

	public WebDriver driver;
	private AdactinLogin alp;
	private adactinSearchhotel ash;
	

	public Pageobjectmanager(WebDriver lodriver) {
        this.driver=lodriver;
	}
	
	public adactinSearchhotel gethotelsearch()
	{
		if (ash==null)
		{
			ash=new adactinSearchhotel(driver);
		}
		return ash;
	}

	
	
	public AdactinLogin getLp() {
		if (alp==null) {
			alp=new AdactinLogin(driver);
		}
		return alp;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
