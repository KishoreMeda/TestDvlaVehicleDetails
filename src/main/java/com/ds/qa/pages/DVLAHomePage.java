package main.java.com.ds.qa.pages;

import main.java.com.ds.qa.base.TestBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DVLAHomePage extends TestBase{
	//Page Factory - Object Repository
	@FindBy(xpath="//*[@id='get-started']/a")
		WebElement btnStartNow;
	
	// Initializing the Page Objects (OR)
	public DVLAHomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle(){
		return driver.getTitle();
	}
	
	public void clickStartButton(){
		btnStartNow.click();
	}
}
