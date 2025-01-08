package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputFormPage {
	
	WebDriver driver;
	By clickInput=By.xpath("//a[contains(text(),'Input Form')]");
	By showButton =By.xpath("//button[@id='button-one']");
	By headerName=By.xpath("(//div[@class='card-header'])[2]");
	public InputFormPage(WebDriver driver){
		this.driver=driver;
		
	}
	public void clickOnInputform() {
		WebElement clickinuput=driver.findElement(clickInput);
		clickinuput.click();
	}
	public String getButtonName() {
		WebElement button =driver.findElement(showButton);
		return button.getText();
	}
	public String getHeaderName() {
		WebElement heading=driver.findElement(headerName);
		return heading.getText();
		}
	
}
