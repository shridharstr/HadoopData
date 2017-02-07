package AppDataPage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetAppDetails
{
	public WebDriver driver = null;
	public GetAppDetails(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String filepath = System.getProperty("user.dir") + File.separator + "LogFile" + File.separator + "HadoopLogs.txt";
	public void FetchAppDetails() throws IOException
	{
	  WebElement Name = driver.findElement(By.cssSelector("#layout > tbody > tr > td.content > div:nth-child(1) > table > tbody > tr:nth-child(3) > td"));
      String getName = Name.getText();
      System.out.println("The Name is:"+getName);
    
      WebElement Status = driver.findElement(By.cssSelector("div.info-wrap:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(6) > td:nth-child(2)"));
      String getStatus = Status.getText();
      System.out.println("The Status is:"+getStatus);

      WebElement FinalStatus = driver.findElement(By.cssSelector("div.info-wrap:nth-child(1) > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(7) > td:nth-child(2)"));
      String getFinalStatus = FinalStatus.getText();
      System.out.println("The Status is:"+getFinalStatus);
      
      WebElement ElapsedTime = driver.findElement(By.cssSelector("tr.even:nth-child(9) > td:nth-child(2)"));
      String getElapsed = ElapsedTime.getText();
      System.out.println("The Elapsed time is:"+getElapsed);
      
       File file = new File(filepath);
  	   PrintWriter out = new PrintWriter(file);
     
  	   out.println("Name: "+getName);
       out.println("Status: "+getStatus);
       out.println("Final Status: "+getFinalStatus);
       out.println("Elapsed Time: "+getElapsed);
       out.println("\n\n\n");
       out.close();

	}
	
}
