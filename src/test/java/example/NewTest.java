package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	private WebDriver driver;

	@Test
	public void easyTest() {
		driver.get("http://www.guru99.com/selenium-tutorial.html");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertTrue(title.contains("Free Selenium Tutorials"));
	}

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
