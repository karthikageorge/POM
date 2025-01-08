package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.DatePickerPage;
import pages.TablePage;

public class TableTest extends BaseClass {
	TablePage tablepage;
	
	@Test
	public void verifyOnClickTable() {
		tablepage=new TablePage(driver);
		tablepage.clickOnTable();
		
	}
	
}
