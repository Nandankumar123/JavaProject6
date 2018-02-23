package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static String getData(String path, String sheetName, int row, int col)
	{
		String value="";
		try {
			Workbook wb=WorkbookFactory.create(new FileInputStream(path));
			value=wb.getSheet(sheetName).getRow(row).getCell(col).toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}
}
