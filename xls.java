package strings;

import  java.io.*;
import  org.apache.poi.hssf.usermodel.HSSFSheet;
import  org.apache.poi.hssf.usermodel.HSSFWorkbook;
import  org.apache.poi.hssf.usermodel.HSSFRow;

public class xls{
    public static void main(String[]args) {
        try {
            //String filename = "C:/Users/Ravi Chandra/Desktop/new.xls" ;
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("FirstSheet");  

            HSSFRow rowhead = sheet.createRow(0);
            rowhead.createCell(0).setCellValue("No.");
            rowhead.createCell(1).setCellValue("Name");
            rowhead.createCell(2).setCellValue("Address");
            rowhead.createCell(3).setCellValue("Email");

            HSSFRow row = sheet.createRow(1);
            row.createCell(0).setCellValue("1");
            row.createCell(1).setCellValue("Ravi chandra");
            row.createCell(2).setCellValue("Bangalore");
            row.createCell(3).setCellValue("b.sairavichandra@gmail.com");

            FileOutputStream fileOut = new FileOutputStream("C:/Users/Ravi Chandra/Desktop/new.xls");
            workbook.write(fileOut);
            fileOut.close();
            //workbook.close();
            System.out.println("excel file has been generated!");

        } catch ( Exception ex ) {
            System.out.println(ex);
        }
    }
}