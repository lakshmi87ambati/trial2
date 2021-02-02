package com.BankingAppScripts;


import org.junit.Test;


public class AppTest extends AppLogin
{
	public static AppLogin logindetails= new AppLogin();
    
	@Test
    public void clickmyhomepage()
    {
       logindetails.launchbrowser().username().password().verifylogin();
    }
	
	@Test
	public void launchtoclose()
	{
		logindetails.launchbrowser().username().password().verifylogin().verifylogout().closebrowser();
	}
}
