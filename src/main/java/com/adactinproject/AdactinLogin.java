package com.adactinproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLogin {

	public WebDriver driver;

	public AdactinLogin(WebDriver lodriver)
	{
	  this.driver=lodriver;
	  PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@class='login_button']")
	private WebElement login;
	
	
	@FindBy(xpath="//img[@class='logo']")
	private WebElement logo;
	
	@FindBy(id="username")
	private WebElement username;
	
	public WebElement getLogin() {
		return login;
	}

	public WebElement getLogo() {
		return logo;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}


	@FindBy(id="password")
	private WebElement password;
	
	
	
	
}
