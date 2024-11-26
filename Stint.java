package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Stint {

	@Test
	public void stint() throws InterruptedException {
		// TODO Auto-generated met

		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://learn.stint.academy/");
		Thread.sleep(3000);

		// Login
//		driver.findElement(By.name("identifier")).click();
		String uname = "Ayyappa.naik@stridefuture.com";
		String password = "Appa@ak45";

		Thread.sleep(1000);
		driver.findElement(By.name("identifier")).sendKeys(uname);
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		driver.findElement(By.name("password")).sendKeys(password);

		// continue [submit button]
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		Thread.sleep(10000);

//		Add Program
		String ProgramName = "Automation test Program";
		driver.findElement(By.linkText("Programme List")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//button[@aria-label='Create Program']")).click();
		driver.findElement(By.id("programName")).sendKeys(ProgramName);
		driver.findElement(By.xpath("//button[@aria-label='Create']")).click();

		// Course Management
		Thread.sleep(3000);
		driver.findElement(By.linkText("Course Management")).click();
		Thread.sleep(3000);

//		Create Course
//		driver.findElement(By.xpath("//button[@aria-label='Create Course']")).click();
		String courseName = "Automation Test";
		String duration = "12";
//		driver.findElement(By.id("CourseName")).sendKeys(courseName);
//		driver.findElement(By.id("courseDuration")).sendKeys(duration);
//		driver.findElement(By.xpath("//button[@aria-label='Create']")).click();

//		Search Course	
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(courseName);
		driver.findElement(By.xpath("//img[@alt='Automation Test']")).click();
		Thread.sleep(2000);

//		Add topic
		String TopicName = "Topic Automation Test";
		String TopicDuration = "1";
		String TopicOrder = "1";

//		driver.findElement(By.xpath("//button[@aria-label='Add Topic']")).click();
//		driver.findElement(By.id("TopicName")).sendKeys(TopicName);
//		driver.findElement(By.id("topicDuration")).sendKeys(TopicDuration);
//		driver.findElement(By.id("topicOrder")).sendKeys(TopicOrder);
//		driver.findElement(By.xpath("//button[@aria-label='Create']")).click();
		Thread.sleep(5000);

//		Add Subtopic
//		driver.findElement(By.xpath("//a[@id='pr_id_226_header_0']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Add Subtopic']")).click();

		String subtopicName = "Automation Content";
		String points = "10";
		String order = "1";

		driver.findElement(By.id("SubtopicName")).sendKeys(subtopicName);
		driver.findElement(By.id("points")).sendKeys(points);
		driver.findElement(By.id("subtopicOrder")).sendKeys(order);
		// Select content type
		WebElement content = driver
				.findElement(By.xpath("//span[@class='p-dropdown-label p-inputtext p-placeholder']"));
		content.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@aria-label='CONTENT']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Create']")).click();

		Thread.sleep(3000);
		// Add Content
		String filepath = "C:\\Users\\BhalaniAvadhkumarAsh\\Downloads\\Untitled (14).html";
		driver.findElement(By.id("ContentTitle")).sendKeys(subtopicName);
		WebElement file = driver.findElement(By.id("file-input"));
		Thread.sleep(2000);

		file.sendKeys(filepath);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@aria-label='Create']")).click();

//		Add to Program
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Add to programme']")).click();
		driver.findElement(By.xpath("//span[@class='p-dropdown-label p-inputtext p-placeholder']")).click();

		WebElement AddProgram = driver
				.findElement(By.xpath("//input[@class='p-dropdown-filter p-inputtext p-component']"));
		AddProgram.sendKeys(ProgramName);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@aria-label='Automation test Program']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@aria-label='Save']")).click();
		System.out.println("Program Added Successfully");

//		Batch Management
		Thread.sleep(3000);
		driver.findElement(By.linkText("Batch Management")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//button[@aria-label='Create Batch']")).click();

		String BatchName = "Batch Automation Test";

		driver.findElement(By.id("batchName")).sendKeys(BatchName);
		// Add Program
		driver.findElement(By.xpath("//span[normalize-space()='Programme Name']")).click();
		WebElement AddProgramInBatch = driver
				.findElement(By.xpath("//input[@class='p-dropdown-filter p-inputtext p-component']"));
		AddProgramInBatch.sendKeys(ProgramName);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@aria-label='Automation test Program']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@placeholder='Select Start Date']")).sendKeys("25/11/2024");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@placeholder='Select End Date']")).sendKeys("31/12/2024");
		Thread.sleep(2500);
		driver.findElement(By.xpath("//button[@aria-label='Create']")).click();
		Thread.sleep(6000);
//		//Scheduling start date
//		driver.findElement(By.xpath("//div[@id='pr_id_3815']//div[1]//div[1]//div[1]//div[1]//span[1]//button[1]")).click();
//		Thread.sleep(2500);
//		driver.findElement(By.xpath("//span[normalize-space()='25']")).click();
////		//Scheduling End Date
//		driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/button[1]")).click();
//		Thread.sleep(2500);
//		driver.findElement(By.xpath("//span[normalize-space()='31']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//button[@aria-label='Schedule'])[1]")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Done']")).click();
		
		
	}
}
