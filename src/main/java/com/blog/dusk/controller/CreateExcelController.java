package com.blog.dusk.controller;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileOutputStream;
import java.io.IOException;

@RestController
public class CreateExcelController {

    public static void main(String[] args){
        //第一步创建workbook
        HSSFWorkbook wb = new HSSFWorkbook();

        //第二步创建sheet
        HSSFSheet sheet = wb.createSheet("测试");

        //第三步创建行row:添加表头0行
        HSSFRow row = sheet.createRow(0);
        HSSFCellStyle style = wb.createCellStyle();
        //style.setAlignment(HSSFCellStyle.ALIGN_CENTER);  //居中
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);//水平居中
        style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);//垂直居中

        // 背景色
        style.setFillForegroundColor(HSSFColor.YELLOW.index);
        style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
        style.setFillBackgroundColor(HSSFColor.YELLOW.index);

        // 设置边框
        style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
        style.setBorderRight(HSSFCellStyle.BORDER_THIN);
        style.setBorderTop(HSSFCellStyle.BORDER_THIN);


        //第四步创建单元格
        for (int i = 0;i<5 ; i++) {
            HSSFCell cell = row.createCell(i); //第一个单元格
            cell.setCellValue("姓名"+i);
            cell.setCellStyle(style);
        }

        //第五步插入数据

        for (int i = 0; i < 5; i++) {
            //创建行
            row = sheet.createRow(i+1);
            //创建单元格并且添加数据
            row.createCell(0).setCellValue("aa"+i);
            row.createCell(1).setCellValue(i);
            row.createCell(2).setCellValue(i);
            row.createCell(3).setCellValue(i);
            row.createCell(4).setCellValue(i);
        }

        //第六步将生成excel文件保存到指定路径下
        try {
            FileOutputStream fout = new FileOutputStream("D:\\a.xls");
            wb.write(fout);
            fout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Excel文件生成成功...");
    }
}
