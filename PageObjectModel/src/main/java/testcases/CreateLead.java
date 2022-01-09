package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class CreateLead extends BaseClass {
	
	@BeforeTest
	public void setData() {
		fileName = "CreateLead";
	}

	@Test(dataProvider = "sendData")
	public void createLead(String un,String pw,String cn,String fn,String ln,String ds) {
		// TODO Auto-generated constructor stub
		System.out.println("LoginPage Title: "+driver.getTitle());
		
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(un)
		.enterPassword(pw)
		.clickLogin()
		.clickOnCRMSFA()
		.clickOnMyLeads()
		.clickOnCreateLead()
		.enterCompanyName(cn)
		.enterFirstName(fn)
		.enterLastName(ln)
		.selectDataSource(ds)
		.clickOnSubmit()
		.verifySource();
		
		System.out.println("ViewLead Title: "+driver.getTitle());
	}
}