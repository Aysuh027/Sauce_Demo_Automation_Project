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
	By AddCart_Button_1 = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	By AddCart_Button_2 = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
	By AddCart_Button_3 = By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
	By Product_Link = By.id("header_container");
	By Shopping_Cart_Button = By.className("shopping_cart_link");
	By Social_Media = By.xpath("//a[contains(text(),'Twitter')]");
	By MenuItem_List = By.xpath("//nav[@class='bm-item-list']");
	By ShoppingItem_Count = By.className("shopping_cart_badge");
	By LoginPageLogo = By.xpath("//div[@class='login_logo']");

	public String GetLoginLogo() {
		return driver.findElement(LoginPageLogo).getText();
	}

	public String GetShoppingItemCount() {

		return driver.findElement(ShoppingItem_Count).getText();
	}

	public boolean GetMenuList() {
		return driver.findElement(MenuItem_List).isDisplayed();
	}

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

	public void ClickAddCartButton_1() {

		driver.findElement(AddCart_Button_1).click();
	}
	public void ClickAddCartButton_2() {

		driver.findElement(AddCart_Button_2).click();
	}
	public void ClickAddCartButton_3() {

		driver.findElement(AddCart_Button_3).click();
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
