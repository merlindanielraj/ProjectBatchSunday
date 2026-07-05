package org.pom;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel  {

	

	@FindBy(id = "location")
	private WebElement drpLocation;

	@FindBy(id = "room_nos")
	private WebElement drpNoOfRooms;

	@FindBy(id = "datepick_in")
	private WebElement textCheckInDate;

	@FindBy(id = "datepick_out")
	private WebElement textChecOutDate;

	@FindBy(id = "adult_room")
	private WebElement drpAdultsPerRooms;

	@FindBy(id = "Submit")
	private WebElement btnSummit;

	public WebElement getDrpLocation() {
		return drpLocation;
	}

	public WebElement getDrpNoOfRooms() {
		return drpNoOfRooms;
	}

	public WebElement getTextCheckInDate() {
		return textCheckInDate;
	}

	public WebElement getTextChecOutDate() {
		return textChecOutDate;
	}

	public WebElement getDrpAdultsPerRooms() {
		return drpAdultsPerRooms;
	}

	public WebElement getBtnSummit() {
		return btnSummit;
	}

}
