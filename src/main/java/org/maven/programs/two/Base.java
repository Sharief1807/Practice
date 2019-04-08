package org.maven.programs.two;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	static WebDriver driver;

	public static WebDriver browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\DayNineTasks\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		return driver;
	}

	public static WebDriver maxi() {
		driver.manage().window().maximize();
		return driver;
	}

	public static String getUrl(String url) {
		driver.get(url);
		return url;
	}

	public static void typeName(WebElement el, String s) {
		el.sendKeys(s);

	}

	public static void typePass(WebElement el, String s) {
		el.sendKeys(s);

	}
	
	public static void clickBtn(WebElement el) {
		el.click();

	}
	
	public static void waitMethod() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	

}
