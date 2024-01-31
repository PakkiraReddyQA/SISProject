package com.cucumber.stepdefination;

import com.cucumber.PageObjects.CreateAppQuestionPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.SearchQuestionPageObjects;
import com.cucumber.utility.TestContext;

import cucumber.api.java.en.*;

public class SearchQuestionSteps 
{
	TestContext testContext;
	LoginPageObjects login;
     CreateAppQuestionPageObjects caqp;
     SearchQuestionPageObjects sqp;
     
     public SearchQuestionSteps(TestContext context) {
    		testContext = context;
    		login = testContext.getPageObjectManager().getlogin();
    		caqp = testContext.getPageObjectManager().getCreateQuestion();
    		sqp=testContext.getPageObjectManager().getSearchQuestion();
    		
	}
	
	@Given("^Login to the Application$")
	public void login_to_the_Application() throws Throwable {
	  
	}

	@Given("^Click on the AppQtn$")
	public void click_on_the_AppQtn() throws Throwable {
	    
	}

	@When("^Enter Question SearchBy Field <name>$")
	public void enter_Question_SearchBy_Field_name() throws Throwable {
	  
	}

	@When("^Print the First Page Question in Console$")
	public void print_the_First_Page_Question_in_Console() throws Throwable {
	   
	}

	@Then("^Check the Searched Questions displyed$")
	public void check_the_Searched_Questions_displyed() throws Throwable {
	   
	}

}
