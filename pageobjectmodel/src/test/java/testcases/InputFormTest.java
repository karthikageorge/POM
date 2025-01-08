package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.InputFormPage;

public class InputFormTest extends BaseClass {
	InputFormPage inputformpage;

@Test
public void verifyButtonText() {
	inputformpage=new InputFormPage(driver);
	inputformpage.clickOnInputform();
	Assert.assertEquals(inputformpage.getButtonName(), "Show Message");
}
@Test
public void verifyHeaderName() {
	inputformpage=new InputFormPage(driver);
	inputformpage.clickOnInputform();
	String actualHeadname=inputformpage.getHeaderName();
	String expectedHeadname="Single Input Field";
	Assert.assertEquals(actualHeadname, expectedHeadname);
	
}
}
