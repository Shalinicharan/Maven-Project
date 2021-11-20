package org.LibGlobal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLogin extends BaseClass {
	
	public PageLogin() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="username")
	private WebElement txtUserName;
	
	@FindBy(id="password")
	private WebElement txtpassword;
	
	@FindBy(id="login")
	private WebElement btnlogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	public void login(String username,String password) {
		type(getTxtUserName(), username);
		type(getTxtpassword(), password);
		click(getBtnlogin());
		
		
	}
	
	

}
