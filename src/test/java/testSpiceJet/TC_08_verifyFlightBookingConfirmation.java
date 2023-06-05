package testSpiceJet;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseSpiceJet.BaseClassSJ;
import pagesSpiceJet.FlightsPage;
import pagesSpiceJet.HomePage;
import pagesSpiceJet.PassengerPage;
import pagesSpiceJet.PaymentPage;

public class TC_08_verifyFlightBookingConfirmation extends BaseClassSJ {
	
	@Test
	public void tc_08_verifyFlightBookingConfirmation() {
		HomePage home=new HomePage();
		home.oneWayTrip("Delhi", "Tirupati", "17", "October");
		FlightsPage flights=new FlightsPage();
		flights.goToPassengerPage();
		PassengerPage passenger =new  PassengerPage();
		passenger.fillPassengerDetails("Mr", "Jackson", "Michael", "9876543210", "jackson@gmail.com", "India");
		PaymentPage payment=new PaymentPage();
		payment.fillPaymentPage("5354 1234 4321 5678", "Jackson", "12", "25", "123");
		String actMsg = payment.paymentConfirmationMsg();
		Assert.assertEquals(actMsg, "Invalid Card Details");
	}
}
