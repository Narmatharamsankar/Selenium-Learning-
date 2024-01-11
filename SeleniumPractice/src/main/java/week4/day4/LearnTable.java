package week4.day4;

import java.awt.List;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTable {
	
	public static void main(String args[]) throws InterruptedException
	{
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://erail.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    WebElement from = driver.findElement(By.id("txtStationFrom"));
    from.clear();
    from.sendKeys("MAS"+Keys.ENTER);
	
	WebElement to = driver.findElement(By.id("txtStationTo"));
	to.clear();
	to.sendKeys("MDU"+Keys.ENTER);
	
	driver.findElement(By.id("chkSelectDateOnly")).click();
	driver.findElement(By.id("buttonFromTo")).click();
	Thread.sleep(3);
	ArrayList<WebElement> elements = (ArrayList<WebElement>)driver.findElements(By.xpath("//table[@class = 'DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody//tr/td[2]/a"));
	ArrayList<String> trains = new ArrayList<String>();
	
	
	for(WebElement e : elements)
	{
		trains.add(e.getAttribute("title"));
		System.out.println(e.getAttribute("title"));
		
	}
	
	Set <String> s = new TreeSet <String> (trains);
	
	System.out.println("---------------------------------------------------------");
	
	if(s.size() == trains.size())
		System.out.println("No Duplicate trains");
	else
		System.out.println("Duplicates found in the train entry!!!!!! " + s.size() + " " + trains.size());
	}
}
