package Com.Ecommerce.PageClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.Utilites.GenericUtils;

public class AddTo_Cart extends Ecommerce_BaseClass {

	public AddTo_Cart() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class=\"ico-account\"]")
	private WebElement My_Account;

	@FindBy(xpath = "//a[@class=\"ico-logout\"]")
	private WebElement Log_Out;

	@FindBy(xpath = "//a[@class=\"ico-wishlist\"]")
	private WebElement WishList;

	@FindBy(xpath = "//img[@alt=\"nopCommerce demo store\"]")
	private WebElement Logo;

	@FindBy(id = "small-searchterms")
	private WebElement Search;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement Search_Button;

	@FindBy(xpath = "//img[@alt=\"Picture of Nokia Lumia 1020\"]")
	private WebElement Mobile_Pic;

	@FindBy(xpath = "//a[contains(text(),\"Nokia Lumia 1020\")]")
	private WebElement Mobile_Name;

	@FindBy(xpath = "//span[@class=\"price actual-price\"]")
	private WebElement Mobile_Price;

	@FindBy(xpath = "//button[@class=\"button-2 add-to-wishlist-button\"]")
	private WebElement Add_WishList;

	@FindBy(xpath = "//button[@class=\"button-2 add-to-compare-list-button\"]")
	private WebElement Add_CompairList;

	@FindBy(xpath = "//button[@class=\"button-2 product-box-add-to-cart-button\"]")
	private WebElement Add_cart;

	@FindBy(xpath = "//p[contains(text(),\"The product has been added to your \")]")
	private WebElement Msg_Add_cart;

	@FindBy(xpath = "//span[@class=\"close\"]")
	private WebElement Close_PopUp;

	@FindBy(xpath = "//a[@class=\"ico-cart\"]")
	private WebElement ShopingCart;

	@FindBy(xpath = "//div[@class=\"page-title\"]")
	private WebElement Cart_Title;

	@FindBy(xpath = "//span[contains(text(),\"Shopping cart\")]")
	private WebElement CartButton;

	// --------------------

	public void Icon() throws IOException {
		boolean tt = My_Account.isEnabled();

		if (tt = true) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
			GenericUtils.GetScreenshotAs();
		}

	}

	public void MyAcc() throws IOException {
		boolean tt = Log_Out.isEnabled();
		if (tt = true) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
			GenericUtils.GetScreenshotAs();
		}
	}

	public void WishLishtlOGO() throws IOException {
		boolean tt = WishList.isEnabled();
		if (tt = true) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
			GenericUtils.GetScreenshotAs();
		}
	}

	public void Logo() throws IOException {
		boolean tt = Logo.isDisplayed();
		if (tt = true) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
			GenericUtils.GetScreenshotAs();
		}
	}

	public void SearchEngine() {
		Search.sendKeys("Nokia");

	}

	public void SearchButton() throws IOException {
		Search_Button.click();
	}

	public void MOb_Pic() throws IOException {
		boolean tt = Mobile_Pic.isDisplayed();
		if (tt = true) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
			GenericUtils.GetScreenshotAs();
		}
	}

	public void Mob_name() throws IOException {
		boolean tt = Mobile_Name.isDisplayed();
		if (tt = true) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
			GenericUtils.GetScreenshotAs();
		}
	}

	public void MOb_Price() throws IOException {
		boolean tt = Mobile_Price.isDisplayed();
		if (tt = true) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
			GenericUtils.GetScreenshotAs();
		}
	}

	public void WishList1() throws IOException {
		boolean tt = WishList.isEnabled();
		if (tt = true) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
			GenericUtils.GetScreenshotAs();
		}
	}

	public void CompairList() throws IOException {
		boolean tt = Add_CompairList.isEnabled();
		if (tt = true) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
			GenericUtils.GetScreenshotAs();
		}
	}

	public void AddCart() {
		Add_cart.click();
	}

	public void Cart_Mst() throws IOException {
		boolean tt = Msg_Add_cart.isDisplayed();
		if (tt = true) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
			GenericUtils.GetScreenshotAs();
		}
	}

	public void CLosePopUP() throws IOException {
		Close_PopUp.click();
	}

	public void CartButton() throws IOException {

		CartButton.click();
		GenericUtils.GetScreenshotAs();
	}
}
