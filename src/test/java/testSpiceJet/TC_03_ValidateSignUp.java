package testSpiceJet;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseSpiceJet.BaseClassSJ;
import pagesSpiceJet.HomePage;
import pagesSpiceJet.SignUpPage;

public class TC_03_ValidateSignUp extends BaseClassSJ {
	
	@BeforeTest
	public void declareSheetName() {
		sheetName="signUpTestData2";
	}
	@Test(dataProvider="getExcelData")
	public void tc_03_ValidateSignUp(String title, String fName, String lName, String country,String day,String month,String year,
			String mobNumber, String emailId, String pwd, String cnfPwd, String xpath, String expText) throws Exception {
		HomePage home=new HomePage();
		home.goToSignInPage();
		SignUpPage signUp=new SignUpPage();
		String actText = signUp.memberEnrollment(title, fName, lName, country, day, month, year, mobNumber, emailId, pwd, cnfPwd, xpath);
		Assert.assertEquals(actText, expText);
	}
}
