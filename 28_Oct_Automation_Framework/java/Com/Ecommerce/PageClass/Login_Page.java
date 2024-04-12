package Com.Ecommerce.PageClass;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.Utilites.GenericUtils;

public class Login_Page extends Ecommerce_BaseClass {

	// Rohit123@gmail.com
	// Pass@123

	public Login_Page() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),\"Log in\")]")
	private WebElement HomePageLoginButon;

	@FindBy(xpath = "//img[@alt=\"nopCommerce demo store\"]")
	private WebElement LoginPageSymbol;

	@FindBy(xpath = "//h1[contains(text(),\"Welcome, Please Sign In!\")]")
	private WebElement Welcome_Text;

	@FindBy(xpath = "//strong[contains(text(),\"New Customer\")]")
	private WebElement New_Customer_Text;

	@FindBy(xpath = "//div[contains(text(),\"By creating an account on our website, you\")]")
	private WebElement New_Customer_Info;

	@FindBy(xpath = "//button[@class=\"button-1 register-button\"]")
	private WebElement New_RegistrationButton;

	@FindBy(xpath = "//strong[contains(text(),\"Returning Customer\")]")
	private WebElement Returing_Customer_text;

	@FindBy(id = "Email")
	private WebElement Email;

	@FindBy(id = "Password")
	private WebElement Password;

	@FindBy(xpath = "//label[contains(text(),\"Remember me?\")]")
	private WebElement Remember_me;

	@FindBy(xpath = "//a[contains(text(),\"Forgot password?\")]")
	private WebElement ForgotPass_Link;

	@FindBy(xpath = "//button[contains(text(),\"Log in\")]")
	private WebElement Login_Button;

	@FindBy(xpath = "//h2[contains(text(),\"About login / registration\")]")
	private WebElement About_Page;

	@FindBy(xpath = "//a[contains(text(),\"My account\")]")
	private WebElement My_Account;

	// ------------------

	public void Home_Page_Login() {
	//	GenericUtils.Wait_for_element(driver, HomePageLoginButon, 15);
		HomePageLoginButon.click();
	}

	public void Login_Symbol() throws IOException {
		boolean result = LoginPageSymbol.isDisplayed();

		if (result = true) {

			Assert.assertTrue(true);
		} else {
			GenericUtils.GetScreenshotAs();
			Assert.assertTrue(false);
		}
	}

	public void WelCome_Text() throws IOException {
		boolean result = Welcome_Text.isDisplayed();

		if (result = true) {
			Assert.assertTrue(true);
		} else {
			GenericUtils.GetScreenshotAs();
			Assert.assertTrue(false);
		}
	}

	public void NewCustomer_Text() throws IOException {
		boolean result = New_Customer_Text.isDisplayed();
		if (result = true) {
			Assert.assertTrue(true);
		} else {
			GenericUtils.GetScreenshotAs();
			Assert.assertTrue(false);
		}
	}

	public void New_Customer_Info() throws IOException {
		boolean result = New_Customer_Info.isDisplayed();
		if (result = true) {
			Assert.assertTrue(true);
		} else {
			GenericUtils.GetScreenshotAs();
			Assert.assertTrue(false);
		}
	}

	public void New_Reg_Button() {
		boolean result = New_RegistrationButton.isEnabled();
		if (result = true) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	public void Returing_CustomerText() throws IOException {
		boolean result = Returing_Customer_text.isDisplayed();
		if (result = true) {
			Assert.assertTrue(true);
		} else {
			GenericUtils.GetScreenshotAs();
			Assert.assertTrue(false);
		}
	}

	public void SetEmail() {
		Email.sendKeys(UNAME);
	}
	
	public void SetAutoEmail(String Emaill) {
		Email.sendKeys(Emaill);
	}

	public void SetAutoPass(String PASSName) {
		Password.sendKeys(PASSName);
	}

	public void SetPass() {
		Password.sendKeys(PASS);
	}
	
	public void Remember_me() throws IOException {
		boolean result = Remember_me.isDisplayed();
		if (result = true) {
			Assert.assertTrue(true);
		} else {
			GenericUtils.GetScreenshotAs();
			Assert.assertTrue(false);
		}

		Remember_me.click();
	}

	public void Forgot_pass() {
		ForgotPass_Link.isEnabled();
	}

	public void AboutPage() {
		About_Page.isDisplayed();
	}

	public void LoginButton() {
		Login_Button.click();
	}

	public void Login_Successfuly() throws IOException {
		boolean result = My_Account.isDisplayed();
		if (result = true) {
			GenericUtils.GetScreenshotAs();
			Assert.assertTrue(true);

		} else {
			GenericUtils.GetScreenshotAs();
			Assert.assertTrue(false);
		}
	}

}
