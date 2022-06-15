package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.This;

public class Pagebase {
	
	WebDriver driver;
	
	public Pagebase(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements( driver ,this);
		
		
	}

}
