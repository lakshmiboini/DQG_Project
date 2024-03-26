package com.pagefactory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
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
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.base.BaseClass;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class DQGHomepage extends BaseClass {

	public DQGHomepage(WebDriver driver) {
		BaseClass.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "button[id=':rb:']")
	public WebElement Azure;

	@FindBy(css = "input[id='i0116']")
	public WebElement username;

	@FindBy(css = "input[id='idSIButton9']")
	public WebElement userNextclick;

	@FindBy(css = "input[id='i0118']")
	public WebElement password;

	@FindBy(css = "[id*='idSIButt']")
	public WebElement passwordNextBtn;

	@FindBy(xpath = "//*[@id='idSIButton9']")
	public WebElement nextBtn;

	@FindBy(xpath = "//button[text()='Confirm']")
	public WebElement confirm;

	public void login() throws InterruptedException, AWTException {
		driver.manage().window().maximize();
	}

	public void azure() throws InterruptedException {
		Azure.click();
		Thread.sleep(6000);
	}

	public void entercredentials() throws InterruptedException {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		username.sendKeys("lakshmi.b@kairostech.com");

		userNextclick.click();
		Thread.sleep(5000);
	}

	public void password() {
		password.sendKeys("Subhiksh@0519");
	}

	public void passwordNextBtn() throws InterruptedException {
		passwordNextBtn.click();
		Thread.sleep(30000);
	}

	public void nextBtn() throws InterruptedException {
		nextBtn.click();
		// driver.findElement(By.xpath("//div[text()='Text +XX XXXXXXXX01‎']")).click();
		// Thread.sleep(20000);
		// driver.findElement(By.cssSelector("input[id='idSubmit_SAOTCC_Continue']")).click();
		// driver.findElement(By.xpath("//input[@id='idSubmit_ProofUp_Redirect']")).click();
		// Thread.sleep(3000);
		// driver.findElement(By.xpath("//input[@id='KmsiCheckboxField']")).click();
		// driver.findElement(By.xpath("//input[@id='idSubmit_ProofUp_Redirect']")).click();
		Thread.sleep(20000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(9000);
		WebElement alert = driver.findElement(By.xpath("//button[text()='Confirm']"));
		alert.click();
//		if (alert.isDisplayed())
//		{
//			alert.click();
//		} else
//		{
//			Alert alt = driver.switchTo().alert();
//
//			alt.accept();
//		}

		/*
		 * Thread.sleep(6000);
		 * 
		 * int intPosition = 0;
		 * 
		 * Thread.sleep(50000); List<WebElement> element =
		 * driver.findElements(By.xpath("//*[name()='svg'][@aria-label='Add']")); //
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)); //
		 * wait.until(ExpectedConditions.elementToBeClickable(element.get(0))); //
		 * element.get(intPosition).click();
		 * 
		 * 
		 * element.get(0).click();
		 * 
		 * Random random = new Random(); int intRandomNumber = random.nextInt(100);
		 * driver.findElement(By.xpath("//input[@id=':r1f:']")).sendKeys(
		 * "Automation_Test" + intRandomNumber); Thread.sleep(9000); WebElement ele =
		 * driver.findElement(By.xpath("//button[text()='Browse']")); ele.click();
		 * Thread.sleep(5000); Robot robot = new Robot(); StringSelection str = new
		 * StringSelection(
		 * "C:\\Users\\LakshmiBoini-Kairos\\OneDrive - Kairos Technologies Inc\\Desktop\\kairos Website\\Student Info.xlsx"
		 * ); Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, str);
		 * 
		 * // clipboard.setContents(str, null);
		 * 
		 * robot.keyPress(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_V);
		 * Thread.sleep(5000); robot.keyRelease(KeyEvent.VK_CONTROL);
		 * robot.keyRelease(KeyEvent.VK_V); Thread.sleep(5000);
		 * robot.keyPress(KeyEvent.VK_ENTER); robot.keyRelease(KeyEvent.VK_ENTER);
		 * 
		 * 
		 * String filename
		 * ="C:\\Users\\LakshmiBoini-Kairos\\OneDrive - Kairos Technologies Inc\\Desktop\\excels\\Student Info.xlsx"
		 * ; File file = new File(filename); String path = file.getAbsolutePath(); //
		 * give the URL to upload //
		 * driver.findElement(By.xpath("//button[text()='Browse']")).sendKeys(path); //
		 * driver.findElement(By.xpath("//button[text()='Upload']")).click();
		 * 
		 * }
		 */
	}
}
