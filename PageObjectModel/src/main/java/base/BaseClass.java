package base;

import java.io.IOException;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;

public class BaseClass {

	public EdgeDriver driver;
	public String title;
	public String fileName; 
	
	@DataProvider
	public String[][] sendData() throws IOException {
									//rows column
		/*
		 * String[][] data = new String[2][3];
		 * 
		 * data[0][0] = "Testleaf"; //index starts with 0 data[0][1] = "Hari";
		 * data[0][2] = "R";
		 * 
		 * data[1][0] = "Qeagle"; data[1][1] = "Babu"; data[1][2] = "M";
		 * 
		 * return data;
		 */
		return ReadExcel.readData(fileName);
	
	}

	@Parameters({"url"})
	@BeforeMethod
	public void beforeMethod(String url) {

		System.out.println("Before Method ");
		// Setup edge browser
		WebDriverManager.edgedriver().setup();

		// Get driver location
		System.out.println(System.getProperty("webdriver.edge.driver"));

		// Launch the edge browser
		driver = new EdgeDriver();

		// Load the URL
		driver.get(url);

		// Maximize the browser
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method ");
		driver.quit();
	}
}