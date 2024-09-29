package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectModel.HomePage;
import PageObjectModel.LoginPage;
import PageObjectModel.ProductPage;
import Utils.TestBase;

public class Product extends TestBase {

	@Test
	public void TestCase_001() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		ProductPage product = new ProductPage(driver);
		login.LoginSauceDemo("standard_user", "secret_sauce");
		Thread.sleep(1000);
		product.ClickProductLink();

		Thread.sleep(1000);

		String actualResult = product.GetProductText();
		String expectedResult = "Sauce Labs Backpack";
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println(actualResult);

	}
	@Test
	public void TestCase_002() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		ProductPage product = new ProductPage(driver);
		login.LoginSauceDemo("standard_user", "secret_sauce");
		Thread.sleep(1000);
		product.ClickProductLink();
		Thread.sleep(1000);
		product.ClickAddCart_Button();

		Thread.sleep(1000);

		String actualResult = home.GetShoppingItemCount();
		String expectedResult = "1";
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println(actualResult);

	}
	@Test
	public void TestCase_003() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		ProductPage product = new ProductPage(driver);
		login.LoginSauceDemo("standard_user", "secret_sauce");
		Thread.sleep(1000);
		product.ClickProductLink();
		product.ClickAddCart_Button();
		product.ClickRemoveButton();

		Thread.sleep(1000);

		String actualResult = home.GetShoppingItemCount();
		String expectedResult = "";
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println(actualResult);

	}
	@Test
	public void TestCase_004() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		ProductPage product = new ProductPage(driver);
		login.LoginSauceDemo("standard_user", "secret_sauce");
		Thread.sleep(1000);
		product.ClickProductLink();
		Thread.sleep(1000);
		product.ClickBackProductButton();

		Thread.sleep(1000);

		String actualResult = login.GetProductText();
		String expectedResult = "Products";
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println(actualResult);

	}

}