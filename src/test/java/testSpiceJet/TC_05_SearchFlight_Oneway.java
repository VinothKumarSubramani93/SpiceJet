package testSpiceJet;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseSpiceJet.BaseClassSJ;
import pagesSpiceJet.FlightsPage;
import pagesSpiceJet.HomePage;

public class TC_05_SearchFlight_Oneway extends BaseClassSJ{
	
	@Test
	public void tc_05_SearchFlight_Oneway() throws Exception {
		HomePage home=new HomePage();
		home.oneWayTrip("Delhi", "Tirupati", "17", "October");
		FlightsPage flights=new FlightsPage();
		String actMsg = flights.oneWayConfirmationMsg();
		Assert.assertEquals(actMsg, "One Way :");
	}
}
