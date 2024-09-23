package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;

	}

	By Menu_Button = By.id("react-burger-menu-btn");
	By All_Item_Button = By.xpath("//a[@id='inventory_sidebar_link']");
	By All_Item_Text = By.xpath("//a[@id='inventory_sidebar_link']");
	By About_Button = By.xpath("//a[@id='about_sidebar_link']");
	By Logout_Button = By.xpath("//a[@id='logout_sidebar_link']");
	By Reset_App_Button = By.xpath("//a[@id='reset_sidebar_link']");
	By Close_Menu_Button = By.xpath("//button[@id='react-burger-cross-btn']");
	By AddCart_Button = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	By Product_Link = By.id("header_container");
	By Shopping_Cart_Button = By.className("shopping_cart_link");
	By Social_Media = By.xpath("//a[contains(text(),'Twitter')]");

	public void ClickMenuButton() {

		driver.findElement(Menu_Button).click();
	}

	public void ClickAllItemButton() {

		driver.findElement(All_Item_Button).click();
	}
	public String ClickAllItemText() {

		return driver.findElement(All_Item_Text).getText();
	}
	public void ClickAboutButton() {

		driver.findElement(About_Button).click();
	}
	public void ClickLogOutButton() {

		driver.findElement(Logout_Button).click();
	}
	public void ClickResetAppButton() {

		driver.findElement(Reset_App_Button).click();
	}
	public void ClickCloseMenuButton() {

		driver.findElement(Close_Menu_Button).click();
	}
	public void ClickAddCartButton() {

		driver.findElement(AddCart_Button).click();
	}
	public void ClickProductLinkButton() {

		driver.findElement(Product_Link).click();
	}
	public void ClickShoppingCartButton() {

		driver.findElement(Shopping_Cart_Button).click();
	}
	public void ClickSocialMediaButton() {

		driver.findElement(Social_Media).click();
	}




}
