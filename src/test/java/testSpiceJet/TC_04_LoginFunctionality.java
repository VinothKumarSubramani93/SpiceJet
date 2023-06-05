package testSpiceJet;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseSpiceJet.BaseClassSJ;
import pagesSpiceJet.HomePage;
import pagesSpiceJet.LoginPage;

public class TC_04_LoginFunctionality extends BaseClassSJ {
	
	@BeforeTest
	public void declareSheetName() {
		sheetName="loginTestData";
	}
	
	@Test(dataProvider="getExcelData")
	public void tc_04_LoginFunctionality(String userName, String password, String xpath, String expMsg) throws Exception {
		HomePage home=new HomePage();
		home.goToLoginPage();
		LoginPage login=new LoginPage();
		String actMsg = login.loginFunction(userName, password, xpath);
		Assert.assertEquals(actMsg, expMsg);
	}
}
