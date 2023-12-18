package com.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Datasource_Validation extends BaseClass {
	
	//WebDriver driver = new ChromeDriver();
	//WebDriver driver ;
	public Datasource_Validation(WebDriver driver) 
	{
		BaseClass.driver = driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	
public void Validation()
{
driver.findElement(By.xpath("//button[text()='Refresh']")).click();

}
	
	
	
}
