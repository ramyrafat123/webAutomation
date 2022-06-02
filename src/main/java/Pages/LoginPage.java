package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Pagebase {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="email")
	WebElement emailtext;
	
	
	@FindBy(id="passwd")
	WebElement passtext;
	
	@FindBy(id="SubmitLogin")
	WebElement loginbutton;
	
	
	public void userlogin(String email ,String pass) {
		
		emailtext.sendKeys(email);
		passtext.sendKeys(pass);
		loginbutton.click();
		
		
	}
	
	
	

}
