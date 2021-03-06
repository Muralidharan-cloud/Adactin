package com.adactinproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class adactinSearchhotel {
 
	
	public WebDriver driver;

	public adactinSearchhotel(WebDriver shdriver)
	{
		this.driver=shdriver;
		PageFactory.initElements(driver, this);
	}
	
	  @FindBy(id="location")
	    private WebElement location_field;
	  
	 
	    public WebElement getLocation_field() {
		return location_field;
	}

	public WebElement getHotel_field() {
		return hotel_field;
	}

	public WebElement getRoomtype_field() {
		return roomtype_field;
	}

	public WebElement getNumberOf_Rooms() {
		return numberOf_Rooms;
	}

	public WebElement getCheck_in_field() {
		return check_in_field;
	}

	public WebElement getCheck_out_field() {
		return check_out_field;
	}

	public WebElement getAdult_perroom_field() {
		return adult_perroom_field;
	}

	public WebElement getChild_perroom_field() {
		return child_perroom_field;
	}

	public WebElement getSubmit_field() {
		return submit_field;
	}
        @FindBy(xpath="//img[@class='logo']")
        private WebElement searchpglogo;
	
		public WebElement getSearchpglogo() {
			return searchpglogo;
		}

		public void setSearchpglogo(WebElement searchpglogo) {
			this.searchpglogo = searchpglogo;
		}

		@FindBy(id="hotels")
	    private WebElement hotel_field;
	    
	    @FindBy(id="room_type")
	    private WebElement roomtype_field;
	    
	    @FindBy(id="room_nos")
	    private WebElement numberOf_Rooms;
	    
	    @FindBy(id="datepick_in")
	    private WebElement check_in_field;
	    
	    @FindBy(id="datepick_out")
	    private WebElement check_out_field;
	    
	    @FindBy(id="adult_room")
	    private WebElement adult_perroom_field;
	    
	    @FindBy(id="child_room")
	    private WebElement child_perroom_field;
	    
	    @FindBy(id="Submit")
	    private WebElement submit_field;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
