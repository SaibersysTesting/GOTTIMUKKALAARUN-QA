package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmail {
	
public static void main (String args[]) throws InterruptedException
{
	WebDriver g1=new FirefoxDriver();
	
	g1.navigate().to("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
	Thread.sleep(3000);
	g1.findElement(By.name("Email")).sendKeys("gottimukkalaarun");
	g1.findElement(By.xpath(".//*[@id='next']")).click();
	Thread.sleep(3000);
	g1.findElement(By.name("Passwd")).sendKeys("bh@gy@1991");
	g1.findElement(By.xpath(".//*[@id='signIn']")).click();
	Thread.sleep(3000);
	System.out.println("login compeleted");
	g1.findElements(By.linkText("Sign out"));
	System.out.println("logout compeleted");
	g1.close();
	
}

}
