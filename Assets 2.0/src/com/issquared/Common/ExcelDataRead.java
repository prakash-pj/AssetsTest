package com.issquared.Common;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;


public class ExcelDataRead {

		FileInputStream fi;
		XSSFWorkbook wb;
		XSSFSheet ws;
		
		public ExcelDataRead(String excelpath)
		{
			try {
				File f=new File(excelpath);
				fi=new FileInputStream(f);
				wb=new XSSFWorkbook(fi);
				
			    } 
			catch (Exception e) 
			{
				
				e.getMessage();
			
		    }
		}
		
		public ExcelDataRead() {
			// TODO Auto-generated constructor stub
		}

		public String getdata(int sheetindex,int row,int col)
		{
			
			ws=wb.getSheetAt(sheetindex);
			String data=ws.getRow(row).getCell(col).getStringCellValue();
			return data;
			
		}
		
		
		public int getrowcount(int sheetindex)
		{
			int row=wb.getSheetAt(sheetindex).getLastRowNum();		
			row=row;
			return row;
			
		}
		
		
		public int getcolcount(int sheetindex)
		{
			
			int col=wb.getSheetAt(sheetindex).getRow(0).getLastCellNum();
			col=col;
			return col;
			
		}
		
		
		@DataProvider(name="login")
		  public static Object[][] passdata() {

			ExcelDataRead ex=new ExcelDataRead("F:/Automation Framework for EIS Project/FrameWork/testData/Globaladminlogin.xlsx");
		  	  int rows=ex.getrowcount(0);
		  	  int colNum=ex.getcolcount(0);
		  	  System.out.println(rows);
		  	  System.out.println(colNum);
		  	  Object[][] data=new Object[rows][colNum];
		  	  for(int i=0;i<(rows);i++){
		  		  for(int j=0;j<colNum;j++)
		  	      {
		  		  data[i][j]=ex.getdata(0,i+1,j);
		  		
		  		  System.out.println(data[i][j]);
		  	  }}
		  	  return data;

		  }
		 @DataProvider(name="Tadmin")
		  public static Object[][] passdata1() {

			ExcelDataRead ex=new ExcelDataRead("F:/Automation Framework for EIS Project/FrameWork/testData/TadminPage.xlsx");
		  	  int rows=ex.getrowcount(0);
		  	  int colNum=ex.getcolcount(0);
		  	  System.out.println(rows);
		  	  System.out.println(colNum);
		  	  Object[][] data=new Object[rows][colNum];
		  	  for(int i=0;i<(rows);i++){
		  		  for(int j=0;j<colNum;j++)
		  	      {
		  		  data[i][j]=ex.getdata(0,i+1,j);
		  		
		  		  System.out.println(data[i][j]);
		  	  }}
		  	  
		  	 return data;

		  }

		 @DataProvider(name="ProcureAssets")
		  public static Object[][] ProcureAssets() {

			ExcelDataRead ex=new ExcelDataRead("F:/Automation Framework for EIS Project/Assets Module POM Framework/testData/ProcureAssets.xlsx");
		  	  int rows=ex.getrowcount(0);
		  	  int colNum=ex.getcolcount(0);
		  	  System.out.println(rows);
		  	  System.out.println(colNum);
		  	  Object[][] data=new Object[rows][colNum];
		  	  for(int i=0;i<(rows);i++){
		  		  for(int j=0;j<colNum;j++)
		  	      {
		  		  data[i][j]=ex.getdata(0,i+1,j);
		  		
		  		  System.out.println(data[i][j]);
		  	  }}
		  	  
		  	 return data;

		  }
		 @DataProvider(name="AssetClass")
		  public static Object[][] AssetClass() {

			ExcelDataRead ex=new ExcelDataRead("C:/Users/Admin/Desktop/Assets Module POM Framework/testData/AssetClass.xlsx");
		  	  int rows=ex.getrowcount(0);
		  	  int colNum=ex.getcolcount(0);
		  	  System.out.println(rows);
		  	  System.out.println(colNum);
		  	  Object[][] data=new Object[rows][colNum];
		  	  for(int i=0;i<(rows);i++){
		  		  for(int j=0;j<colNum;j++)
		  	      {
		  		  data[i][j]=ex.getdata(0,i+1,j);
		  		
		  		  System.out.println(data[i][j]);
		  	  }}
		  	  
		  	 return data;

		  }
		 @DataProvider(name="ManageAssets")
		  public static Object[][] ManageAssets() {

			ExcelDataRead ex=new ExcelDataRead("F:/Automation Framework for EIS Project/Assets Module POM Framework/testData/ManageAssets.xlsx");
		  	  int rows=ex.getrowcount(0);
		  	  int colNum=ex.getcolcount(0);
		  	  System.out.println(rows);
		  	  System.out.println(colNum);
		  	  Object[][] data=new Object[rows][colNum];
		  	  for(int i=0;i<(rows);i++){
		  		  for(int j=0;j<colNum;j++)
		  	      {
		  		  data[i][j]=ex.getdata(0,i+1,j);
		  		
		  		  System.out.println(data[i][j]);
		  	  }}
		  	  
		  	 return data;

		  }
		 
