package Marathon.Test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbhiBus {

	public static void main(String args[])
	{
		ChromeOptions option = new ChromeOptions();

		option.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
	   WebElement from = driver.findElement(By.xpath("//input[@placeholder='From Station']"));
	   from.sendKeys("Chennai");
	   driver.findElement(By.xpath("//div[text() = 'Chennai']")).click();
	   
	   WebElement to = driver.findElement(By.xpath("//input[@placeholder = 'To Station']"));
	   to.sendKeys("Bangalore");
	   driver.findElement(By.xpath("//div[text() = 'Bangalore']")).click();
	   driver.findElement(By.xpath("//a[text()='Tomorrow']")).click();
		
	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
			 String BusName =  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h5[1]"))).getText();
			 System.out.println(BusName + "- is the first bus displayed");
			 
			 driver.findElement(By.xpath("//span[text() = 'Sleeper']")).click();
		     BusName =  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h5[1]"))).getText();
			 System.out.println(BusName + "- is the first bus displayed");
			System.out.println(driver.findElement(By.xpath("//button[text()='Show Seats']/following-sibling::div/small")).getText()) ; 
			
			driver.findElement(By.xpath("//button[text()='Show Seats']")).click();
			
			driver.findElement(By.xpath("//button[@class='seat sleeper']")).click();
			driver.findElement(By.xpath("//div[@class = 'label'][1]")).click();
			driver.findElement(By.xpath("//div[@class = 'label'][1]")).click();
			
			System.out.println("Seatm selected - "+ driver.findElement(By.xpath("//span[text()='Seat Selected :']/span")).getText());
			System.out.println("Total fare Rs." + driver.findElement(By.xpath("//span[text()='Base Fare :']/span")).getText());
			
			
			
	}
}
