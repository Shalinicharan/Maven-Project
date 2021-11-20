package org.LibGlobal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageBookHotel extends BaseClass {
	
	public PageBookHotel() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	
	@FindBy(id="last_name")
	private WebElement txtLastName;
	
	@FindBy(id="address")
	private WebElement txtAddress;
	
	@FindBy(id="cc_num")
	private WebElement txtCardNo;
	
	@FindBy(id="cc_type")
	private WebElement dDnCcType;
	
	@FindBy(id="cc_exp_month")
	private	WebElement dDnMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement dDnYear;
	
	@FindBy(id="cc_cvv")
	private WebElement txtCvv;
	
	@FindBy(id="book_now")
	private WebElement btnbooknow;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCardNo() {
		return txtCardNo;
	}

	public WebElement getdDnCcType() {
		return dDnCcType;
	}

	public WebElement getdDnMonth() {
		return dDnMonth;
	}

	public WebElement getdDnYear() {
		return dDnYear;
	}

	public WebElement getTxtCvv() {
		return txtCvv;
	}

	public WebElement getBtnbooknow() {
		return btnbooknow;
	}
	
	public void bookHotel(String firstname,String lastname,String address,String cardno,
			String cardtype,String month,String year,String cvv) {
		
		type(getTxtFirstName(),firstname);
		type(getTxtLastName(), lastname);
		type(getTxtAddress(), address);
		type(getTxtCardNo(), cardno);
		selectbytext(getdDnCcType(), cardtype);
		selectbytext(getdDnMonth(), month);
		selectbytext(getdDnYear(), year);
		type(getTxtCvv(), cvv);
		click(getBtnbooknow());
		
		
		
	}

}
