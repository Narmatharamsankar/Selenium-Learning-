package Marathon.Test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PVRCinemas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();

		option.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.pvrcinemas.com/");
		
		driver.findElement(By.xpath("//span[text()='Chennai']")).click();
		driver.findElement(By.xpath("//span[@class=\"icon-glow cursor_pointer\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Movie Library\"]")).click();
		WebElement genere = driver.findElement(By.xpath("//select[@name='genre']"));
		
		Select select_genere = new Select(genere);
		
		select_genere.selectByVisibleText("ANIMATION");
		WebElement lang = driver.findElement(By.xpath("//select[@name='lang']"));
		Select select_lang = new Select(lang);
		select_lang.selectByVisibleText("ENGLISH");
		
		
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		
		
		
		
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		  
		  WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div [@class='movie-list']//div[1]//div[contains(text(),\"ANIMATION\")] ")));
		  
		  driver.executeScript("arguments[0].click();", e);
		  e = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Proceed To Book']")));
		  driver.executeScript("arguments[0].click();", e);
		  
		  e = driver.findElement(By.xpath("//select[@name = 'cinemaName']"));
		  Select cinema = new Select(e);
		  cinema.selectByValue("PVR Heritage RSL ECR Chennai");;
		  
		  driver.findElement(By.id("datepicker-input")).click();
		  driver.findElement(By.xpath("//span[@class=\"day-unit is-today is-selected is-disabled ng-star-inserted\"]")).click();
		  
		  e=driver.findElement(By.xpath("//select[@name='timings']"));
		  Select time = new Select (e);
		  time.selectByIndex(0);
		  
		  driver.findElement(By.xpath("//input[@name ='noOfTickets']")).sendKeys("4");
		  driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Narmatha");
		  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("narmatharamshankar@gmail.com");
		  driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9629268150");
		  e=driver.findElement(By.xpath("//select[@name='food']"));
		  Select food = new Select (e);
		  food.selectByIndex(0);
		  
		  e = driver.findElement(By.xpath("//span[text()='Copy To Self']"));
		  driver.executeScript("arguments[0].click();", e);
		  
		  driver.findElement(By.xpath("//input[@name = 'comment']")).sendKeys("NA");
		  driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
	
		  
		  e = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label ='Close this dialog']")));
		  e.click();
		
		  
		
		  e= driver.findElement(By.xpath("//button[text()='CANCEL']"));
		  driver.executeScript("arguments[0].click();", e);
				  
		 System.out.println("Title of the page -" + driver.getTitle() );
		  
	}

}
