package qAFox.tpack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassTwo {
	@AfterSuite
	public void afterSuite() {
		System.out.println("this will Execute after Suite");
	}
	@BeforeTest
	public void beforeTestforclassTwo() {
		System.out.println("This will execute before every test module in the Testng.xml file");
	}
	@AfterTest
	public void afterTestforclassTwo() {
		System.out.println("This will execute After every test module in the Testng.xml file");
	}
	@Test
	 public void TestTwo() {
	    	System.out.println("TestTwo test of ClassTwo got executed");
	    }
}
