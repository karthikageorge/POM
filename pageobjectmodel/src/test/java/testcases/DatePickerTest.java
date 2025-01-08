package testcases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.DatePickerPage;

public class DatePickerTest  extends BaseClass {
	DatePickerPage datepickerpage;
	
	@Test
	public void verifyOnClickDatePickers() {
		datepickerpage=new DatePickerPage(driver);
		datepickerpage.clickOnDatePicker();
		//Assert.assertEquals(false, null);
	}
	@Test
	public void verifyTypeAttributedatebtn() {
		datepickerpage=new DatePickerPage(driver);
		datepickerpage.clickOnDatePicker();
		datepickerpage.getAttributebtnDate();
		Assert.assertEquals(datepickerpage.getAttributebtnDate(), "btn btn-primary");
		
	}
	@Test
	public void verifybtncolor() {
		datepickerpage=new DatePickerPage(driver);
		datepickerpage.clickOnDatePicker();
		Assert.assertEquals(datepickerpage.getCss(), "rgba(0, 123, 255, 1)");
		
		
		//System.out.println(datepickerpage.getCss(),"");
		
	}
	@Test
	public void printListmenu() {
		datepickerpage=new DatePickerPage(driver);
		List<String> actualheaders=datepickerpage.printMenu();
		//System.out.println(headers);
		List<String> expectedHeader=new ArrayList<>(Arrays.asList(
				"HOME", "INPUT FORM", "DATE PICKERS", "TABLE", "PROGRESS BARS", 
				"ALERTS AND MODALS", "LIST BOX", "OTHERS"));
		Assert.assertEquals(actualheaders, expectedHeader);
		
		
	}
}
