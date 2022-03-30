package gcReddy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyPageTitle {
	WebDriver driver;

	@Test(priority = 1)
	public void LaunchApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		

	}

	@Test(priority = 2)
	public void verifyYahooTitle() {
		driver.get("https://yahoo.com");
		Assert.assertEquals("Yahoo Search - Web Search",driver.getTitle() );
		//driver.close();
	}

	@Test(priority = 2)
	public void VerifyPageTitles() {
		driver.get("https://google.com");
		String actaulTitle = driver.getTitle();
		String expected = "Googlee";
		Assert.assertEquals(actaulTitle, expected);
	}

	@Test(priority = 4)
	public void CloseApp() {
		driver.close();
	}
}
