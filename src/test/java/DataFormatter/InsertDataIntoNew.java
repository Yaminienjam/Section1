package DataFormatter;

import java.io.FileInputStream;

public class InsertDataIntoNew {

	public static void main(String[] args) {
		FileInputStream file = new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		Sheet sh = wnb.getSheet1("sheet1");
		Row r= sh.getRow(4);
		cell c= sh.createCell(1);
		c.setCellValue("trainee");
		FileOUTputStream fos = new FileOutputStream("./src/test/resources/TestData.xlsx");
		wb.write(fos);
		wb.close;
	}

}
