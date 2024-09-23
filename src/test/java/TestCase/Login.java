package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjectModel.LoginPage;
import Utils.TestBase;

public class Login extends TestBase {
	
	
	@Test
	public void TestCase_001() throws InterruptedException {
	
		LoginPage login = new LoginPage(driver);
		login.EnterUserName("standard_user");
		login.EnterPassword("secret_sauce");
		login.ClickLoginButton();
		
		Thread.sleep(1000);
		String actualResult = login.GetProductText();
		String expectedResult = "Products";
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void TestCase_002() throws InterruptedException {
	
		LoginPage login = new LoginPage(driver);
		login.EnterUserName("standard_user");
		login.EnterPassword("secret");
		login.ClickLoginButton();
		
		Thread.sleep(1000);
		String actualResult = login.GetErrorText();
		String expectedResult = "Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println(actualResult);
	}
	
	@Test
	public void TestCase_003() throws InterruptedException {
	
		LoginPage login = new LoginPage(driver);
		login.EnterUserName("standard");
		login.EnterPassword("secret_sauce");
		login.ClickLoginButton();
		
		Thread.sleep(1000);
		String actualResult = login.GetErrorText();
		String expectedResult = "Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println(actualResult);
	}
	
	@Test
	public void TestCase_004() throws InterruptedException {
	
		LoginPage login = new LoginPage(driver);
		login.EnterUserName("standard");
		login.EnterPassword("secret");
		login.ClickLoginButton();
		
		Thread.sleep(1000);
		String actualResult = login.GetErrorText();
		String expectedResult = "Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println(actualResult);
	}
	
	@Test
	public void TestCase_005() throws InterruptedException {
	
		LoginPage login = new LoginPage(driver);
		login.EnterUserName("locked_out_user");
		login.EnterPassword("secret_sauce");
		login.ClickLoginButton();
		
		Thread.sleep(1000);
		String actualResult = login.GetProductText();
		String expectedResult = "Products";
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println(actualResult);
	}
	
	
	@Test
	public void TestCase_006() throws InterruptedException {
	
		LoginPage login = new LoginPage(driver);
		login.EnterUserName("problem_user");
		login.EnterPassword("secret_sauce");
		login.ClickLoginButton();
		
		Thread.sleep(1000);
		String actualResult = login.GetProductText();
		String expectedResult = "Products";
		Assert.assertEquals(actualResult, expectedResult);
	}

	@Test
	public void TestCase_007() throws InterruptedException {
	
		LoginPage login = new LoginPage(driver);
		login.EnterUserName("performance_glitch_user");
		login.EnterPassword("secret_sauce");
		login.ClickLoginButton();
		
		Thread.sleep(1000);
		String actualResult = login.GetProductText();
		String expectedResult = "Products";
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void TestCase_008() throws InterruptedException {
	
		LoginPage login = new LoginPage(driver);
		login.EnterUserName("error_user");
		login.EnterPassword("secret_sauce");
		login.ClickLoginButton();
		
		Thread.sleep(1000);
		String actualResult = login.GetProductText();
		String expectedResult = "Products";
		Assert.assertEquals(actualResult, expectedResult);
	}
	@Test
	public void TestCase_009() throws InterruptedException {
	
		LoginPage login = new LoginPage(driver);
		login.EnterUserName("visual_user");
		login.EnterPassword("secret_sauce");
		login.ClickLoginButton();
		
		Thread.sleep(1000);
		String actualResult = login.GetProductText();
		String expectedResult = "Products";
		Assert.assertEquals(actualResult, expectedResult);
	}
}
