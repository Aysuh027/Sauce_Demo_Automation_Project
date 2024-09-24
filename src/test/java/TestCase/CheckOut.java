package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectModel.CheckOutPage;
import PageObjectModel.HomePage;
import PageObjectModel.LoginPage;
import PageObjectModel.ProductCartPage;
import PageObjectModel.ProductPage;
import Utils.TestBase;

public class CheckOut extends TestBase {

	@Test
	public void TestCase_001() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		ProductPage product = new ProductPage(driver);
		CheckOutPage CheckOut = new CheckOutPage(driver);
		ProductCartPage cart = new ProductCartPage(driver);

		login.LoginSauceDemo("standard_user", "secret_sauce");
		home.ClickAddCartButton_1();
		home.ClickAddCartButton_2();
		home.ClickAddCartButton_3();
		home.ClickShoppingCartButton();
		cart.ClickCheckOut_Button();
		home.ClickShoppingCartButton();

		Thread.sleep(1000);

		String actualResult = cart.GetCartTitleText();
		String expectedResult = "Your Cart";
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println(actualResult);

	}

	@Test
	public void TestCase_002() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		ProductPage product = new ProductPage(driver);
		CheckOutPage CheckOut = new CheckOutPage(driver);
		ProductCartPage cart = new ProductCartPage(driver);

		login.LoginSauceDemo("standard_user", "secret_sauce");
		home.ClickAddCartButton_1();
		home.ClickAddCartButton_2();
		home.ClickAddCartButton_3();
		home.ClickShoppingCartButton();
		cart.ClickCheckOut_Button();
		CheckOut.ClickCancel_Button();

		Thread.sleep(1000);

		String actualResult = cart.GetCartTitleText();
		String expectedResult = "Your Cart";
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println(actualResult);

	}
	@Test
	public void TestCase_003() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		ProductPage product = new ProductPage(driver);
		CheckOutPage CheckOut = new CheckOutPage(driver);
		ProductCartPage cart = new ProductCartPage(driver);

		login.LoginSauceDemo("standard_user", "secret_sauce");
		home.ClickAddCartButton_1();
		home.ClickAddCartButton_2();
		home.ClickAddCartButton_3();
		home.ClickShoppingCartButton();
		cart.ClickCheckOut_Button();
		CheckOut.EnterFirstName("Rahul");
		CheckOut.EnterLasstName("Singh");
		CheckOut.Postalcode("1234");
		CheckOut.ClickContinue_Button();

		Thread.sleep(1000);

		String actualResult = CheckOut.GetCheckOutTitle();
		String expectedResult = "Checkout: Overview";
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println(actualResult);

	}

}
