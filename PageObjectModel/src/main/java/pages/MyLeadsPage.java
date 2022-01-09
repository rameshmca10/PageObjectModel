package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import base.BaseClass;

public class MyLeadsPage extends BaseClass {

	public MyLeadsPage(EdgeDriver driver) {
		this.driver = driver;
	}

	public CreateLeadPage clickOnMyLeads() {
		// TODO Auto-generated method stub

		// Click My Leads Link (Menu)
		driver.findElement(By.linkText("Leads")).click();

		return new CreateLeadPage(driver);
	}

}