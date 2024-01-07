package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		// Thread.sleep(2000);	
	//	 driver.quit();
	}

}


//  1. Launch URL "http://leaftaps.com/opentaps/control/login"
//  
//  2. Enter UserName and Password Using Id Locator
//  
//  3. Click on Login Button using Class Locator
//  
//  4. Click on CRM/SFA Link
//  
//  5. Click on Accounts Button
//  
//  6. Click on Create Account
//  
//  7. Enter AccountName Field Using Xpath Locator value as Debit Limited Account
//  
//  8. Enter DEscriptiion as "Selenium Automation Tester"
//  
//  9. Enter LocalName Field Using Xpath Locator
//  
//  10. Enter SiteName Field Using Xpath Locator
//  
//  11. Enter value for AnnualRevenue Field using Xpath Locator but class as
//  Attribute
//  
//  12. Select Industry as ComputerSoftware
//  
//  13. Select OwnerShip as S-Corporation using SelectByVisibletext
//  
//  14. Select Source as Employee using SelectByValue
//  
//  15. Select Marketing Campaign as eCommerce Site Internal Campaign using
//  SelectbyIndex
//  
//  16. Select State/Province as Texas using SelectByValue
//  
//  17. Click on Create Account using Xpath Locator
// 