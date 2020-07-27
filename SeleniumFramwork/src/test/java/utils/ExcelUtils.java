package utils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils 
{
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet; 
	
	public ExcelUtils(String excelPath, String sheetName)
	{
		try 
		{
			projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath+"/excel/data.xlsx");
			sheet = workbook.getSheet("Sheet1");
		}
		catch(Exception exp)
		{
			exp.printStackTrace();
		}
	}
	public static int getRowCount()
	{
		int rowCount = 0;
		try 
		{
			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Row Count of given sheet : "+ rowCount);
		}
		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.getStackTrace();
		}
		return rowCount;
	}
	public static int getColCount()
	{
		int colCount = 0;
		try 
		{
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Col Count of given sheet : "+ colCount);
		}
		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.getStackTrace();
		}
		return colCount;
	}
	public static String getCellStringData(int rowNum, int colNum)
	{
		String cellStringValue = null;
		try 
		{
			cellStringValue = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(cellStringValue);

		}
		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.getStackTrace();
		}
		return cellStringValue;
	}
		public static void getCellNumData(int rowNum, int colNum)
		{
			try 
			{
				double cellNumValue = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
				//System.out.println(cellNumValue);
			}
			catch(Exception exp)
			{
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.getStackTrace();
			}
	}
}
