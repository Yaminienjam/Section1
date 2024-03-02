package DataFormatter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.EncryptedDocumentException;


public class Practice1 {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream file = new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		DataFormatter df= new dataFormatter();
		String text = df.formatCellValue(wb.getSheet("sheet1").wb.getRow(1).wb.getCell(1);
		System.out.println(text);
		wb.close();
		

	}

}
