package com.pageobjectmodel;



import java.awt.AWTException;

import org.testng.annotations.Test;

import com.base.BaseClass;

public class DQG_Test_Run extends BaseClass {

	

		@Test
		public void test() throws Throwable, AWTException 
		{
			//dqhomepage.login();
		    //datasource.dataSource();
			//Thread.sleep(3000);
			//validations.Validation();
			//dqrules.createDQRules();
//		dqgUsers.dqgusersBtn();
//		dqgUsers.dqgNextBtn();
//		dqgUsers.dqgTeamMembers();
//		dqgUsers.dqgNextBtn1();
		
			Thread.sleep(9000);
			dash.clkdashboard();
			Thread.sleep(9000);
			dash.titlecomparison();
			Thread.sleep(9000);
            dash.dashboardToSchedule();
		
		}
	}
