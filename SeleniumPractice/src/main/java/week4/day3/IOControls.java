package week4.day3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IOControls {
	
	public static void main(String args[]) throws IOException, InterruptedException
	{
		/*- Initialize ChromeDriver
		- Load the URL (https://www.amazon.in/)
		- Maximize the browser window
		- Add an implicit wait to ensure the webpage elements are fully loaded*/
		/*Requirements:
			-Load the URL https://www.amazon.in/
			-Scroll down to the "Conditions of Use and Sale" section at the bottom of the page using Actions class.
			-Get the text of "Conditions of Use and Sale" and print it in the console.
			-Finally, take a screenshot of the displayed webpage.
			Hints to Solve:
			- Use Selenium's Actions class methods such as `scrollToElement()`, ‘perform()’ and Selenium methods such
			as`getText()`, `getScreenShotAs()` to do the necessary actions.
			- Utilize appropriate locators and techniques to interact with web elements*/
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
	    WebElement e = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
	    
	    action.scrollToElement(e).perform();;
	    System.out.println(e.getText());
	    action.keyDown(Keys.PAGE_UP).keyUp(Keys.PAGE_UP).perform();
	    
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./target/screenshot.png");
		FileUtils.copyFile(source, dest);
		
		}
	

}
