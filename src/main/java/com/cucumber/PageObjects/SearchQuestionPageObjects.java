package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.TestBase.TestBase;
import com.cucumber.managers.FileReaderManager;
import com.cucumber.utility.Constants;

public class SearchQuestionPageObjects {
	WebDriver driver;
	TestBase testbase;
//	By AppQuestionLnk= By.xpath("//span[text()='Application Questions']");
	
	By SearchByEdt=By.id("searchUser");
	
	public SearchQuestionPageObjects(WebDriver driver) {
		this.driver=driver;
		testbase = new TestBase();
	}
	
	public void SearchByField(String name)
	{
		testbase.waitForElement(Constants.driver.findElement(SearchByEdt), FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), FileReaderManager.getInstance().getConfigReader().getPoolingWait());
		Constants.driver.findElement(SearchByEdt).sendKeys(name);
		
	}

}
