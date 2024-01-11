package week4.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertSample {

	public static void main(String[]args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		WebElement frame =driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		 driver.switchTo().frame(frame);
		 driver.findElement(By.xpath("//button[text()='Try it']")).click();
		 Alert a = driver.switchTo().alert();
		 a.accept();;
		 System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());
		 Thread.sleep(4000);
		 driver.quit();
	}
}