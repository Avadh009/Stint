package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
		
		
		ChromeDriver driver = new ChromeDriver();

		@BeforeTest
		public void Browser() {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();

//			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");

		}
		
		@Test(priority = 1)
		public void login() throws InterruptedException {

			String Number = "9904472193";
		
			driver.findElement(By.xpath("//img[@alt='Chevron']")).click();
			driver.findElement(By.xpath("//li[normalize-space()='My Profile']")).click();
			driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys(Number);
			driver.findElement(By.xpath("//button[normalize-space()='Request OTP']")).click();
			
			//OTP Enter manually that's why we are take time limit
			Thread.sleep(2500);
			driver.findElement(By.xpath("//button[normalize-space()='Verify']")).click();
			
			}
		
		@Test(priority=2)
		public void home() throws InterruptedException {
			
			Thread.sleep(2500);
			driver.findElement(By.xpath("//img[@title='Flipkart']")).click();
			WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
			search.sendKeys("Bags");
			Thread.sleep(1500);
			driver.findElement(By.xpath("//a[contains(text(),'Large 40 L Laptop Backpack Vegan Casual Backpack f')]")).click();
			
		}
		
		public void buyProduct() {
			
			driver.findElement(By.xpath("//button[normalize-space()='Buy Now']")).click();
			driver.findElement(By.xpath("//button[normalize-space()='Deliver Here']")).click();
			driver.findElement(By.xpath("//button[normalize-space()='CONTINUE']")).click();
			driver.findElement(By.xpath("//label[@for='WALLETOTHERS']//div[@class='qsHXPi']")).click();
		}
	}

	

