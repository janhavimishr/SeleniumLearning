package TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Commonfunctions.CommonFunctions;
import PageObjects.EbayHomePage;

public class SearchHealthAndBeautyTest {
	
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
	public void hoverHealthandBeauty() {
		ehp.hoverText();
	}
	
	@Test
	public void clickTextVisionCare() throws InterruptedException {
	ehp.click_link();
	}

	
}
