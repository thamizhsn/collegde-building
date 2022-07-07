package org.groundfloor;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Dropdown {
public static void main(String [] args) throws Exception {
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\eclipse-workspace\\colledge building\\Driver\\chromedriver.exe"); 
 ChromeDriver driver= new ChromeDriver();
 String url="https://chercher.tech/practice/practice-dropdowns-selenium-webdriver";
 driver.navigate().to(url);
 driver.manage().window().maximize();
 
 WebElement single=driver.findElement(By.xpath("(//select)[1]"));
 WebElement multiple=driver.findElement(By.xpath("(//select)[3]"));
 
 Select s= new Select(single);
 Thread.sleep(2000);
 s.selectByIndex(3);
 Thread.sleep(2000);
 s.selectByValue("Microsoft");
 Thread.sleep(2000);
 s.selectByVisibleText("Iphone");
 
 boolean multiple1 =s.isMultiple();
 System.out.println(multiple1);
 
 List<WebElement> options =s.getOptions();
 for (int i = 0; i < options.size(); i++) {
	 WebElement element = options.get(i); 
	 String text = element.getText();
	 System.out.println(text);
}
 
 Select s1= new Select(multiple);
 s1.selectByIndex(1);
 s1.selectByValue("burger");
 s1.selectByVisibleText("Bonda");
 
 boolean multiple2 =s1.isMultiple();
 System.out.println(multiple2);
 
List<WebElement> options1 =s1.getOptions();
 for (int i = 0; i < options1.size(); i++) {
	 WebElement element2 = options1.get(i); 
	 String text2 = element2.getText();
	 System.out.println(text2);
 }
 WebElement first =s1.getFirstSelectedOption();
 String text3 =first.getText();
 System.out.println("first selected text is present:"+text3);
 
 List<WebElement>all=s1.getAllSelectedOptions();
 for (int i = 0; i <all.size(); i++) {
	 WebElement element3 = all.get(i); 
	 String text4 = element3.getText();
	 System.out.println(text4);	 
}

}}





 
 
 


 
 
