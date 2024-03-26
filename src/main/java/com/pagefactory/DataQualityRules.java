package com.pagefactory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class DataQualityRules extends BaseClass {

	String strName;

	public DataQualityRules(WebDriver driver) {
		BaseClass.driver = driver;
		PageFactory.initElements(driver, this);

	}

	Actions actions = new Actions(driver);

	@FindBy(xpath = "//*[text()='Data Quality Rules']")
	public WebElement DataQualityRulesBtn;

	@FindBy(xpath = "//*[normalize-space()='Create Rule']")
	public WebElement CreateRule;

	@FindBy(xpath = "//*[text()='File']")
	public WebElement FileBtn;

	@FindBy(xpath = "//*[text()='New']")
	public WebElement NewBtn;

	@FindBy(css = "[class*='MuiPaper-root MuiPaper-elevation MuiPaper-elevation'] [class*='MuiInputBase-input MuiOutlinedInput-input']")
	public WebElement DataSourceName;

	@FindBy(xpath = "//*[text()='Browse']")
	public WebElement BrowseBtn;

	@FindBy(xpath = "//*[text()='Upload']")
	public WebElement UploadBtn;

	@FindBy(xpath = "//button[text()='Next']")
	public WebElement Next;

	@FindBy(xpath = "//input[@name='Start with']")
	public WebElement Startwith;

	@FindBy(xpath = "//input[@name='value_text']")
	public WebElement SelectText;

	@FindBy(xpath = "//input[@name='value_text']")
	public WebElement SelectColumn;

	@FindBy(xpath = "//input[@name='Text']")
	public WebElement Text;
	@FindBy(xpath = "//div[@class='MuiSelect-select MuiSelect-outlined MuiSelect-multiple MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-182didf']")
	public WebElement click;

	@FindBy(xpath = "//li[@data-value='Student Name ']")
	public WebElement StudentName;

	@FindBy(css = "[id='demo-multiple-checkbox-label']")
	public WebElement CheckBox;

	@FindBy(xpath = "//button[text()='Add Data Quality Checks']")
	public WebElement AddDataQualityCheck;
	@FindBy(xpath = "//button[text()='Create DQ Rule']")
	public WebElement CreateDQRule;

	@FindBy(xpath = "//button[text()='Create'])")
	public WebElement CreateBtn;

	@FindBy(css = "[class*='ag-center-cols-contai'] [title='Execute']")
	public List<WebElement> RunBtn;

	@FindBy(css = "[class*='ag-cell ag-cell-not-inline-editing'][aria-colindex='2']")
	public List<WebElement> Execute;
	@FindBy(css = "[class*='MuiBox-root css-70'] [data-testid='AnalyticsIcon']")
	public List<WebElement> ExecuteBtn;

	public void createDQRules() throws InterruptedException, AWTException {
		driver.manage().window().maximize();
		Thread.sleep(6000);
	}

	public void dataQualityRulesBtn() throws InterruptedException {
		DataQualityRulesBtn.click();
		Thread.sleep(2000);
	}

	public void createRule() {
		CreateRule.click();
	}

	public void fileBtn() {

		FileBtn.click();
	}

	public void newBtn() throws InterruptedException {
		NewBtn.click();
		Thread.sleep(30000);
	}

	public void AddNewDataSource() throws InterruptedException {
		Random random = new Random();
		int intRandomNumber = random.nextInt(1000);
		DataSourceName.click();
		WebElement ele1 = DataSourceName;

		String strRuleName = "Automation_Test" + intRandomNumber;
		strName = strRuleName;
		ele1.sendKeys(strRuleName);

		Thread.sleep(9000);
	}

	public void browse() throws InterruptedException, AWTException {
		WebElement ele = BrowseBtn;
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

		String filename = "C:\\Users\\LakshmiBoini-Kairos\\OneDrive - Kairos Technologies Inc\\Desktop\\excels\\Student Info.xlsx";
		File file = new File(filename);
		String path = file.getAbsolutePath(); //

	}

	// give the URL to upload
	// driver.findElement(By.xpath("//button[text()='Browse']")).sendKeys(path); //
	public void upload() throws InterruptedException {
		UploadBtn.click();
		Thread.sleep(9000);
	}

	public void next() throws InterruptedException {
		Next.click();
		Thread.sleep(3000);
	}

	public void startWith() throws InterruptedException {

		Startwith.click();
		Thread.sleep(3000);
	}

	public void selectText() throws InterruptedException {
		SelectText.click();
		Thread.sleep(3000);
	}

	public void selectColumn() throws InterruptedException {
		SelectColumn.sendKeys("M");
		Thread.sleep(3000);
	}

	public void Text() throws InterruptedException {
		Text.click();
		Thread.sleep(3000);
	}

	public void click() throws InterruptedException {
		click.click();
		Thread.sleep(3000);
	}

	public void studentName() throws InterruptedException {
		StudentName.click();
		Thread.sleep(3000);
	}

	public void checkbox() throws InterruptedException {
		WebElement element = CheckBox;

		actions.click(element).build().perform();

		Thread.sleep(10000);
	}

	public void addDataQualityCheck() {
		WebElement elem = AddDataQualityCheck;
		actions.click(elem).build().perform();
	}

	public void craeateDQRule() throws InterruptedException {
		Random random2 = new Random();
		int intRandomNumber2 = random2.nextInt(1000);
		WebElement element2 = CreateDQRule;
		actions.click(element2).sendKeys("rule1 " + intRandomNumber2).perform();
		Thread.sleep(3000);
	}

	public void CreateBtn() throws InterruptedException {
		Random random1 = new Random();
		int intRandomNumber1 = random1.nextInt(1000);

		WebElement ele2 = driver.findElement(By.xpath("//button[text()='Create']"));
		ele2.click();
		Thread.sleep(3000);
	}

	public void runBtn() {
		List<WebElement> execute = RunBtn;

		List<WebElement> sourceName = Execute;
		try {
			Thread.sleep(8000);
		} catch (Exception e) {
		}
		for (int i = 0; i < sourceName.size(); i++) {
			if (sourceName.get(i).getText().equalsIgnoreCase(strName)) {
				System.out.println(sourceName.get(i).getText());
				System.out.println(strName);
				System.out.println(sourceName.get(i).getText());
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
				}
				actions.click(execute.get(i)).build().perform();
			}
		}

		List<WebElement> Result = ExecuteBtn;

		try {
			Thread.sleep(8000);
		} catch (Exception e) {
		}
		for (int i = 0; i < sourceName.size(); i++) {
			if (sourceName.get(i).getText().equalsIgnoreCase(strName)) {
				System.out.println(sourceName.get(i).getText());
				System.out.println(strName);
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
				}
				if (sourceName.get(i).getText().equalsIgnoreCase(strName)) {
					actions.click(Result.get(i)).build().perform();
				} else {
					Result.get(i).click();
				}
			}

		}

	}

}
