package com.RealTestingFrameWorks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Hihi {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(".\\src\\com\\Hrm_Test_Input_Files\\login_Validation_Input.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");

	}

}
