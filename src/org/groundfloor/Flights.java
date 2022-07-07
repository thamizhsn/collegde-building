package org.groundfloor;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Flights {
public static void main(String [] args) throws Exception {
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\eclipse-workspace\\colledge building\\Driver\\chromedriver.exe"); 
 ChromeDriver driver= new ChromeDriver();
 String url="https://www.flipkart.com/";
 driver.navigate().to(url);
 driver.manage().window().maximize();
 
 driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobiles");
	driver.findElement(By.xpath("//button[@type='submit']")).click();Thread.sleep(3000);
	List<WebElement> text=driver.findElements(By.xpath("//div[contains(@class,'_4rR01T')]"));
	for(int i=0;i<text.size();i++) {
		WebElement L=text.get(i);
		String E=L.getText();
		System.out.println(E);}
	driver.findElement(By.xpath("//a[text()='Flights']")).click();Thread.sleep(3000);
	WebElement Radio=driver.findElement(By.xpath("(//div[@class='_1XFPmK'])[2]"));
	Radio.click();
	WebElement Flight= driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	Flight.click();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	WebElement Flight1=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	Flight1.click();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	WebElement Flight2=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	Flight2.click();
	WebElement Depart1=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	Depart1.click();Thread.sleep(2000);
	WebElement Depart=driver.findElement(By.xpath("(//button[@class='jkj0H4'])[25]"));
	Depart.click();
	
	WebElement Return1=driver.findElement(By.xpath("(//input[@type='text'])[4]"));
	Return1.click();Thread.sleep(2000);
	WebElement Return=driver.findElement(By.xpath("(//button[@class='jkj0H4'])[45]"));
	Return.click();
	WebElement TravelClass=driver.findElement(By.xpath("(//input[@type='text'])[5]"));
	TravelClass.click();
	WebElement Radio1=driver.findElement(By.xpath("(//button)[2]"));
	Radio1.click();
	WebElement Radio2=driver.findElement(By.xpath("(//button)[4]"));
	Radio2.click();Radio2.click();
	WebElement Radio3=driver.findElement(By.xpath("(//button)[6]"));
	Radio3.click();
	WebElement Radio4=driver.findElement(By.xpath("(//div[@class='_1XFPmK'])[4]"));
	Radio4.click();
	WebElement Done=driver.findElement(By.xpath("//button[@class='aC49_F _14Me7y']"));
	Done.click();
	WebElement Search=driver.findElement(By.xpath("//button[@class='_2KpZ6l _1QYQF8 _3dESVI']"));
	Search.click();
	Thread.sleep(2000);
	WebElement D=driver.findElement(By.xpath("//div[@class='zzPDhz _1Jqgld']"));
	Thread.sleep(1000);
	WebElement C=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	String Date=C.getAttribute("value");
	System.out.println(Date);
	WebElement Check=driver.findElement(By.xpath("(//span[@class='_55dN9O'])[2]"));
	String Check1=Check.getText();
	System.out.println(Check1);
	if(Date.contains(Check1)) {
		System.out.println("Happy Journey:Your Journey is Confirmed");
	}
	else {
		System.out.println("Sorry:Your Journey is Not Confirmed");
	}
	}
	

		 
		 
		 
}