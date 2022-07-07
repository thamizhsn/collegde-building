package org.groundfloor;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Robotconcept {
public static void main(String [] args) throws Exception {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\eclipse-workspace\\colledge building\\Driver\\chromedriver.exe"); 
	    WebDriver driver= new ChromeDriver();
	    driver.navigate().to("https://www.facebook.com/");
	    driver.manage().window().maximize();
			
	 WebElement user =driver.findElement(By.id("email"));
	 user.sendKeys("Selenium");

	 Actions acc = new Actions(driver);
	 acc.doubleClick(user).perform();
	 acc.contextClick(user).perform();
			   
		    Robot r = new Robot();
		     for (int i = 0; i < 2; i++) {
		    	 r.keyPress(KeyEvent.VK_DOWN);
		         r.keyRelease(KeyEvent.VK_DOWN);
			}
		     r.keyPress(KeyEvent.VK_ENTER);
		     r.keyRelease(KeyEvent.VK_ENTER);
		     
		     r.keyPress(KeyEvent.VK_TAB);
		     r.keyRelease(KeyEvent.VK_TAB);
		     
		     r.keyPress(KeyEvent.VK_CONTROL);
		     r.keyPress(KeyEvent.VK_V);
		     r.keyRelease(KeyEvent.VK_CONTROL);
		     r.keyRelease(KeyEvent.VK_V); 
		     
		 }}
		   

