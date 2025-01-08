package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//no assertions in page only in test
//constructor
//webelements
public class HomePage {
	//compile time not possible to overite
	WebDriver driver;
	By Logo=By.xpath("(//img[@src='images/logo.png'])[1]");
	//parameterized constructor.base--driver..to reach valued driver use parameter

	public HomePage(WebDriver driver){
		this.driver=driver;
		
	}
	
	/*public void printTitle() {
		int a=10;//run time
		a=5;
		System.out.println(driver.getTitle());
	}*/
public boolean isLogoDisplayed() {
	WebElement logElement=driver.findElement(Logo);
	return logElement.isDisplayed();
}
}
