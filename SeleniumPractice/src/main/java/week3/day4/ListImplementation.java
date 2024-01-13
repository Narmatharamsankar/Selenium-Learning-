package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListImplementation {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.ajio.com/");
		 driver.findElement(By.name("searchVal")).sendKeys("bags");
		 driver.findElement(By.xpath("//span[@class='ic-search']")).click();
         driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
         WebElement e = driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]"));
         
         WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
         wait.until(ExpectedConditions.elementToBeClickable(e));
         driver.executeScript("arguments[0].click();",e);
         
     //    Thread.sleep(5000);
         String numberOfBags =  driver.findElement(By.xpath("//div[@class=\" filter-container\"]/div/div")).getAttribute("aria-label");
         System.out.println("Number of Items found " + numberOfBags);
         List<WebElement> list = driver.findElements(By.xpath("//div[@class='brand']/strong"));
         List<String> brandList = new ArrayList<String>();
         for(WebElement l : list)
         {
        	 brandList.add(l.getText());
         }
         Set <String> brandSet = new HashSet<String>(brandList);
         System.out.println(brandSet);
         
         
	}

}
/*- Launch the URL https://www.ajio.com/
- In the search box, type as "bags" and press enter
- To the left of the screen under "Gender" click on "Men"
- Under "Category" click "Fashion Bags"
- Print the count of the items found.
- Get the list of brand of the products displayed in the page and print the list.
- Get the list of names of the bags and print it*/