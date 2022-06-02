package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class Pagebase {
	
	WebDriver driver;
	
	public Pagebase(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements( driver ,this);
		
	}

}
