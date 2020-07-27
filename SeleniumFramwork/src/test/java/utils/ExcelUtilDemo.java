package utils;

public class ExcelUtilDemo 
{
	public static void main(String[] args) 
	{
		String projectPath = System.getProperty("user.dir");
		ExcelUtils excel = new ExcelUtils(projectPath+"/excel/data.xlsx", "Sheet1");
		
		excel.getRowCount();
		excel.getColCount();
		excel.getCellStringData(0, 0);
		excel.getCellNumData(1, 1);
	}
}
