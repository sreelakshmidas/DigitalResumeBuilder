package com.qa.utilities;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelValues
{

	public static XSSFWorkbook excelWorkBook;
	public static XSSFSheet excelWorkSheet;
	
	//giving the excelfile path and sheet number as parameters instead of giving the direct values
	
	public static String getCellData(int RowNo, int ColNo,String ExcelPath,int SheetNum ) throws IOException
	{
		FileInputStream excel=new FileInputStream(ExcelPath);
		excelWorkBook=new XSSFWorkbook (excel);
		excelWorkSheet=excelWorkBook.getSheetAt(SheetNum);
		return 	excelWorkSheet.getRow(RowNo).getCell(ColNo).getStringCellValue();
		
	}

	
}
