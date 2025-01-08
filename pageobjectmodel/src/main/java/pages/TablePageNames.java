package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilityClass;

public class TablePageNames {
	WebDriver driver;
	UtilityClass utilityclass=new UtilityClass();
	
	
	@FindBy(xpath = "//a[contains(text(),'Table')]")
	WebElement tableLink;

	@FindBy(xpath="//table/tbody/tr//td[1]")
	List<WebElement> tableNames;
	
	@FindBy(xpath="//table/tbody/tr[1]//td")
	List<WebElement> onePersondata;
	
	
	public TablePageNames(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnTable() {
		tableLink.click();
	}
	
	public List<String> getListofAllNames(){
		List<String> namesList=new ArrayList<String>();
		namesList=utilityclass.getAllNames(tableNames);
		return namesList;
	}
	public List<String> getSingleData(){
		List<String> onePersonData=new ArrayList<String>();
		onePersonData=utilityclass.getSinglePersondata(onePersondata);
		return onePersonData;
	}

		
		
	}
	
	
	


