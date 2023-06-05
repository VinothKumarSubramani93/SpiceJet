package testSpiceJet;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseSpiceJet.BaseClassSJ;
import pagesSpiceJet.FlightsPage;
import pagesSpiceJet.HomePage;
import pagesSpiceJet.PassengerPage;
import pagesSpiceJet.PaymentPage;

public class TC_07_FillingPassengerAndPaymentInfo extends BaseClassSJ {
	
	@Test
	public void tc_07_FillingPassengerAndPaymentInfo() {
		HomePage home=new HomePage();
		home.oneWayTrip("Delhi", "Tirupati", "17", "October");
		FlightsPage flights=new FlightsPage();
		flights.goToPassengerPage();
		PassengerPage passenger =new  PassengerPage();
		passenger.fillPassengerDetails("Mr", "Jackson", "Michael", "9876543210", "jackson@gmail.com", "India");
		PaymentPage payment=new PaymentPage();
		payment.fillPaymentPageWOProceeding("5354 1234 4321 5678", "Jackson", "12", "25", "123");
		Assert.assertTrue(false);
	}
}
