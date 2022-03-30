package hyrlisteners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ITestListenerclas.class)
public class TestClass1 {
	@Test
	public static void testMethod1() {
		System.out.println("I'm inside testMethod1");
	}
	@Test
	public static void testMethod2() {
		System.out.println("I'm inside testMethod2");
		Assert.assertTrue(false);
	}
	@Test(timeOut = 1000)
	public static void testMethod3() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("I'm inside testMethod3");
	}
	@Test(dependsOnMethods="testMethod3")
	public static void testMethod4() {
		System.out.println("I'm inside testMethod4");
	}

}
