package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DropDown {

	public boolean checkCity(String country)
	{
		
		return true;
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver Driver =new ChromeDriver();
		Driver.get("https://www.leafground.com/select.xhtml");
		
		Select tool = new Select (Driver.findElement(By.className("ui-selectonemenu")));
		tool.selectByIndex(1);
		
		
		
		  Driver.findElement(By.xpath("//button [@class = 'ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only']")).click();
		  Thread.sleep(2000);
		  Driver.findElement(By.xpath("//li [@data-item-label=\"Selenium WebDriver\"]")). click();
		  
	
		  
		  Driver.findElement(By.xpath("//h5[text()='Choose your preferred country.']//following-sibling::div //label[@class ='ui-selectonemenu-label ui-inputfield ui-corner-all']" )).click();
		  Thread.sleep(2000);
		  Driver.findElement(By.xpath("//li[@data-label=\"India\"]")).click();
		  
		  
		  Driver.findElement(By.xpath("//label[text()='Select Language']//following-sibling::div")).click();
		  Driver.findElement(By.xpath("//li[@data-label='Tamil']")).click();	
		  
		  
			  
	

}
	
	
}