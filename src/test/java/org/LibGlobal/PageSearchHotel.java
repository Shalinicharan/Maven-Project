package org.LibGlobal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageSearchHotel extends BaseClass {
	
	public PageSearchHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement dDnLocation;
	
	@FindBy(id="hotels")
	private WebElement dDnHotels;
	
	@FindBy(id="room_type")
	private WebElement dDnRoomType;
	
	@FindBy(id="room_nos")
	private WebElement dDnNoOfRooms;
	
	@FindBy(id="datepick_in")
	private WebElement txtCheckInDate;
	
	@FindBy(id="datepick_out")
	private WebElement txtCheckOutDate;
	
	@FindBy(id="adult_room")
	private WebElement dDnAdultsPerRoom;
	
	@FindBy(id="child_room")
	private WebElement dDnChildPerRoom;
	
	@FindBy(id="Submit")
	private WebElement btnSearch;

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotels() {
		return dDnHotels;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnNoOfRooms() {
		return dDnNoOfRooms;
	}

	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}

	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}

	public WebElement getdDnAdultsPerRoom() {
		return dDnAdultsPerRoom;
	}

	public WebElement getdDnChildPerRoom() {
		return dDnChildPerRoom;
	}
	public WebElement getbtnSearch() {
		return btnSearch;
	}
	
	public void searchhotel(String location,String hotels,String roomtype,String noofrooms,String checkindate,String checkoutdate,String adults,String child) {
		selectbytext(getdDnLocation(), location);
		selectbytext(getdDnHotels(), hotels);
		selectbytext(getdDnRoomType(), roomtype);
		selectbytext(getdDnNoOfRooms(), noofrooms);
		type(getTxtCheckInDate(), checkindate);
		type(getTxtCheckOutDate(), checkoutdate);
		selectbytext(getdDnAdultsPerRoom(), adults);
		selectbytext(getdDnChildPerRoom(), child);
		click(getbtnSearch());
		
		

	}
	

}
