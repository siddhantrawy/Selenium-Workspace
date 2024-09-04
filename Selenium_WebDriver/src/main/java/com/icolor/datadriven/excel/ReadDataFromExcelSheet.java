package com.icolor.datadriven.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcelSheet {

	static int rowCount = 0, colCount = 0;
	static FileInputStream file = null;
	static XSSFWorkbook workbook = null;
	static XSSFSheet sheet = null;

	public static void main(String[] args) {

		try {
			file = new FileInputStream("C:\\Users\\siddh\\Desktop\\Sheet1.xlsx");
			workbook = new XSSFWorkbook(file);
			sheet = workbook.getSheet("Sheet1");
			rowCount = sheet.getLastRowNum();
			colCount = sheet.getRow(0).getLastCellNum();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Total Row Count: " + rowCount);
		System.out.println("Total Column Count: " + colCount);

		for (int i = 0; i <= rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				System.out.print(sheet.getRow(i).getCell(j).toString());
				System.out.print("\t\t");
			}
			System.out.println();
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