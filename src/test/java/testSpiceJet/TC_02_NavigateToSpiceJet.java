package testSpiceJet;

import org.testng.annotations.Test;

import baseSpiceJet.BaseClassSJ;

public class TC_02_NavigateToSpiceJet extends BaseClassSJ  {
	
	@Test
	public void tc_02_NavigatingToSpiceJet() {
		String expTitle="SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
		titleAssertion(expTitle);
	}
}
