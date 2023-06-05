package pagesSpiceJet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseSpiceJet.BaseClassSJ;

public class PassengerPage extends BaseClassSJ {
	
	@FindBy(xpath="//div[@data-testid='title-contact-detail-card']")
	WebElement titlTextBox;
	
	@FindBy(xpath="//input[@data-testid='first-inputbox-contact-details']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@data-testid='last-inputbox-contact-details']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@data-testid='contact-number-input-box']")
	WebElement contactNumber;
	
	@FindBy(xpath="//input[@data-testid='emailAddress-inputbox-contact-details']")
	WebElement emailId;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-tmtnm0 r-1777fci r-ymttw5 r-5njf8e r-1otgn73 r-13qz1uu']")
	WebElement selCountry;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement searchCountry;
	//div[@class='css-76zvg2 r-qsz3a2 r-poiln3 r-n6v787 r-1e081e0 r-oyd9sg']
	
	@FindBy(xpath="//div[contains(text(),'I prefer not to receive')]")
	WebElement preferNotCheckBox;
	
	@FindBy(xpath="//div[text()='Passenger Information']")
	WebElement passengerPageConfimationMsg;
	
	@FindBy(xpath="//div[contains(text(),'I am flying as the primary passenger')]")
	WebElement primaryPassangerCheckBox;
	
	@FindBy(xpath="//div[@data-testid='traveller-info-continue-cta']")
	WebElement continueAtPassenger;
	
	@FindBy(xpath="(//div[text()='Continue'])[3]")
	WebElement continueAtAddOn;
	
	@FindBy(id="skipfrompopup")
	WebElement skipForSkipComfort;
	//id="skipfrompopup"
	
	public PassengerPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void selectCountry(String country) {
		List<WebElement> countriesList = driver.findElements(By.xpath("//div[@class='css-76zvg2 r-qsz3a2 r-poiln3 r-n6v787 r-1e081e0 r-oyd9sg']"));
		for(WebElement countries : countriesList) {
			if(countries.getText().equalsIgnoreCase(country)) {
				clickOn(countries);
				break;
			}
		}
	}
	
	public void fillPassengerDetails(String title,String fName,String lName, String conNum,String email,String country) {
		clickOn(titlTextBox);
		clickOn(driver.findElement(By.xpath("//div[text()='"+title+"']")));
		type(firstName, fName);
		type(lastName, lName);
		type(contactNumber, conNum);
		type(emailId, email);
		clickOn(selCountry);
		type(searchCountry, country);
		selectCountry(country);
		clickOn(preferNotCheckBox);
		clickOn(primaryPassangerCheckBox);
		clickOn(continueAtPassenger);
		jsClickOn(continueAtAddOn);
		jsClickOn(skipForSkipComfort);
	}
	
	public String passengerPageConfirmation() {
		return extractText(passengerPageConfimationMsg);
	}
}
