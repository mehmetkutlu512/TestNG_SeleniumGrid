package techproed.utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelUtilsPractice {

    Workbook workbook;
    Sheet sheet;

    String path;

    //Constuctor: Excel path'ine ve Excel'deki sayfaya ulaşmak için 2 parametreli cons. oluşturduk


    public ExcelUtilsPractice(String path, String sheetName) {
        this.path = path;


        try {
            FileInputStream fis = new FileInputStream(path);
            workbook = WorkbookFactory.create(fis);
            sheet = workbook.getSheet(sheetName);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getCellData1 (int satir, int sutun){

        Cell cell = sheet.getRow(satir).getCell(sutun);
       return cell.toString();

    }

    //Exceldeki satir sayisini return eder
    public int satirSayisi (){
        return sheet.getPhysicalNumberOfRows();
    }

    //Exceldeki sütun sayisini return eder
    public int sutunSayisi (){

        return sheet.getRow(0).getLastCellNum();
    }

}
