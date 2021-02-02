package appUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjects {
	public static WebDriver driver;
	
	public PageObjects(WebDriver driver) {
		PageObjects.driver=driver;
	}
	
	public void username(String un) {
		
		driver.findElement(By.name("user")).sendKeys(un);
		
	}
	
	public void password(String pwd) {
		
		driver.findElement(By.name("pass")).sendKeys(pwd);
		
	}

	
	public void verifylogin() {
		driver.findElement(By.name("btnSubmit")).click();
		
	}

	
	public void verifylogout() {
		
		driver.findElement(By.xpath("//*[@id=\"user_bar\"]/ul/li[1]/a")).click();
		
	}

	
	public void closebrowser() {
		driver.quit();
		
	}

}
