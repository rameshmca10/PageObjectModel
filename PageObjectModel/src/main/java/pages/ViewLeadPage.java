package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import base.BaseClass;

public class ViewLeadPage extends BaseClass {

	public ViewLeadPage(EdgeDriver driver) {
		this.driver = driver;
	}

	public ViewLeadPage verifySource() {
		// TODO Auto-generated method stub

		// Print the source text
		String text = driver.findElement(By.id("viewLead_dataSources_sp")).getText();
		System.out.println(text);

		return new ViewLeadPage(driver);
	}

}