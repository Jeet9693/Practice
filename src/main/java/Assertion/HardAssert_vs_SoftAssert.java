package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert_vs_SoftAssert {

	@Test
	public void HardAssertLogic() {
	System.out.println("1. this is my first hard assert statement");
	Assert.assertTrue(true);
	
	System.out.println("2. this is my second hard assert statement");
	Assert.assertTrue(false);
	
	System.out.println("3. This is my third hard assert statement");
	Assert.assertTrue(true);
	} 
	
	@Test
	public void SoftAssertLogic() {
		
		SoftAssert softassert = new SoftAssert();
		
		System.out.println("4. This is my soft assert statement");
		
		System.out.println("5. this is my first soft assert statement"); 
		softassert.assertTrue(true);
		System.out.println("6. this is my second soft assert statement"); 
		softassert.assertTrue(false);
		System.out.println("7. this is my third soft assert statement"); 
		softassert.assertTrue(true);
		
		softassert.assertAll();
		
	}
	
	
}
