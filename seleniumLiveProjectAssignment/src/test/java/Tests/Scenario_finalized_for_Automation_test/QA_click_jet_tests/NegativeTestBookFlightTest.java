package Tests.Scenario_finalized_for_Automation_test.QA_click_jet_tests;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Pages.Scenario_finalized_for_Automation_page.QA_click_jet_pages.NegativeTestBookFlightPage;
import Utills.BaseTestForFlightsBooking;

public class NegativeTestBookFlightTest extends BaseTestForFlightsBooking  
{

	@Test
	public void NegativeTestSameDepAndArrivalLoc() throws InterruptedException
	{
		Boolean IssameCityPresentInDestination;
		
		NegativeTestBookFlightPage obj = new NegativeTestBookFlightPage(driver) ;
		//obj.SelectOriginCity("Delhi (DEL)");
		
		List<WebElement> destinationCityList = obj.returnListOfDestinationCities();
		
		for(WebElement elm : destinationCityList)
		{
			System.out.println(elm.getText());
		}
		
		IssameCityPresentInDestination = destinationCityList.contains("Delhi (DEL)");
		
		
	}
	
}