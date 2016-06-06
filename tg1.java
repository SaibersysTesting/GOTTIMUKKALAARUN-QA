package java_testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class tg1 {

	@BeforeClass
	public void login(){
		System.out.println("login completed");
	}
	@AfterClass
	public void logout(){
		System.out.println("logout completed");	
	}
	@Test(priority=1)
    public void addemp(){
    	System.out.println("add employe sucessfuly");
    }
	@Test(priority=2)
    public void delemp(){
    	System.out.println("delete employ sucessfuly");
    }
}



