package Com.Ecommerce.Utilites;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSUtils {

	
	public static FileInputStream fi;
	public static XSSFWorkbook wb;
	public static XSSFSheet XS;
	public static XSSFRow row;
	public static XSSFCell cell;

	public static int getRowCount(String XFile, String XSheet) throws IOException {

		fi = new FileInputStream(XFile);
		wb = new XSSFWorkbook(fi);
		XS = wb.getSheet(XSheet);
		int rowcount = XS.getLastRowNum();
		wb.close();
		fi.close();

		return rowcount;
	}

	public static int getColumCount(String XFile, String XSheet, int rownum) throws IOException {

		fi = new FileInputStream(XFile);
		wb = new XSSFWorkbook(fi);
		XS = wb.getSheet(XSheet);
		row = XS.getRow(rownum);

		int cellcount = row.getLastCellNum();

		wb.close();
		fi.close();

		return cellcount;
	}

	public static String getCellData(String XFile, String XSheet, int rownum, int colnum) throws IOException {

		fi = new FileInputStream(XFile);
		wb = new XSSFWorkbook(fi);
		XS = wb.getSheet(XSheet);
		row = XS.getRow(rownum);
		cell = row.getCell(colnum);

		String data;

		try {
			DataFormatter formatter = new DataFormatter();
			String Celldata = formatter.formatCellValue(cell);
			return Celldata;
		} catch (Exception e) {
			data = " ";
		}
		
		wb.close();
		fi.close();
		return data;
	}
}
