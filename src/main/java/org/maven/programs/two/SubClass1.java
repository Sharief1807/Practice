package org.maven.programs.two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SubClass1 extends Base{

	public static void main(String[] args) {
		browserLaunch();
		maxi();
		getUrl("https://www.facebook.com/");
		WebElement uName=driver.findElement(By.id("email"));
		typeName(uName,"JAVA");
		
		WebElement pWord=driver.findElement(By.id("pass"));
		typePass(pWord,"JA@VA");
		
		WebElement btn=driver.findElement(By.xpath("//input[@type='submit']"));
		clickBtn(btn);
		
		waitMethod();
		
		
		WebElement uName2=driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		typeName(uName2,"JAVA");
		
		WebElement pWord2=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		typePass(pWord2,"JA@VA");
		
		WebElement btn2=driver.findElement(By.xpath("//button[@value='1']"));
		clickBtn(btn2);
		

	}

}
