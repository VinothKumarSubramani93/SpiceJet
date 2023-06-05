package pagesSpiceJet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseSpiceJet.BaseClassSJ;

public class PaymentPage extends BaseClassSJ {
	
	@FindBy(xpath="//div[@class='payment_methods css-76zvg2 r-poiln3']")
	WebElement payementMethodText;
	
	@FindBy(id="card_number")
	WebElement cardNumber;
	
	@FindBy(id="name_on_card")
	WebElement cardHolderName;
	
	@FindBy(id="card_exp_month")
	WebElement expMonth;
	
	@FindBy(id="card_exp_year")
	WebElement expYear;
	
	@FindBy(id="security_code")
	WebElement cVV;
	
	@FindBy(xpath="//div[@data-testid='common-proceed-to-pay']")
	WebElement proceedToPay;
	
	@FindBy(xpath="//div[text()='Invalid Card Details']")
	WebElement paymentConfirmationMsg;
	
	@FindBy(xpath="//iframe[@class='card_number_iframe']")
	WebElement cardNumberFrame;
	
	@FindBy(xpath="//iframe[@class='name_on_card_iframe']")
	WebElement cardNameFrame;
	
	@FindBy(xpath="//iframe[@class='card_exp_month_iframe']")
	WebElement expMonthFrame;
	
	@FindBy(xpath="//iframe[@class='card_exp_year_iframe']")
	WebElement expYearFrame;
	
	@FindBy(xpath="//iframe[@class='security_code_iframe']")
	WebElement cVVFrame;
	
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String paymentPageConfirmation() {
		return extractText(payementMethodText);
	}
	
	public void fillPaymentPageWOProceeding(String cardNumber, String cardHolderName,String expMonth,String expYear, String cVV) {
		switchToFrame(cardNumberFrame);
		type(this.cardNumber, cardNumber);
		toDefaultContent();
		switchToFrame(cardNameFrame);
		type(this.cardHolderName, cardHolderName);
		toDefaultContent();
		switchToFrame(expMonthFrame);
		type(this.expMonth, expMonth);
		toDefaultContent();
		switchToFrame(expYearFrame);
		type(this.expYear, expYear);
		toDefaultContent();
		switchToFrame(cVVFrame);
		type(this.cVV, cVV);
		toDefaultContent();
	}
	
	public void fillPaymentPage(String cardNumber, String cardHolderName,String expMonth,String expYear, String cVV) {
		switchToFrame(cardNumberFrame);
		type(this.cardNumber, cardNumber);
		toDefaultContent();
		switchToFrame(cardNameFrame);
		type(this.cardHolderName, cardHolderName);
		toDefaultContent();
		switchToFrame(expMonthFrame);
		type(this.expMonth, expMonth);
		toDefaultContent();
		switchToFrame(expYearFrame);
		type(this.expYear, expYear);
		toDefaultContent();
		switchToFrame(cVVFrame);
		type(this.cVV, cVV);
		toDefaultContent();
		clickOn(proceedToPay);
	}
	
	public String paymentConfirmationMsg() {
		return extractText(paymentConfirmationMsg);
	}
}
