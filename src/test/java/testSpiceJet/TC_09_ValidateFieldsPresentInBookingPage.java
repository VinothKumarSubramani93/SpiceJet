package testSpiceJet;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseSpiceJet.BaseClassSJ;
import pagesSpiceJet.HomePage;

public class TC_09_ValidateFieldsPresentInBookingPage extends BaseClassSJ{
	
	HomePage home=new HomePage();
	
	@Test
	public void tc_09_ValidateCheckIn() {
		HomePage home=new HomePage();
		Assert.assertTrue(home.checkInPresence());
	}
	
	@Test
	public void tc_09_ValidateFlightStatus() {
		HomePage home=new HomePage();
		Assert.assertTrue(home.flightStatusPresence());
	}
	
	@Test
	public void tc_09_ValidateManageBooking() {
		HomePage home=new HomePage();
		Assert.assertTrue(home.manageBookingPresence());
	}
}
