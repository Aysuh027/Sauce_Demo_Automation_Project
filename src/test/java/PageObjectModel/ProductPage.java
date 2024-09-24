package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

	WebDriver driver;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}

	By ProductLink = By.id("item_4_title_link");
	By ProductText = By.xpath("//div[@class='inventory_details_name large_size']");
	By AddCart_Button = By.id("add-to-cart");
	By Remove_Button = By.id("remove");
	By BackToProduct_Button = By.id("back-to-products");

	public void ClickProductLink() {

		driver.findElement(ProductLink).click();
	}

	public String GetProductText() {

		return driver.findElement(ProductText).getText();
	}
	
	public void ClickAddCart_Button() {
		driver.findElement(AddCart_Button).click();
	}
	
	public void ClickRemoveButton() {
		driver.findElement(Remove_Button).click();
	}
	public void ClickBackProductButton() {
		driver.findElement(BackToProduct_Button).click();
	}
}
