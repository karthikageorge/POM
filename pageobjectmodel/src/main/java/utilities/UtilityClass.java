package utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class UtilityClass {
	//to return attribute--one utility method
	public String get_Attribute(WebElement element,String attribute) {
		
		return element.getAttribute(attribute);//method is getattribute
	}
public String get_Cssvalue(WebElement element,String property) {
		
		return element.getCssValue(property);//method is getattribute
	}
public List<String> getTextOfElements(List<WebElement> elements){
	List<String> data=new ArrayList<String>();
	for(WebElement element :elements) {
		data.add(element.getText());
	}
	return data;
}
public List<String> getAllNames(List<WebElement> elements){
	List<String> namesdata=new ArrayList<String>();
	for(WebElement element:elements) {
		namesdata.add(element.getText());
	}
	return namesdata;
}
public List<String> getSinglePersondata(List<WebElement> elements){
	List<String> singleData=new ArrayList<String>();
	for(WebElement element:elements) {
		singleData.add(element.getText());
	}
	return singleData;
}

}
