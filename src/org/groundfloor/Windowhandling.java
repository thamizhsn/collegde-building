package org.groundfloor;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {
	public static void main(String [] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\eclipse-workspace\\colledge building\\Driver\\chromedriver.exe"); 
		ChromeDriver driver= new ChromeDriver();
		String url="https://www.flipkart.com/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("Redmi mobiles",Keys.ENTER);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
		
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]")).click();
		
		String parent =driver.getWindowHandle();
		
		Set<String>child =driver.getWindowHandles();
		List<String>multiwindow= new ArrayList<>(child);
		
		driver.switchTo().window(multiwindow.get(1));
		WebElement element=driver.findElement(By.xpath("//span[@class='B_NuCI']"));
		String text = element.getText();
		System.out.println(text);
		
}}
