
package com.issquared.Common;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtils {

	static Sheet sheet;
	static FileInputStream file;

	public static void main(String... args) throws Exception {
		System.out.println("config data : "
				+ getConfigData("." + File.separator + "Excel-testData" + File.separator + "Config.xlsx", "Config"));
	}

	/**
	 * Will read config excel file.
	 * 
	 * @param filePath
	 * @param SheetName
	 * @return
	 */
	public static HashMap<String, String> getConfigData(String filePath, String SheetName) {
		HashMap<String, String> temp;
		try {
			file = readExcel(filePath, SheetName);
			int totalColumns = getColumnCount();
			List<String> headers = new ArrayList<String>();

			for (int j = 0; j < totalColumns; j++) {
				String cellData = getCellData(0, j);
				headers.add(cellData);
			}
			temp = new HashMap<String, String>();
			for (int j = 0; j < totalColumns; j++) {
				String cellData = getCellData(0 + 1, j);
				temp.put(headers.get(j), cellData);
			}
			return temp;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				file.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	/**
	 * Reads the test data from excel and returns.
	 * 
	 * @param filePath
	 * @param SheetName
	 * @return
	 */
	public static List<HashMap<String, String>> getTestData(String filePath, String SheetName) {
		List<HashMap<String, String>> finalHashList = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> temp;
		try {
			file = readExcel(filePath, SheetName);
			int totalRows = getRowCount();

			int totalColumns = getColumnCount();
			List<String> headers = new ArrayList<String>();

			for (int j = 0; j < totalColumns; j++) {
				String cellData = getCellData(0, j);
				headers.add(cellData);
			}
			for (int i = 0; i < totalRows; i++) {
				temp = new HashMap<String, String>();
				for (int j = 0; j < totalColumns; j++) {
					String cellData = getCellData(i + 1, j);
					temp.put(headers.get(j), cellData);
				}
				finalHashList.add(temp);
			}
			file.close();
			return finalHashList;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				file.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	/**
	 * Will get row count
	 * 
	 * @return
	 */
	public static int getRowCount() {
		return sheet.getLastRowNum();
	}

	/**
	 * Will get column count
	 * 
	 * @return
	 */
	public static int getColumnCount() {
		return sheet.getRow(0).getLastCellNum();
	}

	/**
	 * Will get cell data
	 * 
	 * @param row
	 * @param column
	 * @return
	 */
	public static String getCellData(int row, int column) {
		String cellData;
		try {
			cellData = sheet.getRow(row).getCell(column).toString();
		} catch (NullPointerException npe) {
			cellData = "";
		}
		return cellData;
	}

	public static FileInputStream readExcel(String filePath, String sheetName) throws IOException {

		FileInputStream file = new FileInputStream(new File(filePath));
		Workbook workbook = null;
		if (filePath.toLowerCase().endsWith("xlsx")) {
			workbook = new XSSFWorkbook(file);
		} else if (filePath.toLowerCase().endsWith("xls")) {
			workbook = new HSSFWorkbook(file);
		}
		sheet = workbook.getSheet(sheetName);
		return file;
	}
	
	

}