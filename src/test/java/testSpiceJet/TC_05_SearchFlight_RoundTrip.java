package testSpiceJet;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseSpiceJet.BaseClassSJ;
import pagesSpiceJet.FlightsPage;
import pagesSpiceJet.HomePage;

public class TC_05_SearchFlight_RoundTrip extends BaseClassSJ{
	
	@Test
	public void tc_05_SearchFlight_RoundTrip() {
		HomePage home=new HomePage();
		home.roundTrip("Delhi", "Tirupati", "17", "October", "1", "November");
		FlightsPage flights=new FlightsPage();
		String actMsg = flights.roundTripConfirmationMsg();
		Assert.assertEquals(actMsg, "Round Trip :");
	}
}
