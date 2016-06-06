package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webtable {

	public static void main (String args[]) throws InterruptedException{
		WebDriver table=new FirefoxDriver();
		table.get("https://www.google.com/");
		Thread.sleep(3000);
		table.findElement(By.name("q")).sendKeys("web tables");
		table.findElement(By.linkText("HTML Tables - W3Schools")).click();
		int row = table.findElements(By.xpath(".//*[@id='main']/table[1]/tbody/tr/th[1]")).size();
		int col = table.findElements(By.xpath(".//*[@id='main']/table[1]/tbody/tr[1]/th")).size();
		int rowcol = table.findElements(By.xpath(".//*[@id='main']/table[1]/tbody/tr/th")).size();
		
		System.out.println("row");
		System.out.println("col");
		System.out.println("rowcol");
		
		String data1 = table.findElement(By.xpath(".//*[@id='main']/table[1]/tbody/tr[4]/td[2]")).getText();

				System.out.println(data1);
				for(int i=1;i<=row;i++) 

				{

				//for(int j=1;j<=col;j++)

				{

				String data = 

				table.findElement(By.xpath("//table[@id='idCourse']/tbody/tr["+i+"]")).getText();

				 System.out.println(data);

				}

				}

				 table.close();
	}
}