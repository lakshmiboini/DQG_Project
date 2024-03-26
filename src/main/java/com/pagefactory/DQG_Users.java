package com.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class DQG_Users extends BaseClass{
	
	
	
	public DQG_Users (WebDriver driver) 
	{
		BaseClass.driver = driver;
		PageFactory.initElements(driver, this);
		
	}


	
	@FindBy(xpath="//span[@class='ag-icon ag-icon-next']")
	private WebElement dqgNextBtn;
	
	@FindBy(xpath="//span[text()='DQG Users']")
	private WebElement dqgusersBtn;
	
	
	@FindBy(css="('[class*='MuiSvgIcon-root MuiSvgIcon-fontSizeSmall css-1k33q06']')")
	private WebElement DQGTeamMembers;		
	
	@FindBy(xpath="//span[@class='ag-icon ag-icon-next']")
	private WebElement dqgNextBtn1;
	
	
	Actions act= new Actions(driver);
	
	
	public void dqgusersBtn() throws InterruptedException
	{
	Thread.sleep(9000);
	WebElement ele=dqgusersBtn;	
	act.click(ele).build().perform();
	}
	
	public void dqgNextBtn1() throws InterruptedException 
	{
		Thread.sleep(6000);
		WebElement ele1=dqgNextBtn1;
		act.click(ele1).build().perform();
	}

	public void dqgNextBtn() throws InterruptedException
	{

		Thread.sleep(6000);
		WebElement ele1=dqgNextBtn;
		act.click(ele1).build().perform();
		
	}
	
	
	public void dqgTeamMembers() throws InterruptedException 
	{
		Thread.sleep(3000);
		WebElement ele1=DQGTeamMembers;
		act.click(ele1).build().perform();
	
		
	}
	}
