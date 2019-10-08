package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	public WebDriver driver;
	
	public Loginpage(WebDriver ldriver) {
      this.driver=ldriver;
      PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//i[contains(@class,'fb_logo')]")
	private WebElement fblogo;
	
	@FindBy(id="email")
	private WebElement emailfield;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement loginbutton;

	public WebElement getFblogo() {
		return fblogo;
	}

	public WebElement getEmailfield() {
		return emailfield;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}	
	
}
