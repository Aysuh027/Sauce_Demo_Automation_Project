package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By username = By.id("user-name");
	By password = By.id("password");
	By login = By.id("login-button");
	By Product_Heading = By.xpath("//span[@class ='title']");
	By Error_Message = By.tagName("h3");

	public String GetProductText() {

		return driver.findElement(Product_Heading).getText();
	}

	public String GetErrorText() {

		return driver.findElement(Error_Message).getText();
	}

	public void EnterUserName(String Username) {
		driver.findElement(username).sendKeys(Username);
	}

	public void EnterPassword(String Password) {

		driver.findElement(password).sendKeys(Password);
	}

	public void ClickLoginButton() {

		driver.findElement(login).click();
	}

	public void LoginSauceDemo(String Username, String Password) {
		driver.findElement(username).sendKeys(Username);
		driver.findElement(password).sendKeys(Password);
		driver.findElement(login).click();
	}

}
