package org.LibGlobal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageSelectHotel extends BaseClass{
	
	public PageSelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(id="continue")
	private WebElement btncontinue;

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getBtncontinue() {
		return btncontinue;
	}
	
	public void selecthotel() {
		
		click(getRadiobutton());
		click(getBtncontinue());

	}
	
	

}
