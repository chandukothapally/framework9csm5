package Genericlibreies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	private Workbook workbook;
	 public void excelInit( String execelPath)
	 {
		 FileInputStream fis=null;
		
		 try {
			 fis= new FileInputStream(execelPath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
			 workbook= WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 }

	      public Map<String, String> getData(String sheetName, String exepectedTest)
	      {
	    	  Map<String, String> Map=new HashMap< String,String>();
	    	  DataFormatter df=new DataFormatter();
	    	    Sheet sheet= workbook.getSheet(sheetName);
	    	     for(int i=0;i<=sheet.getLastRowNum();i++)
	    	     {
	    	    	 if(df.formatCellValue(sheet.getRow(i).getCell(1)).equals(exepectedTest))
	    	    	 {
	    	    		 for(int j=i;j<=sheet.getLastRowNum();j++)
	    	    		 {
	    	    			 Map.put(df.formatCellValue(sheet.getRow(j).getCell(2)),
	    	    					 df.formatCellValue(sheet.getRow(j).getCell(3)));
	    	    			 if(df.formatCellValue(sheet.getRow(j).getCell(2)).equals("####"))
	    	    			 {
	    	    				 break;
	    	    			 }
	    	    			 }
	    	    			 
	    	    		 }
	    	    	 }
				return Map;
	    	    	 
	    	     }
	      }
