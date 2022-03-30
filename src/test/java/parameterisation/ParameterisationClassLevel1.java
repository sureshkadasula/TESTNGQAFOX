package parameterisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterisationClassLevel1 {
	@Parameters({"url"})
	@Test
	public void Amazon(String url) {

		System.out.println("Amazon");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		driver.quit();
	}
    @Parameters({"url"})
	@Test
	public void Flipkart(String url) {
		System.out.println("Flipkart");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		driver.quit();
	}

	@Test
	public void Myntra() {
		System.out.println("Myntra");
	}

	@Test
	public void Meeshoo() {
		System.out.println("Meeshoo");
	}

	@Test
	public void Jiomart() {
		System.out.println("JioMart");
	}
}
