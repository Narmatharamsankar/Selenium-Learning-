package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {
	
	public static void main (String args[])
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/waits.xhtml");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
	    WebElement b = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Click'])[3]")));
	    b.click();
	    
	 // boolean textChange =   wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='I am going to change!']")));
	  
	  b =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Did you notice?']")));
	  
	  System.out.println("the text is changed - " + b.getText());
		
		
	}

}
