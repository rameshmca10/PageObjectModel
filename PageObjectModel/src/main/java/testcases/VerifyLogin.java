package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class VerifyLogin extends BaseClass {

	@BeforeTest
	public void setData() {
		fileName = "Login";
	}

	@Test(dataProvider = "sendData")
	public void verifyLogin(String un, String pw) {
		// TODO Auto-generated constructor stub
		System.out.println("LoginPage Title: " + driver.getTitle());

		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(un).enterPassword(pw).clickLogin();

		System.out.println("HomePage Title: " + driver.getTitle());
	}
}