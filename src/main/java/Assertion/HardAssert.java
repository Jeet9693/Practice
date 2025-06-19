package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	@Test(priority=1)
	public void Critical() {
		String ExpectedOutPut = "We are learning in English";
		String ActualOutPut = "We are learning in English and Hindi";
		Assert.assertEquals(ActualOutPut, ExpectedOutPut);
	}
	
	@Test(priority=2)
	public void High() {
		boolean b1 = 1<2; //true condition
		boolean b2 = 2>3; //false condition
		Assert.assertTrue(b1 =! b2, "2 can never be greater than 3");
		
	}
	
	@Test(priority=3)
	public void Medium() {
		
	}
	
	@Test(priority=4)
	public void Low() {
	
	}

}
