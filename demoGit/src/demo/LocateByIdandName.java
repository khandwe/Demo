package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.WebBrowser;
import utility.WebElementsMethod;

public class LocateByIdandName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
//		//create object of chrome
//		WebDriver driver =new ChromeDriver();
//
//		            
//		driver.manage().window().maximize();
//
//		//Methods to operate on browser
//
//		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//		WebElement userName=driver.findElement((By.id("login1")));
//		userName.sendKeys("admin");
//		
//		WebElement password = driver.findElement(By.id("password"));
//		
//		
//		password.sendKeys("admin123");
//		driver.findElement(By.name("proceed")).click();
		
		
	WebDriver driver=	WebBrowser.openBrowser("https://mail.rediff.com/cgi-bin/login.cgi");
	WebElementsMethod.enterText(driver, By.id("login1"), "admin");
	WebElementsMethod.enterText(driver, By.id("password"), "admin123");
	WebElementsMethod.clickButton(driver, By.name("proceed"));
	System.out.println("Hello update");
	driver.close();
		
	}}