package Com.Ecommerce.PageClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.Utilites.GenericUtils;

public class New_Registration extends Ecommerce_BaseClass{

	// 1 Create Constructor of class

	public New_Registration() {

		PageFactory.initElements(driver, this);
	}

	// 2 Find All locators of Web element of respected page

	@FindBy(xpath = "//a[contains(text(),\"Register\")]")
	private WebElement Register;

	@FindBy(xpath = "//h1[contains(text(),\"Register\")]")
	private WebElement RegText;

	@FindBy(xpath = "//strong[contains(text(),\"Your Personal Details\")]")
	private WebElement PersonlText;

	@FindBy(xpath = "(//input[@type=\"radio\"])[1]")
	private WebElement GenderMale;

	@FindBy(xpath = "(//input[@type=\"radio\"])[2]")
	private WebElement GenderFemale;

	@FindBy(id = "FirstName")
	private WebElement FName;

	@FindBy(id = "LastName")
	private WebElement LName;

	@FindBy(xpath = "//select[@name=\"DateOfBirthDay\"]")
	private WebElement Day;

	@FindBy(xpath = "//select[@name=\"DateOfBirthMonth\"]")
	private WebElement Month;

	@FindBy(xpath = "//select[@name=\"DateOfBirthYear\"]")
	private WebElement Year;

	@FindBy(id = "Email")
	private WebElement email;

	@FindBy(xpath = "//strong[contains(text(),\"Company Details\")]")
	private WebElement CompanyText;

	@FindBy(id = "Company")
	private WebElement CompanyDetails;

	@FindBy(xpath = "//strong[contains(text(),\"Your Password\")]")
	private WebElement PasswordTest;

	@FindBy(id = "Password")
	private WebElement Passwords;

	@FindBy(id = "ConfirmPassword")
	private WebElement CPassword;

	@FindBy(id = "register-button")
	private WebElement RegistrationButton;

	@FindBy(xpath = "//div[contains(text(),\"Your registration completed\")]")
	private WebElement Registration_Msg;

	// 3 Creating method for Each element which is present in respective page

	public void Registrtion() {
		Register.click();
	}

	public void Regestration_Text() {
		RegText.isDisplayed();
	}

	public void Personal_Text() {
		PersonlText.isDisplayed();
	}

	public void GenMale() {
		GenderMale.click();
	}

	public void GenFemale() {
		GenderFemale.click();
	}

	public void FirstName(String Name) {
		FName.sendKeys(Name);
	}

	public void LastName(String Lastname) {
		LName.sendKeys(Lastname);
	}

	public void Date(String date) {
		Select S1 = new Select(Day);
		S1.selectByValue(date);
	}

	public void Months(String month) {
		Select S2 = new Select(Month);
		S2.selectByValue(month);
	}

	public void Years(String year) {
		Select S3 = new Select(Year);
		S3.selectByValue(year);
	}

	public void Email(String Email) {
		email.sendKeys(Email);
	}

	public void Company_Test() {
		CompanyText.isDisplayed();
	}

	public void CompanyName(String company_Details) {
		CompanyDetails.sendKeys(company_Details);
	}

	public void Password_Text() {
		PasswordTest.isDisplayed();
	}

	public void Pass(String pass) {
		Passwords.sendKeys(pass);
	}

	public void Conform_Pass(String Cpass) {
		CPassword.sendKeys(Cpass);
	}

	public void Reg_Button() {
		RegistrationButton.click();
	}

	public void Reg_Conform() throws IOException {
		boolean result = Registration_Msg.isDisplayed();
		
//		Assert.assertEquals(result, true);
//
//		Assert.assertEquals(result, false, "Reg_Faild");

		if (result = true) {
			Assert.assertTrue(true);
			GenericUtils.GetScreenshotAs();

		} else {
			GenericUtils.GetScreenshotAs();
			Assert.assertTrue(false);
		}

	}

}
