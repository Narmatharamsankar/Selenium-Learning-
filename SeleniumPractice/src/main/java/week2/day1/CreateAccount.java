package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver Driver =new ChromeDriver();
		Driver.get("http://leaftaps.com/opentaps/control/login");
	    Driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	    Driver.findElement(By.id("password")).sendKeys("crmsfa");
	    Driver.findElement(By.className("decorativeSubmit")).click();
	   
	    //Thread.sleep(4000);
	   
	    Driver.findElement(By.partialLinkText("CRM/")).click();
	    Driver.findElement(By.linkText("Accounts")).click();
	    Driver.findElement(By.linkText("Create Account")).click();
	    
	    Driver.findElement(By.id("accountName")).sendKeys("Debit Limited Account-Narmatha");
	    
	    Driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester - Narmatha ");
	   
	    Driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Nirimba Fields");
	    Driver.findElement(By.xpath("//input[@name='officeSiteName']")).sendKeys("Sydney");
	    Driver.findElement(By.xpath("//input [@id ='annualRevenue' ]")).sendKeys("130000");
	    
	    Select currency = new Select (Driver.findElement(By.id("currencyUomId")));
	    currency.selectByValue("AUD");
	     
	    Select Industry = new Select(Driver.findElement(By.xpath("//select[@name='industryEnumId']")));
	    Industry.selectByVisibleText("Computer Software");
	    
	    Select OwnerShip = new Select(Driver.findElement(By.xpath("//select [@name = 'ownershipEnumId']")));
	    OwnerShip.selectByVisibleText("S-Corporation");
	    
	    
	    Select Source = new Select(Driver.findElement(By.xpath("//select [@id ='dataSourceId']")));
	    Source.selectByValue("LEAD_EMPLOYEE");
	    

	    Select MaeketingCampaign = new Select(Driver.findElement(By.xpath("//select [@id ='marketingCampaignId']")));
	    MaeketingCampaign.selectByIndex(6);
	    
	    
	    Select Province = new Select(Driver.findElement(By.xpath("//select [@id ='generalStateProvinceGeoId']")));
	    Province.selectByValue("TX");
	    
	    Driver.findElement(By.xpath("//input [@type='submit']")).click();
	    
	    Thread.sleep(4000);
	    

	}

}
