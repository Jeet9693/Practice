package MultipleDataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcases {
	
	public static WebDriver driver;
	SoftAssert sf = new SoftAssert();
	
	@Test(priority = 1, dataProvider = "NinjaData", dataProviderClass= Data.class)
	public void ninjaLoginTest(String username, String password) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://tutorialsninja.com/demo");
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		sf.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		sf.assertAll();
		driver.quit();
		
	}
		
	@Test(priority = 2, dataProvider = "RediffData", dataProviderClass= Data.class)
	public void rediffLoginTest(String username, String password) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys(username); 
		driver.findElement(By.id("password")).sendKeys(password); 
		driver.findElement(By.xpath("i/html/body/div[2]/div[1]/div/div[2]/div[2]/form/button")).click();
		sf.assertTrue(driver.findElement(By.cssSelector("a.rd_logout")).isDisplayed());
		sf.assertAll();
		driver.quit();
	}

}