		 @DataProvider(name="AssetExpenses")
		  public static Object[][] AssetExpenses() {

			ExcelDataRead ex=new ExcelDataRead("F:/Automation Framework for EIS Project/Assets Module POM Framework/testData/AssetExpenses.xlsx");
		  	  int rows=ex.getrowcount(0);
		  	  int colNum=ex.getcolcount(0);
		  	  System.out.println(rows);
		  	  System.out.println(colNum);
		  	  Object[][] data=new Object[rows][colNum];
		  	  for(int i=0;i<(rows);i++){
		  		  for(int j=0;j<colNum;j++)
		  	      {
		  		  data[i][j]=ex.getdata(0,i+1,j);
		  		
		  		  System.out.println(data[i][j]);
		  	  }}
		  	  
		  	 return data;

		  }
		 
		 @DataProvider(name="MaintenanceContract")
		  public static Object[][] MaintenanceContract() {

			ExcelDataRead ex=new ExcelDataRead("F:/Automation Framework for EIS Project/Assets Module POM Framework/testData/MaintenanceContract.xlsx");
		  	  int rows=ex.getrowcount(0);
		  	  int colNum=ex.getcolcount(0);
		  	  System.out.println(rows);
		  	  System.out.println(colNum);
		  	  Object[][] data=new Object[rows][colNum];
		  	  for(int i=0;i<(rows);i++){
		  		  for(int j=0;j<colNum;j++)
		  	      {
		  		  data[i][j]=ex.getdata(0,i+1,j);
		  		
		  		  System.out.println(data[i][j]);
		  	  }}
		  	  
		  	 return data;

		  }
		 
		 @DataProvider(name="InsuranceContracts")
		  public static Object[][] InsuranceContracts() {

			ExcelDataRead ex=new ExcelDataRead("F:/Automation Framework for EIS Project/Assets Module POM Framework/testData/InsuranceContracts.xlsx");
		  	  int rows=ex.getrowcount(0);
		  	  int colNum=ex.getcolcount(0);
		  	  System.out.println(rows);
		  	  System.out.println(colNum);
		  	  Object[][] data=new Object[rows][colNum];
		  	  for(int i=0;i<(rows);i++){
		  		  for(int j=0;j<colNum;j++)
		  	      {
		  		  data[i][j]=ex.getdata(0,i+1,j);
		  		
		  		  System.out.println(data[i][j]);
		  	  }}
		  	  
		  	 return data;

		  }
		 
		 @DataProvider(name="WarrantyContract")
		  public static Object[][] WarrantyContract() {

			ExcelDataRead ex=new ExcelDataRead("F:/Automation Framework for EIS Project/Assets Module POM Framework/testData/Warantycontract.xlsx");
		  	  int rows=ex.getrowcount(0);
		  	  int colNum=ex.getcolcount(0);
		  	  System.out.println(rows);
		  	  System.out.println(colNum);
		  	  Object[][] data=new Object[rows][colNum];
		  	  for(int i=0;i<(rows);i++){
		  		  for(int j=0;j<colNum;j++)
		  	      {
		  		  data[i][j]=ex.getdata(0,i+1,j);
		  		
		  		  System.out.println(data[i][j]);
		  	  }}
		  	  
		  	 return data;

		  }
		 
