package org.firstfloor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Esection extends Csection{

public static void main(String[] args) throws Exception  {
	
		lanuch("https://www.facebook.com/");
		maximize();
		WebElement findElement = driver.findElement(By.id("email"));
		WebElement findElement2 = driver.findElement(By.id("pass"));
		WebElement findElement3 = driver.findElement(By.xpath("//button[@type='sumbit']"));
		fill(findElement,"selenium");
		takeScreenShot("username");
		fill(findElement2,"1234567890");
		takeScreenShot("password");
		click(findElement3);
		takeScreenShot("Loginpage");
		
		
	}}



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
    








//qno 5
    /*List<Integer> l= new ArrayList();
    l.add(10); 
    l.add(20); 
    l.add(30); 
    l.add(10); 
    l.add(30); 
    l.add(40);
    l.add(80);
	l.add(50); 
	l.add(10);
	l.add(60); 
	l.add(30);
	l.add(70);
	System.out.println(l);
	for(int i=0;i<l.size();i++) 
	{
		Integer a=l.get(i);
		if(a==10 || a==30)
		{
			System.out.println(i);
	
		}
	}*/

	
		
	
	
		
	




	

 