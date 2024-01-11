package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver Driver =new ChromeDriver();
		
		Driver.manage().window().maximize();
		
		String fName = "Akhil";
		String ID ="";
		Driver.get("http://leaftaps.com/opentaps/control/login");
	    Driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	    Driver.findElement(By.id("password")).sendKeys("crmsfa");
	    Driver.findElement(By.className("decorativeSubmit")).click();
	   
	    Driver.findElement(By.partialLinkText("CRM/")).click();
	    
	    Driver.findElement(By.linkText("Leads")).click();
	    Driver.findElement(By.linkText("Create Lead")).click();
	    
	    Driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys Ltd");
	    Driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Akhil");
	    Driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
	    
	    
	    Select Source = new Select(Driver.findElement(By.xpath("//select [@id ='createLeadForm_dataSourceId']")));
	    Source.selectByVisibleText("Employee");
	    
	    
	    Select MarketingCampaign = new Select(Driver.findElement(By.xpath("//select [@id ='createLeadForm_marketingCampaignId']")));
	    MarketingCampaign.selectByValue("9001");
	    
	    
	    Select OwnerShip = new Select(Driver.findElement(By.xpath("//select [@id = 'createLeadForm_ownershipEnumId']")));
	    OwnerShip.selectByIndex(5);
	    
	    
	    Select Country = new Select(Driver.findElement(By.xpath("//select [@id = 'createLeadForm_generalCountryGeoId']")));
	    Country.selectByVisibleText("India");
	    Driver.findElement(By.xpath("//input[@name = 'submitButton']")).click();
	    // Lead created.
	    
	    Thread.sleep(5000);
	    
	    Driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	    Driver.findElement(By.xpath("(//input[@name=\"firstName\"])[3]")).sendKeys(fName);
	    
	    Driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    Thread.sleep(5000);
	    WebElement Lead =Driver.findElement(By.xpath("//div[@class = 'x-panel-body xedit-grid']//tbody//div/a"));
	    String Id = Lead.getText();
	    System.out.println("Id is " + Id);
        Thread.sleep(4000);
	     
        Lead.click();
        Driver.findElement(By.xpath("//*[text()='Delete']")).click();
        
        Driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	    Driver.findElement(By.xpath("//*[text()='Lead ID:'] //following-sibling::div/input")).sendKeys(Id);
	    Driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    Thread.sleep(2000);
	    String NEF = Driver.findElement(By.xpath("//*[text()='No records to display']")).getText();
	    
	    if(NEF.equals("No records to display"))
	    {
	    	System.out.println("Delete Lead Successful");
	    }
	    else
	    {
	    	System.out.println("Lead deletion unsuccessful!!");
	    }
	    	
	    	
	    //Driver.findElement(By.xpath("//a[text()=\"Delete\"])")).click();
          
	}

}
