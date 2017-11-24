package main.java.com.ds.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import main.java.com.ds.qa.base.TestBase;

public class VehicleDetailsPage extends TestBase {

	@FindBy(xpath="//*[@id='pr3']/div/ul/li[1]/span[2]")
		WebElement vecNo;
	
	@FindBy(xpath="//*[@id='pr3']/div/ul/li[2]/span[2]/strong")
		WebElement vecMake;
	
	@FindBy(xpath="//*[@id='pr3']/div/ul/li[3]/span[2]/strong")
		WebElement vecColor;
	
	// Initializing the Page Objects (OR)
	public VehicleDetailsPage(){
		PageFactory.initElements(driver, this);
		
		//ExcelRead er = new ExcelRead(getFile());
		
		//data = er.getData();
	}
	
	public String getVehNumber(){
		return vecNo.getText();
	}
	
	public String getVehMake(){
		return vecMake.getText();
	}
	
	public String getVehColor(){
		return vecColor.getText();
	}
}
