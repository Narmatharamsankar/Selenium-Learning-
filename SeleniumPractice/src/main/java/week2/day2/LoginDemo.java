package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {

	public static void main(String[] args) throws InterruptedException {
		
			// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.facebook.com");
       WebElement email_Id = driver.findElement(By.id("email"));
       email_Id.sendKeys("testleaf.2023@gmail.com");
       
       WebElement passWord = driver.findElement(By.name("pass"));
       
       passWord.sendKeys("Tuna@321");
       
       WebElement submitBtn = driver.findElement(By.name("login"));
       
       submitBtn.click();
       
       Thread.sleep(4000);
       
       WebElement linkText = driver.findElement(By.linkText("Find your account and log in."));
       linkText.click();
              
       Thread.sleep(4000);
         
       String title = driver.getTitle();
       
       if (title.contains("Forgotten Password"))
    	   System.out.println("Title verified!!");
       else
    	   System.out.println("Title is not verified .. !");
       
        
       
       
	}

}
