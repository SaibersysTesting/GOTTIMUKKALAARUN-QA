package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
public class multiselect {
	public static void main (String args[]) throws InterruptedException{
	
	WebDriver driver=new FirefoxDriver();
	
	driver.get("http://output.jsbin.com/osebed/2");
	
	Select box=new Select(driver.findElement(By.id("fruits")));
	
	box.selectByVisibleText("Banana");
	
	System.out.println("Banana is seleceted");
	
	box.selectByIndex(1);
	
    System.out.println("Apple is selected");
    
    box.selectByIndex(2);
    
    System.out.println("Orange");
    
	 Thread.sleep(3000);
	 
	 String selectedValue = box.getFirstSelectedOption().getText();
	 
	 System.out.println(selectedValue);

	 driver.quit();
	
	
}
}
