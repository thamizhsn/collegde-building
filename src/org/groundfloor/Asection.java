package org.groundfloor;

import org.openqa.selenium.chrome.ChromeDriver;

//q no 2
public class  Asection  {
   public static void main(String[] args) throws Exception  {
	   
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\eclipse-workspace\\colledge building\\Driver\\chromedriver.exe");
       ChromeDriver c= new ChromeDriver();
       String url="https://facebook.com/";
       c.navigate().to(url);
       Thread.sleep(4000);
       c.navigate().forward();
       Thread.sleep(4000);
       c.navigate().back();
       Thread.sleep(4000);
       c.navigate().refresh();
       c.manage().window().maximize();
       
       String d =c.getCurrentUrl();
       System.out.println(d);
   
       if (url.equals(d)) {
		System.out.println("same url has been verified");
		}
		else {
			System.out.println("not same url has been verified");
		}
	
       String t= c.getTitle();
       System.out.println(t);
       if (url.contains("facebook")) {
		System.out.println("true");
	}
   }
   }

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 