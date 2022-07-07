package org.groundfloor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdropconcept {
public static void main(String [] args) throws Exception{
	System.setProperty("webdriver.edge.driver","C:\\Users\\ASUS\\eclipse-workspace\\colledge building\\Driver\\msedgedriver.exe"); 
	WebDriver driver= new EdgeDriver();
	driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
		  
    WebElement drag = driver.findElement(By.xpath("//a[text()=' BANK ']"));
	WebElement drop = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		    
	WebElement drag1 = driver.findElement(By.xpath("(//a[contains(text(),'5000')])[2]"));
	WebElement drop1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		    
	WebElement drag2=driver.findElement(By.xpath("//a[text()=' SALES ']"));
	WebElement drop2=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		    
	WebElement drag3=driver.findElement(By.xpath("(//a[contains(text(),'5000')])[4]"));
	WebElement drop3=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		  
	Actions acc= new Actions(driver);
	acc.dragAndDrop(drag,drop).perform();
	acc.dragAndDrop(drag1,drop1).perform();
	acc.dragAndDrop(drag2,drop2).perform();
	acc.dragAndDrop(drag3,drop3).perform(); 
	
}}
