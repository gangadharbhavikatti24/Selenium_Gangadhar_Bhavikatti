package Day3;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTestNGTest2Test {
  @Test
  public void login() {
	  AssertJUnit.assertTrue(true);
	  System.out.println("login done");
  }
   @Test(dependsOnMethods="login")
  public void create() {
	  System.out.println("Account Created");
  
   }
   
  
}
