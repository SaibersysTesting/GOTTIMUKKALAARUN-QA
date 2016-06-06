package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class chromebrowser{
	
	public static void mian (String args[]) throws InterruptedException{
		System.setProperty("WebDriver.chrome.driver","E:\\softwares\\chromedriver.exe");
		WebDriver browser= new ChromeDriver();
		
		browser.get("https://www.google.com");
		Thread.sleep(3000);
		browser.findElement(By.name("q")).sendKeys("youtube");
		browser.findElement(By.name("q")).click();
		browser.close();
		
	}

}
