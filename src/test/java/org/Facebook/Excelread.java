package org.Facebook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelread {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Shalini\\eclipse-workspace\\MavenSample\\Excel Maintenance\\Excel1.xlsx");
		FileInputStream str = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(str);
		Sheet s = book.getSheet("Facebook");
		int rowno = s.getPhysicalNumberOfRows();
		for (int i = 0; i < rowno; i++) {
			
			Row r = s.getRow(i);
			int cellno = r.getPhysicalNumberOfCells();
			for (int j = 0; j < cellno; j++) {
				Cell c = r.getCell(j);
				
				System.out.println(c);
				
			}
			System.out.println("**********************");
			
		}
		
		
	}

}
