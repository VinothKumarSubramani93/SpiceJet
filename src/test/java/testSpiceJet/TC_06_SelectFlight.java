package testSpiceJet;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseSpiceJet.BaseClassSJ;
import pagesSpiceJet.FlightsPage;
import pagesSpiceJet.HomePage;
import pagesSpiceJet.PassengerPage;

public class TC_06_SelectFlight extends BaseClassSJ {
	
	@Test
	public void tc_06_SelectFlight() {
		HomePage home=new HomePage();
		home.oneWayTrip("Delhi", "Tirupati", "17", "October");
		FlightsPage flights=new FlightsPage();
		flights.goToPassengerPage();
		PassengerPage passenger=new PassengerPage();
		String actText = passenger.passengerPageConfirmation();
		Assert.assertEquals(actText, "Passenger Information");
	}
}
