package com.cucumber.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.baseclass.Baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
//		plugin={"pretty",
//				"html:src\\test\\resource\\com\\cucumber\\report",
//				"json:src\\test\\resource\\com\\cucumber\\report.json",
//				"junit:src\\test\\resource\\com\\cucumber\\report.xml"
//		},
		features="src\\test\\java\\com\\cucumber\\feature",glue="com.cucumber.stepdefinition",
		tags={"@adactin","~@Ignore"},
		dryRun=false,strict=true,monochrome=true
		
)
public class TestRunner {
	public static WebDriver driver;
	
	@BeforeClass
	public static void  driverintialization() throws Exception {
		driver=Baseclass.getDriver("chrome");
      }
	
	@AfterClass
	public static void driverquit() {
     //  driver.quit();
	}

}
