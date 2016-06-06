package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class keys {

	public static void main (String args[]) throws InterruptedException{
		WebDriver key=new FirefoxDriver();
		
		key.get("https://www.google.com/#gws_rd=ssl");
		key.findElement(By.name("q")).sendKeys("youtube");
		Thread.sleep(3000);
		key.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		System.out.println("successfuly done first time");
		key.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		System.out.println("successfuly done second time");
		key.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		System.out.println("SUccessfuly done Enter");
	}
}
