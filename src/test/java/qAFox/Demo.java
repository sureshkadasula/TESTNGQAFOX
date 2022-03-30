package qAFox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
@Test
	public static void m1() {
		// TODO Auto-generated method stub
  Assert.assertEquals(5, 5);//test pass
  Assert.assertEquals("app", "bpp");//test fail
  int a=10;
  int b=20;
  Assert.assertTrue(a<b);//test pass
  Assert.assertNotEquals("po", "raa");//test pass
  Assert.assertFalse(b<a);//test pass
  if(a>b) {
  Assert.fail("Intentionally failed the test case");//Not Working
  }
}

}
