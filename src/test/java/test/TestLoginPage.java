package test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import utility.XLUtility;

public class TestLoginPage extends Testbase{
	
	HomePage home;
	LoginPage loginpage;
	
	
	
	
	@Test(dataProvider = "login")
	public void verifyLogin(String i , String j) {
		home=new HomePage(driver);
		loginpage=new LoginPage(driver);
		home.clicklogin();
		loginpage.userlogin(i, j);
		
		
	}
	
	@DataProvider(name ="login")
	public String[][] getData() throws IOException {
		
//		String loginData[][]= {
//				{"mahmoud@gmail.com","ramy1029384756"},
//				{"mohab@gmail.com","ramy1029384756"},
//				{"ramyrafat997@gmail.com","ramy1029384756"},
//				
//				
//		};
		
		XLUtility xlutility=new XLUtility();
		
		int totalrows= xlutility.getRowCount("Sheet2");
		int totalcols =xlutility.getCellCount("Sheet2",1);
		
		System.out.println("totalcols"+ totalcols);
		System.out.println("totalrows" +totalrows);
		
		
		String loginData[][]= new String[totalrows][totalcols];
		
		for (int i = 1; i <= totalrows; i++) {
			
			for (int j = 0; j < totalcols; j++) {
				
				loginData[i-1][j]=xlutility.getCellData("Sheet2", i, j);
				System.out.print(loginData[i-1][j]);
				
			}
			
		}
		
		return loginData;
		
	}
	
	
	

}
