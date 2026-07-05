package org.pom;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {



	@CacheLookup
	@FindBys({ @FindBy(id = "username"), @FindBy(xpath = "//input[@type='text']") })
	private WebElement txtUserName;

	@CacheLookup
	@FindAll({ @FindBy(id = "Password"), @FindBy(name = "password") })
	private WebElement txtPassword;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement btnLogin;

	@FindBy(id = "username_show")
	private WebElement VerifySearchHotelPage;

	@FindBy(xpath = "//div[@class='auth_error']")
	private WebElement verifyErrorMessage;

	public WebElement getVerifyErrorMessage() {
		return verifyErrorMessage;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getVerifySearchHotelPage() {
		return VerifySearchHotelPage;
	}

	public WebElement getTxtxUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

}
