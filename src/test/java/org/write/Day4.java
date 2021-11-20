package org.write;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4 {
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement skills = driver.findElement(By.id("Skills"));
		Select select = new Select(skills);
		
		List<WebElement> options = select.getOptions();
	
		
		File f = new File("C:\\Users\\Shalini\\eclipse-workspace\\MavenSample\\Excel Maintenance\\skills.xlsx");
		Workbook book = new XSSFWorkbook();
		Sheet sheet = book.createSheet("Courses");
		
		
		for (int j = 0; j < options.size(); j++) {
			WebElement element = options.get(j);
			String data = element.getText();
			System.out.println(data);
			Row row = sheet.createRow(j);
			Cell cell = row.createCell(0); 
			cell.setCellValue(data);
			
		}
		
		FileOutputStream o = new FileOutputStream(f);
		book.write(o);
		
		System.out.println("*************");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
