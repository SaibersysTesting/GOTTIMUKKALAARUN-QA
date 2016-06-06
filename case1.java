package testcases;

import framework.commands;
public class case1 {
	public static void main(String args[]) throws InterruptedException{
		commands c= new commands();
		c.openapplication();
		c.login();
		c.logout();
		c.closeapplication();
		
	}

}
