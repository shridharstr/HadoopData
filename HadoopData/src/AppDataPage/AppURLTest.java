package AppDataPage;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import AppDataPage.GetAppDetails;

public class AppURLTest {
  
 public GetAppDetails getDetails = null;	
	
  @Test
  public void Run_URL() throws InterruptedException, IOException 
  {
	  WebDriver driver = null;
	System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
	  //System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
	 driver = new FirefoxDriver();
	 getDetails = new GetAppDetails(driver);
	 int num = 0001;
	 int res = 0;
	 String url = "http://bhsnode4.bitwiseglobal.net:8088/cluster/app/application_1486447401474_";
	 String new_url= null;
	 for(int i=2;i<=10;i++)
	 {
		 res = num + i;
		 new_url = url + res;
		 driver.get(new_url);
		 getDetails.FetchAppDetails();
		 driver.quit();
		 driver.close();
		 Thread.sleep(10000);
	 }	 
	 
	 	
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
