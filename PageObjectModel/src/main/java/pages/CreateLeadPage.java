package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import base.BaseClass;

public class CreateLeadPage extends BaseClass {

	public CreateLeadPage(EdgeDriver driver) {
		this.driver = driver;
	}

	public CreateLeadPage clickOnCreateLead() {
		// TODO Auto-generated method stub

		// Click Create Lead Link
		driver.findElement(By.linkText("Create Lead")).click();

		return new CreateLeadPage(driver);
	}

	public CreateLeadPage enterCompanyName(String companyName) {
		// TODO Auto-generated method stub
		// Type the company Name (Any name)
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);

		return new CreateLeadPage(driver);
	}

	public CreateLeadPage enterFirstName(String firstName) {
		// TODO Auto-generated method stub

		// Type the first name (Your name)
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);

		return new CreateLeadPage(driver);
	}

	public CreateLeadPage enterLastName(String lastName) {
		// TODO Auto-generated method stub
		// Type the last name (Your father name)
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);

		return new CreateLeadPage(driver);
	}

	public CreateLeadPage selectDataSource(String dataSource) {
		// TODO Auto-generated method stub
		// Select the source by its text
		WebElement ele = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(ele);
		dd.selectByVisibleText(dataSource);

		return new CreateLeadPage(driver);

	}

	public ViewLeadPage clickOnSubmit() {
		// TODO Auto-generated method stub
		// Click Create Lead Button
		driver.findElement(By.name("submitButton")).click();

		return new ViewLeadPage(driver);

	}

}