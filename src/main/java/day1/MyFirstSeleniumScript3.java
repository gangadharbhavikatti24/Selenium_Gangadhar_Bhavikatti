package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyFirstSeleniumScript3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/signup");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		
		WebElement username=driver.findElement(By.id("name"));
		username.sendKeys("Gangadhar");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("gangadhar@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Gan@1234");
		
		WebElement blockchain=driver.findElement(By.xpath("//label[normalize-space()='Testing']"));
        blockchain.click();
        WebElement iOSDevelopment=driver.findElement(By.xpath("//label[normalize-space()='iOS Development']"));
        iOSDevelopment.click();
        
		//driver.findElement(By.id("interests").sendkeys
		//Select intersts=new Select
		
	}

}
