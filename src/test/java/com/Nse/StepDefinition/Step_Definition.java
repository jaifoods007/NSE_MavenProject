package com.Nse.StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Nse.TestRunner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Step_Definition {
	
public WebDriver driver=Test_Runner.driver;
@Given("^User Launch The Browser\\.$")
public void user_Launch_The_Browser() throws Throwable {
	driver.get("https://www.nseindia.com/");
	driver.manage().window().maximize();
   
}

@When("^User To Get Top Five Gainers Of The Day\\.$")
public void user_To_Get_Top_Five_Gainers_Of_The_Day() throws Throwable {
    
	WebElement topGainers1 = driver.findElement(By.xpath("//tbody//tr//td"));
	String one = topGainers1.getText();
	System.out.println(one);
	}

@When("^User To Get Top Five Losers Of The Day\\.$")
public void user_To_Get_Top_Five_Losers_Of_The_Day() throws Throwable {
    
}




}
