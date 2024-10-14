package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Amazon {

	WebDriver driver;

	@BeforeClass
	public void setUp() throws InterruptedException {
		// Set up ChromeDriver using WebDriverManager
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// Navigate to Amazon
		driver.get("https://www.amazon.in/");

		// Maximize the browser window
		driver.manage().window().maximize();
		Thread.sleep(3000);

	}

	@Test(priority = 1)
	public void ogin() throws InterruptedException {

		String Num = "9712547038";
		String Pass = "@_Radhe16";

		driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(Num);
		driver.findElement(By.id("continue")).click();

		driver.findElement(By.id("ap_password")).sendKeys(Pass);
		Thread.sleep(2000);

		driver.findElement(By.className("a-button-input")).click();
		Thread.sleep(3000);

	}

	@Test(priority = 2)
	public void AmazonPurchase() throws InterruptedException {

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("laptop bags"); // Replace with desired product
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		searchButton.click();
		Thread.sleep(3000); // Wait for search results to load

		// Click on the first product from the search results
		WebElement firstProduct = driver
				.findElement(By.xpath("//span[normalize-space()='Lenovo 15.6\" Casual Backpack B210']"));
		firstProduct.click();
		Thread.sleep(7000); // Wait for the product page to load

		// Add the product to the cart
		WebElement Buy = driver.findElement(By.className("a-button-text"));
		Buy.click();
		Thread.sleep(6000); // Wait for the cart to update

		// Proceed to checkout
		driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
		Thread.sleep(3000); // Wait for checkout page

//	        Add your Address
		WebElement Address = driver.findElement(By.xpath("//input[@data-testid='Address_selectShipToThisAddress']"));
		Address.click();
		Thread.sleep(6000);

//	        Select Payment Method [As of now selected NetBanking] 
		WebElement paymentMethod = driver.findElement(By.xpath("//div[@class='a-radio a-spacing-top-mini']"));
		paymentMethod.click();
		Thread.sleep(3000);

		WebElement BankMenu = driver.findElement(By.xpath("//span[@role='button']"));
		BankMenu.click();
		Thread.sleep(4000);

		driver.findElement(By.partialLinkText("HDFC Bank")).click();
//	        This method should working but it was in spam
//	        Select Menu = new Select(BankMenu);
//	        Menu.selectByVisibleText("HDFC Bank");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-labelledby='orderSummaryPrimaryActionBtn-announce']")).click();

		Thread.sleep(3000);
//	        popup 
		WebElement popup = driver.findElement(By.xpath("//a[@id='prime-interstitial-nothanks-button']"));
		popup.click();

//	        Place your order and pay
		WebElement PlaceOrderAndPay = driver
				.findElement(By.xpath("//input[@aria-labelledby='submitOrderButtonId-announce']"));
		PlaceOrderAndPay.click();

		System.out.println("Order Confirmation Message: ");
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
//		 Close the browser
		Thread.sleep(2000);
		if (driver != null) {
			driver.quit();
		}
	}
}
