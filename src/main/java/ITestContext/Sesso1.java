package ITestContext;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class Sesso1 {
	
	//ItestContext is an interface
	//Purpose = within the same Java file or Class file, it helps sharing data within the test cases
	@Test(priority = 1)
	public void setUp(ITestContext context) {
		//passing the object reference of the interface inside the method body
	System.out.println("This is setup of our new Laptop"); 
	context.setAttribute("Windows10", "ASUS");
	}
	
	@Test(priority = 2, dependsOnMethods = "setUp")
	public void Logic(ITestContext context) {
	System.out.println("This is the logical functioning of our new Laptop");
	
	String OperatingSystem = (String)context.getAttribute("Windows10");
	
	System.out.println("The setUp for the operating system for Asus Laptop is:" + OperatingSystem);
	context.setAttribute("Complex", "DevOps + Agile");
	}
	
	@Test(priority = 3, dependsOnMethods = {"setUp", "Logic" })
	public void exit(ITestContext context) {
	System.out.println("This is exit of our new Laptop"); 
	String OperatingSystem = (String)context.getAttribute("Windows10");

	System.out.println("The setUp for the operating system for asus laptop is: "+OperatingSystem);
	System.out.println("The setUp for the operating system for asus laptop is: "+OperatingSystem);
	
	System.out.println("Third comment");
	System.out.println("Fourth comment");
	System.out.println("Fifth last and new update comment checking auto update in jenkins");

	}
}
	
