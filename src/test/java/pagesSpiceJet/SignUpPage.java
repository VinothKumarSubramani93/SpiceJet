package pagesSpiceJet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseSpiceJet.BaseClassSJ;

public class SignUpPage extends BaseClassSJ {
	
	@FindBy(xpath="//select[@class='form-control form-select ']")
	WebElement titleDropDown;
	
	@FindBy(id="first_name")
	WebElement firstName;
	
	@FindBy(id="last_name")
	WebElement lastName;
	
	@FindBy(xpath="(//select)[2]")
	WebElement countryDropDown;
	
	@FindBy(id="dobDate")
	WebElement datePicker;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	WebElement yearDropDown;
	
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	WebElement monthDropDown;
	
	@FindBy(xpath="//input[@class=' form-control']")
	WebElement mobileNumber;
	
	@FindBy(xpath="//input[@id='email_id']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='new-password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='c-password']")
	WebElement confirmPassword;
	
	@FindBy(id="defaultCheck1")
	WebElement tcCheckBox;
	
	@FindBy(xpath="//div[@class=' mt-40 px-sm-4 col-auto']")
	WebElement submitButton;
	
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void datePick(String day,String month,String year) {
		clickOn(datePicker);
		selectFromDropDown(monthDropDown, month);
		selectFromDropDown(yearDropDown, year);
		WebElement date = driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--0"+day+"')]"));
		clickOn(date);
	}
	public String memberEnrollment(String title, String fName, String lName, String country, String day,String month, 
			String year,String mobNumber, String emailId, String pwd, String cnfPwd, String xpath) throws Exception {
		selectFromDropDown(titleDropDown, title);
		type(firstName, fName);
		type(lastName, lName);
		selectFromDropDown(countryDropDown, country);
		datePick(day, month, year);
		type(mobileNumber, mobNumber);
		waitExplicit(email);
		Thread.sleep(10000);
		type(email, emailId);
		waitExplicit(password);
		type(password, pwd);
		waitExplicit(confirmPassword);
		type(confirmPassword, cnfPwd);
		jsClickOn(tcCheckBox);
		jsClickOn(submitButton);
		String actText = extractText(driver.findElement(By.xpath(""+xpath+"")));
		return actText;
	}
	
	public void enroll(String title, String fName, String lName, String country, String day,String month, 
			String year,String mobNumber, String emailId) throws Exception {
		selectFromDropDown(titleDropDown, title);
		type(firstName, fName);
		type(lastName, lName);
		selectFromDropDown(countryDropDown, country);
		datePick(day, month, year);
		type(mobileNumber, mobNumber);
		clickOn(email);
		Thread.sleep(15000);
		type(email, emailId);
	}
}
