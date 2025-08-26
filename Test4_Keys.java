package Test_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class Test4_Keys {
	public static void main(String[] args) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(3000);
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("username")).sendKeys(Keys.TAB);
		
		
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(3000);
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");         
//		driver.findElement(By.name("username")).sendKeys(Keys.ENTER);
//		if(driver.findElement(By.name("username")).isDisplayed())
//		{
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		}
//		else
//		{
//			System.out.println("username is not displayed");
//		}
		
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		WebElement uname=driver.findElement(By.name("username"));
		if(uname.isDisplayed())
		{
			uname.sendKeys("Admin");
		System.out.println("Get placeholder:"+uname.getAttribute("placeholder"));
		}
		else
		{
			System.out.println("username is not displayed");
		}
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.name("username")).sendKeys(Keys.ENTER);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("alert('Hello')");
		js.executeScript("windown.scrollBy(0, document.body.scrollHeight)");


	}
 
}