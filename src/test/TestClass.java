package test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class TestClass {

	public static void main(String[] args) throws ParseException {
		convertToByte();	
	
	}
	
	public static void workingWithDateTime()
	{
		/*
	 	String inputDateStr1 = "07/20/2016 10:36";
	 	String inputDateStr2 = "07/20/2016 10:37";
	 	
        SimpleDateFormat inputFormatter = new SimpleDateFormat("MM/dd/yyyy HH:mm");
        
        SimpleDateFormat outputFormatter = new SimpleDateFormat("MM/dd/yyyy HH:mm");
        
        Date inputDate1 = inputFormatter.parse(inputDateStr1);
        Date inputDate2 = inputFormatter.parse(inputDateStr2);
        
        System.out.println("inputDateDate1 :" + inputDate1);
        System.out.println("inputDateDate2 :" + inputDate2);
        
        // printed: inputDateDate :Thu Jan 10 00:00:00 EST 2013

        String requiredDateStr1 = outputFormatter.format(inputDate1);
        String requiredDateStr2 = outputFormatter.format(inputDate2);
        
        System.out.println("requiredDateStr1 :" + requiredDateStr1);
        System.out.println("requiredDateStr2 :" + requiredDateStr2);
        */
	/*
	SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm");
	Date date = new Date();
	Date newDate = new Date(date.getTime()+ TimeUnit.HOURS.toMillis(2));
	
	System.out.println(newDate);
    System.out.println(format.format(date));    
    */
	
    SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm");
    Calendar cal = Calendar.getInstance();
    cal.add(Calendar.HOUR_OF_DAY, 2);
    Date date = cal.getTime();
    String formatted = dateFormat.format(date);        
    System.out.println(formatted);
    
    WebDriver driver = new FirefoxDriver();
    driver.get("http://tech.firstpost.com/news-analysis/microsofts-linkedin-three-step-strategy-for-india-heres-why-it-makes-sense-334901.html");
    int size = driver.findElements(By.xpath(".//*[@id='single']/section[1]/div/div[1]/div[4]/div")).size();
    String data  = driver.findElements(By.xpath(".//*[@id='single']/section[1]/div/div[1]/div[4]/div")).get(0).getText();
    String data1  = driver.findElements(By.xpath(".//*[@id='single']/section[1]/div/div[1]/div[4]/div")).get(1).getText();
    System.out.println(size);
    System.out.println(data);

	}

	public static void printDate()
	{
		DateFormat df = new SimpleDateFormat("d-MM-yy");
		Date date = new Date();
		String currentDay = df.format(date).substring(0, df.format(date).indexOf("-"));
		

	}

	public static void addTimeInDate()
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		Calendar cal = Calendar.getInstance();
		String currentDate = dateFormat.format(cal.getTime()).substring(0, dateFormat.format(cal.getTime()).indexOf("/"));
		cal.add(Calendar.DATE, 1);
		String currentDatePlus1 = dateFormat.format(cal.getTime()).substring(0, dateFormat.format(cal.getTime()).indexOf("/"));
		cal.add(Calendar.DATE, -2);
		String currentDateMinus1 = dateFormat.format(cal.getTime()).substring(0, dateFormat.format(cal.getTime()).indexOf("/"));
		System.out.println(currentDate);
		System.out.println(currentDatePlus1);
		System.out.println(currentDateMinus1);

	}
	
	public static void convertToByte()
	{
		int x  = 2;
		int y = x;
		byte z = (byte) (y-1);
		Assert.assertEquals(z, (byte)1);
		System.out.println(y);
	}
}