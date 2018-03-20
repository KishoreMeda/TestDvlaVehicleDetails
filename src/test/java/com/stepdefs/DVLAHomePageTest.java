package test.java.com.stepdefs;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import main.java.com.ds.qa.base.TestBase;
import main.java.com.ds.qa.helper.ExcelRead;
import main.java.com.ds.qa.pages.DVLAHomePage;
import main.java.com.ds.qa.pages.VehicleDetailsPage;
import main.java.com.ds.qa.pages.VehicleSearchPage;
import uk.java.com.ds.filescan.FileUtil;

public class DVLAHomePageTest extends TestBase{

	DVLAHomePage dHome;
	VehicleSearchPage vsPage;
	VehicleDetailsPage vdPage;
	
	public static List<HashMap<String, String>> data;
	
	public DVLAHomePageTest(){
		// Initialise super class objects (properties, drivers etc...)
		super();
	}

	public void setUp(){
		initialization();
		dHome = new DVLAHomePage();
	}
	
	@Given("^DVLA Url$")
	public void dvla_Url() {
		
		setUp();
		String title = dHome.getTitle();
		org.junit.Assert.assertNotNull(title);
		junit.framework.Assert.assertEquals("Get vehicle information from DVLA - GOV.UK", title);
	}

	@When("^you click on Startnow button$")
	public void you_click_on_Startnow_button() {
		
		dHome.clickStartButton();
	}

	@Then("^it will redirect to Enter the registration number of the vehicle page$")
	public void it_will_redirect_to_Enter_the_registration_number_of_the_vehicle_page() {
		
		String title = dHome.getTitle();
		org.junit.Assert.assertNotNull(title);
		junit.framework.Assert.assertEquals("Check if a vehicle is taxed and has an MOT", title);
	}

	@Given("^Excel file to read Vehicle details$")
	public void excel_file_to_read_Vehicle_details(){
//		ExcelRead er = new ExcelRead(System.getProperty("user.dir") + "/src/main/resources/" + getFile());
//		data = er.getData();
		System.out.println("file excel_file_to_read_Vehicle_details:" + System.getProperty("user.dir") + dHome.getDirectory());
		
		// Get file/s from specified directory using FileUtil package
		FileUtil fUtil = new FileUtil(System.getProperty("user.dir") + dHome.getDirectory());
		File[] fList = fUtil.getFiles(dHome.getFileType());

		// Navigate to required file and open using Excel Uitility
		for (int i=0; i < fList.length; i++){
			ExcelRead er = new ExcelRead(fList[i].getAbsolutePath());
			data = er.getData();
		}
	}
	
	@When("^you enter Vehicle number and Click on Continue button$")
	public void you_enter_Vehicle_number_and_Click_on_Continue_button() {

		vsPage = new VehicleSearchPage();

		// Read Vehicle number from Data
		vsPage.enterVechicleNo(data.get(0).get("Number"));
		vsPage.clickContinueButtion();
	}

	@Then("^it will navigate to Vehicle Information page$")
	public void it_will_navigate_to_Vehicle_Information_page() {
	    
		String title = vsPage.getTitle();
		org.junit.Assert.assertNotNull(title);
		junit.framework.Assert.assertEquals("Check if a vehicle is taxed and has an MOT", title);
			    
	}

	@Then("^displays necessary Vehicle details$")
	public void displays_necessary_Vehicle_details() {
	    
		vdPage = new VehicleDetailsPage();
		junit.framework.Assert.assertEquals(data.get(0).get("Number"), vdPage.getVehNumber());
		junit.framework.Assert.assertEquals(data.get(0).get("Make"), vdPage.getVehMake());
		junit.framework.Assert.assertEquals(data.get(0).get("Colour"), vdPage.getVehColor());		
		closeDown();
	}
	
	public void closeDown(){
		tearDown();
	}
}
