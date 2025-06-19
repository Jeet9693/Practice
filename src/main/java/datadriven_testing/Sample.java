package datadriven_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Test(dataProvider = "getData")
public class Sample {
	
	public static WebDriver driver;
	public static SoftAssert sf = new SoftAssert();
	
	
	public void ninjaLoginTest(String username, String password){
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		
		
		driver.findElement(By.linkText("My Account")).click();
		driver. findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("")).click();
		sf.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		sf.assertAll();
		driver.quit();
		
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = {{"seleniumpanda@gmail.com","Selenium@123"},
				{"seleniumpanda1@gmail.com" ,"Selenium@123"},
				{"seleniumpanda2@gmail.com" ,"Selenium@123"},
				{"seleniumpanda2@gmail.com" ,"Selenium@123"}};
		
				return data;
			 
	}
		
		
	}
		
	

