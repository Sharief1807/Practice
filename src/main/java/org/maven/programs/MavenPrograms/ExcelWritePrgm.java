package org.maven.programs.MavenPrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWritePrgm {
	public static void main(String[] args) throws IOException {

		FileInputStream stream = new FileInputStream("D:\\Users\\Admin\\Desktop\\abcd.xlsx");
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet1");

		Row row = sheet.createRow(4);
		Cell cell = row.createCell(0);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue("Krishna");

		Cell cell2 = row.createCell(1);
		cell2.setCellType(cell2.CELL_TYPE_NUMERIC);
		cell2.setCellValue("9898986565");

		Cell cell3 = row.createCell(2);
		cell3.setCellType(cell.CELL_TYPE_STRING);
		cell3.setCellValue("sdf@gmail.com");

		Cell cell4 = row.createCell(3);
		cell4.setCellType(cell2.CELL_TYPE_NUMERIC);
		cell4.setCellValue("55000");

		FileOutputStream outStream = new FileOutputStream("D:\\Users\\Admin\\Desktop\\abcd.xlsx");
		workbook.write(outStream);
		outStream.close();
		System.out.println("..........");

	}

}
