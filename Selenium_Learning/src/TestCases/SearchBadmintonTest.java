package TestCases;

import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Commonfunctions.CommonFunctions;
import PageObjects.EbayHomePage;

public class SearchBadmintonTest {
	
	EbayHomePage ehp=new EbayHomePage();
	CommonFunctions cf=new CommonFunctions();
	
	@BeforeClass
	public void beforeClass() {
		cf.basicSetup();
	}
	
	@BeforeMethod  
	public void homePage() throws InterruptedException {
		ehp.click_Logo();
	}
	
	@Test
public void searchBadminton() throws InterruptedException {
	ehp.enterText("Badminton");
}
	
	@AfterClass
	public void afterClass() {
		cf.quitBrowser();
	}


}
