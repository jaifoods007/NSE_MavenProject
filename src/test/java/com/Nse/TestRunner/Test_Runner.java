package com.Nse.TestRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "C:\\Users\\randy\\eclipse-workspace\\Maven_NSE_Website\\src\\test\\java\\com\\Nse\\Feature\\nse.feature",
glue="com.Nse.StepDefinition"
		)

public class Test_Runner {
	
		
	public static WebDriver driver;
		
	@BeforeClass
	public static void Set_Up() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\randy\\eclipse-workspace\\Selinium\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
			

	}
	
	@AfterClass
	public static void tear_Down() {
//		driver.close();
		
	}


}
