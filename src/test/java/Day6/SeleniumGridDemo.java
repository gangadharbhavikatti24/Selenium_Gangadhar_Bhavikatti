package Day6;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import bsh.Capabilities;

public class SeleniumGridDemo {
	WebDriver driver;
	@Parameters({"os","osversion","browser","browserVersion"})
	@BeforeMethod
	public void setup(String os,String osVersion,String browser,String browserVersion) {
		DesiredCapabilities capablilities=new DesiredCapabilities();
		capablilities.setCapability("browserName", "browser");
		capablilities.setCapability("browserVersion", "browserVersion");
		capablilities.setCapability("os", "os");
		capablilities.setCapability("osVersion", "osversion");
		
		URL url=null;
		try {
			url = new URL("https://gangadhar_QPfa8u:aXuAXYJqqWxnvst6xh3M@hub-cloud.browserstack.com/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver=new RemoteWebDriver(url,capablilities);
	}

		
	
  @AfterMethod
  public void tearDown() {
	  driver.quit();
  }
  @Test
  public void ineuron() {
	  driver.get("https://ineuron-courses.vercel.app/login"); 
	  Assert.assertTrue(driver.getCurrentUrl().contains("https://ineuron-courses.vercel.app/login"));
  }
}
