package org.groundfloor;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Webtable {
public static void main(String [] args) throws Exception {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\eclipse-workspace\\colledge building\\Driver\\chromedriver.exe"); 
		 ChromeDriver driver= new ChromeDriver();
		 String url="https://www.techlistic.com/p/demo-selenium-practice.html";
		 driver.navigate().to(url);
		 driver.manage().window().maximize();
		 
		 List<WebElement>itable=driver.findElements(By.tagName("table"));
		  for (int i = 0; i < itable.size(); i++) {
			  WebElement table = itable.get(i);
			  
			  if (table.equals( itable.size())) {
				
			}
			  WebElement tbody =table.findElement(By.tagName("tbody"));
		List<WebElement>row=tbody.findElements(By.tagName("tr"));
		 for (int j = row.size()/2; j < row.size(); j++) {
			 WebElement irow = row.get(j);
			 
		List<WebElement>data=irow.findElements(By.tagName("td")); 
		for (int k = data.size()-3; k < data.size(); k++) {
			WebElement idata = data.get(k);
			String text =idata.getText();
			System.out.println(text);
			break;
		}
		break;
		 }
		
		  }
	

    }}

		//if (text.equals("Saudi Arabia")) {
			//System.out.println("given text is present:"+text);
			//System.out.println("row no:"+j);
			//System.out.println("column no:"+k);}
			
		//}	
		//break;
		
		//break;
