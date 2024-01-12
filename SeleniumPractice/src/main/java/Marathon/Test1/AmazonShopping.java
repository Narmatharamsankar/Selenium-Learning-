package Marathon.Test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonShopping {

	public static void main(String[]args)
	{
		ChromeDriver driver =  new ChromeDriver();
		driver.get(" https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");		
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//div[@data-index='3']"));
		
		String text = driver.findElement(By.xpath("//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/span")).getText();
		System.out.println(text);
		String s[] = text.split(" ");
		System.out.println(s[3]);
		/*
		 * WebElement e = driver.findElement(By.xpath(
		 * "//span[text()='Brand']/parent::div/following-sibling::ul/span/span//a//input"
		 * )); driver.executeScript("arguments[0].click();", e);
		 */
		WebElement e = driver.findElement(By.xpath("//div[@id='brandsRefinements']//following::input[2]"));
        driver.executeScript("arguments[0].click();", e);
        
        e = driver.findElement(By.xpath("//div[@id='brandsRefinements']//following::input[3]"));
        driver.executeScript("arguments[0].click();", e);
        e = driver.findElement(By.xpath("//span[text()='Sort by:']/parent::span"));
        e.click();
        driver.findElement(By.xpath("//ul[@role='listbox']/li[5]")).click();
        String brand = driver.findElement(By.xpath("//h2[@class ='a-size-mini s-line-clamp-1']/span")).getText();
        System.out.println("Brand is " + brand);
        String description = driver.findElement(By.xpath("//h2[@class=\"a-size-mini a-spacing-none a-color-base s-line-clamp-2\"]/a/span")).getText();
        System.out.println(description);
}

}