package com.issquared.Common;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Exceluitility {
public String Testcase;
public WritableSheet writablesh;
public WritableWorkbook workbookcopy;
@BeforeTest
 public void queryParameterization() throws BiffException, IOException, RowsExceededException, WriteException{
	
      FileInputStream testfile= new FileInputStream("E:\\Test Scenarios-2018\\Book1.xls");
      Workbook wbook = Workbook.getWorkbook(testfile);
      Sheet sheets = wbook.getSheet("Query_data");
      int NoRows = sheets.getRows();
      
      String inputdata[][] = new String[sheets.getRows()][sheets.getColumns()];
      System.out.println("Number of rows present in TestData xlx file is:"+ NoRows);
      
      FileOutputStream testOutput= new FileOutputStream("E:\\Test Scenarios-2018\\Book12.xls");
      System.out.println("Creating file one");
      
      workbookcopy = Workbook.createWorkbook(testOutput);
      System.out.println("Creating file 2");
      
      writablesh = workbookcopy.createSheet("Query_data",0);
       System.out.println("Creating file 3");
       
         for(int i=0;i<sheets.getRows();i++){
            
        	 for(int k=0;k<sheets.getColumns();k++){
        		 
                 inputdata[i][k]=sheets.getCell(k, i).getContents();
                 Label l = new Label(k, i, inputdata[i][k]);
                 Label l2= new Label(4, 0, "Results"); 
                 
                   writablesh.addCell(l);
                   writablesh.addCell(l2);
                   
           }
       }
   }

@AfterTest
   public void writeexcels(){
	
      try{
            workbookcopy.write();
          }
      catch(IOException e){
             e.printStackTrace();
     }
        try{
            workbookcopy.close();
            }
        catch(WriteException e){
            e.printStackTrace();
           }
        catch(IOException e){
            e.printStackTrace();
          }
      }
    }

