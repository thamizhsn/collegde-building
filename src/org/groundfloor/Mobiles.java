package org.groundfloor;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Mobiles {
	public static void main(String [] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\eclipse-workspace\\colledge building\\Driver\\chromedriver.exe"); 
	ChromeDriver driver= new ChromeDriver();
	 String url="https://www.flipkart.com/";
	 driver.navigate().to(url);
	 driver.manage().window().maximize();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//button[text()='✕']")).click();
	 Thread.sleep(3000);
	 WebElement user = driver.findElement(By.name("q"));
	 user.sendKeys("Redmi mobiles",Keys.ENTER);
	 Thread.sleep(3000);
	 List<WebElement> mobile=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	 int size = mobile.size();
	 System.out.println(size);
	  for (int i = 0; i < mobile.size(); i++) {
		  WebElement lin = mobile.get(i);
		  String text =lin.getText();
		  System.out.println(text);
	}
	  Thread.sleep(3000);
	 //driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	 WebElement flight =driver.findElement(By.xpath("//a[text()='Flights']"));
	 flight.click();Thread.sleep(3000);
	 WebElement button=driver.findElement(By.xpath("(//div[@class='_1XFPmK'])[2]"));
	 button.click();
	 WebElement from =driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	 from.click();
	 Robot r =new Robot();
	 r.keyPress(KeyEvent.VK_DOWN);
     r.keyRelease(KeyEvent.VK_DOWN);
     r.keyPress(KeyEvent.VK_DOWN);
 	 r.keyRelease(KeyEvent.VK_DOWN);
	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease(KeyEvent.VK_ENTER);
	 
	 WebElement to =driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	 to.click();
	 Robot r1 =new Robot();
	 r1.keyPress(KeyEvent.VK_DOWN);
	 r1.keyRelease(KeyEvent.VK_DOWN);
	 r1.keyPress(KeyEvent.VK_ENTER);
	 r1.keyRelease(KeyEvent.VK_ENTER);
	 
	 WebElement Flight2=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	 Flight2.click();
	 WebElement depart =driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	 depart.click();
	 Thread.sleep(2000);
	 WebElement depart1=driver.findElement(By.xpath("(//button[@class='jkj0H4'])[25]"));
	 depart1.click();
	 WebElement return1=driver.findElement(By.xpath("(//input[@type='text'])[4]"));
	 return1.click();
	 Thread.sleep(2000);
	 WebElement return2=driver.findElement(By.xpath("(//button[@class='jkj0H4'])[45]"));
	 return2.click();
	 WebElement traveller=driver.findElement(By.xpath("(//input[@type='text'])[5]"));
	 traveller.click();
	 Thread.sleep(2000);
	 WebElement radio1=driver.findElement(By.xpath("(//button)[2]"));
	 radio1.click();
	 WebElement radio2=driver.findElement(By.xpath("(//button)[4]"));
	 radio2.click();
	 WebElement radio3=driver.findElement(By.xpath("(//button)[6]"));
	 radio3.click();
	 WebElement radio4=driver.findElement(By.xpath("(//div[@class='_1XFPmK'])[5]"));
	 radio4.click();
	 WebElement done= driver.findElement(By.xpath("//button[@class='aC49_F _14Me7y']"));
	 done.click();
	 WebElement search=driver.findElement(By.xpath("//button[@class='_2KpZ6l _1QYQF8 _3dESVI']"));
	 search.click();
	 Thread.sleep(2000);
	 WebElement D=driver.findElement(By.xpath("//div[@class='zzPDhz _1Jqgld']"));
	 Thread.sleep(1000);
	 WebElement d =driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	 String date=d.getAttribute("value");
	 System.out.println(date);
	 WebElement check =driver.findElement(By.xpath("(//span[@class='_55dN9O'])[2]"));
	 String check1 =check.getText();
	 System.out.println(check1);
	 if (date.contains(check1)) {
		System.out.println("same date is present");
	}
	 else {
		System.out.println("same date is not present");
	}
	
}}
