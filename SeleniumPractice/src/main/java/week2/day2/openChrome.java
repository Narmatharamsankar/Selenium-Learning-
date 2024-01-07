package week2.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("HTTPS://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
        driver.quit();
	}

}
