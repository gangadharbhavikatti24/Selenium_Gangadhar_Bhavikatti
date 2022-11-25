package Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandelDynamicElements2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		
	
		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("sapient");
		driver.findElement(By.xpath("//input[@value='Show me']")).click();
		
		WebDriverWait Wait=new WebDriverWait(driver,Duration.ofSeconds(20));
WebElement element=Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='passnew']")));
        
        WebElement a=driver.findElement(By.xpath("//input[@id='passnew']"));
        WebElement element1=Wait.until(ExpectedConditions.elementToBeClickable(a));
        element.sendKeys("aaa");
        
	}

}
