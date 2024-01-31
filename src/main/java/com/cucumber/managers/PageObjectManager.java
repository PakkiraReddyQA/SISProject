package com.cucumber.managers;

import org.apache.log4j.xml.DOMConfigurator;

import com.cucumber.PageObjects.CreateAppQuestionPageObjects;
import com.cucumber.PageObjects.LoginPageObjects;
import com.cucumber.PageObjects.SearchQuestionPageObjects;
import com.cucumber.utility.Constants;
import com.cucumber.utility.Log;

public class PageObjectManager {

	// private WebDriver driver;

	private LoginPageObjects login;
 private CreateAppQuestionPageObjects caqp;
 private SearchQuestionPageObjects sqp;
	private Log log;



    
    public PageObjectManager() {
		// this.driver = driver;
		DOMConfigurator.configure("log4j.xml");
	}

	public LoginPageObjects getlogin() {
		if (login == null) {
			login = new LoginPageObjects(Constants.driver);
		}
		return login;
	}
	
	public CreateAppQuestionPageObjects getCreateQuestion()
	{
		if(caqp==null)
		{
			caqp=new CreateAppQuestionPageObjects(Constants.driver);
		}
		return caqp;
	}
	public SearchQuestionPageObjects getSearchQuestion()
	{
		if(sqp==null)
		{
			sqp=new SearchQuestionPageObjects(Constants.driver);
		}
		return sqp;
	}

	
}
