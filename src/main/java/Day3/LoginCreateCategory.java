package Day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LoginCreateCategory {
@Test

public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ineuron-courses.vercel.app/login");
        WebElement username= driver.findElement(By.name("email1"));
        username.sendKeys("ineuron@ineuron.ai");
		driver.findElement(By.id("password1")).sendKeys("ineuron");
		driver.findElement(By.className("submit-btn")).click();

        Actions act=new Actions(driver);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        
        
        WebElement manage =driver.findElement(By.xpath("//span[normalize-space()='Manage']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(manage).perform();
        WebElement web=driver.findElement(By.xpath(" //span[normalize-space()='Manage']"));
        Thread.sleep(3000);
       act.moveToElement(web).perform();
       driver.findElement(By.xpath(" //span[normalize-space()='Manage Categories']")).click();
      
	}

}
