package org.LibGlobal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
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

public class BaseClass {
	
	static WebDriver driver;
	public static void getdriver() {
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 }
	
	public static void loadurl(String data) {
		driver.get(data);
		}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public WebElement findlocatorbyid(String attributename) {
		WebElement element = driver.findElement(By.id(attributename));
		return element;
		
	}
	
	public WebElement findlocatorbyname(String attributename) {
		WebElement element = driver.findElement(By.name(attributename));
		return element;
	}
	
	public WebElement findlocatorbyclass(String attributename) {
		WebElement element = driver.findElement(By.className(attributename));
		return element;
	}
	
	public WebElement findlocatorbyxpath(String attributename) {
		WebElement element = driver.findElement(By.xpath(attributename));
		return element;
	}
	
	public void type(WebElement element, String data) {
		element.sendKeys(data);
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public String gettext(WebElement element) {
		String data = element.getText();
		return data;
		
	}
	
	public void selectbytext(WebElement element, String data) {
		Select select = new Select(element);
		select.selectByVisibleText(data);
	}
	
	
	public String readdata(String sheetname,int rowno,int cellno) throws IOException {
		String value = null;
		File file = new File("C:\\Users\\Shalini\\eclipse-workspace\\MavenSample\\Excel Maintenance\\HotelData.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet(sheetname);
		Row row = sheet.getRow(rowno);
		Cell cell = row.getCell(cellno);
		int type = cell.getCellType();
		if (type ==1) {
			 value = cell.getStringCellValue();
			
		} else if(type==0){
			double d = cell.getNumericCellValue();
			long l = (long)d;
		    value = String.valueOf(l);

		}else {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date date = cell.getDateCellValue();
				SimpleDateFormat simple = new SimpleDateFormat("dd-MM-yyyy");
			    value = simple.format(date);
				
				
			}
			
		}
		return value;
		}
	
       public String getattributevalue(WebElement element) {
    	   String data = element.getAttribute("value");
		   return data;
       }
	
	
	    public void writeData(String sheetName,int rowno,int cellno,String data) throws IOException {
		
		File file = new File("C:\\Users\\Shalini\\eclipse-workspace\\MavenSample\\Excel Maintenance\\HotelData.xlsx");
		Workbook book = new XSSFWorkbook();
		Sheet sheet = book.createSheet(sheetName);
		Row row = sheet.createRow(rowno);
		Cell cell = row.createCell(cellno);
		
		cell.setCellValue(data);
		FileOutputStream o = new FileOutputStream(file);
		book.write(o);
		
		}
	    
	    public void writeDataInCell(String sheetName,int rowno,int cellno,String data) throws IOException {
	    	File file = new File("C:\\Users\\Shalini\\eclipse-workspace\\MavenSample\\Excel Maintenance\\orderNo.xlsx");
			FileInputStream stream = new FileInputStream(file);
			Workbook book = new XSSFWorkbook(stream);
			Sheet sheet = book.getSheet(sheetName);
			Row row = sheet.getRow(rowno);
			Cell cell = row.createCell(cellno);
			cell.setCellValue(data);
			FileOutputStream o = new FileOutputStream(file);
			book.write(o);
	    	
			
		}
	    
	    public void selectoptionbytext(WebElement element,String data) {
	    	Select select = new Select(element);
	    	select.selectByVisibleText(data);
			

		}
	    
	    public void updateData(String sheetname,int rowno, int cellno,String olddata,String newdata) throws IOException {
	    	
	    	File f = new File("C:\\Users\\Shalini\\eclipse-workspace\\MavenSample\\Excel Maintenance\\HotelData.xlsx");
	    	FileInputStream  stream = new FileInputStream(f);
	    	Workbook book = new XSSFWorkbook(stream);
	    	Sheet sheet = book.getSheet(sheetname);
	    	Row row = sheet.getRow(rowno);
	    	Cell cell = row.getCell(cellno);
	    	String data = cell.getStringCellValue();
	    	if(data.equals(olddata)) {
	    		
	    		cell.setCellValue(newdata);
	    		
	    	}
	    	FileOutputStream o = new FileOutputStream(f);
	    	book.write(o);
	    	
	    	
	    	
	    	
	    }
	    
	    
	    
	    public static void quit() {
			driver.quit();

		}

}
