package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.Xls_Reader;

public class Rajeev {

	public static void main(String[] args) {
	
		//String webUrl = "https://www.google.com";
		String excelPath = "C:\\Rajeev\\BizQuest.xlsx";
		//WebDriver driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		//driver.get(webUrl);
		Xls_Reader xr  = new Xls_Reader(excelPath);
		int rowCount = xr.getRowCount("BizQuest");
		for(int i = 2; i<=rowCount; i++)
		{
			String emailId = xr.getCellData("BizQuest", "Interest_Email", i);
			System.out.println(emailId);
		}

	}

}
