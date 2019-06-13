package testingworld;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_003 {
	@Test
	public void testcase() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\adin\\eclipse-workspace\\Day1S\\drivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("pinkey");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("welcome");
		//driver.findElement(By.id("email")).sendKeys("charu.patel2372@gmail.com");
		//driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("pinkey9004");
		//driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
		driver.quit();
	}

}
