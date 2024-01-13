package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		 WebElement e = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		 driver.switchTo().frame(e);
		 WebElement button = driver.findElement(By.xpath("//button[text()='Try it']"));
		  driver.executeScript("arguments[0].click();",button);
		  Alert alert = driver.switchTo().alert(); 
	    //  alert.sendKeys("Narmatha Balaji"); 
		   alert.accept();
		   System.out.println( driver.findElement(By.tagName("p")).getText()); 
		   driver.switchTo().defaultContent();
		  driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		  
		 
	}

}
