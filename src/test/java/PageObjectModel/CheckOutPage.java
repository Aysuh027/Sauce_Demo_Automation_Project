package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {

	WebDriver driver;

	public CheckOutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By firstname = By.id("first-name");
	By lastname = By.id("last-name");
	By postalcode = By.id("postal-code");
	By Cancel_Button = By.id("cancel");
	By ContinueButtion = By.id("continue");
	By CheckOutTitle = By.xpath("//span[@class='title']");
	
	public void EnterFirstName(String Firstname) {
		driver.findElement(firstname).sendKeys(Firstname);
	}
	public void EnterLasstName(String Lastname) {
		driver.findElement(lastname).sendKeys(Lastname);
	}
	public void Postalcode(String Postalcode) {
		driver.findElement(postalcode).sendKeys(Postalcode);
	}
	 public void ClickCancel_Button() {
		 driver.findElement(Cancel_Button).click();
	 }
	 public void ClickContinue_Button() {
		 driver.findElement(ContinueButtion).click();
	 }
	 
	 public String GetCheckOutTitle() {
		 return driver.findElement(CheckOutTitle).getText();
	 }
	
}
