package org.Facebook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadCont {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Shalini\\eclipse-workspace\\MavenSample\\Excel Maintenance\\Excel2.xlsx");
		FileInputStream str = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(str);
		Sheet s = book.getSheet("Sheet1");
		
	
		Row r = s.getRow(2);
		Cell c = r.getCell(2);
		System.out.println(c);
		
		int type = c.getCellType();
		
		if (type == 0) {
			
			if (DateUtil.isCellDateFormatted(c)) {
				Date d = c.getDateCellValue();
				SimpleDateFormat simple = new SimpleDateFormat("dd-MM-yy");
				String format = simple.format(d);
				System.out.println(format);
				
			}

			
			
	}
		
	}

}
