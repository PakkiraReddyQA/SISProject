package com.cucumber.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.TestBase.TestBase;
import com.cucumber.utility.Constants;

public class UserVerifiedCertificatesPageObjects {
	WebDriver driver;
	Actions act;
	TestBase testbase;
	private final int TIMEOUT_WAIT = 30;
	private final int POOLING_WAIT = 8000;

	// click the reports type option
	By report = By.xpath("//a[normalize-space()='Reports']");
	// click the verified certificates
	By verified  = By.xpath("//a[normalize-space()='Verified Certificates']");
	// click by the send mail and click the ok
	By mail = By.xpath("(//*[@title='Send Mail'])[1]");
	By OK = By.xpath("(//*[@type='button'])[3]");
	// click on the download original certificates icon
	By originalcertificates = By.xpath("//tbody/tr[1]/td[8]/a[2]/i[1]");
	// click on the QR Code icon
	By qrcode = By.xpath("//tbody/tr[1]/td[8]/a[3]");
	// select student checkbox again click by ok
	By header = By.xpath("//tr[@class='bg-info-gradient']//input[@id='rowid']");
	// click on action dropdown
	By dropdown = By.xpath("//*[@name='bulk_action']");
	// Click on sendmail option
	By option = By.xpath("//option[text()='Send Mail']");  
	// click on Go button
	By go = By.xpath("//*[@type='button']");
	// click on ok button
	By ok1 = By.xpath("(//*[@type='button'])[3]");

	public UserVerifiedCertificatesPageObjects(WebDriver driver) {
		this.driver = driver;
		testbase = new TestBase();
	}

	public void clickthereportstypeoption() throws InterruptedException {
		WebElement rep = testbase.waitForElement(Constants.driver.findElement(report), TIMEOUT_WAIT, POOLING_WAIT);
		Actions act = new Actions(driver);
		act.moveToElement(rep).build().perform();
		Thread.sleep(3000);
	}

	public void clicktheverifiedcertificates() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(verified), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(verified).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@class='selectBatchSingle ng-untouched ng-pristine ng-valid']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/app-root/app-verified-certificates-all/body/div/div/div/div/div/div[2]/div/div/div[1]/div/select/option[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h3[@class='mb-0 card-title']")).click();
		Thread.sleep(1000);
	}

	public void clickbythesendmailandclicktheok() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(mail), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(mail).click();
		Thread.sleep(3000);
	    Constants.driver.findElement(OK).click();
		Thread.sleep(3000);

		JavascriptExecutor jse1=(JavascriptExecutor) driver;

		WebElement Action=driver.findElement(By.xpath("//li[@class='pagination-next']//a[1]"));

		jse1.executeScript("arguments[0].scrollIntoView();",Action);
		Thread.sleep(3000);
		

		JavascriptExecutor jse2=(JavascriptExecutor) driver;

		WebElement Actions=driver.findElement(By.xpath("//th[normalize-space()='Actions']"));

		jse1.executeScript("arguments[0].scrollIntoView();",Actions);
		Thread.sleep(3000);
	}

	
   public void clickonthedownloadoriginalcertificatesicon() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(originalcertificates), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(originalcertificates).click();
		Thread.sleep(3000);
	}

	public void clickontheQRCodeicon() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(qrcode), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(qrcode).click();
		Thread.sleep(3000);
	}

	public void selectstudentcheckboxagainclickbyok() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(header), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(header).click();
		Thread.sleep(2000);
		// scroll down a page
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);

	}

	public void bulkDrop() throws InterruptedException {
		WebElement dropdowns = testbase.waitForElement(Constants.driver.findElement(dropdown), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(dropdown).click();
		Thread.sleep(2000);
		Select select = new Select(dropdowns);
		select.selectByValue("1");
		Thread.sleep(2000);
	}
	public void sendmailinactions() throws InterruptedException {
	testbase.waitForElement(Constants.driver.findElement(option), TIMEOUT_WAIT, POOLING_WAIT);
	Constants.driver.findElement(option).click();
	Thread.sleep(5000);
	}

	public void clickonGoandOk() throws InterruptedException {
		testbase.waitForElement(Constants.driver.findElement(go), TIMEOUT_WAIT, POOLING_WAIT);
		Constants.driver.findElement(go).click();
		Thread.sleep(3000);
//		testbase.waitForElement(Constants.driver.findElement(ok1), TIMEOUT_WAIT, POOLING_WAIT);
//		Constants.driver.findElement(ok1).click();
//		Thread.sleep(1000);

	}
}
