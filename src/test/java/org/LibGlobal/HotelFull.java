package org.LibGlobal;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class HotelFull extends BaseClass {
	
	@BeforeClass
	public static void before() {
		getdriver();
		loadurl("https://adactinhotelapp.com/");
		maximize();
	}
	@AfterClass
	public static void After() {
		quit();
		
	}
	
	@Test
	public void Test() throws IOException {
	String name =   readdata("Datas", 1, 0 );
	String pass =   readdata("Datas", 1, 1);
	String text =   readdata("Datas", 1, 2);
	String text1 =   readdata("Datas", 1, 3);
	String text2 =   readdata("Datas", 1, 4);
	String text3 =   readdata("Datas", 1, 5);
	String text4 =   readdata("Datas", 1, 6);
	String text5 =   readdata("Datas", 1, 7);
	String text6 =   readdata("Datas", 1, 8);
	String text7 =   readdata("Datas", 1, 9);
	String text8 =   readdata("Datas", 1, 10);
	String text9 =   readdata("Datas", 1, 11);
	String text10 =   readdata("Datas", 1, 12);
	String text11 =   readdata("Datas", 1, 13);
	String text12 =   readdata("Datas", 1, 14);
	String text13 =   readdata("Datas", 1, 15);
	String text14 =   readdata("Datas", 1, 16);
	String text15 =   readdata("Datas", 1, 17);
	
	
	
	WebElement txtUserName = findlocatorbyid("username");
	type(txtUserName, name);
	
	WebElement txtpassword =   findlocatorbyid("password");
	  type(txtpassword, pass);
	
	WebElement btnlogin =   findlocatorbyid("login");
	  click(btnlogin); 
	
	WebElement location =   findlocatorbyid("location");
	  selectbytext(location, text);
	
	WebElement hotels =   findlocatorbyid("hotels");
	  selectbytext(hotels, text1);
	
	WebElement roomtype =   findlocatorbyid("room_type");
	  selectbytext(roomtype, text2);
	
	WebElement roomno =   findlocatorbyid("room_nos");
	  selectbytext(roomno, text3);
	
	WebElement indate =   findlocatorbyid("datepick_in");
	  type(indate, text4);
	
	WebElement outdate =   findlocatorbyid("datepick_out");
	  type(outdate, text5);
	
	WebElement adult =   findlocatorbyid("adult_room");
	  type(adult, text6);
	
	WebElement child =   findlocatorbyid("child_room");
	  type(child, text7);
	
	WebElement btnsubmit =   findlocatorbyid("Submit");
	  click(btnsubmit);
	
	WebElement radio =   findlocatorbyid("radiobutton_0");
	  click(radio);
	
	WebElement btncont =   findlocatorbyid("continue");
	  click(btncont);
	
	WebElement firstname =   findlocatorbyid("first_name");
	  type(firstname, text8);
	
	WebElement lastname =   findlocatorbyid("last_name");
	  type(lastname, text9);
	
	WebElement address =   findlocatorbyid("address");
	  type(address, text10);
	
	WebElement card =   findlocatorbyid("cc_num");
	  type(card, text11);
	
	WebElement cardtype =   findlocatorbyid("cc_type");
	  type(cardtype, text12);
	
	WebElement cardmonth =   findlocatorbyid("cc_exp_month");
	  type(cardmonth, text13);
	
	WebElement cardyear =   findlocatorbyid("cc_exp_year");
	  type(cardyear, text14);
	
	WebElement cvv =   findlocatorbyid("cc_cvv");
	  type(cvv, text15);
	
	WebElement btnbooknow =   findlocatorbyid("book_now");
	  click(btnbooknow);
	  
	  WebElement Hello = findlocatorbyid("username_show");
	  String data = Hello.getAttribute("value");
	  System.out.println(data);
	  Assert.assertTrue("Verifies Login page", data.contains("Hello"));
	  

    
	  
	  
	
		

	}
}
