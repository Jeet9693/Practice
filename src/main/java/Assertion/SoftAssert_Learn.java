package Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Learn {
	
	@Test
	public void Validation() {
	SoftAssert softassert = new SoftAssert(); //object creation
	int i = 20; int j = 25;
	System.out.println(i+j); //logic
	softassert.assertTrue(true);
		
		
	}

}
