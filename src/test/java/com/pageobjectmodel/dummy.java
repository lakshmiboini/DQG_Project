package com.pageobjectmodel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class dummy {
	
	String strName;
	WebDriver driver = new ChromeDriver();

	@Test
	public void login() throws InterruptedException, AWTException {
		driver.manage().window().maximize();
		driver.get("http://localhost:81/");
		driver.findElement(By.cssSelector("button[id=':rb:']")).click();
		Thread.sleep(6000);

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		driver.findElement(By.cssSelector("input[id='i0116']")).sendKeys("lakshmi.b@kairostech.com");
		// driver.findElement(null) input[id='idSIButton9'] i0118
		driver.findElement(By.cssSelector("input[id='idSIButton9']")).click();
		Thread.sleep(5000);

		driver.findElement(By.cssSelector("input[id='i0118']")).sendKeys("Subhiksh@0519");

            driver.findElement(By.cssSelector("[id*='idSIButt']")).click();
		
		Thread.sleep(30000);
          driver.findElement(By.xpath("//*[@id='idSIButton9']")).click();
		// driver.findElement(By.xpath("//div[text()='Text +XX XXXXXXXX01‎']")).click();
		// Thread.sleep(20000);
		// driver.findElement(By.cssSelector("input[id='idSubmit_SAOTCC_Continue']")).click();
		// driver.findElement(By.xpath("//input[@id='idSubmit_ProofUp_Redirect']")).click();
		// Thread.sleep(3000);
		// driver.findElement(By.xpath("//input[@id='KmsiCheckboxField']")).click();
		// driver.findElement(By.xpath("//input[@id='idSubmit_ProofUp_Redirect']")).click();
		Thread.sleep(10000);
		 driver.switchTo().window(tabs.get(0));

		 WebElement alert=driver.findElement(By.xpath("//button[text()='Confirm']"));
		if(alert.isDisplayed())
		{
		alert.click();
		}
	    else {
		Alert alt=driver.switchTo().alert();

		alt.accept();
		 }
	
	
	  driver.manage().window().maximize();
      Thread.sleep(6000);
		driver.findElement(By.xpath("//*[text()='Data Quality Rules']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[normalize-space()='Create Rule']")).click();
		
		driver.findElement(By.xpath("//*[text()='File']")).click();
		driver.findElement(By.xpath("//*[text()='New']")).click();
		Thread.sleep(30000);
		Random random = new Random();
		int intRandomNumber = random.nextInt(1000);
		driver.findElement(By.cssSelector(" [class*='MuiPaper-root MuiPaper-elevation MuiPaper-elevation'] [class*='MuiInputBase-input MuiOutlinedInput-input']")).click();
		WebElement ele1=driver.findElement(By.cssSelector("[class*='MuiPaper-root MuiPaper-elevation MuiPaper-elevation'] [class*='MuiInputBase-input MuiOutlinedInput-input']"));
		
		String strRuleName="Automation_Test"+ intRandomNumber;
		strName=strRuleName;
		ele1.sendKeys(strRuleName);
		
		
		Thread.sleep(9000);
		WebElement ele = driver.findElement(By.xpath("//*[text()='Browse']"));
		ele.click();
		Thread.sleep(5000);
		Robot robot = new Robot();
		StringSelection str = new StringSelection(
				"C:\\Users\\LakshmiBoini-Kairos\\OneDrive - Kairos Technologies Inc\\Desktop\\kairos Website\\Student Info.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, str);

		// clipboard.setContents(str, null);

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
		  // driver.findElement(By.xpath("//button[text()='Browse']")).sendKeys(path); //
		driver.findElement(By.xpath("//*[text()='Upload']")).click();
		Thread.sleep(9000);
		
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		Thread.sleep(3000);
          driver.findElement(By.xpath("//input[@name='Start with']")).click();
          Thread.sleep(3000);
          driver.findElement(By.xpath("//input[@name='value_text']")).click();
          Thread.sleep(3000);
          driver.findElement(By.xpath("//input[@name='value_text']")).sendKeys("M");
          Thread.sleep(3000);
          driver.findElement(By.xpath("//input[@name='Text']")).click();
          Thread.sleep(3000);
          driver.findElement(By.xpath("//div[@class='MuiSelect-select MuiSelect-outlined MuiSelect-multiple MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-182didf']")).click();         
	Thread.sleep(3000);
	driver.findElement(By.xpath("//li[@data-value='Student Name ']")).click();
	Thread.sleep(3000);
	WebElement element=driver.findElement(By.cssSelector("[id='demo-multiple-checkbox-label']"));
	Actions actions=new Actions(driver);
	actions.click(element).build().perform();
	
	Thread.sleep(10000);
WebElement elem=driver.findElement(By.xpath("//button[text()='Add Data Quality Checks']"));
actions.click(elem).build().perform();

Random random2 = new Random();
int intRandomNumber2= random2.nextInt(1000);
	WebElement element2=driver.findElement(By.xpath("//button[text()='Create DQ Rule']"));
	actions.click(element2).sendKeys("rule1 "+ intRandomNumber2).perform();
	Thread.sleep(3000);
	
	Random random1 = new Random();
	int intRandomNumber1 = random1.nextInt(1000);
	//driver.findElement(By.xpath("//button[text()='Create']")).click();
	WebElement ele2=driver.findElement(By.xpath("//button[text()='Create']"));
	ele2.click();
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//button[text()='Create']")).click();
	//Thread.sleep(6000);
	//driver.findElement(By.xpath("//svg[contains(@class, 'MuiSvgIcon-root') and contains(@class, 'MuiSvgIcon-fontSizeSmall') and contains(@class, 'css-1k33q06')]\r\n")).click();
	
//	  WebElement exe=driver.findElement(By.xpath("(//*[local-name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeSmall css-1k33q06'])[3]" ));
	//actions.click(exe).build().perform();
 
	
	  List<WebElement> execute =driver.findElements(By.cssSelector("[class*='ag-center-cols-contai'] [title='Execute']")); 
	  
	  List<WebElement> sourceName =driver.findElements(By.cssSelector("[class*='ag-cell ag-cell-not-inline-editing'][aria-colindex='2']")); 
	  try {
		  Thread.sleep(8000);
		  }
		  catch (Exception e) {	
		}
	  for(int i=0;i<sourceName.size();i++) {
		  if(sourceName.get(i).getText().equalsIgnoreCase(strName)) {
			  System.out.println(sourceName.get(i).getText());
			  System.out.println(strName);
			  System.out.println(sourceName.get(i).getText());
			  try {
			  Thread.sleep(3000);
			  }
			  catch (Exception e) {	
			}
			  actions.click(execute.get(i)).build().perform();
		  }
	  }
	     
	     //

		  List<WebElement> Result =driver.findElements(By.cssSelector("[class*='MuiBox-root css-70'] [data-testid='AnalyticsIcon']")); 
		  
		 // List<WebElement> sourceName1 =driver.findElements(By.cssSelector("[class*='ag-cell ag-cell-not-inline-editing'][aria-colindex='2']")); 
		  try {
			  Thread.sleep(8000);
			  }
			  catch (Exception e) {	
			}
		  for(int i=0;i<sourceName.size();i++) {
			  if(sourceName.get(i).getText().equalsIgnoreCase(strName)) {
				  System.out.println(sourceName.get(i).getText());
				  System.out.println(strName);
				  try {
				  Thread.sleep(3000);
				  }
				  catch (Exception e) {	
				}
				  if(sourceName.get(i).getText().equalsIgnoreCase(strName))
				  {
				  actions.click(Result.get(i)).build().perform();
				  }
				  else
				  {
					 Result.get(i).click();
				  }
			  }
				  
		  }
	     //
	}
		
}
