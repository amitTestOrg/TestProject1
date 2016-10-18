package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.opera.core.systems.scope.protos.ExecProtos.ActionList.Action;

public class NewTest {


  @Test(priority=0,suiteName="jim",groups={"Smoke","Regreesion"}, enabled=true)
  public void A1() throws InterruptedException {
	  WebDriver driver  = new FirefoxDriver();
	  driver.get("http://fsmocs.appspot.com/index.php/admin/login");
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("123");
	  driver.findElement(By.xpath("html/body/div[2]/div/div[1]/div[1]/form/div[3]/div/button[1]")).click();
	  Thread.sleep(3000);
	  Actions action = new Actions(driver);
	  action.moveToElement(driver.findElement(By.xpath(".//*[@id='smoothmenu']/ul/li[3]/a"))).build().perform();
	  Thread.sleep(3000);
	  
	  action.moveToElement(driver.findElement(By.xpath(".//*[@id='smoothmenu']/ul/li[3]/ul/li[5]/a"))).build().perform();
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath(".//*[@id='smoothmenu']/ul/li[3]/ul/li[5]/ul/li[2]/a")).click();
	  
	  Thread.sleep(4000);
	  
	  driver.findElement(By.id("addstafftosite")).click();
	  Thread.sleep(3000);
	  
	  driver.findElement(By.id("button_tab_assignments")).click();
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath(".//*[@id='tab_assignments']/table/tbody/tr/td/select[@name=contains(.,'Afternoon')]")).sendKeys("Afternoon");
	  //driver.quit();
	  Thread.sleep(2000);
	  System.out.println("this is A1");
  }
  
  @Test(priority=1, enabled=true)
  public void A2() {
	System.out.println("this is A2");
  }
  
  @Test(priority=2, enabled=true)
  public void A3() {
	System.out.println("this is A3");
  }
  
  @Test(priority=3, enabled=true)
  public void A4() {
	System.out.println("this is A4");  
  }
  
  @Test(priority=4, enabled=true)
  public void A5() {
	System.out.println("this is A5");  
  }
}
