package org.junit;


import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit {
	static WebDriver driver;
	
	@BeforeClass
	public static void beforeclass() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/"); 
		driver.manage().window().maximize();
		}
	
	@AfterClass
	public static void afterClass() {
		driver.quit();
		}
	
	@Before
	public void before() {
		Date date = new Date();
		System.out.println(date);
	
		}
	@After
	public void after() {
		Date date = new Date();
		System.out.println(date);
		

	}
	@Test
	public void test() throws InterruptedException {
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys("Shalu");
		
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys("Hello@1234");
		Thread.sleep(3000);
		
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();

	}
	
	

}
