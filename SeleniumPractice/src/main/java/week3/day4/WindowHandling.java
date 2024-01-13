package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ChromeDriver driver = new ChromeDriver();
      driver.get("http://leaftaps.com/opentaps/control/login");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	   
	    driver.findElement(By.partialLinkText("CRM/")).click();
	    driver.findElement(By.xpath("//a[text()=\"Contacts\"]")).click();
	    driver.findElement(By.xpath("//a[text()='Merge Contacts'] ")).click();
         driver.findElement(By.xpath("//form[@name ='MergePartyForm']//a[1]/img")).click();
         Set<String> windowHandles = driver.getWindowHandles();
		 List<String> l = new ArrayList<String>(windowHandles);
		  
		  driver.switchTo().window(l.get(1));
		  driver.findElement(By.xpath("//table/tbody/tr/td/div/a")).click();
		  
		 driver.switchTo().window(l.get(0)) ;
	     driver.findElement(By.xpath("(//form[@name ='MergePartyForm']//a)[2]/img")).click();
	     windowHandles = driver.getWindowHandles();
		 l = new ArrayList<String>(windowHandles);
		  
		  driver.switchTo().window(l.get(1));
		  driver.findElement(By.xpath("(//table)[5]//a")).click();
	   
          driver.switchTo().window(l.get(0));
          driver.findElement(By.xpath("//a[text()='Merge']")).click();

	      Alert alert = driver.switchTo().alert();
	      alert.accept();
	      
	      System.out.println("Title of the page - "+driver.getTitle());
	}

}
/*
 * Initialize ChromeDriver - Load the URL
 * (http://leaftaps.com/opentaps/control/login) - Maximize the browser window -
 * Add an implicit wait to ensure the webpage elements are fully loaded
 * Requirements: - Enter the username and password. - Click on the Login button.
 * - Click on the CRM/SFA link. - Click on the Contacts button. - Click on Merge
 * Contacts. - Click on the widget of the "From Contact". - Click on the first
 * resulting contact. - Click on the widget of the "To Contact". - Click on the
 * second resulting contact. - Click on the Merge button. - Accept the alert. -
 * Verify the title of the page.
 */