package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class applyingjob {
	public static void main (String args[]) throws InterruptedException{
		WebDriver job=new FirefoxDriver();
		
		job.navigate().to("http://www.dice.com");
		Thread.sleep(3000);
		
		job.findElement(By.xpath(".//*[@id='Login_1']")).click();
		job.findElement(By.xpath(".//*[@id='Email_1']")).sendKeys("gottimukkalaarun@gmail.com");
		job.findElement(By.xpath(".//*[@id='Password_1']")).sendKeys("12358464");
		job.findElement(By.xpath(".//*[@id='LoginBtn_1']")).click();
		Thread.sleep(3000);
		job.findElement(By.name("q")).sendKeys("selenium");
		job.findElement(By.xpath(".//*[@id='location']")).sendKeys("Irving, TX");
		job.findElement(By.xpath(".//*[@id='searchJob']/div/div[4]/span[3]/input")).click();
		job.findElement(By.xpath(".//*[@id='searchJob']/div/div[3]/input")).click();
		Thread.sleep(3000);
		job.findElement(By.linkText(".//*[@id='position0']")).click();
		job.findElement(By.xpath(".//*[@id='easyApplybtn']")).click();
		
		job.switchTo().frame("dice-iframe");// entering into frame
		job.findElement(By.xpath(".//*[@id='select-resume-radio']")).click();
		Select box=new Select(job.findElement(By.id("resume-select")));
		
		box.selectByIndex(1);
		
		System.out.println("arun resume is seleceted");
		
		job.findElement(By.xpath(".//*[@id='recaptcha_response_field']")).sendKeys("****");
		job.findElement(By.xpath(".//*[@id='submit-btn']")).click();
		job.switchTo().defaultContent(); //Exit from frame
		
		job.close();

		
	}
}
