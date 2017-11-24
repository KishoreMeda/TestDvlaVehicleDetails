package main.java.com.ds.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import main.java.com.ds.qa.base.TestBase;

public class VehicleSearchPage extends TestBase{

	@FindBy(xpath="//*[@id='Vrm']")
		WebElement txtRegNo;
	
	@FindBy(xpath="//*[@id='content']/form/div/div/div[2]/fieldset/button")
		WebElement btnContinue;
	
	// Initializing the Page Objects (OR)
	public VehicleSearchPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void enterVechicleNo(String strNo){
		txtRegNo.sendKeys(strNo);
	}
	
	public String getTitle(){
		return driver.getTitle();
	}
	
	public void clickContinueButtion(){
		btnContinue.click();
	}
}
