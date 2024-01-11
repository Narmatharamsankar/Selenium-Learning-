package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("https://www.kmart.com.au/");
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//input[@name='searchTerm']")).sendKeys("bags" + Keys.ENTER);
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//label[text()='Handbags']//input")).click();

	}

}
