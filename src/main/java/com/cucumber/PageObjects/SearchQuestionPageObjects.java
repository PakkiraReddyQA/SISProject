package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.TestBase.TestBase;
import com.cucumber.managers.FileReaderManager;
import com.cucumber.utility.Constants;

public class SearchQuestionPageObjects {

	TestBase testbase;
	
	//Click on Application Question
	@FindBy(xpath = "//span[text()='Application Questions']")
	private WebElement appquestionlnk;
	
//	By AppQuestionLnk= By.xpath("//span[text()='Application Questions']");
	
	public TestBase getTestbase() {
		return testbase;
	}


	public WebElement getAppquestionlnk() {
		return appquestionlnk;
	}


	public WebElement getSearchQtn() {
		return searchQtn;
	}


	public WebElement getGoBtn() {
		return GoBtn;
	}


	//Search Qtn 
	@FindBy(id = "searchUser")
	private WebElement searchQtn;
	
//	By SearchByEdt=By.id("searchUser");
	
	//Click on GO Btn
	@FindBy(xpath = "//span[text()='Go']")
	private WebElement GoBtn;
	

	
	public SearchQuestionPageObjects(WebDriver driver) {
//		this.driver=driver;
		PageFactory.initElements(Constants.driver, this);
		testbase = new TestBase();
	}
	
	
	public void searchQuestion() throws Exception
	{
		testbase.waitForElement(searchQtn, FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), FileReaderManager.getInstance().getConfigReader().getPoolingWait());
		Thread.sleep(8000);
	    searchQtn.sendKeys("what");
		
		GoBtn.click();
		Thread.sleep(3000);
	}

}
