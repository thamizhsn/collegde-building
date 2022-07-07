package org.groundfloor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
public static void main(String [] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\eclipse-workspace\\colledge building\\Driver\\chromedriver.exe"); 
	ChromeDriver driver= new ChromeDriver();
	String url="https://chercher.tech/practice/frames-example-selenium-webdriver";
	driver.navigate().to(url);
	driver.manage().window().maximize();
		 
	driver.switchTo().frame("frame1");
    driver.switchTo().frame("frame3");
    driver.findElement(By.xpath("//input[@id='a']")).click();
		 
	driver.switchTo().parentFrame();
	WebElement element =driver.findElement(By.xpath("//b[@id='topic']"));
	String text =element.getText();
	System.out.println(text);
		 
	driver.switchTo().defaultContent();
	WebElement element1 =driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
	String text1 =element1.getText();
	System.out.println(text1);

		 
		 
		 
		 
}}
