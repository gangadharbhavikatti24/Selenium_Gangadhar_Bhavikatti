package Day3;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgDemo4 {
  @Test
   public  void main() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();

		Thread.sleep(3000);
		List<WebElement> allElements = driver.findElements(By.xpath("(//table[@class='ui-datepicker-calendar'])//a"));

		for (WebElement el : allElements) {
			String str = el.getText();
			System.out.println(str);

			if (str.contains("25")) {
				el.click();
				break;
  }
}
		AssertJUnit.assertTrue(driver.getCurrentUrl().contains("how-to-handle-calendar-in-selenium.html"));
		AssertJUnit.assertTrue(true);
}
  }