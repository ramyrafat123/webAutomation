package test;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;

public class TestLoginPage extends Testbase{
	
	HomePage home;
	LoginPage loginpage;
	
	
	
	
	@Test
	public void verifyLogin() {
		home=new HomePage(driver);
		loginpage=new LoginPage(driver);
		home.clicklogin();
		loginpage.userlogin("ramyrafat997@gmail.com", "ramy1029384756");
		
	}

}
