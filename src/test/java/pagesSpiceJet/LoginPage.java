package pagesSpiceJet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseSpiceJet.BaseClassSJ;

public class LoginPage extends BaseClassSJ{
	
	@FindBy(xpath="//div[text()='Email']")
	WebElement emailRadioBtn;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement emailTextBox;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement passwordTextBox;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	WebElement loginButton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String loginFunction(String email, String password, String xpath) {
		clickOn(emailRadioBtn);
		type(emailTextBox, email);
		type(passwordTextBox, password);
		clickOn(loginButton); 
		String actMsg = extractText(driver.findElement(By.xpath(xpath)));
		return actMsg;
	}
}
