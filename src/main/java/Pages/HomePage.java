package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Pagebase {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	WebElement loginbtn;
	
	@FindBy(id="search_query_top")
	WebElement inputsearch;
	
	
	public void clicklogin() {
		
		loginbtn.click();
		
	}
	
	
	

}
