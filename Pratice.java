package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pratice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2500);
		
		//Search Product
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("Bags");
		driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']//*[name()='svg']")).click();
		Thread.sleep(2500);
		
		DevTools devTools = new ChromeDriver().getDevTools();
		devTools.createSession();
		
		//Adding the product
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]/div[1]/img[1]")).click();
		Thread.sleep(4000);
		WebElement element  = driver.findElement(By.xpath("//button[normalize-space()='Add to cart']"));
		
		  JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", element);
	        element.click();
		
		
//		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]"
//				+ "/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]")).click();
		
		
	}

}
