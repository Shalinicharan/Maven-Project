package org.LibGlobal;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class HotelBooking extends BaseClass {
	
	@BeforeClass
	public static void browserLaunch() {
		getdriver();
		loadurl("https://adactinhotelapp.com/");
		maximize();
		

	}
	
	@AfterClass 
	public static void browserClose() {
	quit();
	
	}
	@Test
	public void Booking() throws IOException {
		
		String username = readdata("Datas", 1, 0);
		String password = readdata("Datas", 1, 1);
		String location = readdata("Datas", 1, 2);
		String hotels = readdata("Datas", 1, 3);
		String roomtype = readdata("Datas", 1, 4);
		String noofrooms = readdata("Datas", 1, 5);
		String checkindate = readdata("Datas", 1, 6);
		String checkoutdate = readdata("Datas", 1, 7);
		String adults = readdata("Datas", 1, 8);
		String child = readdata("Datas", 1, 9);
		String firstname = readdata("Datas", 1, 10);
		String lastname = readdata("Datas", 1, 11);
		String address = readdata("Datas", 1, 12);
		String cardno = readdata("Datas", 1, 13);
		String cardtype = readdata("Datas", 1, 14);
		String month = readdata("Datas", 1, 15);
		String year = readdata("Datas", 1, 16);
		String cvv = readdata("Datas", 1, 17);
	
		
		
		
		
		PageLogin loginpage = new PageLogin();
		loginpage.login(username, password);
		
		PageSearchHotel searchhotelPage = new PageSearchHotel();
		searchhotelPage.searchhotel(location, hotels, roomtype, noofrooms, checkindate, checkoutdate, adults, child);
		
		PageSelectHotel selecthotelpage = new PageSelectHotel();
		selecthotelpage.selecthotel();
		
		PageBookHotel bookhotelpage = new PageBookHotel();
		bookhotelpage.bookHotel(firstname, lastname, address, cardno, cardtype, month, year, cvv);
		
		//PageBookingConfirmation bookingconfirmationpage = new PageBookingConfirmation();
		//bookingconfirmationpage.confirmation(orderno);
		
		
		
		
		
		
		
		
		
	}
	
	
	}


