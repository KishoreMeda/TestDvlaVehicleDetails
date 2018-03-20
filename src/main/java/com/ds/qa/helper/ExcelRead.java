package main.java.com.ds.qa.helper;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class ExcelRead {
	String strFile;
	// Read the data and store into List of Hash Map
	List<HashMap<String, String>> mydata;
	
	public ExcelRead(String file)
	{
		this.strFile = file;
	}

	public List<HashMap<String, String>> getData(){
		XSSFWorkbook workbook;

		try {
			workbook = new XSSFWorkbook(new FileInputStream(strFile));
		
			mydata = new ArrayList<HashMap<String, String>>();
			XSSFSheet ws = workbook.getSheet("sheet1");
			int rows = ws.getPhysicalNumberOfRows();
			
			// Header row
			Row headerRow = ws.getRow(0);
			for(int i = 1; i < rows; i++){
				Row currentRow = ws.getRow(i);
				int cols = ws.getRow(0).getPhysicalNumberOfCells();
				HashMap<String, String> currentHash = new HashMap<String, String>();
				for (int j = 0; j < cols; j++) { 
					String cellVal = currentRow.getCell(j).getStringCellValue();
					currentHash.put(headerRow.getCell(j).getStringCellValue(), cellVal);
				}
				mydata.add(currentHash);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mydata;
	}
}
