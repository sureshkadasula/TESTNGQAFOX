package qAFox.kpack;
//DependsOnMethods in a different Way
import org.testng.annotations.Test;

public class ClassTen {
	public class ClassNine {
		@Test(dependsOnMethods = { "Jiomart","Flipkart","Myntra" })
		public void Amazon() {
			System.out.println("Amazon");
		}

		@Test
		public void Flipkart() {
			System.out.println("Flipkart");
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
}
