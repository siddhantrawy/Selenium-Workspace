package com.icolor.datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.attribute.UserDefinedFileAttributeView;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// Excel File -> Workbook -> Sheets -> Rows -> Cells

public class ReadFromExcel {
	
	// Two static variables file and workbook are declared:
	// 1. file: Used to hold the input stream for reading the Excel file.
	// 2. workbook: An instance of XSSFWorkbook, which represents the entire Excel workbook (part of Apache POI library for working with Excel files).
	static FileInputStream file = null;
	static XSSFWorkbook workbook = null;
	
	
	public static void main(String[] args) {
		
		// A FileInputStream is created to read the Excel file from the specified path (MyData.xlsx).
		// If the file is not found, a FileNotFoundException is thrown, and the error message is printed.
		try {
			file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\MyData.xlsx");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
/*
 	The path provided (System.getProperty("user.dir") + "\\testdata\\MyData.xlsx") gives the full path to the file MyData.xlsx.
 	if your project is located in C:\Users\siddh\workspace\MyProject, System.getProperty("user.dir") will return that path.
 	The double backslashes (\\) are used to escape the backslash in a string literal in Java. A single backslash \ is a special character in Java strings, so it needs to be escaped.
 	
 	Q. Why Use System.getProperty("user.dir")?
	   Portability: Using System.getProperty("user.dir") makes your code more flexible and portable because the path is dynamically determined based on where the program is executed. You don't have to hard-code absolute paths, which might differ on various machines or environments.
       Relative Paths: You can work with relative paths (e.g., \\testdata\\MyData.xlsx) instead of hard-coding absolute paths. This makes your program easier to manage, especially if it is used across different systems or development environments.  
 */
		
		
		
		// XSSFWorkbook is used to open the workbook using the file input stream.
		// If an I/O error occurs during reading, it throws an IOException and prints the stack trace.
		try {
			workbook = new XSSFWorkbook(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// The code accesses the sheet named "Sheet1" in the workbook. Alternatively, you can access the sheet by its index using workbook.getSheetAt(0) (0 being the first sheet).
		XSSFSheet  sheet = workbook.getSheet("Sheet1");  //	XSSFSheet  sheet=workbook.getSheetAt(0);
		
		// getLastRowNum() returns the index of the last row in the sheet (0-based index).
		// getLastCellNum() returns the number of cells (columns) in the first row.
		int totalRows=sheet.getLastRowNum();
		int totalCells=sheet.getRow(0).getLastCellNum();
		
		// The total number of rows and cells in the first row are printed.
		System.out.println("number of rows:"+ totalRows); //5
		System.out.println("number of cells:"+ totalCells);  //4
		
		
		// A nested loop is used to iterate through the rows (r) and columns (c) in the sheet.
		// For each row and cell, the content is retrieved and printed, separated by a tab (\t).
		for(int r=0;r<=totalRows;r++)
		{
			XSSFRow currentRow=sheet.getRow(r);
						
			for(int c=0;c<totalCells;c++)
			{
				XSSFCell cell=currentRow.getCell(c);
				System.out.print(cell.toString()+"\t");
				
			}
			System.out.println();
		}
		
		// The workbook and file stream are closed in separate try-catch blocks to avoid resource leaks.
		try {
			workbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
