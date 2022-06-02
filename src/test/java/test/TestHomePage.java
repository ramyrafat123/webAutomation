package test;

import org.testng.annotations.Test;

import Pages.HomePage;

public class TestHomePage extends Testbase{
	
	HomePage homepage;
	
	public TestHomePage() {
		super();
	}
	
	@Test
	public void verifyloginbtn() {
		
		homepage=new HomePage(driver);
		
		homepage.clicklogin();
		
		
	}
	

}
