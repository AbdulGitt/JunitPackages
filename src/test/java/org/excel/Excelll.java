package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelll {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\abdul\\eclipse-workspace\\Maven7.30Pm\\src\\test\\resources\\Excel.xlsx");
		
		FileInputStream fi=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(fi);
		
		Sheet s = w.getSheet("Sheet1");
		
		Row r = s.getRow(2);
		
		Cell c = r.getCell(1);
		
		System.out.println(c);
	}

}
