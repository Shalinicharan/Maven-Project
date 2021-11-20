package org.LibGlobal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageCancelBooking extends BaseClass {
	
	public PageCancelBooking() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement btnBookedItinery;
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	private WebElement cancel1;
	
	@FindBy(id="logout")
	private WebElement btnLogOut;

	public WebElement getBtnBookedItinery() {
		return btnBookedItinery;
	}

	public WebElement getCancel1() {
		return cancel1;
	}

	public WebElement getBtnLogOut() {
		return btnLogOut;
	}
	
	private void cancelBooking() {
		click(getBtnBookedItinery());
		click(getCancel1());
		click(getBtnLogOut());

	}
	
	


}
