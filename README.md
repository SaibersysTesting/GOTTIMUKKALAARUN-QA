# GOTTIMUKKALAARUN-QApackage framework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class commands extends target{ 
	@BeforeClass
	public void openapplication(){
		d1= new FirefoxDriver();
		d1.navigate().to(url);
		}
	@Test(priority=1)
	public void login() throws InterruptedException{
		d1.findElement(By.name(txt_un)).sendKeys("arun.pinttu.teja");
		d1.findElement(By.name(btn_login)).click();
		Thread.sleep(3000);
		d1.findElement(By.name(txt_pw)).sendKeys("1234567888");
		d1.findElement(By.xpath(btn_signin)).click();
		Thread.sleep(3000);
		}
	@Test(priority=2)
	public void logout(){
		d1.findElement(By.linkText(link_logout)).click();
		}
	@AfterClass
	public void closeapplication(){
		d1.close();
	}

}
