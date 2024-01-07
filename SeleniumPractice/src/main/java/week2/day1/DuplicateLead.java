package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

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
	    Driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramsankar");
	    Driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ramsubbu");
	    
	    Driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ram");
	    Driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
	    
	    Driver.findElement(By.id("createLeadForm_description")).sendKeys("Duplicate lead creation");
	    Driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ram0407@gmail.com");
	    
	    Driver.findElement(By.xpath("//input[@name = 'submitButton']")).click();
	    
        Thread.sleep(4000);
	    
	    System.out.println(Driver.getTitle());
	   
	    Thread.sleep(4000);
	    
	    
	    Driver.findElement(By.xpath("//a [text()=\"Duplicate Lead\"]")).click();
	    
	    Driver.findElement(By.id("createLeadForm_companyName")).clear();
	    Driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant technologies");
	    
	    Driver.findElement(By.id("createLeadForm_firstName")).clear();
	    Driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Venkata");
	    
	    Driver.findElement(By.xpath("//input[@name = 'submitButton']")).click();
	    
	    System.out.println(Driver.getTitle());
	    
	    Thread.sleep(5000);
	    
	    Driver.quit();
	    
	    
	}
	
	/*
	 * Assignment 2:Duplicate Lead 1. Launch URL
	 * "http://leaftaps.com/opentaps/control/login" 
	 * 2. Enter UserName and Password
	 * Using Id Locator 
	 * 3. Click on Login Button using Class Locator 
	 * 4. Click on
	 * CRM/SFA Link 
	 * 5. Click on Leads Button 
	 * 6. Click on Create Lead 
	 * 7. Enter
	 * CompanyName Field Using id Locator 
	 * 8. Enter FirstName Field Using id Locator
	 * 9. Enter LastName Field Using id Locator 
	 * 10. Enter FirstName(Local) Field
	 * Using id Locator 
	 * 11. Enter Department Field Using any Locator of Your Choice
	 * 12. Enter Description Field Using any Locator of your choice
	 *  13. Enter your
	 * email in the E-mail address Field using the locator of your choice 
	 * 14. Click
	 * on Create Button 
	 * 15. Get the Title of Resulting Page using driver.getTitle()
	 * 16. Click on Duplicate button 
	 * 17. Clear the CompanyName Field using .clear()
	 * And Enter new CompanyName 
	 * 18.Clear the FirstName Field using .clear() And
	 * Enter new FirstName 
	 * 19.Click on Create Lead Button 
	 * 20. Get the Title of
	 * Resulting Page using driver.getTitle()
	 */

}
