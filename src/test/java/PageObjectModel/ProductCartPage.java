package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductCartPage {

	WebDriver driver;

	public ProductCartPage(WebDriver driver) {
		this.driver = driver;
	}

	By Remove_Button = By.id("remove-sauce-labs-bike-light");
	By Continue_Shopping_Button = By.id("continue-shopping");
	By CheckOut_Button = By.id("checkout");
	By CheckoutInformation_Text = By.xpath("//span[@class='title']");
	By CartTitleText = By.xpath("//span[@class='title']");

	public void ClickRemove_Button() {
		driver.findElement(Remove_Button).click();
	}

	public void ClickContinue_Shopping_Button() {
		driver.findElement(Continue_Shopping_Button).click();
	}

	public void ClickCheckOut_Button() {
		driver.findElement(CheckOut_Button).click();
	}

	public String GetCheckoutInformation_Text() {
		return driver.findElement(CheckoutInformation_Text).getText();
	}

	public String GetCartTitleText() {
		return driver.findElement(CartTitleText).getText();
	}
}
