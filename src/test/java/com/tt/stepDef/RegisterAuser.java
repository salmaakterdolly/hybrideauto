package com.tt.stepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterAuser {
	
   WebDriver driver;
		

@Given("^i am on network home page$")
public void i_am_on_network_home_page() throws Throwable {
   System.setProperty("webdriver.chrome.driver", "/home/mahbub/WebDrivers/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
}

@When("^I click on register link$")
public void i_click_on_register_link() throws Throwable {
   
}

@When("^I enter user name, password, confirm password$")
public void i_enter_user_name_password_confirm_password() throws Throwable {
  
}

@When("^I click on submit$")
public void i_click_on_submit() throws Throwable {
   
}

@Then("^I see successful registration message$")
public void i_see_successful_registration_message() throws Throwable {
    }

}
