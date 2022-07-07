package org.groundfloor;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Esection {
  public static void main(String [] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\eclipse-workspace\\colledge building\\Driver\\chromedriver.exe"); 
	ChromeDriver driver= new ChromeDriver();
	 String url="https://demoqa.com/alerts";
	 driver.navigate().to(url);
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.xpath("//button[@id='alertButton']")).click();
	 Alert a =driver.switchTo().alert();
	 Thread.sleep(2000);
	 a.accept();
	 driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
     Thread.sleep(2000);
	 a.dismiss();
	 WebElement X=driver.findElement(By.xpath("//span[@id='confirmResult']"));
	 String text=X.getText();
	 System.out.println(text);
	 driver.findElement(By.xpath("//button[@id='promtButton']")).click();
	 Object W=a.getText();
     System.out.println(W);
     a.sendKeys("selenium");
     Thread.sleep(2000);
     a.accept();
     WebElement Y=driver.findElement(By.xpath("//span[@id='promptResult']"));
	 String text1=Y.getText();
	 System.out.println(text1);
       
  
  }     
  
	} 
	