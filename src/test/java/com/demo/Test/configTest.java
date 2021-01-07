package com.demo.Test;

import Base.BaseTest;
import com.relevantcodes.extentreports.ExtentReports;

import org.testng.annotations.*;



public class configTest extends BaseTest {


	@BeforeSuite()
	public void setExtent() {

		extent = new ExtentReports("E:\\selenium\\AutoReport\\index.html", true);
		extent.addSystemInfo("Framework", "Page Object Model");
		extent.addSystemInfo("Author", "mahdy");
		extent.addSystemInfo("OS", "window");
		extent.addSystemInfo("Test Type", "E2E");
		extent.addSystemInfo("project Name", "com.demo");
		extent.addSystemInfo("Cross Platform", "Chrome & Firefox");

	}
	
	@AfterSuite()
	public void endReport() {

		extent.flush();

	}

	
	

}
