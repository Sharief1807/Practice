package org.maven.programs.MavenPrograms;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadPrgm {

	public static void main(String[] args) throws IOException {
		File fileLocation = new File("D:\\Users\\Admin\\Desktop\\abcd.xlsx");
		FileInputStream stream = new FileInputStream(fileLocation);
		Workbook wb = new XSSFWorkbook(stream);
		Sheet sheet = wb.getSheet("Sheet1");

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int type = cell.getCellType();
				if (type == 1) {
					String str1 = cell.getStringCellValue();
					System.out.println(str1);
				}
				if (type == 0) {
					double d = cell.getNumericCellValue();
					long l = (long) d;
					String str2 = String.valueOf(l);
					System.out.println(str2);

				}

			}
		}

	}

}
