package AutomationTesting;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ninjas {

//	public static void main(String[] args) throws InterruptedException {

	@Test
	public void ninja() throws InterruptedException {

		System.out.println("Hy Starting Automation");

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();

		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(1200);

//		Register Account
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(1200);
		driver.findElement(By.id("input-firstname")).sendKeys("Avadh");
		Thread.sleep(1200);
		driver.findElement(By.id("input-lastname")).sendKeys("Bhalani");
		Thread.sleep(1200);
		driver.findElement(By.id("input-email")).sendKeys("avadhbhalani123@gmail.com");
		Thread.sleep(1200);
		driver.findElement(By.id("input-telephone")).sendKeys("9898989898");
		Thread.sleep(1200);
		driver.findElement(By.id("input-password")).sendKeys("1234");
		Thread.sleep(1200);
		driver.findElement(By.id("input-confirm")).sendKeys("1234");
		Thread.sleep(1200);
		driver.findElement(By.name("agree")).click();
		Thread.sleep(1200);
		driver.findElement(By.xpath("//input[@class= 'btn btn-primary']")).click();

		Thread.sleep(1200);
		boolean display = driver.findElement(By.xpath("//body/div[@id='account-register']/div[1]")).isDisplayed();
		System.out.println(display + " User already register please click on login");

		if (display == true) {

			driver.findElement(By.linkText("login page")).click();

		} else {

			System.out.println("Registration successfull");

		}

//		Login Account
		driver.findElement(By.id("input-email")).sendKeys("avadhbhalani123@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("input-password")).sendKeys("1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class= 'btn btn-primary']")).click();
//	
//		// Search the product
		driver.findElement(By.name("search")).sendKeys("Mobile");
		driver.findElement(By.xpath("/html[1]/body[1]/header[1]/div[1]/div[1]/div[2]/div[1]/span[1]/button[1]/i[1]"))
				.click();
		driver.findElement(By.id("description")).click();
		driver.findElement(By.id("button-search")).click();

//		If user want see product in grid or list , if list so press = 1 and if grid so press = 2 

//				System.out.println("How would you like to view the products?");
//		        System.out.println("1. List");
//		        System.out.println("2. Grid");
//		        Scanner scanner = new Scanner(System.in);
//		        int choice = scanner.nextInt();
//		        // Use an if-else statement to handle the choice
//		        if (choice == 1) {
//		            // User selected list view
//		           driver.findElement(By.id("list-view")).click();
//		        	
//		            // Perform actions for list view
//		        } else if (choice == 2) {
//		            // User selected grid view
//		        	 driver.findElement(By.id("grid-view")).click();
//		            // Perform actions for grid view
//		        } else {
//		            // Invalid choice
//		            System.out.println("Invalid choice. Please try again.");
//		        }
//				scanner.close();

		WebElement ddown = driver.findElement(By.id("input-sort"));
		ddown.click();
		Select de = new Select(ddown);
		de.selectByVisibleText("Model (A - Z)");

		driver.findElement(By.linkText("iPhone")).click();
		driver.findElement(
				By.xpath("//body/div[@id='product-product']/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]"))
				.click();
		int i = 0;
		while (i < 5) {

			driver.findElement(By.xpath("//body/div[2]/div[1]/button[2]")).click();
			Thread.sleep(1000);
			i++;
		}
		driver.findElement(By.className("mfp-close")).click();
		driver.findElement(By.id("input-quantity")).clear();
		driver.findElement(By.id("input-quantity")).sendKeys("2");
		// driver.findElement(By.xpath("//button[@id='button-cart']")).click();
		driver.findElement(By.id("button-cart")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("shopping cart")).click();

		// if stock is not available so this type line is displaying

		boolean outstock = driver.findElement(By.xpath("//body/div[@id='checkout-cart']/div[1]")).isDisplayed();
		if (outstock == true) {
			System.out.println("Sorry! Stock is not available next week you can purchese this product ");
		}
		Thread.sleep(600);
		if (outstock == true) {
			driver.navigate().back();
			driver.navigate().back();
			System.out.println("you can search the product");
		}

		driver.findElement(By.linkText("MacBook Air")).click();

		driver.findElement(
				By.xpath("//body/div[@id='product-product']/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]"))
				.click();
		int j = 1;
		while (j < 4) {

			driver.findElement(By.xpath("//body/div[2]/div[1]/button[2]")).click();
			Thread.sleep(1000);
			j++;
		}
		driver.findElement(By.className("mfp-close")).click();
		driver.findElement(By.id("input-quantity")).clear();
		driver.findElement(By.id("input-quantity")).sendKeys("2");
		//driver.findElement(By.xpath("//button[@id='button-cart']")).click();
		driver.findElement(By.id("button-cart")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("shopping cart")).click();

		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div[1]/span[1]/button[2]")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//input[@class='form-control']")).clear();
		Thread.sleep(600);
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("2");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(600);
		driver.findElement(By.linkText("Checkout")).click();
		Thread.sleep(1000);
		// After CheckOut
//		driver.findElement(By.id("input-payment-firstname")).sendKeys("Avadh");
//		driver.findElement(By.id("input-payment-lastname")).sendKeys("Bhalani");
//		driver.findElement(By.id("input-payment-address-1")).sendKeys("Bangalore");
//		driver.findElement(By.id("input-payment-city")).sendKeys("Bangalore");
//		driver.findElement(By.name("postcode")).sendKeys("123456");
//		WebElement country =driver.findElement(By.name("country_id"));
//		country.click();
//		Select yourcountry = new Select(country);	
//		yourcountry.selectByIndex(39);
//		WebElement state = driver.findElement(By.name("zone_id"));
//		state.click();
//		Select yourstate = new  Select(state);
//		yourstate.selectByIndex(6);

		Boolean warning = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"))
				.isDisplayed();

		if (warning == false) {
			driver.findElement(By.id("button-payment-address")).click();
			driver.findElement(By.xpath("//input[@id='button-payment-address']")).click();
			Thread.sleep(800);
			driver.findElement(By.xpath("//input[@id='button-shipping-address']")).click();
			Thread.sleep(800);
			driver.findElement(By.xpath("//input[@id='button-shipping-method']")).click();
			Thread.sleep(600);
			driver.findElement(By.name("agree")).click();
			driver.findElement(By.xpath("//input[@id='button-payment-method']")).click();
			Thread.sleep(600);
			driver.findElement(By.xpath("//input[@id='button-confirm']")).click();
			System.out.println("Successfully Ordered ");

		}
		System.out.print("Product is out of stock");

//		Thread.sleep(2500);
//		driver.close();

	}

}
