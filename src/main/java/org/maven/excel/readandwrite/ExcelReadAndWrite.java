package org.maven.excel.readandwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelReadAndWrite {

	static WebDriver driver;

	public static String getData(int rownum, int cellnum) throws IOException {
		File fileLocation = new File("D:\\Users\\Admin\\Desktop\\abcd.xlsx");
		FileInputStream stream = new FileInputStream(fileLocation);
		Workbook wb = new XSSFWorkbook(stream);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		int type = cell.getCellType();

		String name = null;

		if (type == 1) {
			name = cell.getStringCellValue();
			System.out.println(name);

		}
		if (type == 0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				String name3 = new SimpleDateFormat("dd-MMM-yy").format(cell.getDateCellValue());
				System.out.println(name3);

			} else {

				double d = cell.getNumericCellValue();
				long l = (long) d;
				String name2 = String.valueOf(l);
				System.out.println(name2);

			}

		}
		return name;

	}

	public static void writeData(int rownum, String c1, long c2, String c3, int c4, String c5) throws IOException {

		FileInputStream stream = new FileInputStream("D:\\Users\\Admin\\Desktop\\abcd.xlsx");
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.createRow(rownum);
		
		Cell cell = row.createCell(0);
		cell.setCellType(Cell.CELL_TYPE_STRING);
		cell.setCellValue(c1);

		Cell cell2 = row.createCell(1);
		cell2.setCellType(Cell.CELL_TYPE_NUMERIC);
		cell2.setCellValue(c2);

		Cell cell3 = row.createCell(2);
		cell3.setCellType(Cell.CELL_TYPE_STRING);
		cell3.setCellValue(c3);

		Cell cell4 = row.createCell(3);
		cell4.setCellType(Cell.CELL_TYPE_NUMERIC);
		cell4.setCellValue(c4);

		Cell cell5 = row.createCell(4);
		cell5.setCellType(Cell.CELL_TYPE_STRING);
		cell5.setCellValue(c5);

		FileOutputStream outStream = new FileOutputStream("D:\\Users\\Admin\\Desktop\\abcd.xlsx");
		workbook.write(outStream);
		outStream.close();
	}

}
