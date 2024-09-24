package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectModel.HomePage;
import PageObjectModel.LoginPage;
import PageObjectModel.ProductCartPage;
import PageObjectModel.ProductPage;
import Utils.TestBase;

public class ProductCart extends TestBase {

	@Test
	public void TestCase_001() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		ProductPage product = new ProductPage(driver);
		ProductCartPage cart = new ProductCartPage(driver);

		login.LoginSauceDemo("standard_user", "secret_sauce");
		home.ClickAddCartButton_1();
		home.ClickAddCartButton_2();
		home.ClickAddCartButton_3();
		home.ClickShoppingCartButton();
		cart.ClickRemove_Button();
		home.GetShoppingItemCount();

		Thread.sleep(1000);

		String actualResult = home.GetShoppingItemCount();
		String expectedResult = "2";
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println(actualResult);

	}

	@Test
	public void TestCase_002() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		ProductPage product = new ProductPage(driver);
		ProductCartPage cart = new ProductCartPage(driver);

		login.LoginSauceDemo("standard_user", "secret_sauce");
		home.ClickShoppingCartButton();
		cart.ClickContinue_Shopping_Button();

		Thread.sleep(1000);

		String actualResult = login.GetProductText();
		String expectedResult = "Products";
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println(actualResult);

	}

	@Test
	public void TestCase_003() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		ProductPage product = new ProductPage(driver);
		ProductCartPage cart = new ProductCartPage(driver);

		login.LoginSauceDemo("standard_user", "secret_sauce");
		home.ClickAddCartButton_1();
		home.ClickAddCartButton_2();
		home.ClickAddCartButton_3();
		home.ClickShoppingCartButton();
		cart.ClickCheckOut_Button();

		Thread.sleep(1000);

		String actualResult = cart.GetCheckoutInformation_Text();
		String expectedResult = "Checkout: Your Information";
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println(actualResult);

	}

}
