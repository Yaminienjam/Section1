package DataFormatter;

import java.io.FileInputStream;

public class WriteDataToExcel {

	public static void main(String[] args) {
		FileInputStream file = new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		Sheet sh = wb.getSheet1("sheet1");
		Row r= sh.createRow(4);
		cell c= sh.createCell(0);
		c.setCellValue("User1");
		FileOUTputStream fos = new FileOutputStream("./src/test/resources/TestData.xlsx");
		wb.write(fos);
		wb.close;
		
	}

}
