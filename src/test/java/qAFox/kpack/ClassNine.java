package qAFox.kpack;

import org.testng.annotations.Test;

/*Order of Execution with the help of DependonMethod
 * Requirement is as follows:Execution should be in the order as given below
 * JioMart
 * Amazon
 * FlipKart
 * Myntra
 * Meeshoo
 * */
public class ClassNine {
	@Test(dependsOnMethods = { "Jiomart" })
	public void Amazon() {
		System.out.println("Amazon");
	}

	@Test(dependsOnMethods = { "Amazon" })
	public void Flipkart() {
		System.out.println("Flipkart");
	}

	@Test(dependsOnMethods = { "Flipkart" })
	public void Myntra() {
		System.out.println("Myntra");
	}

	@Test(dependsOnMethods = { "Myntra" })
	public void Meeshoo() {
		System.out.println("Meeshoo");
	}

	@Test
	public void Jiomart() {
		System.out.println("JioMart");
	}

}
