package org.LibGlobal;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Adactin {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseClass b = new BaseClass();
		
	
		b.getdriver();
		b.loadurl("https://adactinhotelapp.com/");
		b.maximize();
		
		String name = b.readdata("Datas", 1, 0 );
		String pass = b.readdata("Datas", 1, 1);
		String text = b.readdata("Datas", 1, 2);
		String text1 = b.readdata("Datas", 1, 3);
		String text2 = b.readdata("Datas", 1, 4);
		String text3 = b.readdata("Datas", 1, 5);
		String text4 = b.readdata("Datas", 1, 6);
		String text5 = b.readdata("Datas", 1, 7);
		String text6 = b.readdata("Datas", 1, 8);
		String text7 = b.readdata("Datas", 1, 9);
		String text8 = b.readdata("Datas", 1, 10);
		String text9 = b.readdata("Datas", 1, 11);
		String text10 = b.readdata("Datas", 1, 12);
		String text11 = b.readdata("Datas", 1, 13);
		String text12 = b.readdata("Datas", 1, 14);
		String text13 = b.readdata("Datas", 1, 15);
		String text14 = b.readdata("Datas", 1, 16);
		String text15 = b.readdata("Datas", 1, 17);
		
		
		
		WebElement txtUserName = b.findlocatorbyid("username");
		b.type(txtUserName, name);
		
		WebElement txtpassword = b.findlocatorbyid("password");
		b.type(txtpassword, pass);
		
		WebElement btnlogin = b.findlocatorbyid("login");
		b.click(btnlogin); 
		
		WebElement location = b.findlocatorbyid("location");
		b.selectbytext(location, text);
		
		WebElement hotels = b.findlocatorbyid("hotels");
		b.selectbytext(hotels, text1);
		
		WebElement roomtype = b.findlocatorbyid("room_type");
		b.selectbytext(roomtype, text2);
		
		WebElement roomno = b.findlocatorbyid("room_nos");
		b.selectbytext(roomno, text3);
		
		WebElement indate = b.findlocatorbyid("datepick_in");
		b.type(indate, text4);
		
		WebElement outdate = b.findlocatorbyid("datepick_out");
		b.type(outdate, text5);
		
		WebElement adult = b.findlocatorbyid("adult_room");
		b.type(adult, text6);
		
		WebElement child = b.findlocatorbyid("child_room");
		b.type(child, text7);
		
		WebElement btnsubmit = b.findlocatorbyid("Submit");
		b.click(btnsubmit);
		
		WebElement radio = b.findlocatorbyid("radiobutton_0");
		b.click(radio);
		
		WebElement btncont = b.findlocatorbyid("continue");
		b.click(btncont);
		
		WebElement firstname = b.findlocatorbyid("first_name");
		b.type(firstname, text8);
		
		WebElement lastname = b.findlocatorbyid("last_name");
		b.type(lastname, text9);
		
		WebElement address = b.findlocatorbyid("address");
		b.type(address, text10);
		
		WebElement card = b.findlocatorbyid("cc_num");
		b.type(card, text11);
		
		WebElement cardtype = b.findlocatorbyid("cc_type");
		b.type(cardtype, text12);
		
		WebElement cardmonth = b.findlocatorbyid("cc_exp_month");
		b.type(cardmonth, text13);
		
		WebElement cardyear = b.findlocatorbyid("cc_exp_year");
		b.type(cardyear, text14);
		
		WebElement cvv = b.findlocatorbyid("cc_cvv");
		b.type(cvv, text15);
		
		WebElement btnbooknow = b.findlocatorbyid("book_now");
		b.click(btnbooknow);
		
		Thread.sleep(10000);
		

        WebElement orderno = b.findlocatorbyid("order_no");
        String data = b.getattributevalue(orderno);
        b.writeDataInCell("Datas", 1, 18, data);
		
 	}

}
