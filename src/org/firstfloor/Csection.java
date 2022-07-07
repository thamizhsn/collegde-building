package org.firstfloor;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Csection  {
	static WebDriver driver;
	 public static void lanuch(String url) {
     System.setProperty("webdriver.edge.driver","C:\\Users\\ASUS\\eclipse-workspace\\colledge building\\Driver\\msedgedriver.exe"); 	    
	 driver =new EdgeDriver();
}
	 public static void maximize() {
		 driver.manage().window().maximize();
	 }
	 public static void fill(WebElement element,String value) {
		 element.sendKeys(value);
	 }
	 public static void click(WebElement element) {
		 element.click();
	 }
	 public static void takeScreenShot(String screenshotname) throws Exception {
		 TakesScreenshot tk =(TakesScreenshot)driver;
	      File filetype =tk.getScreenshotAs(OutputType.FILE);
	      File Location = new File("C:\\Users\\ASUS\\eclipse-workspace\\colledge building\\Library\\"+screenshotname);
	      FileUtils.copyFile(filetype,Location); 
	 }
}
	 
	/*	 String s="welcome to java class";
		 String s1=s.replaceAll("java class","Selenium");
		 if(s1.contains("Selenium")) {
		    	System.out.println("Successfully Replaced");
		    }
		  else {
		    	System.out.println("Not Successful");
		    }
		  
			}    
	
		 
	 
	 
	 
	 */