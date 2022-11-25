package Day3;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNgDemo {
	@Test
	public void testGoogle() {
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Gangadhar");

		String title = driver.getTitle();
		System.out.println("Title is " + title);
		String url = driver.getCurrentUrl();
		AssertJUnit.assertTrue(driver.getCurrentUrl().contains("google"));
		System.out.println("URL is " + url);
		// driver.quit();

	}

}
