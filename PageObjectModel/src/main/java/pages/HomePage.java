package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import base.BaseClass;

public class HomePage extends BaseClass {
	
	public HomePage(EdgeDriver driver)
	{
		this.driver = driver;
	}

	public MyLeadsPage clickOnCRMSFA() {
		// TODO Auto-generated method stub
		// Click on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		return new MyLeadsPage(driver);
	}

}