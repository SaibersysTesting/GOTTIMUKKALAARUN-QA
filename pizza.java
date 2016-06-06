package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pizza {

	public static void main (String args[]) throws InterruptedException{
		WebDriver p1= new FirefoxDriver();
		
		p1.navigate().to("https://www.google.com");
		p1.findElement(By.name("q")).sendKeys("pizza");
		Thread.sleep(3000);
		p1.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		System.out.println("sucessfuly done one time");
		p1.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		System.out.println("sucessfuly done second time");
		p1.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		System.out.println("sucessfuly done");
		p1.findElement(By.linkText("Pizza Hut - Pizza Coupons, Pizza Deals, Pizza Delivery, Order Pizza ...")).click();
		Thread.sleep(3000);
		p1.findElement(By.linkText("Create an Account")).click();
		Thread.sleep(3000);
		p1.findElement(By.name("regFirstname")).sendKeys("arun");
		p1.findElement(By.name("regLastname")).sendKeys("teja");
		p1.findElement(By.name("regPhone")).sendKeys("8148125225");
		p1.findElement(By.name("regEmail")).sendKeys("arun.pinttu.teja@gmail.com");
		p1.findElement(By.name("regReEmail")).sendKeys("arun.pinttu.teja@gmail.com");
		p1.findElement(By.name("reg-password")).sendKeys("BH@gy@1991");
		p1.findElement(By.name("regRePassword")).sendKeys("BH@gy@1991");
		p1.findElement(By.name("opt-in-deals")).click();
		p1.findElement(By.name("regTerms")).click();
		p1.findElement(By.xpath(".//*[@id='reg-age-13']")).click();
		p1.findElement(By.xpath(".//*[@id='reg-submit']")).click();
		
		
		p1.close();
		
	}
}
