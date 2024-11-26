package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagDemo {

	ChromeDriver driver = new ChromeDriver();

	@BeforeTest
	public void openBrowser() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

//		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

	}

	@Test(priority = 1)
	public void login() {

		String username = "standard_user";
		String password = "secret_sauce";
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);

		driver.findElement(By.id("login-button")).click();

		WebElement logo = driver.findElement(By.className("app_logo"));
		if (logo.isDisplayed() == true) {
			System.out.println("Login Sucessful");
		}
	}

	@Test(priority = 2)
	public void poduct() throws InterruptedException {

		WebElement ddown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		ddown.click();
		Thread.sleep(2500);
		Select d = new Select(ddown);
		Thread.sleep(1000);
//		d.selectByValue("Price (low to high)");
		d.selectByVisibleText("Price (low to high)");

	}

	@Test(priority = 3)
	public void selectProduct() {

		driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		driver.findElement(By.id("add-to-cart")).click();
		WebElement Verifying = driver.findElement(By.id("remove"));

		if (Verifying.isDisplayed() == true) {

			driver.findElement(By.name("back-to-products")).click();
		} else {
			System.out.println("Product is not added");
		}

	}

	@Test(priority = 4)
	public void goingToCart() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(By.className("shopping_cart_link")).click();
		driver.findElement(By.id("checkout")).click();

	}

	@Test(priority = 5)
	public void yourInfo() {

		String FstName = "XYZ";
		String SndName = "ABC";
		String Pincode = "123456";

		driver.findElement(By.id("first-name")).sendKeys(FstName);
		driver.findElement(By.id("last-name")).sendKeys(SndName);
		driver.findElement(By.id("postal-code")).sendKeys(Pincode);

		driver.findElement(By.id("continue")).click();
	}

	@Test(priority = 6)
	public void overview() throws InterruptedException {

		Thread.sleep(1200);
		driver.findElement(By.id("finish")).click();

		WebElement orderPage = driver.findElement(By.className("complete-header"));
		if (orderPage.isDisplayed() == true) {
			driver.findElement(By.name("back-to-products")).click();
		} else {
			System.out.println("Your order is not sucessful");
		}

		driver.close();
	}
	

}
