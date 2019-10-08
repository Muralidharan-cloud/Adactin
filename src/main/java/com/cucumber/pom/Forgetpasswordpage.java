package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgetpasswordpage {

	public WebDriver driver;
	
	public Forgetpasswordpage(WebDriver lodriver) {
		this.driver=lodriver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//span[text()='Log in to Facebook']")
	private WebElement forgotpasswordtitle;

	public WebElement getForgotpasswordtitle() {
		return forgotpasswordtitle;
	}
	
	
	
	
}
