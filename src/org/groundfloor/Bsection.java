package org.groundfloor;//c2

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Bsection  {
	
	public static void main(String [] args) throws Exception {
	    System.setProperty("webdriver.edge.driver","C:\\Users\\ASUS\\eclipse-workspace\\colledge building\\Driver\\msedgedriver.exe"); 
	    WebDriver driver= new EdgeDriver();
	    String url="https://www.facebook.com/";
	    driver.navigate().to(url);
		driver.manage().window().maximize();
		
		
		WebElement user= driver.findElement(By.id("email"));
		WebElement password= driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','Selenium')", user);
        js.executeScript("arguments[1].setAttribute('value','37777776265')", user,password,login);
	
        Object executescrpit =js.executeScript("return arguments[0].getAttribute('value')",user);
        System.out.println(executescrpit);
        
        //js.executeScript("arguments[0].click()",login);
         
        WebElement careers =driver.findElement(By.xpath("//a[text()='Careers']"));
        Thread.sleep(3000);
        js.executeScript("arguments[0].scrollIntoView(true)", careers);
        
        TakesScreenshot tk =(TakesScreenshot)driver;
        File filetype =tk.getScreenshotAs(OutputType.FILE);
        File Location = new File("C:\\Users\\ASUS\\eclipse-workspace\\colledge building\\Library\\Careers");
        FileUtils.copyFile(filetype,Location);
        Thread.sleep(3000);
        js.executeScript("arguments[0].scrollIntoView(false)", user);
        
 }}

