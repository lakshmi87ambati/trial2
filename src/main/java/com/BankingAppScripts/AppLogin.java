package com.BankingAppScripts;

import org.openqa.selenium.WebDriver;


import appUtilities.BrowserFactory;
import appUtilities.PageObjects;

public class AppLogin {
public static WebDriver driver;
public static PageObjects loginpage=new PageObjects(driver);
public static BrowserFactory browsers= new BrowserFactory();
public static String weburl="https://www.mycontactform.com/index.php";

public AppLogin launchbrowser() {
	
	driver=BrowserFactory.getbrowser("firefox",weburl);
	loginpage= new PageObjects(driver);
	
	
	return this;
	
}
	
	public  AppLogin username() {
		loginpage.username("qatrainer");
		return this;
		
	}
	
	public AppLogin password() {
		
		loginpage.password("admin123");
		return this;
		
	}

	
	public AppLogin verifylogin() {
		loginpage.verifylogin();
		return this;		
	}

	
	public AppLogin verifylogout() {
		
		loginpage.verifylogout();
		return this;
		
	}

	
	public AppLogin closebrowser() {
		loginpage.closebrowser();
		return this;
		
	}


}
