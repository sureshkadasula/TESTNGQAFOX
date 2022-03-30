package qAFox.tpack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassOne {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This will Execute before Suite");
	}
	@BeforeTest
	public void beforeTestforclassOne() {
		System.out.println("This will execute before every test module in the Testng.xml file");
	}
	@AfterTest
	public void afterTestforclassOne() {
		System.out.println("This will execute After every test module in the Testng.xml file");
	}
	@Test
    public void TestOne() {
    	System.out.println("TestOne test of ClassOne got executed");
    }
}
