package org.LibGlobal;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageBookingConfirmation extends BaseClass {
	
	public PageBookingConfirmation() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	private WebElement orderno;
	
	public WebElement getOrderno() {
		return orderno;
	}
	@FindBy(id="logout")
	private WebElement btnlogout;

	public WebElement getBtnlogout() {
		return btnlogout;
	}
	
	public void confirmation() throws IOException {
		
		writeData("Sheet1", 0, 0);


		click(getBtnlogout());

	}

}