		 @DataProvider(name="Maintenance")
		  public static Object[][] Maintenance() {

			ExcelDataRead ex=new ExcelDataRead("F:/Automation Framework for EIS Project/Assets Module POM Framework/testData/Maintenance.xlsx");
		  	  int rows=ex.getrowcount(0);
		  	  int colNum=ex.getcolcount(0);
		  	  System.out.println(rows);
		  	  System.out.println(colNum);
		  	  Object[][] data=new Object[rows][colNum];
		  	  for(int i=0;i<(rows);i++){
		  		  for(int j=0;j<colNum;j++)
		  	      {
		  		  data[i][j]=ex.getdata(0,i+1,j);
		  		
		  		  System.out.println(data[i][j]);
		  	  }}
		  	  
		  	 return data;

		  }
		 
		 @DataProvider(name="Ownership")
		  public static Object[][] Ownership() {

			ExcelDataRead ex=new ExcelDataRead("F:/Automation Framework for EIS Project/Assets Module POM Framework/testData/Ownership.xlsx");
		  	  int rows=ex.getrowcount(0);
		  	  int colNum=ex.getcolcount(0);
		  	  System.out.println(rows);
		  	  System.out.println(colNum);
		  	  Object[][] data=new Object[rows][colNum];
		  	  for(int i=0;i<(rows);i++){
		  		  for(int j=0;j<colNum;j++)
		  	      {
		  		  data[i][j]=ex.getdata(0,i+1,j);
		  		
		  		  System.out.println(data[i][j]);
		  	  }}
		  	  
		  	 return data;

		  }
		 @DataProvider(name="AssetRepairs")
		  public static Object[][] AssetRepairs() {

			ExcelDataRead ex=new ExcelDataRead("F:/Automation Framework for EIS Project/Assets Module POM Framework/testData/AssetRepairs.xlsx");
		  	  int rows=ex.getrowcount(0);
		  	  int colNum=ex.getcolcount(0);
		  	  System.out.println(rows);
		  	  System.out.println(colNum);
		  	  Object[][] data=new Object[rows][colNum];
		  	  for(int i=0;i<(rows);i++){
		  		  for(int j=0;j<colNum;j++)
		  	      {
		  		  data[i][j]=ex.getdata(0,i+1,j);
		  		
		  		  System.out.println(data[i][j]);
		  	  }}
		  	  
		  	 return data;

		  }
		 @DataProvider(name="AssetDisposal")
		  public static Object[][] AssetDisposal() {

			ExcelDataRead ex=new ExcelDataRead("F:/Automation Framework for EIS Project/Assets Module POM Framework/testData/AssetDisposal.xlsx");
		  	  int rows=ex.getrowcount(0);
		  	  int colNum=ex.getcolcount(0);
		  	  System.out.println(rows);
		  	  System.out.println(colNum);
		  	  Object[][] data=new Object[rows][colNum];
		  	  for(int i=0;i<(rows);i++){
		  		  for(int j=0;j<colNum;j++)
		  	      {
		  		  data[i][j]=ex.getdata(0,i+1,j);
		  		
		  		  System.out.println(data[i][j]);
		  	  }}
		  	  
		  	 return data;

		  }
		  

@DataProvider(name="AssetBundles")
 public static Object[][] AssetBundles() {

	ExcelDataRead ex=new ExcelDataRead("F:/Automation Framework for EIS Project/Assets Module POM Framework/testData/AssetBundles.xlsx");
 	  int rows=ex.getrowcount(0);
 	  int colNum=ex.getcolcount(0);
 	  System.out.println(rows);
 	  System.out.println(colNum);
 	  Object[][] data=new Object[rows][colNum];
 	  for(int i=0;i<(rows);i++){
 		  for(int j=0;j<colNum;j++)
 	      {
 		  data[i][j]=ex.getdata(0,i+1,j);
 		
 		  System.out.println(data[i][j]);
 	  }}
 	  
 	 return data;

 }
	}
	


