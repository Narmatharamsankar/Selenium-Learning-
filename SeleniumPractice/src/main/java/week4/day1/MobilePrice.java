package week4.day1;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MobilePrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.snapdeal.com");
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
	    Driver.findElement(By.xpath("//input [@placeholder='Search products & brands']")).sendKeys("mobile");
	    Driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
		
        List<WebElement> Mobile_Prices = Driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
        Integer mPrice [] = new Integer[Mobile_Prices.size()];
        for (int i=0;i< Mobile_Prices.size();i++)
        {
            mPrice[i]=  Integer.parseInt( (Mobile_Prices.get(i).getText()).replaceAll("[^0-9]",""));
        	System.out.println(mPrice[i]);
        }
        
        Arrays.sort(mPrice);
        
        System.out.println("The least price : " + mPrice[0]);
        
        
	}

}
