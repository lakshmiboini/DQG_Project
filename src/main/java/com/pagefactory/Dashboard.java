package com.pagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Dashboard extends BaseClass {

	public Dashboard(WebDriver driver) {
		BaseClass.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "[class*='MuiTypography-root MuiTypography-body1 MuiListItemText-primary']")
	private List<WebElement> dashboard;

	@FindBy(xpath = "//*[local-name()='svg'] [@data-testid='AccessTimeOutlinedIcon']")
	public WebElement dashboardtOscheduleBtn;

	@FindBy(xpath = "(//*[text()='Dashboard'])[2]")
	private WebElement titleDashbord;

		public void clkdashboard() throws InterruptedException {
		for (int i = 0; i < dashboard.size(); i++) {
			if (dashboard.get(i).getText().equalsIgnoreCase("Dashboard")) {
				dashboard.get(i).click();
			}
		}
	}

	public void titlecomparison() {
		String name = titleDashbord.getText();
		System.out.println("the dashboard title is " + name);
		if (name.equals("Dashboard")) {
			System.out.println("page is correctly launched");
		} else {
			System.out.println("page is not launched");
		}
	}

	public void dashboardToSchedule() {
		dashboardtOscheduleBtn.click();

	}
}
