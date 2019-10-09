package com.cucumber.stepdefinition;

import javax.swing.text.Element;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.cucumber.baseclass.Baseclass;
import com.cucumber.pom.Forgetpasswordpage;
import com.cucumber.pom.Loginpage;
import com.cucumber.runner.TestRunner;
import com.cucumber.utilities.Pageobjectmanager;
import com.cucumber.utilities.configreader;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends Baseclass {
	public static WebDriver driver=TestRunner.driver;
	public static Pageobjectmanager pg=new Pageobjectmanager(driver);
	
	public static configreader cg=new configreader(driver);
	
//	@Given("^user should be in facebook application$")
//	public void user_should_be_in_facebook_application() throws Throwable {
//	  getUrl("https://www.facebook.com/");
//	}

	@Given("^user should be in facebook applications$")
	   public void user_should_be_in_facebook_applications() throws Throwable {
	      getUrlfrom(cg.geturl());
	   }

	@Then("^user should see the facebook logo displayed in the header$")
	public void user_should_see_the_facebook_logo_displayed_in_the_header() throws Throwable {
//		 Loginpage lp=new Loginpage(driver);
		  elementisenabled(pg.getLp().getFblogo());
	}

	@When("^user enter the email address in the emailfield in login page$")
	public void user_enter_the_email_address_in_the_emailfield_in_login_page() throws Throwable {
//		Loginpage lp=new Loginpage(driver);
		setkey(pg.getLp().getEmailfield(),"123@gmail.com");
		
	}

	@When("^user enter the password in the password field in the login page$")
	public void user_enter_the_password_in_the_password_field_in_the_login_page() throws Throwable {
//		Loginpage lp=new Loginpage(driver);
		setkey(pg.getLp().getPassword(),"1234");
		
	}

	@When("^user click on the login button in the login page$")
	public void user_click_on_the_login_button_in_the_login_page() throws Throwable {
//		Loginpage lp=new Loginpage(driver);
		clickElement(pg.getLp().getLoginbutton());
	}

	@When("^user wait for (\\d+) seconds for page load$")
	public void user_wait_for_seconds_for_page_load(int sec) throws Throwable {
//	  Thread.sleep(sec*1000);
		waitforvisibilityofelment(cg.getwait());
		
	}

	@Then("^user should see the login into facebook title in the forgot password page$")
	public void user_should_see_the_login_into_facebook_title_in_the_forgot_password_page() throws Throwable {
//   Forgetpasswordpage fpp=new Forgetpasswordpage(driver);
   String actual=text(pg.getFb().getForgotpasswordtitle());
   Assert.assertEquals("Log in to Facebook", actual);
	}
	
	
//   @When("^user enter the '(.*)' in the emailfield in login page$")
//   public void user_enter_the_test_gmail_com_in_the_emailfield_in_login_page(String username) throws Throwable
//   {
//	   Loginpage lp=new Loginpage(driver);
//	   setkey(lp.getEmailfield(), username );
//   }

   @When("^user enter the '(.*)' in the password field in the login page$")
   public void user_enter_the_in_the_password_field_in_the_login_page(String password) throws Throwable 
   {
	   Loginpage lp=new Loginpage(driver);
	   setkey(lp.getPassword(),password);
	   
   }
   
   @When("^user enter the '(.*)' address in the emailfield in login page$")
   public void user_enter_the_testuser_address_in_the_emailfield_in_login_page(String username) throws Throwable {
	   Loginpage lp=new Loginpage(driver);
	   setkey(lp.getEmailfield(), username);
   
   }

		
		
		
		}



