package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtility {
	
	File file ;    
	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public CellStyle style;
	public String path="E:\\WebAutomationTest\\WebApp\\src\\test\\java\\data\\test.xlsx";
	
//create instructor to init path 

	
//	get row count 
	
	public int getRowCount(String sheetName) throws IOException {
		
		file =new File(path);
		fi=new FileInputStream(file);
		workbook =new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetName);
		int rowCount=sheet.getLastRowNum();
		
		
		return rowCount;
	}
	
//	get col count
	
	public int getCellCount(String sheetName , int rownum) throws IOException {
		file =new File(path);
		fi=new FileInputStream(file);
		workbook =new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetName);
		row=sheet.getRow(rownum);
		int cellcount=row.getLastCellNum();
		
		
		return cellcount;
		
	}
	
//	get data from cell which in rownumber/cellnumber
	
	public String getCellData(String sheetName ,int rownum ,int cellnum) throws IOException {
		
		file =new File(path);
		fi=new FileInputStream(file);
		workbook=new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetName);
		row=sheet.getRow(rownum);
		cell=row.getCell(cellnum);
		
//		formate data 
		
//		switch (cell.getCellType()) {
//		case STRING: System.out.print(cell.getStringCellValue());
//		break;
//		case NUMERIC: System.out.print(cell.getNumericCellValue());
//		break;
//		case BOOLEAN: System.out.print(cell.getBooleanCellValue());
//		break;
		
//		String data=cell.getStringCellValue();
		
		String data;
		DataFormatter formatter=new DataFormatter();
		try {
			
			data=formatter.formatCellValue(cell);
			
		} catch (Exception e) {
			data="";
		}
		
		
		
		return data;
		
		
		
		
		
		
		
	}
	

}
