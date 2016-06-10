package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon {
	public static void main (String args[]) throws InterruptedException{
		WebDriver amazon=new FirefoxDriver();
		amazon.get("https://www.amazon.com/186-8646556-3008351");
		Thread.sleep(3000);
		amazon.findElement(By.linkText("Sign in")).click();
		amazon.findElement(By.name("email")).sendKeys("arun.pinttu.teja@gmail.com");
		amazon.findElement(By.name("password")).sendKeys("1245662");
		amazon.findElement(By.id("signInSubmit")).click();
		Thread.sleep(3000);
		amazon.findElement(By.name("field-keywords")).sendKeys("iphone cases");
		amazon.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
		amazon.findElement(By.linkText("HoCase Camouflage Series Polycarbonate Silicone Bumper Case for iPhone 5C - Camo/Turquoise")).click();
		amazon.findElement(By.name("submit.add-to-cart")).click();
		Thread.sleep(3000);
		amazon.findElement(By.linkText("Not aruntej...? Sign Out")).click();
		amazon.close();
	}

}
