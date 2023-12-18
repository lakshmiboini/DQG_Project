package com.base;

import java.awt.AWTException;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.pagefactory.DQGHomepage;
import com.pagefactory.Datasource_Validation;
import com.utilspage.Constants;

import com.utilspage.PropertyFile;

import com.utilspage.UtillFunctions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass {
	
	public static WebDriver driver;
	
//	public LoginPage loginpage; 
//	public DashdriverardPage  dashdriverardPage;
//	public AddNewCustomer Addnewbutton;
//	public AddCutomerInfo Addcustomerinformation;
//	public Logout logout;\
	public DQGHomepage dqhomepage;
	public Datasource_Validation validations;
	
	
	
	
	
	public PropertyFile propertyfile=new PropertyFile();
	public String url=propertyfile.getApplicationUrl();
	public String browser=propertyfile.getApplicationBrowser();
//	public ReadExcelFile excelfile= new ReadExcelFile();
   // public CreateLog log= new CreateLog();
	public UtillFunctions utillfunnctions=new UtillFunctions(driver);
	public String userName=propertyfile.getApplicationUserName();
	public String password1=propertyfile.getApplicationPassword();
	
	 @BeforeClass
	 public void setup() {
		 switch(browser) {
		 case "chrome":
			 chromeBrowser();
			 break;
		 //case "firefox":
			// firefoxBrowser();
			//break; 
		 case "edge":
			 edgeBrowser();
			break;
			default:
				error();
				
		 	
		 }
	 }
	 @BeforeMethod
	 public void login() throws AWTException, Throwable {
//		 loginpage=new LoginPage(driver);
//		 dashdriverardPage=new DashdriverardPage(driver);
//		 Addnewbutton= new AddNewCustomer(driver);
//		 Addcustomerinformation=new AddCutomerInfo(driver);
//		 LoginPage logout=new LoginPage(driver);
	     
//		loginpage.clearName();
//		loginpage.clearpasswordName();
//		loginpage.clickLogin();
		
		 dqhomepage =new DQGHomepage(driver);
		 validations =new Datasource_Validation(driver);
		 
	 }
    @AfterClass
	 public void teardown()
	 {
		 driver.quit();
		 //log.info("Browser closed");
		
	 }
	public void url() {
		driver.get(url);
		//log.info("URL is Launched");
		driver.manage().window().maximize();
		//log.info("Window is maximized");
	}
    public void error() {
    	System.err.println("unknown Browser");
	//	log.info("unknown Browser");
		
		
	}
    public void chromeBrowser() {
    	WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
    //	log.info("ChromeBrowser is launched");
    	url();
    }
    public void edgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		//log.info("Edge is Launched");
		url();
		
	}
//    public void firefoxBrowser() {
//		WebDriverManager.firefoxdriver().setup();
//		driver=new FirefoxDriver();
//		//log.info("Firefox is Launched");
//		url();
//	
		
//	}
    public void maximizeBrowser() {
		utillfunnctions.maximizeWindow();
    	
	}

	public String browserName() {
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		String browsername = cap.getBrowserName().toLowerCase();
		return browsername;
	}

	public String browserversion() {
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		String browserversion = cap.getBrowserVersion().toString();
		return browserversion;
	}

}
