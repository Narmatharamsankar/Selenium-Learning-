package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver Driver =new ChromeDriver();
		Driver.get("http://leaftaps.com/opentaps/control/login");
	    Driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	    Driver.findElement(By.id("password")).sendKeys("crmsfa");
	    Driver.findElement(By.className("decorativeSubmit")).click();
	   
	    Driver.findElement(By.partialLinkText("CRM/")).click();
	    
	    Driver.findElement(By.linkText("Leads")).click();
	    Driver.findElement(By.linkText("Create Lead")).click();
	    
	    Driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys Ltd");
	    Driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Narmatha");
	    Driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ramsankar");
	    
	    
	    Select Source = new Select(Driver.findElement(By.xpath("//select [@id ='createLeadForm_dataSourceId']")));
	    Source.selectByVisibleText("Employee");
	    
	    
	    Select MarketingCampaign = new Select(Driver.findElement(By.xpath("//select [@id ='createLeadForm_marketingCampaignId']")));
	    MarketingCampaign.selectByValue("9001");
	    
	    
	    Select OwnerShip = new Select(Driver.findElement(By.xpath("//select [@id = 'createLeadForm_ownershipEnumId']")));
	    OwnerShip.selectByIndex(5);
	    
	    
	    Select Country = new Select(Driver.findElement(By.xpath("//select [@id = 'createLeadForm_generalCountryGeoId']")));
	    Country.selectByVisibleText("India");
	    Driver.findElement(By.xpath("//input[@name = 'submitButton']")).click();
	    
	
	    Thread.sleep(4000);
	    
	    System.out.println(Driver.getTitle());
	   
	    Thread.sleep(4000);
	   
	}

}


/*
 * Assignment 1:Create Lead 1. Launch URL
 * "http://leaftaps.com/opentaps/control/login"
 * 
 * 2. Enter UserName and Password Using Id Locator
 * 
 * 3. Click on Login Button using Class Locator
 * 
 * 4. Click on CRM/SFA Link
 * 
 * 5. Click on Leads Button
 * 
 * 6. Click on create Lead Button
 * 
 * 7. Enter CompanyName using id Locator
 * 
 * 8. Enter FirstName using id Locator
 * 
 * 9. Enter LastName using id Locator
 * 
 * 10. Select value as Employee in Source Using SelectbyVisible text
 * 
 * 11. Select value as Pay Per Click Advertising in MarketingCampaignId Using
 * SelectbyValue
 * 
 * 
 * 13. Select value as Corporation in OwnerShip field Using SelectbyIndex
 * 
 * 14. Select value as India in Country Field Using SelectbyVisibletext
 * 
 * 15. Click on create Lead Button Using name Locator
 * 
 * 16. Get the Title of the resulting Page
 */