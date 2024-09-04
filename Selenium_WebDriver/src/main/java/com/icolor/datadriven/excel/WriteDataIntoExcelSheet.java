package com.icolor.datadriven.excel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataIntoExcelSheet {

	static FileOutputStream file = null;
	static XSSFWorkbook workbook = null;
	static XSSFSheet sheet = null;

	public static void main(String[] args) {

		try {
			file = new FileOutputStream("C:\\Users\\siddh\\Desktop\\myfile.xlsx");
			workbook = new XSSFWorkbook();
			sheet = workbook.createSheet("sheet1");
			
			XSSFRow row0 = sheet.createRow(0);
			row0.createCell(0).setCellValue("Course");
			row0.createCell(1).setCellValue("Duration");
			row0.createCell(2).setCellValue("Start Date");
			
			XSSFRow row1 = sheet.createRow(1);
			row1.createCell(0).setCellValue("Java");
			row1.createCell(1).setCellValue("6 months");
			row1.createCell(2).setCellValue("22/05/2024");
			
			XSSFRow row2 = sheet.createRow(2);
			row2.createCell(0).setCellValue("Python");
			row2.createCell(1).setCellValue("9 months");
			row2.createCell(2).setCellValue("10/10/2023");
			
			workbook.write(file);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		if (workbook != null)
			try {
				workbook.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		if (file != null)
			try {
				file.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

}
