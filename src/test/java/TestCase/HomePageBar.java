package TestCase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectModel.HomePage;
import PageObjectModel.LoginPage;
import Utils.TestBase;

public class HomePageBar extends TestBase {
	@Test
	public void TestCase_001() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		login.LoginSauceDemo("standard_user", "secret_sauce");

		Thread.sleep(1000);

		String actualResult = login.GetProductText();
		String expectedResult = "Products";
		Assert.assertEquals(actualResult, expectedResult);
	}

	@Test
	public void TestCase_002() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		login.LoginSauceDemo("standard_user", "secret_sauce");
		home.ClickMenuButton();

		Thread.sleep(1000);
		boolean actualResult = home.GetMenuList();
		boolean expectedresult = true;
		Assert.assertEquals(actualResult, expectedresult);
		System.out.println(actualResult);
	}

	@Test
	public void TestCase_003() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		login.LoginSauceDemo("standard_user", "secret_sauce");
		home.ClickMenuButton();
		Thread.sleep(1000);
		home.ClickAllItemButton();

		Thread.sleep(1000);

		String actualResult = login.GetProductText();
		String expectedResult = "Products";
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println(actualResult);
	}

	@Test
	public void TestCase_004() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		login.LoginSauceDemo("standard_user", "secret_sauce");
		home.ClickMenuButton();
		Thread.sleep(1000);
		home.ClickAboutButton();

		Thread.sleep(1000);

		boolean actualResult = driver.findElement(By.xpath("//img[@alt='Saucelabs']")).isDisplayed();
		boolean expectedResult = true;
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println(actualResult);
		
	}

	@Test
	public void TestCase_005() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		login.LoginSauceDemo("standard_user", "secret_sauce");
		home.ClickMenuButton();
		Thread.sleep(1000);
		home.ClickLogOutButton();

		Thread.sleep(1000);

		String actualResult  = home.GetLoginLogo();
		String expectedResult = "Swag Labs";
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println(actualResult);
	}

	@Test
	public void TestCase_006() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		login.LoginSauceDemo("standard_user", "secret_sauce");
		home.ClickMenuButton();
		Thread.sleep(1000);
		home.ClickResetAppButton();

		Thread.sleep(1000);

		String actualResult = login.GetProductText();
		String expectedResult = "Products";
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println(actualResult);
	}

	@Test
	public void TestCase_007() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver);
		login.LoginSauceDemo("standard_user", "secret_sauce");
		home.ClickAddCartButton_1();
		Thread.sleep(1000);

		String actualResult = home.GetShoppingItemCount();
		String expectedResult = "1";
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println(actualResult);
	}

}
