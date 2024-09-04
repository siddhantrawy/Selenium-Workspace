package com.icolor.datadriven.excel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataDynamicallyIntoExcelSheet {

	static FileOutputStream file = null;
	static XSSFWorkbook workbook = null;
	static XSSFSheet sheet = null;
	static Scanner input = null;

	public static void main(String[] args) {

		try {
			file = new FileOutputStream("C:\\Users\\siddh\\Desktop\\myfile1.xlsx");
			workbook = new XSSFWorkbook();
			sheet = workbook.createSheet("sheet1");

			input = new Scanner(System.in);
			System.out.println("Enter Row Count: ");
			int rowCount = input.nextInt();

			System.out.println("Enter Cell Count: ");
			int cellCount = input.nextInt();

			System.out.println("Enter Your Data: ");
			for (int i = 0; i <= rowCount; i++) {
				XSSFRow currRow = sheet.createRow(i);
				for (int j = 0; j < cellCount; j++) {
					XSSFCell cell = currRow.createCell(j);
					cell.setCellValue(input.next());
				}
			}

			workbook.write(file);
		} catch (IOException e) {
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
		if (input != null) {
			input.close();
		}

	}
}
