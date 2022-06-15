package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	

	public WebDriver driver;
	
//	String browser="chrome";

	
//	@Parameters({"browser"})
	@BeforeTest
	public  void setUp() {
			
//		if (browsername.equals("chrome")) {
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
//		driver=new ChromeDriver();
//		}
//		
//		else if (browsername.equals("ff")) {
//			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
//			driver=new FirefoxDriver();
//		}
		
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.navigate().to("http://automationpractice.com/index.php");
		
	}


	
//	@AfterTest
//	public void closebrowser() {
//		
//		driver.quit();
//		
//	}
	
	

}
