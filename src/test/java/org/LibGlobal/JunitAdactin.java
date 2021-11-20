package org.LibGlobal;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;



public class JunitAdactin extends BaseClass{
	
	@BeforeClass
	public static void beforeClass() {
		getdriver();
		loadurl("https://adactinhotelapp.com/");
		maximize();
	}
	
	@AfterClass
	public static void afterClass() {
		quit();
		
	}
	
	@Test
	public void testadactin() throws IOException {
		
		String name = readdata("datas", 1, 0);
		WebElement txtUserName = findlocatorbyid("username");
		type(txtUserName, name);
		String username = getattributevalue(txtUserName);
		Assert.assertEquals("Verify Username",name, username );
		
		String pass = readdata("datas", 1, 1);
		WebElement txtpassword = findlocatorbyid("password");
		type(txtpassword, pass);
		String password = getattributevalue(txtpassword);
		Assert.assertEquals("verify Password",pass,password );
		
		WebElement btnlogin = findlocatorbyid("login");
		click(btnlogin);
		
		

	}
	
	
	

}
