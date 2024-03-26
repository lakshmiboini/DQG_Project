package com.pagefactory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.Random;

import javax.annotation.CheckForNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class DataSource  extends BaseClass{
	
	public DataSource(WebDriver driver) 
	{
		BaseClass.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

@FindBy(xpath="//input[@id=':r1f:']")
public WebElement plusBtn;
@FindBy(xpath="//button[text()='Browse']")
		public WebElement Browse;
	@FindBy(xpath="//button[text()='Upload']")
			public WebElement upload;
  public void dataSource() throws InterruptedException, AWTException {
	Thread.sleep(6000);

	int intPosition = 2;

	Thread.sleep(50000);
	List<WebElement> element = driver.findElements(By.xpath("//*[name()='svg'][@aria-label='Add']"));
	
	
	element.get(2).click();

	Random random = new Random();
	int intRandomNumber = random.nextInt(100);
	plusBtn.sendKeys("Automation_Test" + intRandomNumber);
	Thread.sleep(9000);
	WebElement ele = Browse;
	ele.click();
	Thread.sleep(5000);
	Robot robot = new Robot();
	StringSelection str = new StringSelection(
			"C:\\Users\\LakshmiBoini-Kairos\\OneDrive - Kairos Technologies Inc\\Desktop\\kairos Website\\Student Info.xlsx");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, str);

	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	Thread.sleep(5000);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	Thread.sleep(5000);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);

	
	  String filename="C:\\Users\\LakshmiBoini-Kairos\\OneDrive - Kairos Technologies Inc\\Desktop\\excels\\Student Info.xlsx" ; 
	  File file = new File(filename); String path = file.getAbsolutePath(); //
	  //give the URL to upload
	  upload.click();

}

}
	
	
	

