package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	
	@BeforeMethod
	public void launchObsqureaBrowser() {
		WebDriverManager.chromedriver().setup();	//web driver manager used for chrome driver 
 		driver=new ChromeDriver(); //value is assigned only when chrome is open
 		driver.manage().window().maximize(); 
 		driver.get("https://selenium.qabible.in/"); 
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
	}

}
