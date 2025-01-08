package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;

public class HomeTest extends BaseClass {
	HomePage homepage;
	//HomePage homepage=new HomePage(driver);//compile time//no value in driver
	@Test
	public void verifylogo() {
		homepage=new HomePage(driver);//run time il pass cheyunu driver
		System.out.println(driver.getTitle());
		//homepage.printTitle();
		Assert.assertTrue(homepage.isLogoDisplayed());
		System.out.println(homepage.isLogoDisplayed());
	}

}
