package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import com.cucumber.TestBase.TestBase;
import com.cucumber.managers.FileReaderManager;
import com.cucumber.utility.Constants;

public class CreateAppQuestionPageObjects {
	WebDriver driver;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 20;
	private final int POOLING_WAIT = 8000;

	By AppQuestionLnk= By.xpath("//span[text()='Application Questions']");
	
	By GoBtn= By.xpath("//span[text()='Go']");
	
	By CreateBtn1= By.xpath("//span[text()='Create']");
	
	By EnterQuestionEdt= By.name("question");
	
	By QtnType= By.xpath("//mat-label[text()='select']");
	By QtnTypeValue= By.xpath("//span[text()='List']");
	
	
	By NoOfAnserDrpDwn= By.xpath("(//mat-select[@role='combobox'])[3]");
	
	By CreateBtn2= By.xpath("(//span[text()='Create'])[2]");
	
	//span[text()='3']
	By NoOfAnswerValue= By.xpath("//span[text()='3']");
	
	public CreateAppQuestionPageObjects(WebDriver driver)
	{
		this.driver = driver;
		testbase = new TestBase();
	}
	
	public void clickonAppQuestion() throws InterruptedException
	{
		 testbase.waitForElement(Constants.driver.findElement(AppQuestionLnk), FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(),FileReaderManager.getInstance().getConfigReader().getPoolingWait());
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		
		js1.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(1000);
	
		Constants.driver.findElement(AppQuestionLnk).click();
		
	}
	public void ClickonGoandCraeteBtn()
	{
	 testbase.waitForElement(Constants.driver.findElement(GoBtn), TIMEOUT_WAIT,POOLING_WAIT);

		Constants.driver.findElement(GoBtn).click();
//		testbase.waitForElement(Constants.driver.findElement(CreateBtn1), FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(),FileReaderManager.getInstance().getConfigReader().getPoolingWait());
		Constants.driver.findElement(CreateBtn1).click();
	}
	public void EnterQuestion()
	{
		testbase.waitForElement(Constants.driver.findElement(EnterQuestionEdt), TIMEOUT_WAIT,POOLING_WAIT);
		Constants.driver.findElement(EnterQuestionEdt).sendKeys("Class?");
	}
	public void SelectTypeandEnterAnswers()
	{
		testbase.waitForElement(Constants.driver.findElement(QtnType), FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(),FileReaderManager.getInstance().getConfigReader().getPoolingWait());
       Constants.driver.findElement(QtnType).click();
       
		testbase.waitForElement(Constants.driver.findElement(QtnTypeValue), FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(),FileReaderManager.getInstance().getConfigReader().getPoolingWait());

       Constants.driver.findElement(QtnTypeValue).click();
       
       Constants.driver.findElement(NoOfAnserDrpDwn).click();
       
       Constants.driver.findElement(NoOfAnswerValue).click();
		testbase.waitForElement(Constants.driver.findElement(By.id("answer0")), FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(),FileReaderManager.getInstance().getConfigReader().getPoolingWait());

       Constants.driver.findElement(By.id("answer0")).sendKeys("yes!!!");
       Constants.driver.findElement(By.id("answer1")).sendKeys("No");
       Constants.driver.findElement(By.id("answer1")).sendKeys("May be");
		testbase.waitForElement(Constants.driver.findElement(CreateBtn2), FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(),FileReaderManager.getInstance().getConfigReader().getPoolingWait());
   
       Constants.driver.findElement(CreateBtn2).click();
       }
  
	
	
	
}
