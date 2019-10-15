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
	

    @Given("^User should be in Adactin application$")
    public void user_should_be_in_Adactin_application() throws Throwable {
    getUrlfrom("http://www.adactin.com/HotelApp/index.php");  
    }

@Then("^User should see the Adactin logo displayed in the header$")
public void user_should_see_the_Adactin_logo_displayed_in_the_header() throws Throwable {
      elementisDisplayed(pg.getLp().getLogo());
}

@When("^User enter the name in the username field$")
public void user_enter_the_name_in_the_username_field() throws Throwable {
     setkey(pg.getLp().getUsername(),"Murali1234");
}

@When("^User enter the password in the password field$")
public void user_enter_the_password_in_the_password_field() throws Throwable {
    setkey(pg.getLp().getPassword(),"99Z8NU");
}

@When("^User click on the login button$")
public void user_click_on_the_login_button() throws Throwable {
    clickkk(pg.getLp().getLogin());
}

@When("^user wait for (\\d+) seconds for page load$")
public void user_wait_for_seconds_for_page_load(int sec) throws Throwable 
{
   Thread.sleep(sec*1000);   
}

@Then("^User should see the Search Hotel title in the search page field$")
public void user_should_see_the_Search_Hotel_title_in_the_search_page_field() throws Throwable {
     elementisDisplayed(pg.gethotelsearch().getSearchpglogo());
}

@When("^User should set location in location field$")
public void user_should_set_location_in_location_field() throws Throwable {
      dropdown(pg.gethotelsearch().getLocation_field(),"index", "1");
}

@When("^User should set Hotel in hotels field$")
public void user_should_set_Hotel_in_hotels_field() throws Throwable {
 dropdown(pg.gethotelsearch().getHotel_field(), "index", "1");
}

@When("^User should set room type in roomtype field$")
public void user_should_set_room_type_in_roomtype_field() throws Throwable {
   dropdown(pg.gethotelsearch().getRoomtype_field(), "index", "1");
}

@When("^User enter check-in-date later than check-out-date in respective fields$")
public void user_enter_check_in_date_later_than_check_out_date_in_respective_fields() throws Throwable {
     setkey(pg.gethotelsearch().getCheck_in_field(),"22/10/2019");
}

@Then("^verify that check-in-date is not later than check-out-date$")
public void verify_that_check_in_date_is_not_later_than_check_out_date() throws Throwable {
     setkey(pg.gethotelsearch().getCheck_out_field(), "20/10/2019");
	
}
@Then("^user should find the no of rooms in adactin search page$")
public void user_should_find_the_no_of_rooms_in_adactin_search_page() throws Throwable {
    
	dropdown(pg.gethotelsearch().getNumberOf_Rooms(), "index","1");
}

@Then("^user should check whether the submit button is accessed$")
public void user_should_check_whether_the_submit_button_is_accessed() throws Throwable {
     clickkk(pg.gethotelsearch().getSubmit_field());
}

//3rd



@When("^User should set locations in  the location field$")
public void user_should_set_locations_in_the_location_field() throws Throwable {
	dropdown(pg.gethotelsearch().getLocation_field(),"index", "1");
}

@When("^User should set Hotels in  the hotels field$")
public void user_should_set_Hotels_in_the_hotels_field() throws Throwable {
	dropdown(pg.gethotelsearch().getHotel_field(), "index", "1");
}

@When("^User should set rooms type in the roomtype field$")
public void user_should_set_rooms_type_in_the_roomtype_field() throws Throwable {
	   dropdown(pg.gethotelsearch().getRoomtype_field(), "index", "1");
}

@When("^user should find the no of rooms in the adactin search pages$")
public void user_should_find_the_no_of_rooms_in_the_adactin_search_pages() throws Throwable {
	dropdown(pg.gethotelsearch().getNumberOf_Rooms(), "index","1");
}


@Then("^User enter check-in-date later than check-out-date in the respective fields$")
public void user_enter_check_in_date_later_than_check_out_date_in_the_respective_fields() throws Throwable {
	setkey(pg.gethotelsearch().getCheck_in_field(),"10/10/2019");
}

@Then("^verify that check-in-date is not later than the check-out-date$")
public void verify_that_check_in_date_is_not_later_than_the_check_out_date() throws Throwable {
    setkey(pg.gethotelsearch().getCheck_out_field(),"12/10/2019");
}

//4



@When("^When User should set location in to location field$")
public void when_User_should_set_location_in_to_location_field() throws Throwable {
	dropdown(pg.gethotelsearch().getLocation_field(),"index", "1");
}

@When("^User should set Hotel in to hotels field$")
public void user_should_set_Hotel_in_to_hotels_field() throws Throwable {
	dropdown(pg.gethotelsearch().getHotel_field(), "index", "1");
}

