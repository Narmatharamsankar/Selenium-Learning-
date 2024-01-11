package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("https://leafground.com/checkbox.xhtml");
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		Driver.manage().window().maximize();
		
		Driver.findElement(By.xpath("//h5[text()='Basic Checkbox']/following-sibling::div//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		Driver.findElement(By.xpath("//h5[text()='Notification']/following-sibling::div/div/div/div[2]")).click();
		
		Thread.sleep(4);
		
		
		WebElement we = Driver.findElement(By.className("ui-growl-title"));
		
		System.out.println(we.getText()+ "- from the Ajax control");
		
		Driver.findElement(By.xpath("//label[text()='Java']/preceding-sibling::div/div[2]")).click();
		we = Driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following-sibling::div/div/div/div[2]"));
		we.click();
		
		we = Driver.findElement(By.xpath("//input [@name ='j_idt87:ajaxTriState_input']"));
		System.out.println(we.isSelected()+ "- Tri State Checkbox");
		
		Driver.findElement(By.xpath("//h5[text()='Toggle Switch'] /following-sibling::div/div[2]")).click();
        boolean DisableCheckBox =  Driver.findElement(By.xpath("//h5[text()='Verify if check box is disabled']/following-sibling::div//input")).isEnabled();
		  if(!DisableCheckBox)
			  System.out.println("the checkbox is disabled");
		  else
		  System.out.println("Check box is not disabled");
		 
        
        Driver.findElement(By.xpath("//ul [@data-label='Cities']")).click();
        Thread.sleep(3);
        Driver.findElement(By.xpath("//label[text()='Rome']//preceding-sibling::div/div[2]")).click();
        Driver.findElement(By.xpath("//label[text()='Berlin']//preceding-sibling::div/div[2]")).click();
       Driver.findElement(By.xpath("//a[@class='ui-selectcheckboxmenu-close ui-corner-all']")).click();     
       
       
       Thread.sleep(10);
      // Driver.quit();
	}

}
//Clarify how to check if the check box is selected ??!
