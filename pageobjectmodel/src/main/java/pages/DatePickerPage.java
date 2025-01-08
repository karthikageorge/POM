package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilityClass;

public class DatePickerPage {

	WebDriver driver;
	@FindBy(xpath = "(//a[@class='nav-link'])[3]")
	WebElement datePickersLink;
	
	@FindBy(xpath = "//button[@id='button-one']")
	WebElement datePickersBtn;
	
	@FindBy(xpath = "//a[@class='nav-link']")
	List<WebElement> menuitems;
	
	@FindBy(xpath = "//table/tbody/tr//td[1]")
	List<WebElement> namelist;
	
	
	UtilityClass utilityclass=new UtilityClass();
	
	public DatePickerPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void clickOnDatePicker() {
		datePickersLink.click();
	}
	public String getAttributebtnDate() {
		return utilityclass.get_Attribute(datePickersBtn, "class");
		
	}
	public String getCss() {
		return utilityclass.get_Cssvalue(datePickersBtn, "background-color");
		
	}
	public List<String> printMenu() {
		List<String> MenuHeader=new ArrayList<String>();
		MenuHeader=utilityclass.getTextOfElements(menuitems);
		return MenuHeader;
		
	}
	public List<String> getNames(){
		List<String>getNamesList=new ArrayList<String>();
		getNamesList=utilityclass.getAllNames(namelist);
		return getNamesList;
		
		
	}
}
