package qAFox;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeClassAndAfterClass {
	public class DemoTwo {
		@AfterClass // It will run After Class
		public void Closure() {
			System.out.println("Closing the browser");
		}

		@BeforeClass // it will run Before every Class
		public void Setup() {
			System.out.println("Launch the browser and open the Application url");
		}

		@Test(priority = 1)
		public void testRegistration() {
			System.out.println("Resgistration test got executed");
		}

		@Test(priority = 2)
		public void testLogin() {
			System.out.println("Login test got Executed");
		}

		@Test(priority = 3)
		public void testhomePage() {
			System.out.println("HomePage got executed");
		}
	}
}