@When("^User should set room type in to roomtype field$")
public void user_should_set_room_type_in_to_roomtype_field() throws Throwable {
	 dropdown(pg.gethotelsearch().getRoomtype_field(), "index", "1");
}

@When("^User should set no\\.of rooms in to rooms field$")
public void user_should_set_no_of_rooms_in_to_rooms_field() throws Throwable {
	dropdown(pg.gethotelsearch().getNumberOf_Rooms(), "index","1");
}

@When("^User should enter check-in-date to field$")
public void user_should_enter_check_in_date_to_field() throws Throwable {
	setkey(pg.gethotelsearch().getCheck_in_field(),"15/10/2019");
}

@When("^User should enter check-out-date to field$")
public void user_should_enter_check_out_date_to_field() throws Throwable {
	  setkey(pg.gethotelsearch().getCheck_out_field(),"16/10/2019");
}

@When("^User should select the no\\.of\\.adults to field$")
public void user_should_select_the_no_of_adults_to_field() throws Throwable {
    dropdown(pg.gethotelsearch().getAdult_perroom_field(),"index", "1");
}

@When("^User should select the no\\.of\\.children to field$")
public void user_should_select_the_no_of_children_to_field() throws Throwable {
	 dropdown(pg.gethotelsearch().getChild_perroom_field(),"index", "0");
}

@When("^User click on the search button$")
public void user_click_on_the_search_button() throws Throwable {
    clickkk(pg.gethotelsearch().getSubmit_field());
}





           
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Given("^user should be in facebook application$")
//	public void user_should_be_in_facebook_application() throws Throwable {
//	  getUrl("https://www.facebook.com/");
//	}

//	@Given("^user should be in facebook applications$")
//	   public void user_should_be_in_facebook_applications() throws Throwable {
//	      getUrlfrom(cg.geturl());
//	   }
//
//	@Then("^user should see the facebook logo displayed in the header$")
//	public void user_should_see_the_facebook_logo_displayed_in_the_header() throws Throwable {
////		 Loginpage lp=new Loginpage(driver);
//		  elementisenabled(pg.getLp().getFblogo());
//	}
//
//	@When("^user enter the email address in the emailfield in login page$")
//	public void user_enter_the_email_address_in_the_emailfield_in_login_page() throws Throwable {
////		Loginpage lp=new Loginpage(driver);
//		setkey(pg.getLp().getEmailfield(),"123@gmail.com");
//		
//	}
//
//	@When("^user enter the password in the password field in the login page$")
//	public void user_enter_the_password_in_the_password_field_in_the_login_page() throws Throwable {
////		Loginpage lp=new Loginpage(driver);
//		setkey(pg.getLp().getPassword(),"1234");
//		
//	}
//
//	@When("^user click on the login button in the login page$")
//	public void user_click_on_the_login_button_in_the_login_page() throws Throwable {
////		Loginpage lp=new Loginpage(driver);
//		clickElement(pg.getLp().getLoginbutton());
//	}
//
//	@When("^user wait for (\\d+) seconds for page load$")
//	public void user_wait_for_seconds_for_page_load(int sec) throws Throwable {
////	  Thread.sleep(sec*1000);
//		waitforvisibilityofelment(cg.getwait());
//		
//	}
//
//	@Then("^user should see the login into facebook title in the forgot password page$")
//	public void user_should_see_the_login_into_facebook_title_in_the_forgot_password_page() throws Throwable {
////   Forgetpasswordpage fpp=new Forgetpasswordpage(driver);
//   String actual=text(pg.getFb().getForgotpasswordtitle());
//   Assert.assertEquals("Log in to Facebook", actual);
//	}
//	
//	
////   @When("^user enter the '(.*)' in the emailfield in login page$")
////   public void user_enter_the_test_gmail_com_in_the_emailfield_in_login_page(String username) throws Throwable
////   {
////	   Loginpage lp=new Loginpage(driver);
////	   setkey(lp.getEmailfield(), username );
////   }
//
//   @When("^user enter the '(.*)' in the password field in the login page$")
//   public void user_enter_the_in_the_password_field_in_the_login_page(String password) throws Throwable 
//   {
//	   Loginpage lp=new Loginpage(driver);
//	   setkey(lp.getPassword(),password);
//	   
//   }
//   
//   @When("^user enter the '(.*)' address in the emailfield in login page$")
//   public void user_enter_the_testuser_address_in_the_emailfield_in_login_page(String username) throws Throwable {
//	   Loginpage lp=new Loginpage(driver);
//	   setkey(lp.getEmailfield(), username);
//   
//   }
//
//		
		
		
		}



