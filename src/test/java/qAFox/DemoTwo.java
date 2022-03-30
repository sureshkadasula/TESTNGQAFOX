package qAFox;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTwo {
	@AfterMethod// It will run After every @test method
	public void Closure() {
		System.out.println("Closing the browser");
	}
	@BeforeMethod   //it will run Before every @test method
	public void Setup() {
		System.out.println("Launch the browser and open the Application url");
	}
   @Test(priority=1 ,invocationCount = 3)
	public void testRegistration() {
		System.out.println("Resgistration test got executed");
	}
   @Test(priority=2)
   public void testLogin() {
	   System.out.println("Login test got Executed");
   }
   @Test(priority=3)
   public void testhomePage() {
	   System.out.println("HomePage got executed");
   }
}
