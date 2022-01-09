package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage(EdgeDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//@FindBys
	//@FindAll
	
	@CacheLookup
	@FindBy(how = How.ID, using = "username")
	WebElement userName;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "password")
	WebElement passWord;

	public LoginPage enterUsername(String username) {
		// TODO Auto-generated method stub
		// Find the user name and enter the value
		// driver.findElement(By.id("username")).sendKeys(username);

		userName.sendKeys(username);

		return this;
	}

	public LoginPage enterPassword(String password) {
		// TODO Auto-generated method stub
		// Find the password and enter the password
		// driver.findElement(By.id("password")).sendKeys(password);

		passWord.sendKeys(password);
		return this;
	}

	public HomePage clickLogin() {
		// TODO Auto-generated method stub
		// Find the login and click
		driver.findElement(By.className("decorativeSubmit")).click();

		return new HomePage(driver);
	}

}