package hashtag;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hashtag {
	 
		public static void main (String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hashtag-ca.com/careers/apply?jobCode=QAE001");
		driver.manage().window().maximize();
		
		//Case sensitivity -Name field upper and lower case check, 
		driver.findElement(By.name("name")).sendKeys("Harshada");
		
		driver.findElement(By.name("name")).sendKeys("harshada");

		//Tab fuctionality 
		Actions act = new Actions (driver);
	    act.sendKeys(Keys.TAB).build().perform();
	    
	    //email verification
		driver.findElement(By.name("email")).sendKeys("d96harshada@gmail.com");
		
		//experience
		driver.findElement(By.name("experience")).sendKeys("3");

		//notice period 
		driver.findElement(By.xpath("//input[@name='notice_time']")).sendKeys("15");

		//Resume
		driver.findElement(By.xpath("//input[@id=\"inputFile\"]")).sendKeys("file adress");
		
		//discription
		driver.findElement(By.xpath("//input[@name='description']")).sendKeys("3 plus experience in automation and manual testing");

		

		}
	}


