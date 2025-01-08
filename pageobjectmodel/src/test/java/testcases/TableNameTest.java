package testcases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.TablePageNames;

public class TableNameTest extends BaseClass {
	TablePageNames tablepagenames;

@Test
public void printAllNames() {
	tablepagenames=new TablePageNames(driver);
	tablepagenames.clickOnTable();
	List<String> getActualNames=new ArrayList<String>();
	getActualNames=tablepagenames.getListofAllNames();
	System.out.println(getActualNames);
	List<String> expectedNames=new ArrayList<>(Arrays.asList(
			"Tiger Nixon", "Garrett Winters", "Ashton Cox", "Cedric Kelly", "Airi Satou",
			"Brielle Williamson", "Herrod Chandler", "Rhona Davidson", "Colleen Hurst", "Sonya Frost"
));
	Assert.assertEquals(getActualNames, expectedNames);
}
@Test
public void printSingleData() {
	tablepagenames=new TablePageNames(driver);
	tablepagenames.clickOnTable();
	List<String> getActualdata=new ArrayList<String>();
	getActualdata=tablepagenames.getSingleData();
	System.out.println(getActualdata);
	List<String> expecteddata=new ArrayList<>(Arrays.asList(
			"Tiger Nixon", "System Architect", "Edinburgh", "61", "2011/04/25", "$320,800"
));
	Assert.assertEquals(getActualdata, expecteddata);
}

}
