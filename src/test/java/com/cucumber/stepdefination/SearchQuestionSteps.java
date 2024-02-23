package com.cucumber.stepdefination;

import com.cucumber.PageObjects.CreateAppQuestionPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.SearchQuestionPageObjects;
import com.cucumber.TestBase.TestBase;
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
		login.Logintoappln("pakkirareddyadmin","Pakkira@123");
	  
	}

	@Given("^Click on the AppQtn$")
	public void click_on_the_AppQtn() throws Throwable {
     sqp.getAppquestionlnk().click();
	    
	}

	@When("^Enter Question SearchBy Field")
	public void enter_Question_SearchBy_Field_name() throws Throwable {
		Thread.sleep(1000);
		sqp.searchQuestion();
		
	  
	}

	@Then("^Check the Searched Questions displyed$")
	public void check_the_Searched_Questions_displyed() throws Throwable {
	   System.out.println("Question Searched Successfully!!!");
	}

}
