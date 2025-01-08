package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TablePage {
WebDriver driver;
@FindBy(xpath = "//a[contains(text(),'Table')]")
WebElement tableLink;

public TablePage(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
public void clickOnTable() {
	tableLink.click();
}
}
